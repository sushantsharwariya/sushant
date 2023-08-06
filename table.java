import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(a);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" is ");
            System.out.println(a * i);

        }
    }
}
