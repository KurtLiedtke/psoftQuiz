package main.java.hw0;

import java.util.Random;

public class RandomHello {

	public static void main(String[] args) {
		RandomHello randomHello = new RandomHello();
		System.out.println(randomHello.getGreeting());
//
	}

	public String getGreeting() {
			Random randomGenerator = new Random();
			String[] greetings = new String[5];
			greetings[0] = "Kurtchacho";
			greetings[1] = "Gurt";
			greetings[2] = "Kurtsef";
			greetings[3] = "Gurt";
			greetings[4] = "TisKurt";
			return greetings[randomGenerator.nextInt(4)];
		}
	
}
