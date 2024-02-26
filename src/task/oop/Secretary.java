package task.oop;

import static task.oop.DepHead.callsFact;

public class Secretary extends Employee {

    public Secretary(String name, int age, String education, String jobTitle) {
        super(name, age, education, jobTitle);
    }


    @Override
    public String getEmployeeInfo() {
        return  "Name: " + name + "\n" + jobTitle + "\n" + "Age: " + age + "\n" + "Education: " + education + "\n";
    }

     @Override
    public String getSalesPlanStatus() {
        return "Information is unavailable";
    }

    @Override
    public String getCallsPlanStatus() {
        return "Calls Plan Status Info." + "\n" + "Calls plan: " + callsPlan + "\n" + "Calls Fact: " + callsFact;
    }
@Override
    public String makeCall () {
        callsFact++;
        return "Dialing number, please wait...";}

    @Override
    public String makeSell() {
        return "Operation is unavailable, please contact Sales Manager";
    }




}

