public final class  Dish implements Item{
    final private String name;
    final private double cost;
    final private String description;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(String name, double cost, String description) {
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
