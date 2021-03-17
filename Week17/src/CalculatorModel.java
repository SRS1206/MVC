
public class CalculatorModel {

	private int addValue;
	private int subValue;
	
	public int addTwoNum(int num1, int num2){
		addValue = num1+num2;
		return addValue;
	}
	public int subTwoNum(int num1, int num2){
		subValue = num1-num2;
		return subValue;
	}

}
