import java.util.Random;

public class test0828 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] intArray = new int[3][4];
        int sum = 0;
        
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = random.nextInt(10);
                sum += intArray[i][j];
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("합은 "+ sum);
    }
}


