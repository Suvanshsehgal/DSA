public class Main {

    public static void main(String[] args) {
        int [][] arr ={
            {1,4,7,11,15},
            {2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}
            ,{18,21,23,26,30}
        };
        boolean ans = searchMatrix(arr, 100);
        if(ans) System.out.println("true");
        else System.out.println("false");
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; 
        int check = 0 ; 
        for(int i = 0 ; i <n ; i++){
            if(matrix[i][0]<=target){
                check = i ; 
                int ans = bs(matrix[i] ,target);
                if(ans !=-1) return true; 
            }
            continue; 
        }
        return false; 
    }
      private static int bs(int [] row , int target){
        int s = 0 ; 
        int l = row.length - 1 ; 
        while(s<=l){
            int m = s + (l-s)/2;

            if(row[m] == target){
                return m ;
            }
            else if(row[m]<=target){
                s = m +1 ; 
            }
            else{
                l = m - 1 ; 
            }
        }
        return -1 ; 
    }
}