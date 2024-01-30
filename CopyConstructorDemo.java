public class CopyConstructorDemo{

private int value;
//parameterized constructor
public CopyConstructorDemo(int val){

this.value = val;
}
//copy method 
public void copyFrom(CopyConstructorDemo other){
this.value = other.value;

}
//display
public void display(){
System.out.println("value: " + value);

}



public static void main(String[] args){

CopyConstructorDemo obj1 = new CopyConstructorDemo(10);

CopyConstructorDemo obj2 = new CopyConstructorDemo(0);

//copy value from obj1 to obj2
obj2.copyFrom(obj1);

//display value of both object
obj1.display();
obj2.display();

}





}
