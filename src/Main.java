import java.util.Scanner;

class Main {

    public static void main(String[] args) {
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
        Cur one = new Cur(4, 4, '|', 5, true);
        one.x();
        one.y();
        one.v();
        one.s();
        one.vf();
        one.vt();
    }
}

// Class Declaration

class Cur {
    int x, y;
    char v;
    int size;
    boolean vis;

    // Constructor Declaration of Class
    public Cur(int x, int y, char v, int size, boolean vis) {
        this.x = x;
        this.y = y;
        this.v = v;
        this.size = size;
        this.vis = vis;
        System.out.print("\nX: " + x + "\nY: " + y + "\nV: " + v + "\nSize: " + size + "\nVis: " + vis + "\n");
    }

    public int x() {
        x = -1;
        System.out.print("\nX: ");
        while (x < 0) {
            try (Scanner in = new Scanner(System.in)) {
                x = in.nextInt();
            }
        }
        System.out.print("\nX: " + x);
        return x;
    }

    // method 2
    public int y() {
        y = -1;
        System.out.print("\nY: ");
        while (y < 0) {
            try (Scanner in = new Scanner(System.in)) {
                y = in.nextInt();
            }
        }
        System.out.print("\nY: " + y);
        return y;
    }

    // method 3
    public char v() {
        v = ' ';
        System.out.print("V: ");
        while ((v != '|') || (v != '-')) {
            try (Scanner in = new Scanner(System.in)) {
                v = in.next().charAt(v);
            }
        }
        System.out.print("\nV: " + v);
        return v;
    }

    // method 4
    public int s() {
        size = 0;
        System.out.print("Size: ");

        while ((size < 1) || (size > 15)) {
            try (Scanner in = new Scanner(System.in)) {
                size = in.nextInt();
            }
        }
        System.out.print("\nS: " + size);
        return size;
    }

    public boolean vt() {
        System.out.print("Vis: ");
        vis = true;
        System.out.print("\nVis: " + vis);
        return vis;
    }

    public boolean vf() {
        System.out.print("Vis: ");
        vis = false;
        System.out.print("\nVis: " + vis);
        return vis;
    }

}
