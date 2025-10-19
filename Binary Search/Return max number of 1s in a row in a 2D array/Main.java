public class Main {
    public static void main(String[] args) {
        int [][] arr = {{0,0,1},{1,1,1},{0,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        int ans = findmaxindex(arr, n, m);
        System.out.println("the row with the maximum number of ones is   " + ans);
    }
    public static int findfirstone(int []row, int m){
        int s = 0 ; 
        int l = m-1;
        int firstindex = m;

        while(s<=l){
            int mid = s+(l-s)/2;
            if(row[mid]==1){
                firstindex=mid;
                l=mid-1;
            }
            else{
                s =mid+1;
            }
        }
        return firstindex;
    }
    public static int findmaxindex(int[][]arr,int n , int m){
        int max = 0 ; 
        int maxrowindex = -1; 

        for(int i = 0 ; i<n ; i++){
            int firstoneindex = findfirstone(arr[i], m);
            int onesinthatrow = m - firstoneindex;

            if(onesinthatrow > max){
                max = onesinthatrow;
                maxrowindex = i ;
            }
        }
        return maxrowindex;
    }
}