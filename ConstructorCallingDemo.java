public class ConstructorCallingDemo{

private int value;

// Parameterized constructor
public ConstructorCallingDemo(int val){

this.value = val;

}

public ConstructorCallingDemo(){
this(0);
}

public void display(){
System.out.println("value: " + value);
}

public static void main(String[] args){
ConstructorCallingDemo obj1 = new ConstructorCallingDemo(10);
ConstructorCallingDemo obj2 = new ConstructorCallingDemo();

obj1.display();
obj2.display();

}


}
