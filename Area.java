//area of circle 
//PI = 22/7 of 3.14
import java.util.Scanner;

class Area{
public static void main(String[] args){

 final double PI = 3.14,area;
 int r;
 System.out.print("Enter radius of circle ");
 Scanner ref = new Scanner(System.in);
 
 r = ref.nextInt();
 area = PI*r*r;
 
System.out.println("Area of circle " + area);


}
}
