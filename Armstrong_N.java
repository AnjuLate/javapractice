import java.util.Scanner;
class Armstrong_N{

    public static void main(String[] args) {
   int originalNum, digit, cubeSum = 0,num;
        
System.out.println("Enter the number:");
Scanner sc = new Scanner(System. in );
num = sc.nextInt();
originalNum = num;

while (num!= 0)
{
digit = num % 10;
cubeSum += Math.pow(digit, 3);
num /= 10;
}

if(cubeSum == originalNum)
System.out.println("Armstrong number");
else
System.out.println("not an Armstrong number");
    }
}