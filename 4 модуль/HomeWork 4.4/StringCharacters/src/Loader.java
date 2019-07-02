public class Loader
{
    private static Object ch;

    public static void main(String[] args)
    {

        for (char c = 1; c <= 512; c++)
        {
            System.out.println("code= "+(int)c+" \t sumbol= "+c);
        }
        for (char c = 'а'; c <= 'я'; c++)
        {
            System.out.println("code= " + (int) c + " \t sumbol= " + c);
        }
    }
}
/**
 code= 1072 	 sumbol= а
 code= 1073 	 sumbol= б
 code= 1074 	 sumbol= в
 code= 1075 	 sumbol= г
 code= 1076 	 sumbol= д
 code= 1077 	 sumbol= е
 code= 1078 	 sumbol= ж
 code= 1079 	 sumbol= з
 code= 1080 	 sumbol= и
 code= 1081 	 sumbol= й
 code= 1082 	 sumbol= к
 code= 1083 	 sumbol= л
 code= 1084 	 sumbol= м
 code= 1085 	 sumbol= н
 code= 1086 	 sumbol= о
 code= 1087 	 sumbol= п
 code= 1088 	 sumbol= р
 code= 1089 	 sumbol= с
 code= 1090 	 sumbol= т
 code= 1091 	 sumbol= у
 code= 1092 	 sumbol= ф
 code= 1093 	 sumbol= х
 code= 1094 	 sumbol= ц
 code= 1095 	 sumbol= ч
 code= 1096 	 sumbol= ш
 code= 1097 	 sumbol= щ
 code= 1098 	 sumbol= ъ
 code= 1099 	 sumbol= ы
 code= 1100 	 sumbol= ь
 code= 1101 	 sumbol= э
 code= 1102 	 sumbol= ю
 code= 1103 	 sumbol= я
 **/