package com.company.siyang.pattern.iterator.iterator;

import java.util.ArrayList;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 12:01
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() - 1;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
