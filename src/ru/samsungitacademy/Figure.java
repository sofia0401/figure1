package ru.samsungitacademy;
public abstract class Figure {
    private float x;
    private float y;
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y=y;
    }
    public abstract float getArea();
    public abstract float getPerimeter();
    Figure (float x, float y){
        this.x=x;
        this.y=y;
    }
}

