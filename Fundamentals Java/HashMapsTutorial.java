import java.util.HashMap;

public class HashMapsTutorial {

    public static void main(String[] args) {
        // int a = 10;
        // int b = 3;
        // int c = 88;

        // HashMap<String,Integer>happy = new HashMap<String,Integer>();
        // happy.put("a", 10);
        // happy.put("b", 3);
        // happy.put("c", 88);

        // System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("bobbyjoe1996", "123");
        fun.put("val12", "456");
        fun.put("helloworld", "890");

        // fun.remove("val12");
        // System.out.println(fun.replace("bobbyjoe1996","superhuman"));
        // System.out.println(fun.containsValue("456"));
        // System.out.println(fun.replace("bobbyjoe1996","nicepass"));

        System.out.println(fun.keySet());
        System.out.println(fun);

    }

}
