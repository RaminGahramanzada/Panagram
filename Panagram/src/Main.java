public class Main {
    public static void main(String[] args) {
        System.out.println(panagrams("Ramin"));
    }

    public static String panagrams(String s){
        String alphabet = "abcdefghijklmnopqrsuwxyz";

        for (int i = 0; i <alphabet.length() ; i++) {
            if(s.contains(alphabet.charAt(i)+"")){


            }
        }
        return "Not panagrams";
    }
}