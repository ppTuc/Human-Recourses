package Com.Tu.humanResources;

class Employee extends Staff {

    double extraTime;


    public Employee(String id, String firstName, String middleName,String lastName , int age, double mulSalary, String start, String department, double offday, double extraTime) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.mulSalary = mulSalary;
        this.startDay = start;
        this.department = department;
        this.offDay = offday;
        this.extraTime = extraTime;
    }

    @Override
    void displayInformation() {
        System.out.println("Id's Member: " + id);
        System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Age : " + age);
        System.out.println("coefficients salary: " + mulSalary);
        System.out.println("work start date this month: " + startDay);
        System.out.println("Department: " + department);
        System.out.println("Some Off Day: " + offDay);
        System.out.println("Some Extra Time: " + extraTime);
        System.out.println("Salary: " + Icalculator.employee(mulSalary,extraTime) + " VND");
        System.out.println();
    }

    void simpleInformation() {
        System.out.println(firstName + " " + middleName + " " + lastName + " " + age + " " + department);
    }

    public String getDepartment() {
        return department;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {return Icalculator.employee(mulSalary,extraTime);}

    public String getCode(){
        return "*******";
    };
}
