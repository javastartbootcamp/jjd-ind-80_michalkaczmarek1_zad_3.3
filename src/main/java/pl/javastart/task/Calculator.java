package pl.javastart.task;

class Calculator {
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    double circleField(double radius) {
        return Math.PI * (Math.pow(radius, 2));
    }

    double power(int number) {
        return Math.pow(number, 2);
    }
}
