import java.util.Random;

public class Vault {
	Random r = new Random();
	int code;

	boolean trycode(int number) {
		if (number == code) {
			return true;
		} else {
			return false;
		}
	}

	public Vault() {
		code = r.nextInt(1000000) + 1;
	}
}