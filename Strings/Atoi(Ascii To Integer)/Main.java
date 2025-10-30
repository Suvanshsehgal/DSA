
public class Main {
public static void main(String[] args) {
    String s = "   -42";
    int ans = myAtoi(s);
    System.out.println(ans);
}
public static int myAtoi(String s){
    int sign = 1; 
    int i = 0;
    long ans = 0 ; 

    s=s.trim();

    if(s.length() == 0 ){
        return 0;
    }
    if(s.charAt(i) == '+'|| s.charAt(i)=='-'){
        if(s.charAt(i)=='-'){
            sign = -1;
        }
        i++;
    }
    while(i<s.length() && Character.isDigit(s.charAt(i))){
        if (ans > (Integer.MAX_VALUE - (s.charAt(i) - '0') ) / 10) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
         ans = ans*10 + (s.charAt(i) - '0');
        i++;
    }

    return (int)ans * sign;
}    
}
