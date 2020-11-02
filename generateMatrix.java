import java.util.Scanner;

public class generateMatrix {
    public static void printMatrix(int n) {
        int i, j;
        int k;
        for (i = 0; i < n; i++) {
            for (j=0; j < n; j++) {
                k = Math.random() > 0.5? 1:0; // 随机生成01值
                System.out.print(k);
                System.out.print(' ');
            }
            System.out.print('\n'); // 换行
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter an int number: ");
        Scanner input = new Scanner(System.in);  // 输入nxn矩阵大小
        int number = input.nextInt();
        printMatrix(number);
    }
}
