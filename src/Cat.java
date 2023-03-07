public class Cat extends Animals {

    private final int maxRunMeters = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public String run(int distance) {
        if (distance > maxRunMeters) {
            return this.getName() + " не може пробігти так багато";
        }
        return super.run(distance);
    }

    @Override
    public String swim(int distance) {
        return this.getName() + " не вміє плавати";
    }
}
