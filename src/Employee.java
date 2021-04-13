public abstract class Employee {
    protected int id;
    private String empName;
    private double monthlyPay;
    public String month; //public access specifier
    abstract void empDetails();

    public void setMonthlyPay(double pay){this.monthlyPay = pay;}
    public double getMonthlyPay(){return monthlyPay;}
    public void setId(int id){this.id=id;}
    public int getId(){return  id;}
    public void setEmpName(String empName){this.empName = empName;}
    public String getEmpName(){return empName;}
    void setMonth(String month){this.month = month;} //default access specifier
    String getMonth(){return month;} // default access specifier
}
