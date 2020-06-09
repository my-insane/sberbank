package sgu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2005 {
    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        StringTokenizer st2 = new StringTokenizer(in.readLine());

        final int N = Integer.parseInt(st.nextToken());
        int counter = 0;
        int number;
        int spam = 10001;

        for (int i = 1; i <= N; i += 1) {
            number = Integer.parseInt(st2.nextToken());
            if (spam > number) {
                counter = i;
                spam = number;
            }
        }
        System.out.println(counter);
    }
}
