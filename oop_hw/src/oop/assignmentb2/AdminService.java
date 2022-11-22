package oop.assignmentb2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminService {

    //insert neu product to the menu
    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the information of new product.");

        System.out.print("How many product you want to insert: ");
        int numberProduct = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberProduct; i++) {
            System.out.print("Product's type: ");
            String productType = sc.nextLine();
            System.out.print("Product's id: ");
            int productId = sc.nextInt();
            sc.nextLine();
            System.out.print("Product's name: ");
            String productName = sc.nextLine();
            System.out.print("Product's price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Product's quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productType, productId, productName, productPrice, productQuantity);
            Main.productArrayList.add(product);
        }
    }

    //show list product
    public void showListProduct() {
        System.out.println("------------- List of all product ------------- ");
        String header = String.format("%s%15s%15s%15s%15s", "Type", "Id", "Name", "Price", "Quantity");
        System.out.println(header);
        for (Product product : Main.productArrayList) {
            String row = String.format("%s%15d%15s%15f%15d", product.getProductType(), product.getProductId(), product.getProductName(), product.getProductPrice(), product.getProductQuantity());
            System.out.println(row);
        }
    }

    //update product in the menu
    public void updateProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert id of product to update: ");
        int id = sc.nextInt();
        Product product = null;

        for (Product p : Main.productArrayList) {
            if (p.getProductId() == id) {
                product = p;
                break;
            }
        }

        if (product == null) {
            System.out.println("Theres no product.");
        }

        System.out.println("------------- Product information -------------");
        String header = String.format("%s%15s%15s%15s%15s", "Type", "Id", "Name", "Price", "Quantity");
        System.out.println(header);
        String row = String.format("%s%15d%15s%15f%15d", product.getProductType(), product.getProductId(), product.getProductName(), product.getProductPrice(), product.getProductQuantity());
        System.out.println(row);
        for (int i = 0; i < Main.productArrayList.size(); i++) {
            if (id == Main.productArrayList.get(i).getProductId()) {
                sc.nextLine();
                System.out.print("Product's type: ");
                String productType = sc.nextLine();
                System.out.print("Product's id: ");
                int productId = sc.nextInt();
                sc.nextLine();
                System.out.print("Product's name: ");
                String productName = sc.nextLine();
                System.out.print("Product's price: ");
                double productPrice = sc.nextDouble();
                sc.nextLine();
                System.out.print("Product's quantity: ");
                int productQuantity = sc.nextInt();
                sc.nextLine();
                Main.productArrayList.get(i).setProductType(productType);
                Main.productArrayList.get(i).setProductId(productId);
                Main.productArrayList.get(i).setProductName(productName);
                Main.productArrayList.get(i).setProductPrice(productPrice);
                Main.productArrayList.get(i).setProductQuantity(productQuantity);
            }
        }
    }

    public void updateUserProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert id of user: ");
        int id = sc.nextInt();
        User user = null;

        for (User u : Main.userArrayList) {
            if (u.getUserId() == id) {
                user = u;
                break;
            }
        }
        if (user == null) {
            System.out.println("Theres no user.");
        }

        System.out.println("------------- User information -------------");
        String header = String.format("%s%15s%15s%15s", "Id", "Name", "Phone Number", "Gmail");
        System.out.println(header);
        String row = String.format("%d%15s%15s%15s", user.getUserId(), user.getUserName(), user.getUserPhoneNumber(), user.getUserGmail());
        System.out.println(row);

        for (int i = 0; i < Main.userArrayList.size(); i++) {
            if (id == Main.userArrayList.get(i).getUserId()) {

                sc.nextLine();
                System.out.print("Userr's id: ");
                int userId = sc.nextInt();
                sc.nextLine();
                System.out.print("User's name: ");
                String userName = sc.nextLine();
                System.out.print("User's phonenumber: ");
                String userPhoneNumber = sc.nextLine();
                System.out.print("User's gmail: ");
                String userGmail = sc.nextLine();

                Main.userArrayList.get(i).setUserId(userId);
                Main.userArrayList.get(i).setUserName(userName);
                Main.userArrayList.get(i).setUserPhoneNumber(userPhoneNumber);
                Main.userArrayList.get(i).setUserGmail(userGmail);
            }
        }
    }

    public Product getById(int id) {
        Product product = new Product();

        for (Product p : Main.productArrayList) {
            if (p.getProductId() == id) {
                product = p;
                break;
            }
        }
        return product;
    }
}
