package CodeWars;

public class CreditCardMask {
    public static void main(String[] args) {
        // lesson learned
        // string to array

        StringBuilder stringBuilder = new StringBuilder();
        String joinedString = "";

        String[] strArray = null;
        String str = "skippy";
        strArray = str.split("");

        for (int i = 0; i < strArray.length; i++) {
            if (i < strArray.length - 4) {
                strArray[i] = "#";
            }
            
        }
        for (int k = 0; k < strArray.length; k++) {
            stringBuilder.append(strArray[k]);
        }
        joinedString = stringBuilder.toString();

        System.out.println(joinedString);
    }
}
