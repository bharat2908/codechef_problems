import java.util.Scanner;

public class addtwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int T = sc.nextInt();
       // int A+B = 0;
        for(int i=0;i<T;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
