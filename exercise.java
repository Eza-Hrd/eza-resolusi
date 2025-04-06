package oioi3;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {

        greet(1, "Dani");
        greet(2, "Fikar");
        greet(3, "Eza");
        greet(4, "Mecca");

        System.out.println("The Menus: ");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Chicken");
        System.out.println("4. Ice Cream");

        String choice1 = readMenu("Enter the number of your first Choice (1-4): ");
        String choice2 = readMenu("Enter the number of your second Choice (1-4): ");
        String choice3 = readMenu("Enter the number of your third Choice (1-4): ");

        String menu1 = getMenuItem(choice1);
        String menu2 = getMenuItem(choice2);
        String menu3 = getMenuItem(choice3);

        System.out.println("You Have ordered: "+ menu1+" , "+menu2+" ,and "+menu3+".");


    }

    public static void greet(int num, String name) {
        System.out.println("Hello Mr, " + name + "!");
    }

    public static String readMenu(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String getMenuItem(String choice){
        switch (choice) {
            case "1":
                return "Pizza";
            case "2":
                return "Burger";
            case "3":
                return "Chicken";
            case "4":
                return "Ice Cream";
            default:
                return "Invalid Choice";
        }
    }

}
