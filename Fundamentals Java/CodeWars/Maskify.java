package CodeWars;


import java.lang.StringBuilder;

public class Maskify {
    public static String maskify(String str) {
       
        StringBuilder stringBuilder = new StringBuilder();

        String[] strArray = null;

        strArray = str.split("");

        for (int i = 0; i < strArray.length; i++) {
            if (i < strArray.length - 4) {
                strArray[i] = "#";
            }

        }

        for (int k = 0; k < strArray.length; k++) {
            stringBuilder.append(strArray[k]);
        }
        String joinedString = stringBuilder.toString();
        return joinedString;
    }

}
