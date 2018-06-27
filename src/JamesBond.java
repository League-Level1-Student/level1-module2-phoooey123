
public class JamesBond {

	int findcode(Vault vault) {
		for (int i = 1; i <= 1000000; i++) {
			vault.trycode(i);

			if (i == vault.code) {
				return i;
			}
		}
		return -1;
	}

}
