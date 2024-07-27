// author : Chaudhary Rohit Rajeshkumar;


import java.util.Scanner;

class Complex_pat {
    public static void diamond(int n) {
        // upper part loop :
        for (int i = 0; i < n; i++) {
            // loop for printiing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // loop for printing star
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print(" u");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        // lower part loop
        for (int i = n - 1; i > 0; i--) {
            // loop for printing space
            for (int j = n + 1; j > i; j--) {
                System.out.print(" ");
            }
            // loop for priting star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(" u");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }

    public static void hourGlass(int n){
        for (int i = n ; i > 1; i--) {
            // loop for printing space
            for (int j = n ; j > i; j--) {
                System.out.print(" ");
            }
            // loop for priting star
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print(" u");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
        for (int i = 0; i < n; i++) {
            // loop for printiing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // loop for printing star
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print(" u");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        diamond(5); // method call for (diamond pattern)
        // hourGlass(5);
    }
}
