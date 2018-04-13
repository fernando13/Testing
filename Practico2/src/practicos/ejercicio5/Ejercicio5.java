package practicos.ejercicio5;

public class Ejercicio5 {
/*	
    // (Test Finished after 1,043 seconds )
	public static long fibonacci(long n) {
		
		if (n==0) return 0;
		else if (n==1) return 1;
		else
			return fibonacci(n-2) + fibonacci(n-1);		
	}
*/
	
	// fibonacci iterativo (Test Finished after 0,032 seconds)
	public static long fibonacci(long n){
	    if (n==0) return 0;
	    if (n==1) return 1;
	    if ((n!=0) && (n!=1)){
	        int a = 0;
	        int b = 1;
	        int aux= 0;
	        for(int i=1; i<n ; i++){
	            aux = b;
	            b = a+b;    
	            a = aux;
	        }
	        return b; 
	    }
	    return -1;
	 }
	
/*	
	// fibonacci memoization (Test Finished after 0,032 seconds)
	 public static void memoFib(long[] array, long n){
	        if (n==0) array[0]=0;
	        else
	            if (n==1) array[1]=1;
	            else{
	              if (array [(int) (n-2)]== 0L){
	                memoFib(array,n-2);
	                memoFib(array,n-1);
	              }
	              array[(int) n]= array[(int) (n-2)] + array[(int) (n-1)];
	            }   
	}
	 
	public static long fib (long n){ 
		long[] array = new  long[(int) (n+1)];
	    memoFib(array, n);
	    return array [(int) n];
	}
*/	
	
}