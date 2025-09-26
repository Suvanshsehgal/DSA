
public class Main {
public static void main(String[] args) {
    int [] arr = {0,0,1,1,1,2,3};
    int target = 1; 
    int first = firstocc(arr,target);
    int last = lastocc(arr,target);
    int count = last - first + 1 ;
    System.out.println(count);
}    
public static int firstocc(int []arr , int target){
    int s = 0 ; 
    int l = arr.length - 1 ;
    int ans = -1 ; 

    while(s<=l){
        int m = s + (l-s)/2;
        if(arr[m] == target){
            ans = m ; 
            l = m - 1 ; 
        }
        else if(arr[m] < target){
            s = m + 1 ; 
        }
        else{
            l = m - 1 ; 
        }
    }
    return ans;
}
public static int lastocc(int [] arr , int target){
    int s = 0 ; 
    int l = arr.length - 1 ;
    int ans = -1 ; 

    while(s<=l){
        int m = s + (l-s)/2;
        if(arr[m] == target){
            ans = m ; 
            s = m + 1 ; 
        }
        else if(arr[m] < target){
            s = m + 1 ; 
        }
        else{
            l = m - 1 ; 
        }
    }
    return ans;
}
}
