package com.company.siyang.pattern.iterator;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author <a href="siyang.cry@alibaba-inc.com">思洋</a>
 * @date 2020/9/29 13:33
 */
public class Collections {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList(args));

        System.out.println("Using enumeration with Vector");
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Using iterator with Vector");
        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Using for/in with array of Strings");
        for (String color : args) {
            System.out.println(color);
        }
    }
}
