public class parameterizedConstructor{
    private int value;

    public parameterizedConstructor(int val) {
        this.value = val;
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        
        parameterizedConstructor obj = new parameterizedConstructor(10);
      
        obj.display();
        

    }
}
