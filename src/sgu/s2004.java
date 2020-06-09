package sgu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2004 {
    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int year = Integer.parseInt(st.nextToken());
        int out;
        if (year % 4 == 0 ^ year % 100 == 0 ^ year % 400 == 0) {
            out = 1;
        } else {
            out = 0;
        }
        System.out.println(out);
    }
}