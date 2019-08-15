package _05_vault;

import java.util.Random;

public class Vault {
	int secretCode = new Random ().nextInt(1_000_001);
public boolean tryCode (int code) {
	if (code == secretCode) {
		return true;
	}
	else {
		return false;
	}
}
}	

