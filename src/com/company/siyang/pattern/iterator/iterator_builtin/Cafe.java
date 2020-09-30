package com.company.siyang.pattern.iterator.iterator_builtin;

import java.util.Iterator;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 14:23
 */
public class Cafe {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // with iterators
        Iterator<String> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<String> dinerIterator = dinerMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
