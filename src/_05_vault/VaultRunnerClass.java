package _05_vault;

public class VaultRunnerClass {
	public static void main(String[] args) {
		
		Vault vault = new Vault();
		JamesBond bond = new JamesBond ();
		System.out.println(vault.tryCode(26392));
		for (int i = 0; i < 1000001; i++) {
		System.out.println(JamesBond.findCode());	
		}
		
		
	}
}
