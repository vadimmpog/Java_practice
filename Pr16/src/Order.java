
public interface Order {
    public boolean add(Item item);
    public boolean del(String itemName);
    public int delAll(String itemName);
    public int itemQuantity();
    public Item[] getItems();
    public double getTotalCost();
    public int getQuantityByName(String name);
    public String[] getItemsNames();
    public Item[] getSortItems();
}
