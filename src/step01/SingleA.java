package step01;

public class SingleA {
	private static SingleB cc =null; //SingleB의 객체 주소만 담을 참조변수   

	public static void main(String[] args) {
		
		cc=SingleB.Sing();
		
		System.out.println(cc);
		cc=SingleB.Sing();
		
		
		System.out.println(cc);
				
				

	}

}
