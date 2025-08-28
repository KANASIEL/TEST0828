import java.util.Random;

public class test0828 {
    public static void main(String[] args) {
        int[][] intArry = new int[3][4];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < intArry.length; i++) {
            for (int j = 0; j < intArry[i].length; j++) {
                intArry[i][j] = random.nextInt(10);
                sum += intArry[i][j];
                System.out.print(intArry[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("합은 "+ sum);

    }
}
