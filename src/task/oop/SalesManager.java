package task.oop;

public class SalesManager extends Employee {

    public SalesManager (String name, int age, String education) {
        super(name, age, education);
    }


    @Override
    public String getEmployeeInfo() {
        return null;
    }

    @Override
    public String getEmployeeNumber() {
        return null;
    }

    @Override
    public int getSalesPlanStatus() {
        return 0;
    }

    @Override
    public int getCallsPlanStatus() {
        return 0;
    }
}
