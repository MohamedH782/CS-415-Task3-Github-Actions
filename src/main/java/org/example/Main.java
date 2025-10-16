package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting CI pipeline test...");

        int result = addNumbers(3, 7);
        System.out.println("Sum of 3 + 7 = " + result);

        if (result == 10) {
            System.out.println(" Build and test successful!");
        } else {
            System.out.println(" Test failed: Expected 10");
        }

        System.out.println("Pull request test run ✅");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

}
