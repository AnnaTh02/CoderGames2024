public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object of this task is to find perfect numbers

		int count = 0;
		int first = 2; 
		int last = 100000000;
		
		System.out.println("The program to find perfect numbers between " + first + " and " + last + " has started running");
		
		for(int i = first; i <= last; i++) {
			int sum = 0; 
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					sum = sum + j;					
				}
			}
			if(sum == i) {
				count++;
				
				if(count == 1) {
					System.out.println("The " + count + "st perfect number is: " + i);
				}else if(count == 2){
					System.out.println("The " + count + "nd perfect number is: " + i);
				}else if(count == 3) {
					System.out.println("The " + count + "d perfect number is: " + i);
				}else{
					System.out.println("The " + count + "th perfect number is: " + i);

				}
				
				if(count == 5) {
					break; 
				}
			}
			
		}

	}

}
