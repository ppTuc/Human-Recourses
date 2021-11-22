package Com.Tu.humanResources;

public interface Icalculator {
    public static int employee(double mulSalary, double extraTime) {
        return (int) (mulSalary * 3_000_000 + extraTime *200_000);
    }
    public static int manager(double mulSalary, String responseSalary) {
        double Salary = mulSalary * 5_000_000;
        if (responseSalary.startsWith("B")) {
            Salary += 8_000_000;
            /*Business Leader */
        } else if (responseSalary.startsWith("P")) {
            Salary += 5_000_000;
            /*Project Leader */
        } else { Salary += 6_000_000 ;};
            /*Technical Leader*/
        return (int) Salary;
    }
}