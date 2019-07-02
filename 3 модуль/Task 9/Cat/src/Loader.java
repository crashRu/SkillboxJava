
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat sobziro = new Cat();

        sobziro.restroom();
        System.out.println(sobziro.getStatus());
        System.out.println(Cat.getCount());
        sobziro.restroom();
        sobziro.restroom();
        sobziro.restroom();
        sobziro.restroom();
        sobziro.restroom();
        sobziro.restroom();
        System.out.println(sobziro.getStatus());
        sobziro.feed(100000000.0);
        System.out.println(sobziro.getStatus());
        sobziro.restroom();
        sobziro.restroom();
        sobziro.restroom();
        Cat.createTwin(sobziro);

        System.out.println(Cat.getCount());

        cat.setColorCat(ColorCat.CLASSIC_TABBY);
    }


    public static void CreateCat(double weight) {
        Cat cat = new Cat(weight);

    }
}