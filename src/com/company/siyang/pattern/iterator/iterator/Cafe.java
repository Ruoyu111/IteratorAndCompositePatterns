package com.company.siyang.pattern.iterator.iterator;

import java.util.ArrayList;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 11:49
 */
public class Cafe {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // with no iterators
        System.out.println("\nMENU\n----\nBREAKFAST");
        ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            String menuItem = breakfastItems.get(i);
            System.out.println(menuItem);
        }

        System.out.println("\nLUNCH");
        String[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < lunchItems.length; i++) {
            String menuItem = lunchItems[i];
            System.out.println(menuItem);
        }

        // with iterators
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
