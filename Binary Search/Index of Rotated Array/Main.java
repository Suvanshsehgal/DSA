
public class Main {
   public static void main(String[] args) {
    int [] arr  = {4,5,6,7,0,1,2};
    int target = 0 ;
    int s = 0 ;
    int l = arr.length - 1 ;

    while(s<=l){
        int m = s+(l-s)/2;
        if(arr[m]==target){
            System.out.println(m);
        }
        // left sorted 
        if(arr[s]<=arr[m]){
            if(target >=arr[s] && target<arr[m]){
                l = m - 1 ;
            }
            else{
                s = m + 1 ;
            }
        }
        // right sorted 
        else{
            if(target>arr[m] && target<=arr[l]){
                s = m + 1 ;
            }
            else{
                l = m - 1 ;
            }
        }
    }
   } 
}
