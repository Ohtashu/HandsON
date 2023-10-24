package PackageMain;
import java.util.*;
public class CollegeList 
{
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	Employee TypeofPerson = new Employee();
	
	System.out.println("Pres E for Employee, F for Faculty, or S for Student: ");
    String inputUser = scanner.next();
    
    switch(inputUser)
    {
    case "e":
    	 System.out.println("Press Enter after every input.");
    	 String name = scanner.nextLine();
    	 String contact = scanner.nextLine();
    	 Double salary = scanner.nextDouble();
    	 String Depart = scanner.nextLine();
    	 
         TypeofPerson.setName(name);
         TypeofPerson.setContactNum(contact);
         TypeofPerson.setSalary(salary);
         TypeofPerson.setDepartment(Depart);
         
         System.out.println(TypeofPerson.getName());
         System.out.println();
         System.out.println();
         System.out.println();
   break;
   
        
    	
    	
    }
	
}
}
