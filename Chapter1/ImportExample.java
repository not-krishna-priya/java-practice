import java.util.Random;
import java.util.*;  // This is redundant import since compiler figures out
					// that it only needs Random class of all the calsses imported

public class ImportExample{
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));

	}
}