import java.util.Scanner;
public class indexSmall {
    public static int indexOfSmal1estEIement(int[] array) {
        int i;
        int index = 0;  // 存储最小值位置
        for (i = 0; i < 10; i++) {
            if (array[i] < array[index]) {   // 只有当比原数小时才更新
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] myList = new int[10];
        int i;
        // 用户输人10 个数宇
        for (i = 0; i < 10; i++) {
            System.out.print("Enter the " + (i+1) + " number: ");
            Scanner input = new Scanner(System.in);
            myList[i] = input.nextInt();
        }
        int result = indexOfSmal1estEIement(myList);  // 接受方法返回值并输出
        System.out.print("最大值为第" + (result+1) + "个数");
    }
}