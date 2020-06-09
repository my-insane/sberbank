package sgu;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class s2021 {
    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        StringTokenizer st2 = new StringTokenizer(in.readLine());
        final int N = Integer.parseInt(st.nextToken());
        List<Integer> FirstArray = new ArrayList();
        for (int i = 0; i < N; i++) {
            FirstArray.add(Integer.parseInt(st2.nextToken()));
        }
        for (int i = 0; i < 2; i++) {
            int maxvalue = Collections.max(FirstArray);
            Collections.replaceAll(FirstArray, maxvalue, maxvalue / 2);
        }
        System.out.println(FirstArray.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(" ")));
    }
}