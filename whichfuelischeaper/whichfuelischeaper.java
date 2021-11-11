import java.util.Scanner;

public class whichfuelischeaper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0;i<t;i++){
            int  X = in.nextInt();
            int  Y = in.nextInt();
            int  A = in.nextInt();
            int  B = in.nextInt();
            int  K = in.nextInt();
            int p = 0;
            int d = 0;
            for(int j=1; j<=K; j++) {
                p = X + A;
                d = Y + B;
            }
            if (p < d) {
                System.out.println("PETROL");
            } else if (d < p) {
                System.out.println("DIESEL");
            } else{
                System.out.println("SAME PRICE");
            }
        }
       // in.close();
    }
}
