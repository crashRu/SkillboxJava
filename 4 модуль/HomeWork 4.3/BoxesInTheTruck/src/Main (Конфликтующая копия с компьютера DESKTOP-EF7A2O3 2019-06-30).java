public class Main
{
    public static void main(String[] args) {
        int boxes = 675;
        int truck = 1;
        int container;
        int temporaryBoxes = 1;

        while (true) {
            if (temporaryBoxes >= boxes){
                break;
            }
            System.out.println("Грузовик № " + truck);
            truck++;
            for (container = 1; container <= 12; container++) {
                System.out.println("   Контейнер № " + container);

                for (int i = 1; i <= 27 ; i++) {
                    System.out.println("      Ящик № " + temporaryBoxes );
                    temporaryBoxes++;
                }
            }
        }
    }
}
