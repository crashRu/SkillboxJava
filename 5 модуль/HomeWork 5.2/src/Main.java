import Controll.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) throws IOException {
		String text;
		AddCommand addCommand = new AddCommand();
		ArrayList<Command> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите пожалуйста команду: ");
		text = reader.readLine();

		addCommand.setText(text);
			System.out.println(addCommand.isMatcherAddNoParamBool());
		}
}
