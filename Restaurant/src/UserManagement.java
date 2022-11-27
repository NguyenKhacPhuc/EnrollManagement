import java.util.ArrayList;

public class UserManagement {
    private ArrayList<Order> orderArrayList;

    public UserManagement(){
        this.orderArrayList = new ArrayList<Order>();
    }
    public UserManagement(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }

    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public void setOrderArrayList(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }

    public void addOrder(Order order){
        this.orderArrayList.add(order);
    }
    public void showOrderList(){
        for(int i = 0 ; i < orderArrayList.size();i++){
            System.out.println(orderArrayList.get(i).getItem());
        }
    }
}
