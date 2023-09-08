import java.util.Scanner;
public class Main {
    Person p = new Person();    
    public static Scanner sc = new Scanner(System.in); 
    public static String checkString(){
        while(true){
            String msg = sc.nextLine();
            if(msg.isEmpty()){
                System.out.println("Information cannot be empty!");
                System.out.print("Please input name: ");
            }
            else{
                return msg;
            }
        }
    }
    public static double checkSalary(){
        while(true){
            try { 
                String msg = sc.nextLine();
                if(msg.isEmpty()){
                    System.out.println("You must input Salary.");
                    System.out.print("Please input salary: ");
                }
                else {
                    Double salary = Double.parseDouble(msg);
                    if(salary < 0){
                        System.out.println("Salary is greater than zero");
                        System.out.print("Please input salary: ");
                    }
                    else{
                        return salary;
                    }
            }
            } catch (Exception NumberFormatException) {
                System.out.println("You must input digit."); 
                System.out.print("Please input salary: ");
            }
        }
    }
    public static Person inputPersonInfo(){ 
        String name, address; double salary;
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        name = checkString();
        System.out.print("Please input address: ");
        address = checkString();
        System.out.print("Please input salary: ");
        salary = checkSalary();
        return new Person(name, address, salary);
    }
    public static void sortBySalary(Person[] person){
        try {
            for(int i=0; i < person.length; i++){
                for(int j=i+1; j < person.length; j++){
                    if(person[j].salary < person[i].salary){
                        Person p = person[i];
                        person[i] = person[j];
                        person[j] = p;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Can't Sort Person");
        } 
    }
    
    public static void displayPersonInfo(Person person){
        System.out.println("Information of Person you have entered:");
        System.out.println("Name:" + person.getName());
        System.out.println("Address:" + person.getAddress());
        System.out.println("Salary:" + person.getSalary()); 
    }
    public static void main(String[] args) {
        Person[] p = new Person[3];
        System.out.println("======Management Person programer=====");
        for(int i =0; i < 3; i++){
            p[i] = inputPersonInfo();
        }
        sortBySalary(p);
        System.out.println();
        for(int i =0 ; i < p.length; i++){
            displayPersonInfo(p[i]);
            System.out.println("\n");
        }
    }
}
