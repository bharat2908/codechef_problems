import java.util.Scanner;


public class atm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int withdraw= in.nextInt();
        double initialamount = in.nextDouble();
        double  totalamount =0;
        if(withdraw < initialamount){
            if(withdraw % 5 ==0){
                totalamount = (double)(initialamount - withdraw - 0.50);
                System.out.format("%.2f",totalamount);
            }else
            {
                System.out.format("%.2f",initialamount);
            }

        }else
        {
            System.out.format("%.2f",initialamount);
        }

    }
}
