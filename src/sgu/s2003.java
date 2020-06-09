package sgu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2003 {
    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        StringTokenizer st2 = new StringTokenizer(in.readLine());
        final int N = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = 1; i <= N; i += 1) {
            if (i % 2 != 0)
            {
                sum += Integer.parseInt(st2.nextToken());
            }
            else {
                sum -= Integer.parseInt(st2.nextToken());
            }
        }
        System.out.println(sum);
    }
}