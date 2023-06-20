public class StringCalculator {

	public static int add(String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",|\n");


		if (numbersArray.length > 2) {
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
		} else {

			for (String number : numbersArray) {

				// If it is not a number, parseInt will throw an exception
				if (!number.trim().isEmpty()) {

					if (Integer.parseInt(number.trim()) < 0) {
						throw new IllegalArgumentException("Negatives not allowed.");
					} else if (Integer.parseInt(number.trim()) > 1000) {
						throw new IllegalArgumentException("Numbers bigger than 1000 should be ignored");
					} else {
						returnValue += Integer.parseInt(number.trim()); 
					}
				}
			}
		}

		return returnValue;

	}
}
