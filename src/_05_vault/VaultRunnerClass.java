package _05_vault;

public class VaultRunnerClass {
	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond bond = new JamesBond ();
		System.out.println(bond.findCode(vault));	
		
	}
}
