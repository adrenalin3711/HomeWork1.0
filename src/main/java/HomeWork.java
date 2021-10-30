import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        onValue();
        inValueNatural();
        inValueNaturalReverse();
        printStringAndInt();
        yearVisokosniyOrNeVisokosniy();

    }

    public static boolean onValue() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("within " + " " + c);
            return true;
        } else {
            System.out.println("no within " + " " + c);
            return false;
        }

    }


    public static void inValueNatural() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b >= 0) {
            System.out.println("Number" + " " + b + " is positive");
        } else {
            System.out.println("Number" + " " + b + " is not positive");
        }
    }

    public static boolean inValueNaturalReverse() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b > 0) {
            System.out.println("number is positiv " + b);
            return false;
        } else {
            System.out.println("number is not positiv " + b);
            return true;
        }
    }

    public static void printStringAndInt() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean yearVisokosniyOrNeVisokosniy() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println("Is leap Year ");
            return true;
        } else {
            System.out.println("Is not leap Year ");
            return false;
        }
    }
}
