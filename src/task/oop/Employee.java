package task.oop;

// TODO: Создайте абстрактный класс "Сотрудник", в котором определены общие характеристики для всех сотрудников (например, имя, возраст).
//  Создайте подклассы для различных типов сотрудников (например, "Менеджер", "Работник склада"),
//  в которых можно описать специфичные методы и свойства.

public abstract class Employee {
    protected int age;
    protected String name;
    protected String education;
    protected String jobTitle;

    public static int idCounter = 0;


    public Employee(String name, int age, String education, String jobTitle) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.jobTitle = jobTitle;
        idCounter++;
    }

    protected int salesPlan;
    protected int callsPlan;

    public abstract String getEmployeeInfo();


    public abstract String getSalesPlanStatus();

    public abstract String getCallsPlanStatus();

    public abstract String makeSell();

    public abstract String makeCall();

    public static void main(String[] args) {
        Employee V_Lem = new DepHead("Vladimir Lem", 52, "High economic", "Head of Sales Department");
        Employee M_Sax = new Secretary("Mona Sax", 43, "Teacher", "Secretary of Sales Department");
        Employee M_Payne = new SalesManager("Max Payne", 49, "Economic", "Sales Manager");
        Employee J_Bravura = new SalesManager("Jim Bravura", 58, "Economic", "Sales Manager");

        System.out.println(V_Lem.getEmployeeInfo());
        System.out.println(M_Sax.getEmployeeInfo());
        System.out.println(M_Payne.getEmployeeInfo());
        System.out.println(J_Bravura.getEmployeeInfo());

        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(J_Bravura.makeSell());
        System.out.println(M_Payne.makeSell());
        System.out.println(M_Payne.makeSell());
        System.out.println(M_Payne.makeSell());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(J_Bravura.makeSell());
        System.out.println(J_Bravura.makeSell());
        System.out.println(M_Payne.makeSell());
        System.out.println(J_Bravura.makeSell());
        System.out.println(J_Bravura.makeSell());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Sax.makeCall());
        System.out.println(M_Payne.makeSell());
        System.out.println(M_Payne.makeSell());
        System.out.println(M_Payne.makeSell());
        System.out.println(J_Bravura.makeSell());
        System.out.println(J_Bravura.makeSell());
        System.out.println(M_Payne.makeSell());
        System.out.println(M_Sax.makeCall());
        System.out.println();

        System.out.println(V_Lem.getCallsPlanStatus());
        System.out.println(V_Lem.getSalesPlanStatus());
    }


}