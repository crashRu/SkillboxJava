import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свое Фамилию Имя и Отчество:");
        String str = reader.readLine();

        String[] answer = str.split(" ");
        System.out.println("Фамилия: " + answer[0]);
        System.out.println("Имя: " + answer[1]);
        System.out.println("Отчество: " + answer[2]);
    }
}
