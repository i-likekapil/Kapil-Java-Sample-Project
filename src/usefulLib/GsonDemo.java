//package usefulLib;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class GsonDemo {
//    public static void main(String[] args) {
//        Map<String, String[]> map = new HashMap<>();
//        map.put("numbers", new String[]{"one","two","three","four"});
//        map.put("animal", new String[]{"cat","dog","ankur","lion"});
//        map.put("vegies", new String[]{"pickle","onion","lemon","potato"});
//
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(map));
//        System.out.println(new GsonBuilder().create().toJson(map));
//    }
//}
