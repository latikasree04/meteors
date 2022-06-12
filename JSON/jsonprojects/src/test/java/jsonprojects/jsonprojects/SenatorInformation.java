package jsonprojects.jsonprojects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SenatorInformation {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		JSONParser jsonparser = new JSONParser();     
	    FileReader reader = new FileReader(".\\jsonfiles\\Senators.json");
	    
	    Object obj = jsonparser.parse(reader);

		JSONObject emp = (JSONObject)obj;
	    
	    JSONArray array = (JSONArray)emp.get("objects");
	    
		//System.out.println(data.get("Population"));
	    
	    System.out.println("Enter a state: ");
	    String state = n.nextLine();
	    state = state.toLowerCase();
		
		for(int i = 0; i < array.size(); i++)
		{
			JSONObject data = (JSONObject)array.get(i);
			JSONObject person = (JSONObject)data.get("person");
			
			//System.out.println(data.get("Population"));
			
    		String datayear = (String)data.get("description");
    		datayear = datayear.toLowerCase();
    		
    		if(datayear.contains(state))
    		{
    			System.out.println("Name: " + person.get("name"));
    			//System.out.println("Last Name: " + person.get("lastname"));
    			System.out.println("Birthday: " + person.get("birthday"));
    			System.out.println("Gender: " + person.get("gender"));
    			System.out.println("Political Party: " + data.get("party"));
    			System.out.println("Website: " + data.get("website"));
    			System.out.println("Twitter: " + person.get("twitterid"));
    			System.out.println();
    			
    			
    		}
    		
    		//System.out.println(datayear);
		}
	    
	    //System.out.println("Enter : ");
	    //int year = n.nextInt();
	}

}
