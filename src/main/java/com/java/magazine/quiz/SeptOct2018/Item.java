package com.java.magazine.quiz.SeptOct2018;

import java.util.TreeSet;

public class Item {

    private final String name;

    Item(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return name.equals(((Item)o).name);
    }

    public static void main(String[] args) {
        Item i1 = new Item("1");
        Item i2 = new Item("2");
        Item i3 = new Item("3");
        TreeSet<Item> ts = new TreeSet<Item>();
        ts.add(i2);
        ts.add(i1);
        ts.add(i3);
        System.out.println(ts);
    }
    // Exception in thread "main" java.lang.ClassCastException: com.java.magazine.quiz.SeptOct2018.Q3.Item cannot be cast to
    // java.lang.Comparable
    // at java.util.TreeMap.compare(TreeMap.java:1290)
    // at java.util.TreeMap.put(TreeMap.java:538)
    // at java.util.TreeSet.add(TreeSet.java:255)
    // at com.java.magazine.quiz.SeptOct2018.Q3.Item.main(Item.java:33)

}
