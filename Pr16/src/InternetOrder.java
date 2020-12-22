public class InternetOrder implements Order {


    private int size;
    private MyList<Item> list;

    public InternetOrder() {
        list = new MyList<Item>();
        size = 0;
    }

    public InternetOrder(Item[] items) {
        list = new MyList<Item>();
        size = 0;
        for (Item i : items) {
            list.push(i);
            size++;
        }
    }

    @Override
    public boolean add(Item item) {
        boolean f;
        if(f = list.push(item))
            size++;
        return f;
    }

    @Override
    public boolean del(String itemName) {
        return list.pop(itemName);
    }

    @Override
    public int delAll(String itemName) {
        int q = 0;
        while (list.pop(itemName)){
            q++;
        }
        return q;
    }

    @Override
    public int itemQuantity() {
        return size;
    }

    @Override
    public Item[] getItems() {
        return list.ListToTArray();
    }

    @Override
    public double getTotalCost() {
        int sum = 0;
        Item[] a = list.ListToTArray();
        for (Item i:   a) {
            sum += i.getCost();
        }
        return sum;
    }

    @Override
    public int getQuantityByName(String name) {
        int quan = 0;
        Item[] a = list.ListToTArray();
        for (Item i:   a) {
            if(i.getName().equals(name))
                quan ++;
        }
        return quan;
    }

    @Override
    public String[] getItemsNames() {
        String[] names = new String[size];
        Item[] a = list.ListToTArray();
        int j = 0;
        for (Item i:   a) {
            boolean f = true;
            for (String s : names) {
                if(s.equals(i.getName())){
                    f = false;
                    break;
                }
            }
            if(f) {
                names[j] = i.getName();
                j++;
            }
        }
        return new String[0];
    }

    @Override
    public Item[] getSortItems() {
        Item[] items1 = list.ListToTArray();
        int j = 0;

        for (int i = 0; i < size-1; i++) {
            for (int k = (size - 1); k > i; k--) {
                if(items1[k].getCost() < items1[k-1].getCost()){
                    Item a = items1[k];
                    items1[k] = items1[k-1];
                    items1[k-1] = a;
                }
            }
        }

        return items1;
    }
}
