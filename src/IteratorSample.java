import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import  java.util.Iterator;

public class IteratorSample {
    public static void main(String[] args) {

//
        Map<String, String> capitalCities = new HashMap<String, String>();
       capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Italy","Rome");
        capitalCities.put("Greece","Atina");

        System.out.println(capitalCities);
        //Key
        System.out.println("************ Key *************");
        for (String country: capitalCities.keySet()){
            System.out.println(country);
        }
        //Value
        System.out.println("************ Value **************");
        for(String city: capitalCities.values()){
            System.out.println(city);
        }
        System.out.println("************ Key,Value **************");
        //Key,Value
        for(Map.Entry<String,String > cityCountry :capitalCities.entrySet()){
            System.out.println(cityCountry);
        }
        System.out.println("************ Iterator **************");
        /* S */    Set set = capitalCities.entrySet();
        /* E */    Iterator ite = set.iterator();
        /* S */    while(ite.hasNext()){
        /* I */    System.out.println(ite.next());
        /* W */    }
        /* N N*/
        System.out.println("************ Iterator,Keyset **************");
        Set keyset = capitalCities.keySet();
        Iterator iter = keyset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
