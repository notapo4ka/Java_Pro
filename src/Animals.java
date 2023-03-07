public class Animals {

    private String name;
    private static int animalsCount;
    private static int catsCount;
    private static int dogsCount;

    public Animals(String name) {
        this.name = name;
        animalsCount++;

        if (this instanceof Cat) {
            catsCount++;
        } else if (this instanceof Dog) {
            dogsCount++;
        }
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String run(int distance) {
        return this.name + " пробіг " + distance + " метр/метрів";
    }

    public String swim(int distance) {
        return this.name + " проплив " + distance + " метр/метрів";
    }
}
