import java.io.File;

public class MyClass {
	public static void main(String[] args) throws Exception {
		String path = "/Users/work/Downloads";
		File name = new File(path);

		if (name.exists()) {
			System.out.printf("Exists: %s", name.getName());

			if (name.isDirectory()) {
				System.out.printf("%nDir: %s", name.getName());
				String dir[] = name.list();
				System.out.println("\nContents:");
				for (String dirName : dir) {
					System.out.printf("  %s%n", dirName);
				}
			}
		} else {
			System.out.printf("Does not exist: %s", path);
		}
	}
}
