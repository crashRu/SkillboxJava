public class Loader
{
    public static void main(String[] args)
    {
        for (char c = 'a'; c <= 'z'; c++)
        {
            System.out.printf("'%c':%4d %n", c, (int)c);
        }
        for (char c = 'а'; c <= 'я'; c++)
        {
            if (c == 'е') {
                char d = 'ё';
                System.out.printf("'%c':%4d %n", c, (int) c);
                System.out.printf("'%c':%4d %n", d, (int) d);
            }else{
                System.out.printf("'%c':%4d %n", c, (int) c);
            }
        }
    }
}
