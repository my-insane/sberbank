package sgu;

import java.util.*;
import java.io.*;

public class s2002 {
    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        StringTokenizer st2 = new StringTokenizer(in.readLine());
        final int N = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 0; i < N; i += 1) {
            sum += Integer.parseInt(st2.nextToken());
        }
        System.out.println(sum);
    }
}