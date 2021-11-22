package Com.Tu.humanResources;

class Manager extends Staff {

    String jobTitle;
    private String code = "456258";

    public Manager (String id,String firstName, String middleName,String lastName , int age, double mulSalary, String start, String department, double offDay,String jobTitle){
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.mulSalary = mulSalary;
        this.startDay = start;
        this.department = department;
        this.offDay = offDay;
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInformation() {
        System.out.println("Id's Member: " + id);
        System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Age : " + age);
        System.out.println("coefficients salary: " + mulSalary);
        System.out.println("work start date this month: " + startDay);
        System.out.println("Department: " + department);
        System.out.println("Some Off Day: " + offDay);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + Icalculator.manager(mulSalary,jobTitle) + " VND");
        System.out.println();
    }

    public void simpleInformation() {
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

    public int getSalary() {return Icalculator.manager(mulSalary,jobTitle);}

    public String getCode() {
        return code;
    }
}
