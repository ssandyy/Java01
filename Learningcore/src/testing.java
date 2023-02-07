

public class testing {
	public static void main(String[] args) {
		Abc abc = new Abc();
		System.out.println(abc.c);
	}
}

class Abc {
	private int a = 10;
	protected int b = 20;
	public int c = 30;
}

class Def extends Abc {
	public void testPrint() {
		System.out.println();
	}
}
