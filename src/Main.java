import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        System.out.println("Ex: ");

        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();

            switch (a) {
                case 1:
                    main1();
                    break;

                case 2:
                    main2();
                    break;

                case 3:
                    main3();
                    break;
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

    static void main2() {
        int a, b;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("\nA: ");
            a = in.nextInt();
            System.out.print("B: ");
            b = in.nextInt();
            System.out.print("\n");
        }
        Pr one = new Pr(a, b);
        one.P();
        one.S();
        one.Por();
        one.Po();
    }

    static void main3() {
        St s = new St();
        System.out.println("Empty : " + s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("\nS: ");
        s.pr();

        s.pop();
        System.out.println("\nS: ");
        s.pr();

        System.out.println("\n\n\nEl 3.Pos: " + s.search(3));
    }
}

class Cur {
    int x, y;
    char v;
    int size;
    boolean vis;

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

class Pr {
    int a, b;
    int P, S;

    public Pr(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.print("\nA: " + a + "\nB: " + b + "\n");
    }

    public void P() {
        P = 2 * a + 2 * b;
        System.out.print("\nP: " + P);
    }

    public void S() {
        S = a * b;
        System.out.print("\nS: " + S);
    }

    public void Por() {
        int a1 = 4, b1 = 15;
        int P1 = 2 * a1 + 2 * b1, S1 = a1 * b1;
        System.out.print("\n\nA1: " + a1 + "\nB1: " + b1 + "\n");
        if (a < a1) {
            System.out.print("\nA < A1\n");
        }

        else if (a > a1) {
            System.out.print("\nA > A1\n");
        }

        else {
            System.out.print("\nA = A1\n");
        }

        if (b < b1) {
            System.out.print("\nB < B1\n");
        }

        else if (b > b1) {
            System.out.print("\nB > B1\n");
        }

        else {
            System.out.print("\nB = B1\n");
        }

        if (P < P1) {
            System.out.print("\nP < P1\n");
        }

        else if (P > P1) {
            System.out.print("\nP > P1\n");
        }

        else {
            System.out.print("\nP = P1\n");
        }

        if (S < S1) {
            System.out.print("\nS < S1\n");
        }

        else if (S > S1) {
            System.out.print("\nS > S1\n");
        }

        else {
            System.out.print("\nS = S1\n");
        }

        System.out.print("\n\n");
    }

    public void Po() {
        int a1 = 4, b1 = 15;
        int P1 = 2 * a1 + 2 * b1, S1 = a1 * b1;

        int r = 0;
        if (a % a1 == 0) {
            System.out.print("\nA ~ A1\n");
            r += 1;

        } else if (a1 % a == 0) {
            System.out.print("\nA ~ A1\n");
            r += 1;
        } else
            System.out.print("\nA !~ A1\n");

        if (b % b1 == 0) {
            System.out.print("\nB ~ B1\n");
            r += 1;
        } else if (b1 % b == 0) {
            System.out.print("\nB ~ B1\n");
            r += 1;
        } else
            System.out.print("\nB !~ B1\n");

        if (P % P1 == 0) {
            System.out.print("\nP ~ P1\n");
        } else if (P1 % P == 0)
            System.out.print("\nP ~ P1\n");
        else
            System.out.print("\nP !~ P1\n");

        if (S % S1 == 0) {
            System.out.print("\nS ~ S1\n");
        } else if (S1 % S == 0)
            System.out.print("\nS ~ S1\n");
        else
            System.out.print("\nS !~ S1\n");

        if (r == 2) {
            System.out.print("\n\n ~ \n\n\n");
        } else
            System.out.print("\n\n !~ \n\n\n");
    }
}

class St {
    int top;
    int maxsize = 5;
    int[] stack = new int[maxsize];

    St() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int val) {
        if (top == maxsize - 1) {
            System.out.println("\nOverflow");
            return false;
        } else {
            top++;
            stack[top] = val;
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("\nUnderflow");
            return false;
        } else {
            System.out.println("\n\nItem: " + stack[top--]);
            return true;
        }
    }

    int search(int el) {
        if (top < 0) {
            return -1;
        }
        int p = -1;
        top++;

        if (stack[top] == el) {
            p = top;
            System.out.println("\nPos: " + p);
        }
        return 0;
    }

    void pr() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }
}