package task.oop;

public class DepHead extends Employee {

public DepHead (String name, int age, String education) {
    super(name, age, education);
}

    @Override
    public String getEmployeeInfo() {
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Education: " + education;
    }

    @Override
    public String getEmployeeNumber() {
        return "Number of Employees: " + idCounter;
    }

    @Override
    public int getCallsPlanStatus() {
        return 0;
    }

    @Override
    public int getSalesPlanStatus() {
        return 0;
    }




    public static void main (String [] args) {
    DepHead e1 = new DepHead("Vladimir Lem", 51, "High economic");








}







}
