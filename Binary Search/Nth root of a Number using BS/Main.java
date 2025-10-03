import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("N IS ->");
    int n = sc.nextInt();
    System.out.println("M IS ->");
    int m = sc.nextInt();
    int ans= function(n, m);
    System.out.println(ans);
    sc.close();
}   
public static int function(int n , int m){
    int ans = -1;
    int s = 0 ; 
    int l = m/n;
    while(s<=l){
        int mid = s+(l-s)/2;
        if(Math.pow(mid,n)==m){
            ans = mid;
        }
        if(Math.pow(mid,n)<m){
            s= mid +1;
        }
        else{
            l = mid-1;
        }
    }
    return ans ; 
} 
}
