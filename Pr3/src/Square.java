public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        width = length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        width = length = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
}
