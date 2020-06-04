import java.util.Scanner;

public class Fib {
	static int fib(int x, int[] memo) {
		memo[0] = 0;memo[1] = 1; memo[2] = 1;
		if((x!=0)&&(memo[x]!=0)){
		    return memo[x];
		}else{
		    for(int j = 2; j <= x; j++){
			    memo[j] = memo[j-1] + memo[j-2];
		    }
		    return memo[x];
		}
	}
	public static void main(String args[]) {
		int[] arr = new int[47]; 
		int a;
		boolean closed = false;
		Scanner input = new Scanner(System.in);
		while(!closed) {
			System.out.print("Input a integer ");
			a = input.nextInt();
			if(a == -1) {
				input.close();
				closed = true;
			}else{
				a = fib(a, arr);
				System.out.println(a);
			}
		}
	}
}
