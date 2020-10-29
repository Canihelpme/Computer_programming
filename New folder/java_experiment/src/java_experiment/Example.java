package java_experiment;

import java.util.HashMap;

public class Example {

	public static void main(String[] args)
	{
		HashMap<String, String> ccities = new HashMap<String, String>();
		
		ccities.put("1","SEOUL");
		ccities.put("2", "WDC");
		ccities.put("FRANCE","Paris");
		
		System.out.println(ccities.get("Paris"));
	}

}
