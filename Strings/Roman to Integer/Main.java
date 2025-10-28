import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer>map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        String test = "IV";
        int ans = Convert(map, test);
        System.out.println(ans);
    }
    public static int Convert(HashMap<Character,Integer> map , String test ){
        int check = map.get(test.charAt(test.length() - 1));
        for(int i = test.length()-2 ; i >= 0 ; i--){
            if(map.get(test.charAt(i)) < map.get(test.charAt(i+1))){
                check -= map.get(test.charAt(i));
            } else {
                check += map.get(test.charAt(i));
            }
        }                                                                                                                                                   
        return check; 
    }
}
