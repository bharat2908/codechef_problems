import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T, number, sum = 0;
        T = sc.nextInt();
        while (T > 0) {
             number = sc.nextInt();
           int p = number;
            {
                while (p > 0) {
                    int r = p % 10;
                    p = p / 10;
                    sum += r;
                }
                System.out.println(sum);
                sum = 0;
                T = T - 1;
            }
        }
    }
}





