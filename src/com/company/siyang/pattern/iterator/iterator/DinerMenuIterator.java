package com.company.siyang.pattern.iterator.iterator;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 13:03
 */
public class DinerMenuIterator implements Iterator {
    String[] items;
    int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return items[position++];
        }
        return null;
    }
}
