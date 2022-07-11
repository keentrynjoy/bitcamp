package test.day0711;

public class Ex2dataType {

	int a;//맴버변수임으로 자동초기화.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;//지역변수임으로 반드시 초기화가 필요.
		
		Ex2dataType ex1=new Ex2dataType();
		System.out.println(ex1.a);
		
		System.out.println(b);
		
		byte c=120;
		System.out.println(c);
	}

}
