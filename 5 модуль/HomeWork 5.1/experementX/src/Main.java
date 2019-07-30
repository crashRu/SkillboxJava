import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите размер Х");
		int sizeArray = Integer.parseInt(reader.readLine());
		char[][] array = new char[sizeArray][sizeArray];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j || j == array.length - i -1) {
					array[i][j] = 'X';
				} else {
					array[i][j] = ' ';
				}
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}