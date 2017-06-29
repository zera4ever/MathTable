package org.itstep;

public class ResultViewer {
	
	public static String showTable(int number1, int number2, String action,  String textResult){
		String textTable = "";
		textTable += "    "+ String.valueOf(number1)+ "\n";
		textTable += action + "  " + String.valueOf(number2)+ "\n";
		textTable += "   ";
		int maxLength = 0;
		if(String.valueOf(number1).length() > maxLength){
			maxLength = String.valueOf(number1).length();	
		}
		if(textResult.length() > maxLength){
			maxLength = textResult.length();
		}
		for(int i = 0; i<maxLength; i++){
			textTable += "-";	
		}
		textTable += "\n";
		textTable += "  "+textResult;
		
		return textTable;
		
	}

}
