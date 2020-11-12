package HUFS_Student_Management;
import java.util.HashMap;
import java.util.Map.Entry;

public class prac {
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 1);
        map.put("b", 2);

        System.out.println("Before removal");
        for( String s : map.keySet() ) {
            System.out.println( s );
        }

        System.out.println("\n\nAfter removal");

        map.remove("a");
        for( String s : map.keySet() ) {
            System.out.println( s );
        }
        for(Entry<String, Integer> elem : map.entrySet())
        {
        	System.out.println("key: "+elem.getKey()+" value: "+ elem.getValue());
        }
    }

}
