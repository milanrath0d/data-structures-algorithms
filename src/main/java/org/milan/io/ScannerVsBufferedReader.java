package org.milan.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * BufferedReader is synchronous while scanner is not
 * <p>
 * BufferedReader has larger buffer memory size than scanner
 * <p>
 * BufferedReader is bit faster as compared to scanner because scanner does
 * parsing of input data and buffered reader simply reads sequence of characters
 *
 * @author Milan Rathod
 */
public class ScannerVsBufferedReader {

    public static void main(String[] args) throws IOException {
        ScannerVsBufferedReader scannerVsBufferedReader = new ScannerVsBufferedReader();
        scannerVsBufferedReader.scanner();
        scannerVsBufferedReader.bufferReader();
    }

    private void bufferReader() throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter an integer");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter a String");
        String b = br.readLine();
        System.out.printf("You have entered:- " + a +
                " and name as " + b);
    }

    private void scanner() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter an integer");
        int a = sn.nextInt();
        System.out.println("enter a string");

        // workaround to fix this issue
        sn.nextLine();

        // nextXXX() methods ignore newline character and nextLine() only reads till first newline character
        String b = sn.nextLine();
        System.out.println("you have entered:- " + a + " " + " and name as " + b);
    }
}
