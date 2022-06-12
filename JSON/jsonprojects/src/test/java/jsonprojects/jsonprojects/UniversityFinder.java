package jsonprojects.jsonprojects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UniversityFinder {

	public static void main(String[] args) throws IOException, ParseException{
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		JSONParser jsonparser = new JSONParser();     
	    FileReader reader = new FileReader(".\\jsonfiles\\Universities.json");
	       
	    Object obj = jsonparser.parse(reader);
		JSONObject emp = (JSONObject)obj;
		
		JSONArray array = (JSONArray)emp.get("welcome");
		
		System.out.println("Enter a keyword for a University or College: ");
	    String name = n.nextLine();
	    name = name.toLowerCase();
	    
	    for(int i = 0; i < array.size(); i++)
	    {
	    	JSONObject data = (JSONObject)array.get(i);
	    	String datayear = (String)data.get("name");
	    	datayear = datayear.toLowerCase();
    		//System.out.println(datayear);
	    	if(datayear.contains(name))
	    	{
	    		System.out.println("Name of University: " + datayear);
	    		JSONArray web_pages = (JSONArray)data.get("web_pages");
	    		for(int j = 0; j < web_pages.size(); j++)
	    		{
	    			System.out.println("Web Page URL: " + web_pages.get(j));
	    			System.out.println();
	    		}
	    	}
	    }
		//System.out.println("sdfhuks");
		
		
	}

}
