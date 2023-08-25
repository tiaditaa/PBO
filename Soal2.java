package welcome;

public class Soal2 {
	
	public static void main(String[] args) {
		int i = 42;
		String s = (i<40)?"life":(i>50)?"universe":"everything"; //output yang dihasilkan sesuai dengan i yang diketahui, teknik yang digunakan bernama operator ternary
		System.out.println(s);
	}
}
