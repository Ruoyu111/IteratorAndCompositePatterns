package com.company.siyang.pattern.iterator.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 13:53
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    private void addItem(String name) {
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<String> createIterator() {
        return menuItems.iterator();
    }

    @Override
    public String toString() {
        return "Pancake House Menu";
    }
}
