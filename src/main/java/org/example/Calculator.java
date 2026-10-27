package org.example;

public class Calculator {
    //variables shared by all "Calculator" objects
    float PI = 3.14f;

    public void doNothing(){}
    public int sum(int num1, int num2){
        return num1 + num2;
    }

    // Sobrecarga: mismo nombre, parámetros de tipo double
    public double sum(double num1, double num2){
        return num1 + num2;
    }
}
