import java.util.Scanner;

class letter{

public static void main(String[] args){

char ch;
System.out.print("Enter any Character ");
Scanner ref = new Scanner(System.in);

ch = ref.next().charAt(0);
ch = Character.toLowerCase(ch);

if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' ||ch=='u'){
System.out.println("vowel");
}
else{
System.out.println("consonant");
}



}

}
