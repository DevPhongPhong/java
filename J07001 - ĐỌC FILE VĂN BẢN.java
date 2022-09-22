import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;

		try {
			inputStream = new FileInputStream("DATA.in");
			int c;
			while ((c = inputStream.read()) != -1) {
				System.out.print((char)c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}
}
