package ru.samsungitacademy;

public interface Moveable {
    float dx=0.5f;
    float dy=0.5f;
    void move(float dx, float dy);
    void resize(float koeff);
}
