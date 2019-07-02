
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat vasia = new Cat();
        Cat petia = new Cat();
        Cat jora = new Cat();

        System.out.println(cat.getStatus());

        vasia.drink(10000.0);
        System.out.println("Вася " + vasia.getStatus());
        petia.feed(200.0);
        System.out.println("Петя " + petia.getStatus());

        System.out.println("Жора " + jora.getStatus());
        for (int i = 0; i < 10000; i++) {

            jora.meow();
        }
        System.out.println("Жора " + jora.getStatus());

    }
}