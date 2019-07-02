
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        cat.createTwin(cat2);
        System.out.println(cat.getWeight());
        System.out.println(cat2.getWeight());
    }

    public static void CreateCat(double weight) {
        Cat cat = new Cat(weight);

    }
}