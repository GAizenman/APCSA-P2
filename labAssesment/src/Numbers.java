
public class Numbers {
	//runner
	public static void main(String[] args) {
		System.out.println(isGoofy(13));
		//System.out.println(setSomeGoofyNumbers(3));
	}
	

	
	//first method
	public static boolean isGoofy (int num){
		int num1 = (num / 10);
		int num2 = num - (num1 * 10);
		int numTot = 0;
		for (int i = 0; i <= 2; i++){
			if (num%num1 == 0){
				numTot += num1;
			}
			if (num%num2 == 0){
				numTot += num2;
			}
		}
		
		if (numTot%2 == 0){
			return false;
		}
		
		return true;
	}
	
	//second method
	public static int[] setSomeGoofyNumbers (int count){
		int[] goofy = new int[count];
		int haha = 0;
		int num = 1;
		while (haha != count){
			if (isGoofy(num) == true){
				goofy[haha] = num;
				haha += 1;
				num ++;
			}
			else
				num++;
		}
		
		
		return goofy;
	}

}
