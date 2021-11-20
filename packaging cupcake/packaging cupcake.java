import java.util.Scanner;

public class packagingcupcakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
//        while(t>0){
        for(int i=1;i<=t;i++){
           int n=sc.nextInt();
           int ans = n/2 + 1;
            System.out.println(ans);
        }
    }
