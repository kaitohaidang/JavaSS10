package org.example;
class Car {

    int currentSpeed = 0;

    void accelerate() {
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +10 km/h");
    }

    void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Car accelerates by " + speed + " km/h");
    }

    void accelerate(int speed, int seconds) {
        int increase = speed * seconds;
        currentSpeed += increase;

        System.out.println(
                "Car accelerates " + increase + " km/h (speed x time)"
        );
    }

    void printStatus() {
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }
}