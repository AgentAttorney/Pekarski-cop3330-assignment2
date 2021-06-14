package Ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void setFirstName_Basic_True() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setFirstName("FirstName");
        assertEquals(true,actual);
    }
    @Test
    void setFirstName_Basic_False() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setFirstName("J");
        assertEquals(false,actual);
    }
    @Test
    void setFirstName_Common_True() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setFirstName("James");
        assertEquals(true,actual);
    }
    @Test
    void setFirstName_Uncommon_Edge_True() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setFirstName("Ai");
        assertEquals(true,actual);
    }
    @Test
    void setFirstName_Edge_False() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setFirstName(" ");
        assertEquals(false,actual);
    }

    @Test
    void setLastName_True_Common() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setLastName("Smith");
        assertEquals(true,actual);
    }
    @Test
    void setLastName_True_Long() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setLastName("Smittywerbenjagermanjensen");
        assertEquals(true,actual);
    }
    @Test
    void setLastName_False_Space() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setLastName(" ");
        assertEquals(false,actual);
    }
    @Test
    void setLastName_False_Empty() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setLastName("");
        assertEquals(false,actual);
    }

    @Test
    void setID_Example_Prompt() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setID("AA-1234");
        assertEquals(true,actual);
    }
    @Test
    void setID_False_Format_Letters_Numbers() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setID("A12-34");
        assertEquals(false,actual);
    }
    @Test
    void setID_False_Format_Numbers() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setID("AB-13435");
        assertEquals(false,actual);
    }
    @Test
    void setID_False_Format_Letters() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setID("ABCD-1212");
        assertEquals(false,actual);
    }
    @Test
    void setID_False_Swap_Letters_and_Numbers() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setID("6969-DC");
        assertEquals(false,actual);
    }

    @Test
    void setZip_standard_true() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setZip("34241");
        assertEquals(true,actual);
    }
    @Test
    void setZip_standard_false() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setZip("34241-5705");
        assertEquals(false,actual);
    }
    @Test
    void setZip_uncommon_false() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setZip("00001");
        assertEquals(true,actual);
    }
    @Test
    void setZip_Orlando_true() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setZip("32817");
        assertEquals(true,actual);
    }
    @Test
    void setZip_Less_Digits_than_five_False() {
        Employee Hypo_Employee = new Employee();
        boolean actual = Hypo_Employee.setZip("32");
        assertEquals(false,actual);
    }
}