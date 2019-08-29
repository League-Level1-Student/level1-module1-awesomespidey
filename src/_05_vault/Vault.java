package _05_vault;

import java.util.Random;

public class Vault {
	int secretCode = new Random ().nextInt(1_000_001);
	public Vault () {
		
	}
	public Vault (int code) {
		secretCode = code;
	}
	public boolean tryCode (int code) {
	if (code == secretCode) {
		return true;
	}
	else {
		return false;
	}
}
}	

