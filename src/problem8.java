public class problem8 {
    public static boolean isFullDigit(String s){
        if(s.isEmpty()){
            return true;
        } else{
            boolean check = (s.charAt(s.length()-1) >= 48 && s.charAt(s.length()-1) <= 57);
            boolean rest = isFullDigit(s.substring(0,s.length()-1));

            return check && rest;
        }
    }
}
