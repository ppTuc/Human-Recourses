package Com.Tu.humanResources;

abstract class Staff {

    String id;
    String firstName;
    String middleName;
    String lastName;
    int age;
    double mulSalary;
    String startDay ;
    String department;
    double offDay;

    abstract void displayInformation();

    abstract void simpleInformation();

    abstract String getDepartment();

    abstract String getId();

    abstract String getLastName();

    abstract int getSalary();

    abstract String getCode();
}
