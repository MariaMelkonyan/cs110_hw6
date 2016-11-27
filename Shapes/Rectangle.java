package Shapes;

public class Rectangle {

    private int length;
    private int height;

    public Rectangle() {
    }

    public int getArea() {
        return this.length * this.height;
    }

    public int getLength() {
        return length;
    }
    public void setLenghtHeight(int length, int height) {
        if(length >= 0 && height >= 0) {
            this.length = length;
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }
}
