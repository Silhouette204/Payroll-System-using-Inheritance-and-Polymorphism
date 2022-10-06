
import java.util.Scanner;
public class Main1 {
    
    
    public static void main(String[] args) {
            
       Scanner s1 = new Scanner(System.in);
       Scanner s2 = new Scanner(System.in);
    
        System.out.println("Enter number of Employees: ");
        int length = s1.nextInt();
        
        Salary[] so = new Salary[length];
         
        for(int x=0; x<length; x++) {
           
            System.out.println("Enter Name: ");
           String name = s2.nextLine();
           
           System.out.println("Enter Employment ID: ");
           int employmentID = s1.nextInt();
            
           System.out.println("Enter Number Teaching type: (1)Teaching Employee (2)Non-Teaching Employee: ");
           int types = s1.nextInt();
           
           System.out.println("Enter Teaching Hours: ");
           double teachingHours = s1.nextDouble();
           
           System.out.println("Enter Overtime Hours: ");
           double noOvertimeHours = s1.nextDouble(); 
            
           System.out.println("Enter Number of Absent Hours: ");
           int noAbsentHours = s1.nextInt();
           
           so[x] =  new Salary (name, employmentID, types, teachingHours, noOvertimeHours, noAbsentHours);
           
    }
        for(int x=0; x<length; x++) {
           so[x].DisplayInfo();     
       
    }

    }
    
}
