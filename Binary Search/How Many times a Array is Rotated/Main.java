public class Main {
public static void main(String[] args) {
    int [] arr = {4,5,6,7,0,1,2,3};
    int val = noofrotation(arr);
    System.out.println(val);
}   
public static int noofrotation(int [] arr){
    int s = 0 ;
    int l = arr.length-1;

    while(s<=l){
        int m = s + (l-s)/2;

        if(m>0 && arr[m]<arr[m-1]){
            return m ;
        }
        if(arr[m]>arr[l]){
            s = m+1;
        }
        else{
          l = m -1;  
        }
    }
    return 0;
}
}
