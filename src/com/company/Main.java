package com.company;

public class Main {
    public static void main(String[] args) {
        Car camry = new Toyota();
        Car x3 = new BMW();

        camry.startEngine();
        System.out.println(camry.isRunAndDrive(true));

        x3.startEngine();
        System.out.println(x3.isRunAndDrive(true));
    }
}