import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int ans=(int)Math.sqrt(n);
            System.out.println(ans);

        }
        }
    }
