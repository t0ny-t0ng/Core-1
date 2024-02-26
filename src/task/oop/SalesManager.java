package task.oop;

import static task.oop.DepHead.salesFact;

public class SalesManager extends Employee {



    public SalesManager (String name, int age, String education, String jobTitle) {
        super(name, age, education, jobTitle);
    }

    @Override
    public String getEmployeeInfo() {
        return "Name: " + name + "\n" + jobTitle + "\n" + "Age: " + age + "\n" + "Education: " + education + "\n";
    }
    @Override
    public String getSalesPlanStatus() {
        return "Sales Plan Status Info." + "\n" + "Sales plan: " + salesPlan + "\n" + "Sales Fact: " + salesFact;
    }

    @Override
    public String getCallsPlanStatus() {
        return "Information is unavailable";
    }

    @Override
    public String makeSell() {
        salesFact++;
        return "Conclusion of the Contract, please wait...";}

    @Override
    public String makeCall () {
        return "Operation is unavailable, please contact Sales Manager";
    }


}
