public class Main{
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 1, 2};
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("The minimum value is "+ min);
        System.out.println("The maximum value is "+ max);
    }
    public static int findMin(int[] arr){
        int s = 0 ; 
        int l = arr.length - 1;

        while(s<=l){
            int m = s +(l-s)/2;
            if(m>0 && arr[m]<arr[m-1]){
                return arr[m];
            }
            if(arr[m]>arr[l]){
                s = m+1;}
                else{
                    l = m-1;
                }
        }

        return -1;
    }
    public static int findMax(int[] arr){
        int s = 0 ; 
        int l = arr.length - 1;

        while(s<=l){
            int m = s +(l-s)/2;
            if(m>0 && arr[m]<arr[m-1]){
                return arr[m-1];
            }
            if(arr[m]>arr[l]){
                s = m+1;}
                else{
                    l = m-1;
                }
        }

        return -1;
    }
}