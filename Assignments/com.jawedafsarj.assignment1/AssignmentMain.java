import com.jawedafsarj.assignment1.employees.copy.Developer;
import com.jawedafsarj.assignment1.employees.copy.Manager;
import com.jawedafsarj.assignment1.utilities.copy.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 75000, "Sales");
        Developer dev = new Developer("Bob", 102, 60000, "Java");

        // Use utilities
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        // Give raises
        EmployeeUtilities.giveRaise(mgr, 10);
        EmployeeUtilities.giveRaise(dev, 15);
    }
	
}
