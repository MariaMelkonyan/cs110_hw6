package Shapes;

public class Square {

    private int length;

    public Square() {
    }

    public int getArea() {
        return this.getLength() * this.getLength();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length >= 0) {
            this.length = length;
        }
    }
}
