
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.getWeight());
        cat.restroom();
        System.out.println(cat.getWeight());
        System.out.println(cat.getEaterFood());
        cat.feed(222.2);
        System.out.println(cat.getEaterFood());
        cat.feed(333.3);
        System.out.println(cat.getEaterFood());
    }
}