package Week_1;

import java.nio.charset.StandardCharsets;

public class Excercise_8 {
	public static String encrypt(String matMa,byte key) {
		byte[] a = matMa.getBytes();
		for (int i = 0; i < a.length; i++) {
			a[i]^=key;
		}
		return new String(a,StandardCharsets.UTF_8);
		
	}
	public static String decrypt(String matMa,byte key) {
		return encrypt(matMa,key);
	}
	public static void main(String[] args) {
		byte key=50;
		String encryped=encrypt("Tui ten la Minh",key);
		System.out.println("Tui ten la Minh ENCRYPTED into "+encryped);
		System.out.println(encryped+" DECRYPTED to "+decrypt(encryped, key));
	}
}
