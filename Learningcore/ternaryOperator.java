package learn_java;

public class ternaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=75, b=67, c=53;
		//()?(): ()
		//booleanExpression ? expression1 : expression2
		System.out.println((a>b)?(a>c?a:c):(b>c?b:c));
	}

}
