public class Main {

    public static void main(String[] args) {

        Animals dogCommander = new Dog("Командер");
        Animals dogPrivate = new Dog("Рядовий");

        Animals catPretty = new Cat("Гарний");
        Animals catUki = new Cat("Юкі");

        System.out.println();

        System.out.println(dogCommander.run(150));
        System.out.println(dogCommander.swim(5));

        System.out.println();

        System.out.println(dogPrivate.run(550));
        System.out.println(dogPrivate.swim(15));

        System.out.println();

        System.out.println(catPretty.run(80));
        System.out.println(catPretty.swim(20));

        System.out.println();

        System.out.println(catUki.run(210));
        System.out.println(catUki.swim(-1));

        System.out.println();

        System.out.println("Кількість котів: " + Animals.getCatsCount());
        System.out.println("Кількість собак: " + Animals.getDogsCount());
        System.out.println("Загальна кількість тварин: " + Animals.getAnimalsCount());
    }


}
