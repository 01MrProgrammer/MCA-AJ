public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        int add = a + b;
        int sub = a - b;
        int mult = a * b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);

        // Relational Operators
        boolean isEqual = a == b;
        boolean isGreaterThan = a > b;
        boolean isLessThan = a < b;

        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\nLogical Operators:");
        System.out.println("condition1 AND condition2: " + (condition1 && condition2));
        System.out.println("condition1 OR condition2: " + (condition1 || condition2));
        System.out.println("NOT condition1: " + (!condition1));
    }
}
