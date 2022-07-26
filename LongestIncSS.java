package phase1programs_3;

class LongestIncSS {
	 static int incre_subseq(int arr[], int arrlen){
	      int seq_arr[] = new int[arrlen];
	      int i, j, max = 0;
	      
	      for (i = 0; i < arrlen; i++)
	             seq_arr[i] = 1;
	      
	      for (i = 1; i < arrlen; i++)
	           for (j = 0; j < i; j++)
	                if (arr[i] > arr[j] && seq_arr[i] < seq_arr[j] + 1)
	                       seq_arr[i] = seq_arr[j] + 1;
	      
	      for (i = 0; i < arrlen; i++)
	          if (max < seq_arr[i])
	            max = seq_arr[i];
	      return max;
	   }
	   public static void main(String args[]){
	      int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 89, 20 };
	      int arrlen = arr.length;
	      System.out.println("The length of the longest increasing subsequence is " + incre_subseq(arr, arrlen));
	}
}