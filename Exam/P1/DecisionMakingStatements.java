// DecisionMakingStatements.java

public class DecisionMakingStatements {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("IF Statement:");
        if (num > 0) {
            System.out.println("Number is positive");
        }

        System.out.println("\nIF-ELSE Statement:");
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        System.out.println("\nNESTED IF Statement:");
        if (num > 0) {
            if (num < 100) {
                System.out.println(num + " is a positive number less than 100");
            } else {
                System.out.println(num + " is a positive number greater than or equal to 100");
            }
        }

        System.out.println("\nIF-ELSE-IF LADDER:");
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        System.out.println("\nSWITCH Statement:");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Other Day");
        }
    }
}
