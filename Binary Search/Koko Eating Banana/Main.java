import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        int h = 8;
        int ans = func(arr, h);
        System.out.println(ans);
    }
    public static int func(int [] piles, int h){
        int s =1; 
        int l = Arrays.stream(piles).max().getAsInt();
        
         while(s<=l){
            int mid = s +(l-s)/2;
            int check = mid*h;
            int i = 0 ;
            while(i<h){
                for (int pile : piles){
                    if(pile%mid>0){
                       for(int j = 0 ; j <=pile%mid ; j++){
                        check = check - mid;
                        h++;
                       }
                    }
       
                    else{
                        check = check - pile; 
                    }
                }
            }
            if (check > 0){
                l = mid -1 ;
            }
            else{ 
                s = mid +1; 
            }
        }
        return s;
    }
}