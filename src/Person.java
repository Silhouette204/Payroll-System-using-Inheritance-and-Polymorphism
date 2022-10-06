
public class Person {
    private String name;
    private int employmentID;

    public Person(String name, int employmentID) {
        setName(name);
        setEmploymentID(employmentID);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getEmploymentID() {
        return employmentID;
    }
    
    public void setEmploymentID(int employmentID) {
        this.employmentID = employmentID;
    }

     
}
