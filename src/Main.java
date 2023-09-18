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
        try(
        Scanner in = new Scanner(System.in))
        {

            int x = 4, y = 4;
            char v = '|';
            int size = 5;

            System.out.print("X: " + x + ", Y: " + y);
            System.out.print("V: " + v);
            System.out.print("Size: " + size);
        }

        public static void xy(String[] args){
                 try (Scanner in = new Scanner(System.in)) {
                System.out.print("X: "+ x +", Y: "+ y);
                 }
            }

    }

    public static void main1(String[] args) {

    }

    public void xy(int[] args) {

        Cursor one = new Cursor();
        one.xy();

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("X: ");
            one.x = in.nextInt();
            System.out.print("Y: ");
            one.y = in.nextInt();
        }
        one.xy();

    }

}
