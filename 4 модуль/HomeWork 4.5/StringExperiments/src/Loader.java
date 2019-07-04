import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);
        int payVasia = text.indexOf("Вася заработал");
        int payVa = text.indexOf("руб");
        String str1 = text.substring(payVasia+14, payVa).trim();

        int payMasha = text.indexOf("Маша - ");
        int payMa = text.lastIndexOf("руб");
        String str2 = text.substring(payMasha+6, payMa).trim();
        int symma=Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println("Сумма заработаных денег Маши и Васи состовляет: " + symma);
    }
}