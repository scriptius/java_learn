import java.util.*;
class DotCom {
	private int[] location = new int[3];
	private int[] alreadyKickedCells = {};
	
	public void setLocation(int[] loc) {
		location = loc;
	}
	
	public String checkYourself(String userGuess) {
		int guess = Integer.parseInt(userGuess);
		System.out.println(guess);
		byte cellsNumCounter = 0;
		String result = "Мимо";
		for(int cell : location) {
			boolean isCellKicked = inArray(location, guess);
			boolean isCellAllreadyKicked = (alreadyKickedCells.length == 0)? false : inArray(alreadyKickedCells, guess);	
			if(isCellKicked 
			&& !isCellAllreadyKicked
			) {
				alreadyKickedCells = addIntInArray(alreadyKickedCells, guess);
				result = "Ранил";
				if(location.length == alreadyKickedCells.length) {
					result = "Потопил";
					break;
				}
			}
			cellsNumCounter++;
		}
		System.out.println(result);
		return result;
	}
	
	private static int[] addIntInArray(int[] arr, int value) {	
		int[]newArray = Arrays.copyOf(arr, arr.length + 1);
		newArray[newArray.length - 1] = value;
		return newArray;
	}
	
	private static boolean inArray(final int[] arr, final int key) {
		return Arrays.stream(arr).anyMatch(i -> i == key);
	}
}