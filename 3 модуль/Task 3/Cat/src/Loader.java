
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat vasia = new Cat();
        Cat jora = new Cat();
        System.out.println(Cat.getCount());

        vasia.feed(999999.9);
        System.out.println(Cat.getCount());
        for (int i = 0; i < 1000000; i++) {
            jora.meow();
        }
        System.out.println(Cat.getCount());    
    }
}