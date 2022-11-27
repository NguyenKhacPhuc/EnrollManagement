import java.util.ArrayList;

public class FoodManagement {
    private ArrayList<Food> foodArrayList;


    public FoodManagement(){
        this.foodArrayList = new ArrayList<Food>();
    }

    public FoodManagement(ArrayList<Food> foodArray ) {
        this.foodArrayList = foodArray;
    }

    public void addFood(Food food){
        this.foodArrayList.add(food);
    }

    public ArrayList<Food> getFoodArrayList() {
        return foodArrayList;
    }

    public void setFoodArrayList(ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }

    public void showInfo(){

        String foodHeader = String.format("%s%10s%20s%20s%10s","|","Food","|","Price","|");
        System.out.println(foodHeader);
        System.out.println("____________________________________________________________");

        for(Food food: foodArrayList ){
            String row = String.format("%s%10s%20s%20s%10s","|",food.getItem(),"|",food.getCost(),"|");
            System.out.println(row);
        }
        System.out.println("____________________________________________________________");


    }
}


