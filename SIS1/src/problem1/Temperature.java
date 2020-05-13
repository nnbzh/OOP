package problem1;

public class Temperature {
	private double temp;
	private char letter;
	
//----------------------------Constructors
	public Temperature() {
		temp = 0;
		letter = 'C';
	}
	public Temperature(double temp) {
		this.temp = temp;
	}
	public Temperature(char letter) {
		this.letter = letter;
	}
	public Temperature(double temp, char letter) {
		this.temp = temp;
		this.letter = letter;
	}
	
//----------------------------Setter	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public void setBoth(double temp, char letter) {
		this.temp = temp;
		this.letter = letter;
	}
//----------------------------Getter
	public double getTemp() {
		return temp;
	}
	
	public char getLetter() {
		return letter;
	}
//----------------------------Converter
	public Temperature convertToCelsuis(Temperature t) {
		if (t.letter == 'C') {
			System.out.println("Error. You can not convert Celsius to Celsius. Please, use method 'convertToFahrenheit'");
			return t;
		} else {
			t.temp = 5*(t.temp - 32)/9;
			t.letter = 'F';
			return t;	
		}
	}
	public Temperature convertFahrenheit(Temperature t) {
		if (t.letter == 'F') {
			System.out.println("Error. You can not convert Fahrenheit to Fahrenheit. Please, method 'convertToCelsius'");
			return t;
		} else {
			t.temp = 9*(t.temp/5)+32;
			t.letter = 'C';
			return t;	
		}
	}
}
