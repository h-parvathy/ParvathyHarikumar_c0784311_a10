import javax.swing.*;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        JFrame input;
        input=new JFrame();

        int id = Integer.parseInt(JOptionPane.showInputDialog(input, "Enter Employee ID:"));
        String name = JOptionPane.showInputDialog(input, "Enter Employee Username:");
        double sales = Double.parseDouble(JOptionPane.showInputDialog(input, "Enter sales made this month"));
        double advance = Double.parseDouble(JOptionPane.showInputDialog(input, "Enter advance taken this month:"));
        String month = JOptionPane.showInputDialog(input, "Enter the month:");


        CommissionCalculator calculator = new CommissionCalculator(id,name,sales,advance,month);
        calculator.calcPay();
        calculator.empDetails();
        calculator.saveToFile();
        calculator.printYourName();
    }
}
