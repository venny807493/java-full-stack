import java.util.HashMap;
import java.util.Map;
public class hash{
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("venny",1);
        map.put("jhansi",2);
        map.put("mamatha",3);
        map.put("sony",4);
        System.out.println(map.containsKey("pandu"));
        map.get("venny");
        //Iteration
        for(Map.Entry<String,Integer>e:map.entrySet()){
            e.getKey();
            e.getValue();
        }
    }
}