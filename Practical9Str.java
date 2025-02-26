public class Practical9Str{
	
	public static void main(String[] args){
	
		long[] arr = new long[(int)(System.nanoTime() % 50 + 1)];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (System.nanoTime()%51);
		}
		
		String s1 = new String();
		StringBuilder s2 = new StringBuilder();
		StringBuffer s3 = new StringBuffer();
		
		long totalTimeStr = 0, totalTimeStrBuild = 0, totalTimeStrBuff = 0, startTime, endTime;
		
		for(int i = 0; i < arr.length; i++){
			startTime = System.nanoTime();
			s1 = s1 + arr[i];
			endTime = System.nanoTime();
			totalTimeStr += (endTime - startTime);
		}
		
		for(int i = 0; i < arr.length; i++){
			startTime = System.nanoTime();
			s2.append(arr[i]);
			endTime = System.nanoTime();
			totalTimeStrBuild += (endTime - startTime);
		}
		
		for(int i = 0; i < arr.length; i++){
			startTime = System.nanoTime();
			s3.append(arr[i]);
			endTime = System.nanoTime();
			totalTimeStrBuff += (endTime - startTime);
		}
		
		if(totalTimeStrBuff < totalTimeStr && totalTimeStrBuff < totalTimeStrBuild){
			System.out.println("StringBuffer is Fastest!");
		}else if(totalTimeStrBuild < totalTimeStr && totalTimeStrBuff > totalTimeStrBuild){
			System.out.println("StringBuilder is Fastest!");
		}else{
			System.out.println("String is Fastest!");
		}
	}
}
