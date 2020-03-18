public class GuessGame {
	Plauer p1;
    Plauer p2;
	Plauer p3;
	
	public void startGame () {
		Plauer p1 = new Plauer();
		Plauer p2 = new Plauer();
		Plauer p3 = new Plauer();
		
		int targetNumber = (int)(Math.random()*10);
		String winName = "";
		System.out.println("Загадали цифру: " + targetNumber);
		System.out.println("Поехали!");
		while (true) {
			int p1Guess = p1.guess();
			int p2Guess = p2.guess();
			int p3Guess = p3.guess();
			System.out.println("");
			System.out.println("p1 - " + p1Guess);
			System.out.println("p2 - " + p2Guess);
			System.out.println("p3 - " + p3Guess);
			System.out.println("");
			if (p1Guess == targetNumber) {
				winName = "p1";
			}
			if (p2Guess == targetNumber) {
				winName = "p2";
			}
			if (p3Guess == targetNumber) {
				winName = "p3";
			}
			if (winName != "") {
				break;
			}
		}
		
		System.out.println("Победитель найден!! Это - " + winName);
		System.out.println("Он угадал цифру: " + targetNumber);
		System.out.print(p1.guess());
	}
}