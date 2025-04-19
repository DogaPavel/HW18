public class Dog extends Animal {

    public Dog() {
    }

    public Dog(Double weight, Integer age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.println("Собака по кличке " + super.getName() + " бежит по земле.");
    }
}
