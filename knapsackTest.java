public class knapsackTest{
	static int randomInt(int hi){
		return (int)(Math.random()*100) % hi;
	}
	
	public static void main(String argv[]){
		int v[] = {2, 3, 3, 4, 4, 5, 7, 8, 8}; // {6, 10, 12};
		int w[] = {3, 5, 7, 4, 3, 9, 2, 11, 5}; // {1, 2, 3};
		int totalWeight = 15; // 5;
		int n = v.length;
		int c[][] = knapsack.knapsack(v,w,n,totalWeight); //returns a table
		
		/* print the problems out */	
		System.out.print("value\t");
		for(int i = 0 ; i < n; i++)
			System.out.print(v[i] + "\t");
		System.out.print("\nweight\t");
		for(int i = 0 ; i< n ; i++)
			System.out.print(w[i] + "\t");
		System.out.println();
		/* ********************** */
		
		for(int i = 0 ; i <= n; i++){
			for(int j = 0; j <= totalWeight; j++){
				System.out.print(c[i][j] + " ");	
			}
			System.out.println();
		}// print out the table c

		knapsack.trace(c,w); //trace the table to get the solution
	}
}
