

public class MathBasic {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int remainder(int a, int b) {
        return a % b;
    }

    static int square(int a) {
        return a * a;
    }

    static int cube(int a) {
        return a * a * a;
    }

    static int absolute(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {

        int x = 12;
        int y = 5;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
        System.out.println("Remainder: " + remainder(x, y));
        System.out.println("Square: " + square(x));
        System.out.println("Cube: " + cube(x));
        System.out.println("Absolute: " + absolute(-20));
    }
}
