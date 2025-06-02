// LoopingStatements.java

public class LoopingStatements {
    public static void main(String[] args) {

        System.out.println("FOR Loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop iteration: " + i);
        }

        System.out.println("\nWHILE Loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        System.out.println("\nDO-WHILE Loop:");
        int k = 1;
        do {
            System.out.println("Do-While loop iteration: " + k);
            k++;
        } while (k <= 3);

        System.out.println("\nENHANCED FOR Loop (for-each):");
        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
