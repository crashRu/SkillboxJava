public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();

        container.count += 7843;
        System.out.println(sumDigits(23456668));
    }

    public static Integer sumDigits(Integer number)
    {
        String s =  Integer.toString(number);
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            a = a + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return a;
    }
}
