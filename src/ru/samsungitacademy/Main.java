package ru.samsungitacademy;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.print(circle.getArea()+" ");
        System.out.println(rectangle.getPerimeter());
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
