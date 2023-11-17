class Palindrome_N{
  public static void main(String[] args) {
    int n = 151, revNum = 0, rem;
    int o_Num = n;
    while (n != 0) {
      rem = n% 10;
      revNum = revNum * 10 + rem;
      n/= 10;
    }
if (o_Num == revNum) {
System.out.println("Numberis Palindrome");
 }
else{
System.out.println("number not Palindrome.");
    }
  }
}