package ru.samsungitacademy;

public class Rectangle extends Figure implements Moveable {

    private float height;
    private float width;
    Rectangle(float x, float y, float height, float width) {
        super(x,y);
        this.height=height;
        this.width=width;
    }
    public float getArea() {
        return this.height * this.width;
    }
    public float getPerimeter() {
        return 2*(this.height + this.width);
    }

    public Rectangle(float x, float y, float height) {
        super(x, y);
    }
    public void move(float dx, float dy)
    {
        super.setX(super.getX()+dx);
        super.setY(super.getY()+dy);
    }
    public void resize(float koeff)
    {
        this.height *= koeff;
        this.width *= koeff;
    }
    public String toString()
    {
        return "Rectangle Center: ("+(super.getX()+dx) + ", "+(super.getY()+dy) +") Height: "+this.height +" Width: "+ this.width;
    }
}
