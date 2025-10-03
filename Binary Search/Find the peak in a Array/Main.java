public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        int ans = getpeak(arr);
        System.out.println(ans);
        
    }
    public static int getpeak(int [] arr){
        int s = 0 ;
        int l = arr.length -1 ; 
        while(s<l){
            int m = s+(l-s)/2;
            if(arr[m]>arr[m+1]){
                l = m ; 
            }
            else{
                s = m+1;
            }
        }
        return s; 
    }
}
