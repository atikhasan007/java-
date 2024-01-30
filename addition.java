// JOptionPane
import javax.swing.JOptionPane;

public class addition {

    public static void main (String[] args) {
        double a, b, sum;
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b"));
        sum=a+b;
        JOptionPane.showMessageDialog(null,
            "Value of sum: " + sum);
    }

}
