public class Main {

    public static boolean isIncreasing(String s ){
        String[] tokens = s.split(" ");
        int prev = -1;
        for(String token : tokens){
            if(Character.isDigit(token.charAt(0))){
                 int curr = Integer.parseInt(token);
            
            if(curr<=prev){
                return false;
            }
            prev = curr; 
        }
        }
        return true; 
    }

    public static void main(String[] args) {
        String s ="sunset is at 7 8 pm overnight lows will be in the low 50 and 60 s";
        Boolean ans = isIncreasing(s);
        System.out.println(ans);
    }
}
