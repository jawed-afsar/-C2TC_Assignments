package com.jawedafsarj.assignment1;

import com.jawedafsarj.assignment1.employees.Developer;
import com.jawedafsarj.assignment1.employees.Manager;
import com.jawedafsarj.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
        Manager mgr = new Manager("Jack", 101, 75000, "Sales");
        Developer dev = new Developer("Rose", 102, 60000, "Java");

        // Use utilities
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        // Give raises
        EmployeeUtilities.giveRaise(mgr, 10);
        EmployeeUtilities.giveRaise(dev, 15);
    }

}
