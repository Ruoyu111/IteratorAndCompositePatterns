package com.company.siyang.pattern.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 17:04
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        }
        return null;
    }
}
