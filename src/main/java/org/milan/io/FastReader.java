package org.milan.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Milan Rathod
 */
public class FastReader {

    private BufferedReader br;
    private StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() throws IOException {
        if (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public static void main(String[] args) throws IOException {
        FastReader fastReader = new FastReader();

        int n = fastReader.nextInt();
        int k = fastReader.nextInt();

        int count = 0;

        while (n-- > 0) {
            int number = fastReader.nextInt();
            if (number % k == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
