package com.company;

import java.util.ArrayList;
import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import java.util.stream.Collectors;

public class Main {
//    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
//         To open source code then press CTRL and place cursor or CTRL+E

        l.add(1);
        l.add(3);
        l.add(2);
        l.add(10);
        l.add(9);
        l.add(5);
//        ALT + f8

         List<Integer> collect = l.stream().sorted((l1, l2) -> l1.compareTo(l2)).collect(Collectors.toList());
         System.out.println(collect);

        List<String> l1=new ArrayList<>();
//         To open source code then press CTRL and place cursor or CTRL+E

        l1.add("A");
        l1.add("P");
        l1.add("B");
        l1.add("F");
        l1.add("C");

        List<Integer> collect1 = l.stream().sorted((l3, l4) -> l3.compareTo(l4)).collect(Collectors.toList());
        System.out.println(collect1);




    }
}