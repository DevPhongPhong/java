package J04002;

public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        width = 1;
        height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }
}
