public class copyConstructor{
    private int value;

    // Parameterized constructor
    public copyConstructor(int val) {
        this.value = val;
    }

    // Copy constructor
    public copyConstructor(copyConstructor other) {
        
        this(other.value);
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Create an object using parameterized constructor
        copyConstructor obj1 = new copyConstructor(10);

        // Create another object using copy constructor
        copyConstructor obj2 = new copyConstructor(obj1);

        // Display values of both objects
        obj1.display(); // Output: Value: 10
        obj2.display(); // Output: Value: 10
    }
}
