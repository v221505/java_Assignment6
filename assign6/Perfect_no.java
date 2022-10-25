import java.util.Scanner;

public class Perfect_no {
    public static void main(String[] args){
        int n,sum=0;
        System.out.println("Enter any no:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<n; i++)
        {
            if(n%i==0)

            {
                sum=sum+i;
            }
        }
        if(n==sum)
            System.out.println(" Given No is perfect no");
        else
            System.out.println("not perfect no");
    }
}
