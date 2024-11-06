package generalpractice;

import java.util.Scanner;

public class LambdaSwitch {

    public static int calculate(String operation, int a, int b) {
        switch (operation) {
            case "add" -> {
                return a + b;
            }
            case "sub" -> {
                return a - b;
            }
            case "mul" -> {
                return a * b;
            }
            case "div" -> {
                return a / b;
            }
            default -> {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum;
        switch (operation) {
            case "add" -> sum = a + b;
            case "sub" -> sum = a - b;
            case "mul" -> sum = a * b;
            case "div" -> sum = a / b;
            default -> {
                System.out.println("Error");
                sum = 0;
            }
        }
        System.out.print("Sum void type: " + sum + " Sum int type: " + calculate(operation, a, b));
    }
}