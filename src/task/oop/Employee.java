package task.oop;

// TODO: Создайте абстрактный класс "Сотрудник", в котором определены общие характеристики для всех сотрудников (например, имя, возраст).
//  Создайте подклассы для различных типов сотрудников (например, "Менеджер", "Работник склада"),
//  в которых можно описать специфичные методы и свойства.

public abstract class Employee {
    protected int age;
    protected String name;
    protected String education;

    public static int idCounter = 0;


    public Employee(String name, int age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;
        idCounter++;
    }

    protected int salesPlan;
    protected int callsPlan;

    public abstract String getEmployeeInfo();

    public abstract String getEmployeeNumber();

    public abstract int getSalesPlanStatus();

    public abstract int getCallsPlanStatus();


    public static void main(String[] args) {
        Employee V_Lem = new DepHead("Vladimir Lem", 52, "High economic");
        Employee M_Sax = new Secretary("Mona Sax", 43, "Teacher");
        Employee M_Payne = new SalesManager("Max Payne", 49, "Economic");
        Employee J_Bravura = new SalesManager("Jim Bravura", 58, "Economic");

        System.out.println(V_Lem.getEmployeeInfo());


    }


}