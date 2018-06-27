
public class VaultRunner {
	public static void main(String[] args) {
		Vault v = new Vault();
		JamesBond jb = new JamesBond();
		jb.findcode(v);
		System.out.println(jb.findcode(v));
	}
}
