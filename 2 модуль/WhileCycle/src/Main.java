import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int secretPinCode = 7567;
        int pinCode = -1;

        Scanner scanner = new Scanner(System.in);
        do {
            if (pinCode == -1) {
                System.out.println("Введите пароль:");
            } else {
                System.out.println("Пароль введён неверно. Введите верный пароль:");
            }
            pinCode = scanner.nextInt();
        } while (pinCode != secretPinCode);

        System.out.println("Пароль введён верно!!!");
    }
}
