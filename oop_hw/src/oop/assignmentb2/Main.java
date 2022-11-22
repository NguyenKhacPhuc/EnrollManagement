package oop.assignmentb2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Product> productArrayList = new ArrayList<Product>();
    public static ArrayList<User> userArrayList = new ArrayList<User>();
    public static ArrayList<Order> orderArrayList = new ArrayList<Order>();

    public static ArrayList<Admin> adminArrayList = new ArrayList<Admin>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Product p1 = new Product("Food", 1, "Beef", 35000, 10);
        Product p2 = new Product("Food", 2, "Chicken", 30000, 10);
        Product p3 = new Product("Food", 3, "Pork", 40000, 10);
        Product p4 = new Product("Food", 4, "Egg", 25000, 10);
        Product p5 = new Product("Food", 5, "Vegetables", 10000, 10);

        Product p6 = new Product("Drink", 6, "Orange", 40000, 10);
        Product p7 = new Product("Drink", 7, "Lemon", 35000, 10);
        Product p8 = new Product("Drink", 8, "Mango", 20000, 10);
        Product p9 = new Product("Drink", 9, "Apple", 15000, 10);

        productArrayList.add(p1);
        productArrayList.add(p2);
        productArrayList.add(p3);
        productArrayList.add(p4);
        productArrayList.add(p5);
        productArrayList.add(p6);
        productArrayList.add(p7);
        productArrayList.add(p8);
        productArrayList.add(p9);

        Admin admin1 = new Admin("admin1", "SOmething123@");
        Admin admin2 = new Admin("admin2", "SOMething456#");

        adminArrayList.add(admin1);
        adminArrayList.add(admin2);

        menu();
//        userMenu();
    }


    public static void menu() {
        System.out.println("Are you admin or user?");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("admin")) {
            System.out.println("Enter your username: ");
            String username = sc.nextLine();
            System.out.println("Enter your password: ");
            String password = sc.nextLine();
            for (Admin admin : Main.adminArrayList) {
                boolean check1 = admin.checkUsername(username);
                boolean check2 = admin.checkPassword(password);
                if (check1 && check2) {
                    System.out.println("Login successfully");
                    adminMenu();
                    break;
                } else {
                    System.out.println("Wrong username or password!");
                }
            }
        } else if (answer.equalsIgnoreCase("user")) {
            userMenu();
        }
    }


    static void adminMenu() {
        boolean check = true;
        do {
            System.out.println("---------------- ADMIN MENU ----------------");
            System.out.println("1. Add a new item to the menu");
            System.out.println("2. Update name and price of specific item in the menu");
            System.out.println("3. Update user's profile");
            System.out.println("4. Log out");
            System.out.println("5. Exit");
            System.out.println("6. Show product list");
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();
            AdminService adminService = new AdminService();
            switch (choice) {
                case 1:
                    adminService.insert();
                    break;
                case 2:
                    adminService.showListProduct();
                    adminService.updateProduct();
                    break;
                case 3:
                    adminService.updateUserProfile();
                    break;
                case 4:
                    System.out.println("Logged out");
                    menu();
                    break;
                case 5:
                    System.out.println("End the app");
                    check = false;
                    break;
                case 6:
                    adminService.showListProduct();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (check);
    }


    static void userMenu() {
        boolean check = true;
        do {
            System.out.println("---------------- USER MENU ----------------");
            System.out.println("1. Order items");
            System.out.println("2. See the list of ordered items");
            System.out.println("3. Pay for his order");
            System.out.println("Please enter your choice: ");
            int choice = sc.nextInt();
            UserService userService = new UserService();
            AdminService adminService = new AdminService();
            switch (choice) {
                case 1:
                    adminService.showListProduct();
                    userService.order();
                    break;
                case 2:
                    userService.showOrder();
                    break;
                case 3:
                    userService.showBill();
                    System.out.println("Thank u for using our service!");
                    check = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (check);
    }
}