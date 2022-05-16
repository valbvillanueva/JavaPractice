package PreBuiltMethods;

public class LastIndexOfMethod {
    public static void main(String[] args) {
        String quote =
  "Peace cannot be kept by force; it can" +
  " only be achieved by understanding.";
System.out.print(
  quote.indexOf("can") + " " +
  quote.indexOf("can", 7) + " " +
  quote.lastIndexOf("can"));

    }
}
