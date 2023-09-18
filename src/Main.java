import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ex: ");

        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();

            switch (a) {
                case 1:
                    main1(args);
            }
        }
    }

    public class Cursor {
        int x, y;
        char v;
        int size;

        void m0() {
            x = 4;
            y = 4;
            v = '|';
            size = 5;
        }

        void m1(int a, int b) {
            x = a;
            y = b;
        }
    }

    public class Main1 {
        public static void main1() {
            Cursor one = new Cursor();

            System.out.print("X: " + one.x + ", Y: " + one.y);
            System.out.print("V: " + one.v);
            System.out.print("Size: " + one.size);

            // m1
            try (Scanner in = new Scanner(System.in)) {
                int x = in.nextInt();
                int y = in.nextInt();
            }

            // m2

        }
    }

}
