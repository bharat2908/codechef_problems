import java.util.Scanner;

public class smallfactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int fact=1;
            int n=sc.nextInt();
            for(int j=1;j<n+1;j++) {
                fact = fact*j;

            }
            System.out.println(fact);
        }

    }
}
