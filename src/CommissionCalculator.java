import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CommissionCalculator extends Employee implements WriteFile{
    protected double sales; // Salesperson's total monthly sale
    protected double rate; // Salespersons commission rate
    protected double commission; // Commission
    protected double advance; // advance drawn

    public CommissionCalculator(int id, String name, double sales, double advance,String month) {
        this.sales = sales;
        this.advance = advance;
        setEmpName(name);
        setId(id);
        setMonth(month);
    }

    public void selectRate(){
        if(this.sales< 10000.00){
            this.rate = 0.05;
        }else if(this.sales>=10000 && this.sales <= 14999){
            this.rate = 0.10;
        }else if(this.sales >= 15000 && this.sales <= 17999){
            this.rate = 0.12;
        }else if(this.sales>=18000 && this.sales <= 21999){
            this.rate = 0.15;
        }else if(this.sales>=22000)
            this.rate = 0.16;
    }

    public void calcPay(){
        selectRate();
        this.commission = this.rate*this.sales;
        setMonthlyPay(this.commission - this.advance);
        if(getMonthlyPay()<0)
            displayFinalPay(false);
        else displayFinalPay();
    }

    @Override
    void empDetails() {
        JFrame tot;
        tot=new JFrame();
        JOptionPane.showMessageDialog(tot,"Employee id: "+getId()
                +"\nEmployee name: "+getEmpName()
                +"\nMonth: "+getMonth()
                +"\nEmployeeSalary: "+ getMonthlyPay());
    }

    @Override
    public void saveToFile() throws FileNotFoundException {
        String filename = getEmpName()+getId()+".txt";
        PrintWriter fw = new PrintWriter(filename);
        fw.println(getEmpName()+"-"+getMonth()+"-"+getMonthlyPay());
        fw.close();

    }

    public void displayFinalPay(){
        JFrame output;
        output=new JFrame();
        JOptionPane.showMessageDialog(output,"Salary of "+getEmpName() + " is "+ getMonthlyPay());

    }

    public void displayFinalPay(boolean flag){
        JFrame err;
        err=new JFrame();
        JOptionPane.showMessageDialog(err,getEmpName() + " need to reimburse "+ getMonthlyPay()+
                "$ to the company","Alert",JOptionPane.WARNING_MESSAGE);
    }

    public void printYourName(){
        JFrame tot;
        tot=new JFrame();
        JOptionPane.showMessageDialog(tot,"Author of this code is Parvathy Harikumar, c0784311");

    }
}
