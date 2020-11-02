import java.util.Scanner;

public class countMatrixDiagonal {
    public static double sumMajorDiagonal (double[][] m) {
        double sum_reult = 0;
        int i;
        for (i=0; i<m.length; i++) {
            sum_reult += m[i][i];
        }
        return sum_reult;
    }
    public static void main(String[] args) {
        double[][] myMat = new double[4][4];
        int i,j;
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (i = 0; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            String number = input.nextLine();
            String[] strs = number.split("\\ ");  // 把一行输入的数分开
            for (j = 0; j < 4; j++) {
                myMat[i][j] = new Double(strs[j]);
            }
        }
        double sum_result = sumMajorDiagonal(myMat); // 计算对角线上的值

        System.out.println("对角线上的值为：" + sum_result);
    }
}
