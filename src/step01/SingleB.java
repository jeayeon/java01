package step01;

public class SingleB {
	private static SingleB gle =null;
	private SingleB() {//������
		
		
	}
	
	public static SingleB Sing() {
		if(gle==null) {
			gle = new SingleB();
			
		}
		return gle;
	}

}
