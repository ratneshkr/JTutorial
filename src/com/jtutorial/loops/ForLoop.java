package com.jtutorial.loops;

public class ForLoop {

    public void runSingleForLoop(int x) {
        System.out.println("This is for loop example-");

        for (int i = 0; i < x; i++) {
            System.out.println("Hello World");
        }
    }

    public void runNestedForLoop() {
        int k=1;
        for (int i = 5; i >=1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println("");
            k++;
        }
    }
}
