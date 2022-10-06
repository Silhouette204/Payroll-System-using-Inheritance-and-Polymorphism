
   public class Salary extends Employee {
   
    private double teachingHours;
    private double noOvertimeHours;
    private double payRate;
    private double overtimePay;
    private double Pay;
    private double Allowance;
    private double OvertimeRate;
    private double Deduction;
    private int noAbsentHours;
   
    public Salary(String name, int employmentID, int types, double teachingHours, double noOvertimeHours, int noAbsentHours) {
        super(name, employmentID, types);
        
        setTeachingHours(teachingHours);
        setNoOvertimeHours(noOvertimeHours);    
        setNoAbsentHours(noAbsentHours);
        setPayRate();
        setOvertimePay();
        setAllowance();
        setOvertimeRate();
        setDeduction();
        setPay();
    }
      public void DisplayInfo() {
   
          
          System.out.println("*********************");
          System.out.println("Name: " + getName());
          System.out.println("Employment ID: " + getEmploymentID());
          System.out.println("Type of Teaching: " + getTypes());
          System.out.println("Basic Pay: " + getBasicPay());
          System.out.println("Teaching Hours: " + getTeachingHours());
          System.out.println("Overtime Hours: " + getNoOvertimeHours());
          System.out.println("Overtime Rate: " + getOvertimeRate());
          System.out.println("Overtime Pay: " + getOvertimePay());
          System.out.println("Pay Rate: " + getPayRate());
          System.out.println("Allowance: " + getAllowance());
          System.out.println("Absent of Hours: " + getNoAbsentHours());
          System.out.println("Deduction: " + getDeduction());   
          System.out.println("======================");
          System.out.println("Pay: " + getPay());
      
      }
    @Override
    public double getPay() {
        return Pay;
    }
    
    public double getTeachingHours() {
        return teachingHours;
    }
    
    public double getNoOvertimeHours() {
        return noOvertimeHours;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getOvertimePay() {
        return overtimePay;
    }
    
     public double getBasicPay() {
        return BasicPay;
    }

    public double getAllowance() {
        return Allowance;
    }
     
    public double getOvertimeRate() {
        return OvertimeRate;
    }
    
    public double getDeduction() {
        return Deduction;
    }

    public int getNoAbsentHours() {
        return noAbsentHours;
    }

    public void setPay() {
        Pay = (getTeachingHours() * getPayRate() + getOvertimePay() + getAllowance() - getDeduction());
    }
    
    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    public void setNoOvertimeHours(double noOvertimeHours) {
        this.noOvertimeHours = noOvertimeHours;
    }

    public void setPayRate() {
        payRate = (1.4);
    }

    public void setOvertimePay() {
        overtimePay = (getNoOvertimeHours() * getPayRate());
    }

    public void setAllowance() {
        Allowance = (getBasicPay() - 0.1) ;
    }
  
    public void setOvertimeRate() {
      OvertimeRate = (getPayRate() / 30 / 8 * 1.4);
    }

    public void setDeduction() {
        Deduction = (getPayRate() * getNoAbsentHours());
    }

    public void setNoAbsentHours(int noAbsentHours) {
        this.noAbsentHours = noAbsentHours;
    }
      
}
