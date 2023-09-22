import java.util.Scanner;

class Main {

    void main() {
        System.out.println("Ex: ");

        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();

            switch (a) {
                case 1:
                    main1();
            }
        }
    }

    static void main1() {
        Cur one = new Cur(4, 4, '|', 5);
        System.out.println(one.toString());
    }
}

// Class Declaration

class Cur {
    int x, y;
    char v;
    int size;
    boolean vis;

    // Constructor Declaration of Class
    public Cur(int x, int y, char v, int size) {
        this.x = x;
        this.y = y;
        this.v = v;
        this.size = size;
    }

    public int x() {
        System.out.print("X: ");

        while (x < 0) {
            try (Scanner in = new Scanner(System.in)) {
                x = in.nextInt();
            }
        }
        return x;
    }

    // method 2
    public int y() {
        System.out.print("Y: ");
        while (y < 0) {
            try (Scanner in = new Scanner(System.in)) {
                y = in.nextInt();
            }
        }
        return y;
    }

    // method 3
    public char v() {
        System.out.print("V: ");
        while ((v != '|') || (v != '-')) {
            try (Scanner in = new Scanner(System.in)) {
                v = in.next().charAt(v);
            }
        }
        return v;
    }

    // method 4
    public int s() {
        System.out.print("Size: ");

        while ((size < 1) || (size > 15)) {
            try (Scanner in = new Scanner(System.in)) {
                size = in.nextInt();
            }
        }

        return size;
    }

    public boolean vt() {
        System.out.print("Vis: ");

        vis = true;

        return vis;
    }

    public boolean vf() {
        System.out.print("Vis: ");

        vis = false;

        return vis;
    }

}
