package org.itstep;

public class ShowMustGoOn {

	public static void main(String[] args) {
		int number1 = 123;
		int number2 = 15;
		// задали значение числам
		
		String action = "*";
		//задали действие, меняем на деление, умножение итд
		
		int resultAsInt;
		double resultAsDouble;
		String textResult;
		String actionResult;
		//инициализировали действия на основании значений и действий
		
		switch (action) {
		//перебирает результат
		case "+":
			resultAsInt = MathActionExecutor.getSum(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsInt);
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			
			break;
			//брик останавливает кейс в случае прохождения
		case "-":
			resultAsInt = MathActionExecutor.getMinus(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsInt);
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			
			break;
		case "/":
			resultAsDouble = MathActionExecutor.getDivision(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsDouble);
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			
			break;
		case "*":
			resultAsInt = MathActionExecutor.getMultiply(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsInt);
			//преобразовали в строку, то есть вместа числа будет строка
			
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			break;
			
		default:
			//если перебрал и ни одно значение не подойдет то будет сообщение которое выведено ниже
			System.out.println("Action isn't correct!");
			break;
		}

	}

}
