import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Administrator ad1 = new Administrator("aaaaaaa", "NAM2412lclc@");
        AdministratorManagement administratorManagement = new AdministratorManagement(ad1);
        FoodManagement foodManagement = new FoodManagement();
        DrinkManagement drinkManagement = new DrinkManagement();
        UserManagement userManagement = new UserManagement();
        Food food1 = new Food("Beef", "35.000VND");
        Food food2 = new Food("Chicken", "30.000VND");
        Food food3 = new Food("Pork", "40.000VND");
        Food food4 = new Food("Egg", "25.000VND");
        Food food5 = new Food("Vegetables", "10.000VND");
        Drink drink1 = new Drink("Orange", "40.000VND");
        Drink drink2 = new Drink("Mango", "20.000VND");
        Drink drink3 = new Drink("Apple", "15.000VND");
        Drink drink4 = new Drink("Lemon", "35.000VND");


        foodManagement.addFood(food1);
        foodManagement.addFood(food2);
        foodManagement.addFood(food3);
        foodManagement.addFood(food4);
        foodManagement.addFood(food5);

        drinkManagement.addDrink(drink1);
        drinkManagement.addDrink(drink2);
        drinkManagement.addDrink(drink3);
        drinkManagement.addDrink(drink4);


        System.out.println("HOANG NAM RESTAURANT");
        System.out.println("Ai đấy");
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        if (user.equals("admin")) {
            String username;
            while (true) {
                System.out.println("Press your username");
                username = sc.next();
                if (username.length() < 6) {
                    System.out.println("Not enough character");
                    System.out.println("Please try again");
                } else if (username.equals(administratorManagement.getAdministrator().getUserName())) {
                    break;
                }
            }

            boolean correct = false;
            while (!correct) {
                System.out.println("Press your password");
                String pass;
                pass = sc.next();
                if (pass.equals(administratorManagement.getAdministrator().getPassWord())) {
                    System.out.println("Sign in successfully");
                    correct = true;
                } else correct = checkPass(pass);
            }

            System.out.println("--------------------------------------------------");
            System.out.println("               THIS IS THE RESTAURANT'S MENU");
            foodManagement.showInfo();
            drinkManagement.showInfo();

            int choose;
            do {
                System.out.println("Choose a function:");
                System.out.println("" +
                        "1. Add a new item to the menu.\n" +
                        "2. Update name and price of a specific item in the menu.\n" +
                        "3. Update the user's profile.\n" +
                        "4. Logout.\n" +
                        "5. Exit.\n");
                choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("--------------------------------");
                        System.out.println("ADD NEW ITEM");
                        System.out.println("Choose the item want to add(food/drink)");
                        String type = sc.next();
                        if (type.equals("food")) {
                            System.out.println("Add number of new food ");
                            int numOfNewFoods = sc.nextInt();
                            for (int i = 0; i < numOfNewFoods; i++) {
                                System.out.println("Add name of new food ");
                                String nameOfFood = sc.next();
                                System.out.println("Add the cost");
                                String cost = sc.next();
                                Food food = new Food(nameOfFood, cost);
                                foodManagement.addFood(food);
                            }

                        } else if (type.equals("drink")) {
                            System.out.println("Add number of new drink ");
                            int numOfNewDrinks = sc.nextInt();
                            for (int i = 0; i < numOfNewDrinks; i++) {
                                System.out.println("Add name of new drink ");
                                String nameOfDrink = sc.next();
                                System.out.println("Add the cost");
                                String cost = sc.next();
                                Drink drink = new Drink(nameOfDrink, cost);
                                drinkManagement.addDrink(drink);
                            }

                        } else {
                            System.out.println("ERROR TYPE OF ITEM");
                            System.out.println("Please type again");

                        }
                        System.out.println("New menu");
                        foodManagement.showInfo();
                        drinkManagement.showInfo();
                        System.out.println("--------------------------------");
                        break;
                    case 2:
                        System.out.println("--------------------------------");
                        System.out.println("UPDATE THE ITEM");
                        System.out.println("Choose the item want to update(food/drink)");
                        String type2 = sc.next();
                        if (type2.equals("food")) {
                            System.out.println("Insert the name of the food");
                            String nameOfFood = sc.next();
                            nameOfFood.toLowerCase();
                            for (int i = 0; i < foodManagement.getFoodArrayList().size(); i++) {
                                if (nameOfFood.equals(foodManagement.getFoodArrayList().get(i).getItem().toLowerCase())) {
                                    System.out.println("Add new name of this food ");
                                    nameOfFood = sc.next();
                                    foodManagement.getFoodArrayList().get(i).setItem(nameOfFood);
                                    System.out.println("Add the new cost");
                                    String cost = sc.next();
                                    foodManagement.getFoodArrayList().get(i).setCost(cost);
                                }
                                else{
                                    System.out.println("NOT VALID ITEM");
                                }

                            }
                        } else if (type2.equals("drink")) {
                            System.out.println("Insert the name of the drink");
                            String nameOfDrink = sc.next();
                            nameOfDrink.toLowerCase();
                            for (int i = 0; i < drinkManagement.getDrinkArrayList().size(); i++) {
                                if (nameOfDrink.equals(drinkManagement.getDrinkArrayList().get(i).getItem().toLowerCase())) {
                                    System.out.println("Add new name of this drink ");
                                    nameOfDrink = sc.next();
                                    drinkManagement.getDrinkArrayList().get(i).setItem(nameOfDrink);
                                    System.out.println("Add the new cost");
                                    String cost = sc.next();
                                    drinkManagement.getDrinkArrayList().get(i).setCost(cost);
                                }
                                else{
                                    System.out.println("NOT VALID ITEM");
                                }

                            }

                        } else {
                            System.out.println("ERROR TYPE OF ITEM");
                            System.out.println("Please type again");

                        }
                        System.out.println("New menu");
                        foodManagement.showInfo();
                        drinkManagement.showInfo();
                        System.out.println("--------------------------------");
                        break;
                    case 3:
//                            System.out.println("--------------------------------");
//                            System.out.println("Nhập MSSV");
//                            int studentID = sc.nextInt();
//                            arrayList.findStudent(studentID);
//                            System.out.println("--------------------------------");
//                            break;
                    case 4:
//                            System.out.println("--------------------------------");
//                            System.out.println("Danh sách sinh viên sau khi đã sắp xếp");
//                            arrayList.sortByDepartment();
//                            System.out.println("--------------------------------");
//                            break;
                }
            } while (choose != 0);
        } else if (user.equals("user")) {
            System.out.println("------------------------------------------------------------");
            System.out.println("         WELCOME TO HOANG NAM RESTAURANT");
            System.out.println("           THIS IS THE RESTAURANT'S MENU");
            foodManagement.showInfo();
            drinkManagement.showInfo();
            String orderMore = "yes";
            do {
                System.out.println("Choose the item(food/drink)");
                String choice = sc.next();
                if (choice.equals("food")) {
                    System.out.println("Input the number of the food to order");
                    int numberOfFoodOrder = sc.nextInt();
                    String orderFoodName;
                    for (int i = 0; i < numberOfFoodOrder; i++) {
                        System.out.println("Input the name of the food wanting to order");
                        orderFoodName = sc.next();
                        if (orderFoodName.equalsIgnoreCase(foodManagement.getFoodArrayList().get(i).getItem())) {
                            Order order = new Order(foodManagement.getFoodArrayList().get(i).getItem(), foodManagement.getFoodArrayList().get(i).getCost());
                            userManagement.addOrder(order);
                        } else {
                            System.out.println("NOT VALID FOOD");
                        }
                    }
                    System.out.println("This is your order list");
                    userManagement.showOrderList();
                    System.out.println("Do want to order more?");
                    String answer = sc.next();
                    if (answer.equals("no")) orderMore = "no";

                } else if (choice.equals("drink")) {
                    System.out.println("Input the number of the drink to order");
                    int numberOfDrinkOrder = sc.nextInt();
                    String orderDrinkName;
                    for (int i = 0; i < numberOfDrinkOrder; i++) {
                        System.out.println("Input the name of the drink wanting to order");
                        orderDrinkName = sc.next();
                        if (orderDrinkName.equals(drinkManagement.getDrinkArrayList().get(i).getItem())) {
                            Order order = new Order(drinkManagement.getDrinkArrayList().get(i).getItem(), drinkManagement.getDrinkArrayList().get(i).getCost());
                            userManagement.addOrder(order);
                        } else {
                            System.out.println("NOT VALID DRINK");
                        }
                    }
                    System.out.println("This is your order list");
                    userManagement.showOrderList();
                    System.out.println("Do want to order more?");
                    String answer = sc.next();
                    if (answer.equals("no")) orderMore = "no";
                }
                }while (orderMore.equals("yes")) ;

            }

        }







    public static boolean isStringLowerCase(String str){

        //convert String to char array
        char[] charArray = str.toCharArray();
        int count = 0;
        for(int i=0; i < charArray.length; i++){
            if(count == 4) return true;
            //if any character is not in lower case, return false
            if(Character.isLowerCase( charArray[i] )) count++;

        }


        return false;

    }

    public static boolean isStringUpperCase(String str){

        //convert String to char array
        char[] charArray = str.toCharArray();
        int count = 0;
        for(int i=0; i < charArray.length; i++){
            if(count == 2) return true;
            //if any character is not in lower case, return false
            if( Character.isUpperCase( charArray[i] ))
                count++;
        }

        return false;

    }
    
    public static int countNumberInString(String str){
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                digits++;
        }
        return digits;
    }

    public static boolean checkPass(String pass) {
        if (pass.length() < 8) {
            System.out.println("Not enough character - at least 8 characters ");
            System.out.println("Please try again");
            return false;
        }
        else if (!isStringLowerCase(pass)) {
            System.out.println("Password have to has at least 4 lowercase letters");
            System.out.println("Please try again");
            return false;
        }
        else if (!isStringUpperCase(pass)) {
            System.out.println("Password have to has at least 2 uppercase letters");
            System.out.println("Please try again");
            return false;
        }
        else if (countNumberInString(pass) < 3) {
            System.out.println("Password have to has at least 3 digits");
            System.out.println("Please try again");
            return false;
        }
        else if (pass.indexOf('@') == -1 || pass.indexOf('#') == -1 || pass.indexOf('$') == -1) {
            System.out.println("Please try again");
            return false;
        } else return true;
    }
}


