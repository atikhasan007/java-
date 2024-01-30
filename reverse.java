import java.util.Scanner;
class reverse{
 public static void main(String[] args){
 
 int n;
 System.out.print("Enter any Number : ");
 Scanner ref = new Scanner(System.in);
  n = ref.nextInt();
  int r = 0;
 while(n>0){
    int rem = n%10;
    r = r*10 + rem;
    n/=10;
 
 
 }
 
 System.out.println("Reverse Number is : "+r);
 
 }
 
}
