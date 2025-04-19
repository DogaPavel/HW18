public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(3.0, 3, "Бобик");
        dog.move();
        dog.walk();

        Duck duck = new Duck(1.5, 2, "Кряква");
        duck.move();
        duck.walk();
    }
}