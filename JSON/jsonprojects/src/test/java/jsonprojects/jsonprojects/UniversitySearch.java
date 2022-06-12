package jsonprojects.jsonprojects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UniversitySearch {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		JSONParser jsonparser = new JSONParser();     
	    FileReader reader = new FileReader(".\\jsonfiles\\Unversities.json");

		Object obj = jsonparser.parse(reader);

		JSONObject emp = (JSONObject)obj;
	    
	    JSONArray array = (JSONArray)emp.get("welcome");
	    System.out.println("sdfhus");
	    
	    System.out.println("Enter a keyword for a University or College: ");
	    String name = n.nextLine();
	    name = name.toLowerCase();
	    
	    /*for(int i = 0; i < array.size(); i++)
		{
			JSONObject data = (JSONObject)array.get(i);
			
    		String datayear = (String)data.get("name");
    		datayear = datayear.toLowerCase();
    		
    		//System.out.println(datayear);
    		
    		/*if(datayear.contains(name))
    		{
    		    JSONArray web_pages = (JSONArray)data.get("web_pages");
    		    //JSONArray genres = (JSONArray)data.get("genres");
    		    
    		    System.out.println("Name of University: " + (String)data.get("title"));
    		    //System.out.println("Year Released: " + data.get("year"));
    		    System.out.println();
    		    System.out.println("Website: ");
    			
    			for(int j = 0; j < web_pages.size(); j++)
    			{
    				//JSONObject data1 = (JSONObject)array.get(j);
    				System.out.println("- " + web_pages.get(j));
    			}
    			System.out.println();
    			System.out.println("Genre: ");
    			for(int k = 0; k < genres.size(); k++)
    			{
    				//JSONObject data1 = (JSONObject)array.get(j);
    				System.out.println("- " + genres.get(k));
    			}
    		}
		}*/
	}
}

