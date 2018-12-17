package com.rrr;

import java.util.PrimitiveIterator.OfInt;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {
        Random rd = new Random();
        IntStream is = null;
        TreeMap<Integer, Integer> tmp = null;

        while (true) {
            tmp = new TreeMap<Integer, Integer>();

            // 乱数を４つ生成する
            is = rd.ints(4, 0, 10);

            // TreeMapのキーとして登録
            OfInt it = is.iterator();
            while (it.hasNext()) {
                Integer key = it.next();
                tmp.put(key, key);
            }

            // Keyの数が４かどうかを判断
            if (tmp.keySet().size() == 4) {
                break;
            }

        }

        tmp.keySet().forEach(action -> System.out.println(action));

    }
}
