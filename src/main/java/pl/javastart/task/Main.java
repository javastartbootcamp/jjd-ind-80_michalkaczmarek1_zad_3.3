package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Czy liczba 40 jest parzysta: " + calculator.isEven(40));
        System.out.println("Czy liczba 39 jest nieparzysta: " + calculator.isOdd(39));
        System.out.println("Pole kola o promieniu 10 wynosi: " + calculator.circleField(10));
        System.out.println("Liczba 20 podniesiona do kwadratu wynosi: " + calculator.power(20));
    }
}
