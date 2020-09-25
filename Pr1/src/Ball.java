public class Ball {
    private String color;
    private double radius;
    private String material;

    public Ball(String color, double radius, String material) {
        this.color = color;
        this.radius = radius;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", material='" + material + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public String getMaterial() {
        return material;
    }
}
