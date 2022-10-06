
    public class Employee extends Person {
    public double BasicPay;
    private String types;

    public Employee(String name, int employmentID, int types) {
        super(name, employmentID);
        setTypes(types);
        setBasicPay(types);
    } 
  
    public double getPay() { 
        return BasicPay;
    
    }
     public void setBasicPay(int types) {
        if (types == 1) {
           BasicPay = 10000;
        }
      else if (types == 2) { 
            BasicPay = 5000;
      
      }
    }
   
    public String getTypes() {
        return types;
    }
     public void setTypes(int types) {
      if (types == 1) {
        this.types = "Teaching Employee";
    }
      else if (types == 2) {
          this.types = "Non-Teaching Employee";
      }
      
  
    
}
        
    
}
