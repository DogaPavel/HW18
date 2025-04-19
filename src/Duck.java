public class Duck extends Animal {

    public Duck() {
    }

    public Duck(Double weight, Integer age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках.");
    }
}
