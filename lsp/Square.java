public class Square extends Shape {

    private int side;

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}