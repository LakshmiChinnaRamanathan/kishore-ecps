package java8package;
@FunctionalInterface
interface addsum{
	public int  getsum(int a,int b);
}

public class Test123 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addsum a1=(a,b)->a+b;
		System.out.println(a1.getsum(2, 3));
	}

}
