public class Main {

    public static void main(String[] args) {
        Integer jonyAge = 1;
        Integer saraAge = 1;
        Integer rayanAge = 1;

        Integer junior;
        Integer middle;
        Integer maximum;


        if (jonyAge < saraAge) {
            if (rayanAge < jonyAge) {
                junior = rayanAge;
                middle = jonyAge;
                maximum = saraAge;
            } else if (rayanAge > saraAge) {
                junior = jonyAge;
                middle = saraAge;
                maximum = rayanAge;
            } else {
                junior = jonyAge;
                middle = rayanAge;
                maximum = saraAge;
            }
        } else {
            if (rayanAge < saraAge) {
                junior = rayanAge;
                middle = saraAge;
                maximum = jonyAge;
            } else if (rayanAge > jonyAge) {
                junior = saraAge;
                middle = jonyAge;
                maximum = rayanAge;
            } else {
                junior = saraAge;
                middle = rayanAge;
                maximum = jonyAge;
            }
        }
        System.out.println("Минимальный возвраст: " + junior + " Средний возвраст: " + middle + " Максимальный возвраст: " + maximum + " !!!!!!!!");
    }
}
