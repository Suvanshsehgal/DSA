public class Main{
    public static void main(String[] args) {
        String s = "(()())(())";
        StringBuilder ss = new StringBuilder();
        String ans = removeOuterParentheses(ss, s);
        System.out.println(ans);
    }

    public static String removeOuterParentheses(StringBuilder ss, String s ){
        int check = 0 ; 
        for (char c : s.toCharArray()){
            if(c == '('){
                if(check > 0){
                    ss.append(c);
                }
                check ++ ;
            }
            else if(c == ')'){
                check -- ;
                if(check > 0){
                    ss.append(c);
                }
            }
        }
        return ss.toString();
    }
}