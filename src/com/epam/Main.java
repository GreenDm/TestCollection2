package com.epam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by m18 on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        List<String> lst1 = new LinkedList<>();

        for(int i = 0; i<=10; i++) {
            Random random = new Random();
           int position = random.nextInt(lst1.size()+ 1);
            lst1.add(position,"number_"+i);
        }

        for(String a:lst1){
            System.out.println(a);
        }

    }
}
