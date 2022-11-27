import java.util.ArrayList;

public class DrinkManagement {
    private ArrayList<Drink> drinkArrayList;


    public DrinkManagement(){
        this.drinkArrayList = new ArrayList<Drink>();
    }

    public DrinkManagement(ArrayList<Drink> drink ) {
        this.drinkArrayList = drink;
    }

    public ArrayList<Drink> getDrinkArrayList() {
        return drinkArrayList;
    }

    public void setDrinkArrayList(ArrayList<Drink> drinkArrayList) {
        this.drinkArrayList = drinkArrayList;
    }

    public void addDrink(Drink drink){
        this.drinkArrayList.add(drink);
    }

    public void showInfo() {

        String foodHeader = String.format("%s%10s%20s%20s%10s","|" ,"Drink", "|", "Price", "|");
        System.out.println(foodHeader);
        System.out.println("____________________________________________________________");

        for (Drink drink : drinkArrayList) {
            String row = String.format("%s%10s%20s%20s%10s", "|",drink.getItem(), "|", drink.getCost(), "|");
            System.out.println(row);
        }
        System.out.println("____________________________________________________________");
    }
    }
