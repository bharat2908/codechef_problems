import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            int n=sc.nextInt();
            int fact = 1;
            for (int j=1; j<n+1; j++)
            {
                fact = fact*j;
            }
            System.out.println(fact);
        }
    }
}
