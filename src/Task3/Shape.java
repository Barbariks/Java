package Task3;

abstract class Shape {
    protected String color;
    protected boolean filled;
    protected double getSide;


    public Shape(){}
    public Shape(String color, boolean filled){}
    public String getColor;

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled;

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    protected double getArea() {
        return 0;
    }

    protected double getPerimeter() {
        return 0;
    }
}
//---------------------------
class Circle extends Shape{
    protected double radius;
    public Circle(){
    this.filled = false;
    this.color = "blue";
    radius = 1;
}
    public Circle(double radius){
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius; }
    public void setRadius(double radius) {
        this.radius = radius; }
    @Override
    public double getArea() {
        return Math.PI*radius*radius; }
    @Override
    public double getPerimeter() {return 2*Math.PI*radius; }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color; }}

//---------------------------

class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length){}
    public Rectangle(double width, double length, String color, boolean filled){}

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
//---------------------------
class Square extends Rectangle{
    protected double side;
    public Square(){
        this.filled = false;
        this.color = "red";
        side = 5;
    }
    public Square(double side){
        this.side = side;
        this.filled = false;
        this.color = "red";
    }
    public Square(double side, String color, boolean filled){
        this.filled = false;
        this.color = "red";
        this.side = side;
    }
    public double getSide(){
        return super.getSide;
    }
    public void setSide(){
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
