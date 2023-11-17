import java.util.Scanner;
class Fact_N{  
 public static void main(String args[]){  
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  
  int i,fact=1;  
 
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
 }  
}  