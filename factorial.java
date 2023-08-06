import java.util.*;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no which you want factorial");
        int n = sc.nextInt();
        int j = 1;
        int k = 0;
        for (int i = 1; i <= n; i++) {

            j = j * i;
        }
        System.out.println(j);
    }

}
