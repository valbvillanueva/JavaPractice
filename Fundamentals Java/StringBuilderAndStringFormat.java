public class StringBuilderAndStringFormat {
    public static void main(String[] args) {

        // Inefficient
        String info = "";

        info += "My name is Bob";
        info += " ";
        info += "I am a Builder";

        System.out.println(info);

        // More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Val");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.").append("").append("I am a sky diver");

        System.out.println(s.toString());

        //Formatting

        System.out.print("here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");

        System.out.printf("Total cost %-10d; quantity is %d\n",5,120);

        for(int i=0;i<20;i++){
            System.out.printf("%-2d: %s\n", i,"here is some text");
        }
        System.out.printf("total value: %.2f\n", 5.6);
        System.out.printf("total value: %-.61f\n", 343.23423);
    }
}
