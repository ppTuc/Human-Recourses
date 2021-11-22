package Com.Tu.humanResources;

import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        ArrayList<Staff> listStaff = new ArrayList<Staff>();
        Mainmenu.input(listStaff);
        Mainmenu.printHeader();
        Mainmenu.checkInformation(listStaff);
        while (true) {
            Mainmenu.printFunctionProgram();
            Mainmenu.space(75);
            System.out.print("Your selection (0 -> 3): ");
            choice = s.nextInt();
            if (choice == 0) {
                System.out.println(" Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1 -> Mainmenu.printFunctionListMenu(listStaff);
                case 2 -> Mainmenu.search(listStaff);
                case 3 -> Mainmenu.addNewStaff(listStaff);
                default -> System.out.println("**Invalid choice. Try again.**");
            }
        }
    }
}
