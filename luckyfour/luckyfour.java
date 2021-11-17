import java.util.Scanner;

public class luckyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n = sc.nextInt();
            int [] a = new int[100];
            int i =0;
            int count = 0;
            while (n != 0) {
                a[i] = n%10;
                n = n/10;
                if (a[i]==4){
                    count++;
                }
                i++;

            }
        }

    }

}
