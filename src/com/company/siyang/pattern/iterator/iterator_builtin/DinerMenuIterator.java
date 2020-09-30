package com.company.siyang.pattern.iterator.iterator_builtin;

import java.util.Iterator;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 14:12
 */
public class DinerMenuIterator implements Iterator<String> {
    String[] list;
    int position = 0;

    public DinerMenuIterator(String[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return list[position++];
        }
        return null;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item util you've done at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
