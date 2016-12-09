package hand.Exam_12826_20161209_1;

public class SuShu {
	
	public static void Prime(){
		int count = 0;
		int i=101;
		outer: for ( i = 101; i <= 200; i++) {
			for (int j = 2; j < i-1; j++) {
				if (i % j == 0) {
					continue outer;
				}
			}
			count++;
			System.out.print(" "+i);
		}
		System.out.println();
	System.out.println(" "+"101-200之间总共有" + count+"个素数");
	}

	public static void main(String[] args) {
		Prime();
	}

}


