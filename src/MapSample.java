import java.util.TreeMap;
import java.util.Map;
import  java.lang.*;

public class MapSample {
    public static void main(String[] args) {
//Interface<Wrapper Class> name =
        Map<Integer, String> list = new TreeMap<Integer,String>();
        list.put(1,"Cat");
        list.put(2,"Fish");
        list.put(3,"Dog");
        list.put(4,"Bird");

        //Keyleri almak için
        for(Integer i:list.keySet()){
            System.out.println("Keyset: "+i);
        }
        //Value almak için

        for(String s: list.values()){
            System.out.println("Value :" +s);
        }
        //Key Value ları almak için
        for(Map.Entry<Integer,String> m:list.entrySet()){
            System.out.println(m);
        }
        //Keylerden value ya ulaşmak için
        for(Integer i :list.keySet()){
            String s =list.get(i);
            System.out.println(s);
        }

    }
}
