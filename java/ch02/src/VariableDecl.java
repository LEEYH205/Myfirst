
public class VariableDecl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		float num5, num6;
		int num3, num4;
		double result, result2;
		float result3;
		
		num1 = 1.0000001;
		num2 = 2.0000001;
		num3 = 10000001;
		num4 = 20000001;
		//num5 = 1.0000001;
		//num6 = 2.0000001;
		
		result = num1 + num2;
		result2 = (num3 + num4) / 10000000;
		//result3 = num5 + num6;
		
		System.out.println(result);
		System.out.println(result2);
		//System.out.println(result3);
	}

}