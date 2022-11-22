package oop.assignmentb2;

import java.util.Scanner;

public class UserService {

    public void order() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------- Buy the product ----------------");

        System.out.println("Enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Enter your phonenumber: ");
        String phonenumber = sc.nextLine();
        System.out.println("Enter your gmail: ");
        String userGmail = sc.nextLine();

        User user = new User(userName, phonenumber, userGmail);
        Main.userArrayList.add(user);

        int cancel = -1;
        while (true) {
            System.out.println("Enter the product's id (-1 if you want to end the order): ");
            int productId = sc.nextInt();
            if (productId == -1) {
                break;
            }
            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();

            Product product = null;
            for (Product p : Main.productArrayList) {
                if (p.getProductId() == productId) {
                    product = p;
                    break;
                }
            }
            if (product == null) {
                System.out.println("There's no product.");
            }

            Order order = new Order();
            order.setOrderId(1);
            order.setProductId(productId);
            order.setPrice(product.getProductPrice());
            order.setQuantity(quantity);

            Main.orderArrayList.add(order);
        }
    }

    public void showOrder() {
        System.out.println("---------------- List of product buy ----------------");
        String header = String.format("%s%15s%30s%30s", "Id", "User name", "Phone number", "Email");
        System.out.println(header);
        AdminService adminService = new AdminService();
        for (User user : Main.userArrayList) {
            String row = String.format("%d%15s%30s%30s", user.getUserId(), user.getUserName(),
                    user.getUserPhoneNumber(), user.getUserGmail());
            System.out.println(row);
        }

        String header2 = String.format("%s%15s%30s%30s", "STT", "Product Name", "Price", "Quanitity");
        System.out.println(header2);
        int i = 1;
        for (Order order : Main.orderArrayList) {
            Product p = adminService.getById(order.getProductId());
            String orderDetail = String.format("%d%10s%30f%30d", i, p.getProductName(), order.getPrice(), order.getQuantity());
            System.out.println(orderDetail);
            i++;
        }
    }

    public void showBill() {
        System.out.println("---------------- Bill ----------------");
        String header = String.format("%s%15s%30s%30s", "STT", "Product Name", "Price", "Quantity");
        System.out.println(header);
        AdminService adminService = new AdminService();
        int i = 1;
        for (Order order : Main.orderArrayList) {
            Product p = adminService.getById(order.getProductId());
            String orderDetail = String.format("%d%10s%30f%30d", i, p.getProductName(), order.getPrice(), order.getQuantity());
            System.out.println(orderDetail);
            i++;
        }

        double totalMoney = 0;

        for (Order order : Main.orderArrayList) {
            Product p = adminService.getById(order.getProductId());
            totalMoney += order.getPrice() * order.getQuantity();
        }
        String header2 = String.format("%s%75f", "Total: ", totalMoney);
        System.out.println(header2);
    }

}
