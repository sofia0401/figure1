package ru.samsungitacademy;

public class Circle extends Figure implements Moveable {
    private float radius;

    Circle (float x, float y, float radius) {
        super(x,y);
        this.radius=radius;
    }
    public float getArea() {
        return (float)Math.PI * this.radius * this.radius;
    }
    public float getPerimeter() {
        return (float)Math.PI * 2 * this.radius;
    }
    public void move(float dx, float dy)
    {
        super.setX(super.getX()+dx);
        super.setY(super.getY()+dy);
    }
    public void resize(float koeff)
    {
        this.radius *= koeff;
    }
    public String toString()
    {
        return "Circle Center: ("+(super.getX()+dx) +", "+ (super.getY()+dy) +") Radius "+ this.radius;
    }
}
