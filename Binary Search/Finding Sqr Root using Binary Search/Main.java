public class Main {
    public static void main(String[] args) {
        int n = 1;
        int ans = getsqrtroot(n);
        System.out.println("the sqrtroot is -> " + ans);
    }
    public static int getsqrtroot(int n){
        if(n==1) return 1;
        int sqrtroot = 0 ; 
        int s = 0 ; 
        int l = n/2; 
        while(s<=l){
            int m = s + (l-s)/2;
            if((m*m)<=n){
               sqrtroot = m ;  
               s = m +1 ; 
            }
            else{
                l = m ; 
            }
        }
        return sqrtroot ; 
    }
}
