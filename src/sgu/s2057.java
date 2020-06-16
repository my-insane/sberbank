package sgu;

import java.util.*;
import java.io.*;

public class s2057 {
    public boolean delete () {

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> fr = new HashMap<>();
        int trigger;
        int num = 0;
        StringTokenizer st = new StringTokenizer(in.readLine());
        final int N = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            StringTokenizer st2 = new StringTokenizer(in.readLine());
            trigger = Integer.parseInt(st2.nextToken());
            if (trigger == 1) {
                num = Integer.parseInt(st2.nextToken());
                if (fr.containsKey(num)) {
                    int key = fr.get(num) + 1;
                    fr.replace(num, key);
                } else fr.put(num, 1);
            } else {
                int firstKey = fr.entrySet().stream().min((a,b) -> a.getValue().compareTo(b.getValue())).get().getKey();
                int key = fr.get(firstKey) - 1;
                System.out.println(fr.get(firstKey));
                if (key == 0) {
                    fr.remove(firstKey);
                }
            }
        }
    }
}



