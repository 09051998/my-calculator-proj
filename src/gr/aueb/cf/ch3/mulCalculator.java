package gr.aueb.cf.ch3;

public class mulCalculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int result = 0;

        result =mul(num1, num2);

        System.out.println("Result: " + result);

        result = add(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int mul(int a, int b) {
        return a * b;
    }
    public static int add(int a, int b) {
        return a + b;
    }
}
