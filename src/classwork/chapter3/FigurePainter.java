package classwork.chapter3;

import java.sql.SQLOutput;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (7 - i); j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (7 - i); j++) {
                System.out.print("* ");
            }
            System.out.println();

        }


        }


    }
