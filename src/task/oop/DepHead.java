package task.oop;


public class DepHead extends Employee {

    public DepHead(String name, int age, String education, String jobTitle) {
        super(name, age, education, jobTitle);
    }

    static int callsPlan = 100;
    static int callsFact = 0;

    static int salesPlan = 40;
    static int salesFact = 0;

    @Override
    public String getEmployeeInfo() {
        return "Name: " + name + "\n" + jobTitle + "\n" + "Age: Information is unavailable" + "\n" + "Education: Information is unavailable " + "\n";
    }


    @Override
    public String getCallsPlanStatus() {
        return "Calls Plan Status Info." + "\n" + "Calls plan: " + callsPlan + "\n" + "Calls Fact: " + callsFact;
    }

    @Override
    public String getSalesPlanStatus() {
        return "Sales Plan Status Info." + "\n" + "Sales plan: " + salesPlan + "\n" + "Sales Fact: " + salesFact;
    }

    @Override
    public String makeSell() {
        salesFact++;
        return "Conclusion of the Contract, please wait...";
    }


    @Override
    public String makeCall() {
        callsFact++;
        return "Dialing number, please wait...";
    }

}
