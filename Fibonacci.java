public class Fibonacci {
    public static long fibonacci(int n) {
        if (n < 0) {
            System.out.println("Incorrect input");
            return -1; // Error code for invalid input
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int nTerms = 15; // Change this to the number of Fibonacci terms you want
        for (int i = 0; i < nTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time is: " + totalTime + " ms");
    }
}
