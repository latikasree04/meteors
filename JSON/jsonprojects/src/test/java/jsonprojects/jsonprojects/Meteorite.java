package jsonprojects.jsonprojects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;public class Meteorite {
	
	public static void main(String[] args) throws IOException, ParseException{
	{
		Scanner n = new Scanner(System.in);
		JSONParser jsonparser = new JSONParser();     
	    FileReader reader = new FileReader(".\\jsonfiles\\meteor.json");
	       
	    Object obj = jsonparser.parse(reader);
		JSONObject emp = (JSONObject)obj;
		
		JSONArray array = (JSONArray)emp.get("meteors");
		
		for(int i = 0; i < array.size(); i++)
	    {
	    	JSONObject data = (JSONObject)array.get(i);
	    	String datayear = (String)data.get("name");
	    	datayear = datayear.toLowerCase();
    		System.out.println(datayear);
	    }
	}
}
}