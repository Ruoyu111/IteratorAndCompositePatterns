package com.company.siyang.pattern.iterator.iterator;

import java.util.ArrayList;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 11:50
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
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    @Override
    public String toString() {
        return "Pancake House Menu";
    }
}
