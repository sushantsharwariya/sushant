import java.util.*;

public class pallindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = sc.nextInt();
        int temp = number;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
        if (reverse == temp) {
            System.out.println("the no is pallindrone");
        } else {
            System.out.println("the no is not pallindrone");
        }
    }
}
