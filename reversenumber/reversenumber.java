mport java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int revese = 0;
            while (n!=0) {
                int r = 0;
                r = n % 10;
                revese = revese* 10 + r;
                n = n / 10;
            }
                System.out.println(revese);

        }
    }
}
