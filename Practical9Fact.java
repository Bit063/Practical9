public class Practical9Fact {
	public static int factIterative(int number){
		int factorial = 1;
		if(number == 0 || number == 1){
			return 1;
		}
		else if(number < 0){
			return 0;
		}
		else{
			while(number > 0){
				factorial *= number;
				number = number - 1;
			}
			return factorial;
		}
	}
	
	public static int factRecursion(int number){
		int factorial = 1;
		if(number == 0 || number == 1){
			return 1;
		}
		else if(number < 0){
			return 0;
		}
		else{
			factorial = number * factRecursion(number - 1);
		}
		return factorial;
	}
	
	public static void main(String[] args){
	
		long[] arr = new long[(int)(System.nanoTime() % 50 + 1)];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (System.nanoTime()%51);
		}
		
		long totalTimeIterative = 0, totalTimeRecursion = 0, startTime, endTime;
		
		for(int i = 0; i < arr.length; i++){
			startTime = System.nanoTime();
			factIterative((int)arr[i]);
			endTime = System.nanoTime();
			totalTimeIterative += (endTime - startTime);
		}
		
		for(int i = 0; i < arr.length; i++){
			startTime = System.nanoTime();
			factRecursion((int)arr[i]);
			endTime = System.nanoTime();
			totalTimeRecursion += (endTime - startTime);
		}
		
		long avgTimeIterative = totalTimeIterative / arr.length;
		long avgTimeRecursion = totalTimeRecursion / arr.length;
		
		if(avgTimeIterative > avgTimeRecursion){
			System.out.println("Recursion method Faster!");
		}else{
			System.out.println("Iterative method Faster!");
		}
	}
}
