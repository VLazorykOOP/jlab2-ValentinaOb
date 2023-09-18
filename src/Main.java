import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main() {
        System.out.println("Ex: ");

        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();

            switch (a) {
                case 1:
                    main1();
            }
        }
    }

    // Class Declaration

    public class Cur {
        int x, y;
        char v;
        int size;

        // Constructor Declaration of Class
        public Cur(int x, int y, char v, int size) {
            this.x = x;
            this.y = y;
            this.v = v;
            this.size = size;
        }

        public int x() {
            System.out.print("X: ");

            try (Scanner in = new Scanner(System.in)) {
                x = in.nextInt();
            }
            if ((x < 0)) {
                throw new Error("X>=0");
            }
            return x;
        }

        // method 2
        public int y() {
            System.out.print("Y: ");

            try (Scanner in = new Scanner(System.in)) {
                y = in.nextInt();
            }
            if ((y < 0)) {
                throw new Error("Y>=0");
            }
            return y;
        }

        // method 3
        public char v() {
            System.out.print("V: ");

            try (Scanner in = new Scanner(System.in)) {
                v = in.next().charAt(v);
            }
            if ((v != '|') || (v != '-')) {
                throw new Error("v='-' or v='='");
            }

            return v;
        }

        // method 4
        public int s() {
            System.out.print("Size: ");

            try (Scanner in = new Scanner(System.in)) {
                size = in.nextInt();
            }
            if ((size < 0) || (size > 15)) {
                throw new Error("0 <= size <= 15");
            }

            return size;
        }

        public void main1() {
            Cur one = new Cur(4, 4, '|', 5);
            System.out.println(one.toString());
        }
    }
}