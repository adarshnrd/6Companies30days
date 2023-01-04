package Microsoft;

public class BullsandCows {
    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";
        System.out.println(getHint(secret, guess));
    }
    public static String getHint(String secret, String guess) {

        int bullcount = 0;
        int cowcount = 0;

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == (guess.charAt(i))) {
                bullcount++;
                secret = secret.replaceFirst(secret.charAt(i) + "", "");
                guess = guess.replaceFirst(guess.charAt(i) + "", "");
                i=i-1;
            }
        }
        for (int i = 0; i < secret.length(); i++) {
            if (secret.contains(guess.charAt(i) + "")) {
                cowcount++;
                int index =index(secret,guess.charAt(i));
                secret = secret.replaceFirst(secret.charAt(index) + "", "");
                guess = guess.replaceFirst(guess.charAt(i) + "", "");
                i=i-1;
            }
        }
        return bullcount +"A"+ cowcount+"B";
    }
    public static int index(String secret, char a) {
        for (int i = 0; i < secret.length(); i++){
            if (secret.charAt(i) == a) {
                return i;
            }
    }
        return -1;
    }
}