package step01;

public class SingleA {
	private static SingleB cc =null; //SingleB�� ��ü �ּҸ� ���� ��������   

	public static void main(String[] args) {
		
		cc=SingleB.Sing();
		
		System.out.println(cc);
		cc=SingleB.Sing();
		
		
		System.out.println(cc);
		
		
				
				

	}

}
