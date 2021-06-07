public class main {
	public static void main(String args[]) {
		String msg = "I love JAVA!";
		String enc = "";
		String dec = "";
		String key = "Ponomarenko Roman Ruslanovuch";
		int j = 0;
		
		System.out.println("Исходный текст: " + msg);
		System.out.println("Бинарные значения исходного текста:");
		for(int i = 0; i < msg.length(); i++) {
			System.out.print(Integer.toBinaryString((int)msg.charAt(i)) + " ");
		}
		System.out.println("\n\nКлюч: " + key);
		System.out.println("Бинарные значения ключа:");
		for(int i = 0; i < key.length(); i++) {
			System.out.print(Integer.toBinaryString((int)key.charAt(i)) + " ");
		}
		
		System.out.println("\n\nБинарные значения закодированного текста:");
		for(int i = 0; i < msg.length(); i++) {
			enc = enc + (char) (msg.charAt(i) ^ key.charAt(j));
			System.out.print(Integer.toBinaryString((char) (msg.charAt(i) ^ key.charAt(j))) + " ");
			j++;
			if(j==key.length()) {
				j=0;
			}
		}
		System.out.println("\nЗакодированный текст: " + enc);
		
		System.out.println("\nБинарные значения раскодированного текста:");
		j = 0;
		for(int i = 0; i < msg.length(); i++) {
			dec = dec + (char) (enc.charAt(i) ^ key.charAt(j));
			System.out.print(Integer.toBinaryString((char) (enc.charAt(i) ^ key.charAt(j))) + " ");
			j++;
			if(j==key.length()) {
				j=0;
			}
		}
		System.out.println("\nРаскодированный текст: " + dec);
	}
}