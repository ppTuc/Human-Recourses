package Com.Tu.humanResources;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainmenu {
    public static void input(ArrayList<Staff> listStaff) {
        Manager manager = new Manager("HCM0001IT","Pham","Quang","Le",25,1.5,"20/11/2001","IT",1.0,"Project Leader");
        listStaff.add(manager);
        Employee employee = new Employee("HCM1125SA","Nguyen","Linh","Chi",19,0.5,"06/02/2015","Sale",2,5.5);
        listStaff.add(employee);
    }
    public static void addNewStaff(ArrayList<Staff> listStaff) {
        Scanner s = new Scanner(System.in);
        int choice;
        while (true) {
            space(80);
            System.out.println("THÊM NHÂN VIÊN");
            space(75);
            System.out.println("1.Nhân viên bình thường");
            space(75);
            System.out.println("2.Nhân viên quản lý");
            space(75);
            System.out.println("0.Back");
            space(60);
            System.out.print("Your selection (0 -> 2): ");
            choice = s.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1 -> {
                    space(75);
                    System.out.print("Nhập số lượng nhân viên cần thêm: ");
                    int tmp = s.nextInt();
                    for (int i = 1; i < tmp + 1; i++) {
                        listStaff.add(addEmployee(i));
                    }
                }
                case 2 -> {
                    space(75);
                    System.out.print("Nhập số lượng nhân viên cần thêm: ");
                    int tmp = s.nextInt();
                    for (int i = 1; i < tmp + 1; i++) {
                        listStaff.add(addManager(i));
                    }
                }
                default -> {
                    space(75);
                    System.out.println("**Invalid choice. Try again.**");
                }
            }
        }
    }
    /*Thêm một nhân viên bình thường*/
    public static Employee addEmployee(int i) {
        Scanner data = new Scanner(System.in);
        space(80);
        System.out.println("Nhân viên " + i + " : ");
        space(75);
        System.out.print("ID: ");
        String id = data.next();
        space(75);
        System.out.print("Họ: ");
        String firstName = data.next();
        space(75);
        System.out.print("Chữ lót: ");
        String middleName = data.next();
        space(75);
        System.out.print("Tên: ");
        String lastName = data.next();
        space(75);
        System.out.print("Tuổi: ");
        int age = data.nextInt();
        space(75);
        System.out.print("Hệ số lương: ");
        double mulSalary = data.nextDouble();
        space(75);
        System.out.print("Ngày bắt đầu làm việc: ");
        String start = data.next();
        space(75);
        System.out.print("Phòng bang: ");
        String department = data.next();
        space(75);
        System.out.print("Số ngày nghỉ: ");
        double offday = data.nextDouble();
        space(75);
        System.out.print("Số giờ làm thêm: ");
        double extraTime = data.nextDouble();
        Employee Em = new Employee(id, firstName, middleName, lastName, age, mulSalary, start, department, offday, extraTime);
        return Em;
    }
    /*Thêm một nhân viên cấp quản lý*/
    public static Manager addManager(int i) {
        Scanner data = new Scanner(System.in);
        space(80);
        System.out.println("Nhân viên " + i + " : ");
        space(75);
        System.out.print("ID: ");
        String id = data.next();
        space(75);
        System.out.print("Họ: ");
        String firstName = data.next();
        space(75);
        System.out.print("Chữ lót: ");
        String middleName = data.next();
        space(75);
        System.out.print("Tên: ");
        String lastName = data.next();
        space(75);
        System.out.print("Tuổi: ");
        int age = data.nextInt();
        space(75);
        System.out.print("Hệ số lương: ");
        double mulSalary = data.nextDouble();
        space(75);
        System.out.print("Ngày bắt đầu làm việc: ");
        String start = data.next();
        space(75);
        System.out.print("Phòng bang: ");
        String department = data.next();
        space(75);
        System.out.print("Số ngày nghỉ: ");
        double offday = data.nextDouble();
        space(75);
        System.out.print("Chức danh: ");
        String jobTittle = data.next();
        Manager manager = new Manager(id, firstName, middleName, lastName, age, mulSalary, start, department, offday, jobTittle);
        return manager;
    }
    /*In dánh sách chức năng*/
    public static void printFunctionProgram() {
        space(80);
        System.out.println("MENU\n");
        space(75);
        System.out.println("1.Danh sách nhân viên.");
        space(75);
        System.out.println("2.Tìm kiếm.");
        space(75);
        System.out.println("3.Thêm nhân viên.");
        space(75);
        System.out.println("0. Thoát.\n");
    }
    public static void printFunctionListMenu(ArrayList<Staff> listStaff) {
        Scanner s = new Scanner(System.in);
        int choiceList;
        while (true) {
            space(80);
            System.out.println(" DANH SÁCH.");
            space(75);
            System.out.println("1.Danh sách nhân viên.");
            space(75);
            System.out.println("2.Danh sách phòng bang.");
            space(75);
            System.out.println("3.Danh sách nhân viên(có bảng lương từ thấp tới cao)");
            space(75);
            System.out.println("0.Back");
            space(60);
            System.out.print("Your selection (0 -> 3): ");
            choiceList = s.nextInt();
            if (choiceList == 0) {
                break;
            }
            switch (choiceList) {
                case 1 -> printList(listStaff);
                case 2 -> printListDepartment(listStaff);
                case 3 -> {
                    listStaff.sort((o1, o2) -> o1.getSalary() - o2.getSalary());
                    Mainmenu.printList(listStaff);
                }
                default -> System.out.println("**Invalid choice. Try again.**");
            }
        }
    }
    /*In danh sách nhân viên công ty*/
    public static void printList(ArrayList<Staff> listStaff) {
        for (Staff staff : listStaff) {
            staff.displayInformation();
        }
    }
    /*In danh sách phòng bang trong công ty*/
    public static void printListDepartment(ArrayList<Staff> listStaff) {
        Scanner s = new Scanner(System.in);
        int select;
        while (true) {
            space(80);
            System.out.println("DANH SÁCH PHÒNG BANG");
            space(75);
            System.out.println("1.IT.");
            space(75);
            System.out.println("2.Laboratory.");
            space(75);
            System.out.println("3.Sale.");
            space(75);
            System.out.println("0.Back");
            space(60);
            System.out.print("Your selection (0 -> 3): ");
            select = s.nextInt();
            if (select == 0) {
                break;
            }
            switch (select) {
                case 1 -> {
                    for (int i = 0; i < listStaff.size(); i++) {
                        if ((listStaff.get(i).getDepartment()).toUpperCase().startsWith("I")) {
                            listStaff.get(i).simpleInformation();
                        }
                    }
                }
                case 2 -> {
                    for (int i = 0; i < listStaff.size(); i++) {
                        if ((listStaff.get(i).getDepartment()).toUpperCase().startsWith("L")) {
                            listStaff.get(i).simpleInformation();
                        }
                    }
                }
                case 3 -> {
                    for (int i = 0; i < listStaff.size(); i++) {
                        if ((listStaff.get(i).getDepartment()).toUpperCase().startsWith("S")) {
                            listStaff.get(i).simpleInformation();
                        }
                    }
                }
                default -> System.out.println("**Invalid choice. Try again.**");
            }
        }
    }
    /*Tìm kiếm nhân viên công ty*/
    public static void search(ArrayList<Staff> listStaff) {
        Scanner data = new Scanner(System.in);
        while (true) {
            space(75);
            System.out.print("Vui lòng nhập tên hoặc mã số nhân viên bạn muốn tìm: ");
            String tmp = data.next();
            int unknown = 0;
            for (Staff staff : listStaff) {
                if (!((Staff) staff).getLastName().equalsIgnoreCase(tmp)) {
                    if (((Staff) staff).getId().equalsIgnoreCase(tmp)) {
                        ((Staff) staff).displayInformation();
                        unknown++;
                    }
                } else {
                    ((Staff) staff).displayInformation();
                    unknown++;
                }
            }
            if (unknown ==0) {
                space(75);
                System.out.println("Không có nhân viên này trong công ty!!!!!");
            }
            space(75);
            System.out.print("Back? (Y/N)");
            tmp = data.next();
            if (tmp.toUpperCase().startsWith("Y")){
                break;
            }
        }
    }
    /*Kiểm tra nhân viên công ty*/
    public static void checkInformation (ArrayList<Staff> listStaff) {
        Scanner data = new Scanner(System.in);
        String[] info = new String[2];
        boolean check = false;
        do {
            space(60);
            System.out.println("Vui lòng điền thông tin:\n");
            space(50);
            System.out.print("Tên phòng bang: ");
            info[0] = data.next();//*Tên phòng bang*//
            space(50);
            System.out.print("Mã số nhân viên: ");
            info[1] = data.next();//*Id*//
            space(50);
            System.out.println("<=============================================================>\n");
        } while (!check(listStaff, info[0], info[1]));
    }
    public static boolean check(ArrayList<Staff> listStaff,String department, String id) {
        for (Staff staff : listStaff) {
            if (department.equalsIgnoreCase(staff.getDepartment())) {
                return id.equalsIgnoreCase(staff.getId());
            }
        }
        return false;
    }
    public static void printHeader() {
        space(60);
        System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI CHƯỜNG TRÌNH QUẢN LÝ NHÂN SỰ\n");
        space(77);
        System.out.println("CTy TNHH ABC\n");
    }
    public static void space(int a) {
       for (int i=0; i < a; i++) {
           System.out.print(" ");
       }
    }
}

