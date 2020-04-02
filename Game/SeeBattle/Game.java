import java.lang.*;  
class Game {
	public static void main (String[] args) {
		int numOfGuess = 0;
		DotCom dotCom = new DotCom();
		int firstCell = (int)(Math.random() * 5);
		int[] location = {firstCell, firstCell+1, firstCell+2};
		dotCom.setLocation(location);
		boolean isAktive = true;
		while(isAktive) {
			numOfGuess++;
			GameHelper helper = new GameHelper();
			String userGuess = helper.getUserInput("Введите число");
			String guessResult = dotCom.checkYourself(userGuess);
			if (guessResult.equals("Потопил")) {
				isAktive = false;
			}
		}
		System.out.println("Количество попыток " + numOfGuess);
		
		//int[] arr = {1, 2, 3};
		//System.out.println(Arrays.asList(arr).contains('2'));
		//System.out.println(Arrays.asList(arr).contains('1'));
		//System.out.println(Arrays.asList(arr));
	}
}