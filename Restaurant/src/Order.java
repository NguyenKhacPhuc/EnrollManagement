public class Order {
    private String item;
    private String cost;

    public Order(String item) {
        this.item = item;

    }

    public Order(String item, String cost) {
        this.item = item;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
