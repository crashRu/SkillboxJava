import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sizeArray = Integer.parseInt(reader.readLine());
		char[][] array = new char[sizeArray + 1][sizeArray + 1];

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j <=array.length; j++) {
				if (i == j || j == array.length - i) {
					array[i][j] = 'X';

				} else if (i == array.length - i) {
					array[i][j] = 'X';
					break;

				} else {
					array[i][j] = ' ';
				}
				System.out.print(array[i][j]);
			}
		}
	}
}