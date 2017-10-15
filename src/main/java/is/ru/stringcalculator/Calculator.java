package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String text){
		if(isEmpty(text)) {
			return 0;
		}
		else{
			if(text.contains(",")){
				String numbers[] = text.split(",");
				return sum(numbers);
			}
			return 1;
		}
	}

	private static boolean isEmpty (String text) {
		return text.isEmpty();
	}


	private static int toInt(String number){
		return Integer.parseInt(number);
	}


	private static int sum(String [] numbers){
		int total = 0;
		for(String number : numbers){
			total += toInt(number);
		}
		return total;
	}
}