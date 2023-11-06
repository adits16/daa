public class fibo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 10;
        int num1 = 0;
        int num2 = 1;
        int nextNumber =0;
        int count = 1;
        System.out.print(num1 + " " + num2 + " ");
        while (count <= n) {
            nextNumber = num1+num2;
            System.out.print(nextNumber + " ");
            count++;
            num1=num2;
            num2=nextNumber;
            
        }
        System.out.println();

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time is: " + totalTime + " ms");
    }
}
