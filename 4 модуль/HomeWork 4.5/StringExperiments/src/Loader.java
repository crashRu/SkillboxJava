import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Loader
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("[0-9]+");
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        Matcher matcher = pattern.matcher(text);
        int answer = 0;
        while (matcher.find()) {
            answer += Integer.parseInt(matcher.group());
        }
        System.out.println("В сумме у них получилось денег: " + answer);
    }
}