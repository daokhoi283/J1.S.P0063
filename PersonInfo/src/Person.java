public class Person {
    private String name;
    private String address;
    public double salary;
    public Person(){}
    public Person(String xname, String xAddress, double xsalary){
        name = xname;
        address = xAddress;
        salary = xsalary;
    }        
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setName(String xName){
        this.name = xName;
    }
    public void setAddress(String xAddress){
        this.address = xAddress;
    }
    public void setSalary(double salary){
        this.salary = salary;
    } 
}
