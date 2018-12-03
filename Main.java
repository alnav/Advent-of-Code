package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ale\\IdeaProjects\\aoc2018x1\\src\\com\\company\\input.txt");
        Scantxt scanner = new Scantxt(file);
        ArrayList<String> list = scanner.readFile();
        int sum = 0;
        ArrayList<Integer> frequency = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int a = 0;

        while (a < 200) {
            for (String x : list) {
                sum += Integer.parseInt(x);
                if (!set.add(sum))
                    System.out.println("Repeated: " + sum);
            }
            a++;
            ;
        }

//        System.out.println(set.size());
//        System.out.println(frequency.size());
//        if (set.size() < frequency.size()) {
//            System.out.println("wee");
//        }
//        for(int x : frequency){
//            for(int y : set){
//                if(x == y){
//                    frequency.remove(x);
//                    set.remove(y);
//                }
//            }
//        }
//        for(int x : frequency){
//            System.out.println(x);
//        }


    }
}
