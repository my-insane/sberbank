package sgu;


import com.sun.source.tree.Tree;

import java.util.*;
import java.io.*;

public class s2057 {

    private static int trigger;
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static TreeMap<Integer, Integer> fr = new TreeMap<>();
    private static int num = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        final int N = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            StringTokenizer st2 = new StringTokenizer(in.readLine());
            trigger = Integer.parseInt(st2.nextToken());
            if (trigger == 1) {
                num = Integer.parseInt(st2.nextToken());
                if (fr.containsKey(num)) {
                    int counter = fr.get(num) + 1;
                    fr.replace(num, counter);
                } else fr.put(num, 1);
            }
            if (trigger == 2) {
                for (int key: fr.keySet()) {
                    int q = fr.getOrDefault(key, 0) - 1;
                    if (q <= 0) {
                        fr.remove(key);
                    } else {
                        fr.replace(key, q);
                    }
                    System.out.println(key);
                    break;
                }
            }
        }
    }
//    private void add(int num) {
//        if (fr.containsKey(num)) {
//            int counter = fr.get(num) + 1;
//            fr.replace(num, counter);
//        } else fr.put(num, 1);
//    }
//    private void delete(int num) {
//        for (int key: fr.keySet()) {
//            int q = fr.getOrDefault(key, 0) - 1;
//            if (q <= 0) {
//                fr.remove(key);
//            } else {
//                fr.replace(key, q);
//            }
//            System.out.println(key);
//            break;
//        }
//    }
}



