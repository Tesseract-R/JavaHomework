import java.util.Scanner;
public class reverseNumber{
    public static void reverse(int number) {
        while (number > 10) {
            System.out.print(number % 10);
            number = number / 10;
        }
        System.out.print(number);

    }
    public static void main(String[] args) {
        // 输入一个数
        System.out.println("Enter an int number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // 调用reverse翻转
        reverse(number);
    }
}