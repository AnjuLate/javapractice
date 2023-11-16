import java.util.Scanner;
class SumoDigit
{
    public static void main(String args[])
    {
        
        
        Scanner sc =new Scanner(System.in);
        int sum=0;
        
        System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        
            System.out.println(sum);
    }
}
