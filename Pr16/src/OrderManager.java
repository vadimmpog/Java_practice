import java.util.HashMap;

public class OrderManager {
    private Order[] orders;
    private HashMap<String,Order> addressesWithOrders;

    public void add(Order order, int tableNumber){
        orders[tableNumber] = order;
    }

    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }

    public void addDish(Item dish, int tableNumber){
        orders[tableNumber].add(dish);
    }

    public void removeOrder(int tableNumber){
        orders[tableNumber] = null;
    }

    public int freeTableNumber(){
        int num = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null){
                num = i+1;
                break;
            }
        }
        return num;
    }

    public int[] freeTableNumbers(){
        int nums[] = new int[orders.length];
        int j = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null){
                nums[j] = i+1;
                j++;
            }
        }
        return nums;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary(){
        int costSum = 0;
        for (Order o: orders) {
            for (Item i: o.getItems()) {
                costSum += i.getCost();
            }
        }
        return costSum;
    }

    public int dishQuantity(String dishName){
        int q = 0;
        for (Order o: orders) {
            for (Item i: o.getItems()) {
                if (i.getName().equals(dishName))
                    q++;
            }
        }
        return q;
    }

    public void add(Order order, String address){
        addressesWithOrders.put(address, order );
    }

    public Order getOrder(String address) {
        return addressesWithOrders.get(address);
    }

    public void removeOrder(String address){
        addressesWithOrders.remove(address);
    }

    public void addDish(Item dish, String address){
        addressesWithOrders.get(address).add(dish);
    }

    public Order[] getInternetOrders() {
        return (Order[]) addressesWithOrders.values().toArray();
    }

    public double internetOrdersCostSummary(){
        int costSum = 0;
        for (Order o: addressesWithOrders.values()) {
            for (Item i: o.getItems()) {
                costSum += i.getCost();
            }
        }
        return costSum;
    }

    public int internetDishQuantity(String dishName){
        int q = 0;
        for (Order o: addressesWithOrders.values()) {
            for (Item i: o.getItems()) {
                if (i.getName().equals(dishName))
                    q++;
            }
        }
        return q;
    }
}
