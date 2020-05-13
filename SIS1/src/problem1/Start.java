package problem1;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t = new Temperature();
		t.setBoth(30, 'F');
		t.convertToCelsuis(t);
		System.out.println(t.getTemp());
	}
}
