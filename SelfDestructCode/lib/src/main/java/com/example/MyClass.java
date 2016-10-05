package com.example;

import java.util.Scanner;
import java.util.Arrays;


public class MyClass {
    public static void main(String[] args) {
        boolean foundCode = false;
        String[] validCodes = new String[]{"119bY7", "84T642", "K8711v"};
        int codeCountProtocol = 3;


        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a valid code to verify the self destruct sequence:");
            String userCode = userInput.next();

            if (Arrays.asList(validCodes).contains(userCode)) {
                foundCode = true;
                System.out.println("Valid code confirmed.");
                if (userCode.equals("119bY7")) {
                    validCodes[0] = "";
                } else if (userCode.equals("84T642")) {
                    validCodes[1] = "";
                } else if (userCode.equals("K8711v")) {
                    validCodes[2] = "";
                }

            } else {
                System.out.println("Valid code not found.");
            }

            if (foundCode) {
                codeCountProtocol--;
                foundCode = false;
            }
        } while (codeCountProtocol > 0);

        System.out.println("Self-destruct code protocol verified, commencing self-destruct sequence.");

    }
}