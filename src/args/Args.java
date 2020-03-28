package args;

import java.util.Scanner;

public class Args {

    public static void main(String[] args) {
        String name;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int total = 0;
        int G = 0;

        Scanner Keyboard = new Scanner(System.in);
        System.out.print("\nชื่อ - นามสกุล : ");
        name = Keyboard.nextLine();

        Scanner oj = new Scanner(System.in);
        System.out.print("\nคะแนนรายงาน : ");
        num1 = oj.nextInt();
        System.out.print("\nคะแนนสอบกลางภาค : ");
        num2 = oj.nextInt();
        System.out.print("\nคะแนนปลายภาค : ");
        num3 = oj.nextInt();
        System.out.print("\nคะแนนจิตพิสัย : ");
        num4 = oj.nextInt();
        total = num1 + num2 + num3 + num4;
        System.out.println("\nคะแนนรวม:" + total);
        if (total < 55) {
            System.out.println("\nเกรด : 0");
        } else if (total < 60) {
            System.out.println("\nเกรด : 1");
        } else if (total < 65) {
            System.out.println("\nเกรด : 1.5");
        } else if (total < 70) {
            System.out.println("\nเกรด : 2");
        } else if (total < 75) {
            System.out.println("\nเกรด : 2.5");
        } else if (total < 80) {
            System.out.println("\nเกรด : 3");
        } else if (total < 85) {
            System.out.println("\nเกรด : 3.5");
        } else {
            System.out.println("\nเกรด : 4");
        }

    }

}
