package task.oop;

public class DepHead extends Employee {

public DepHead (String name, int age, String education) {      }

    @Override
    public String getEmployeeInfo(String name) {
        System.out.println("Name: " + name + "\n" + "Age: " + age);
        return null;
    }

    @Override
    public String getEmployeeList() {
        return null;
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
