import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            int t=sc.nextInt();
            int [] array=new int[t];
            for(int i=0; i<t; i++)
            {
                array[i]=sc.nextInt();
            }
            Arrays.sort(array);
            for(int i=0; i<t; i++)
            {
                System.out.println(array[i]);
            }
        }
    }
}
