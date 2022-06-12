package jsonprojects.jsonprojects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NobelPrizeInfo {

	public static void main(String[] args) throws IOException, ParseException{
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		JSONParser jsonparser = new JSONParser();     
	    FileReader reader = new FileReader(".\\jsonfiles\\nobelprize.json");
	    
	    Object obj = jsonparser.parse(reader);

		JSONObject emp = (JSONObject)obj;
	    
	    JSONArray array = (JSONArray)emp.get("prizes");
	    
	    System.out.println("Enter a year: ");
	    int year = n.nextInt();
		
		for(int i = 0; i < array.size(); i++)
		{
			JSONObject data = (JSONObject)array.get(i);
			
			//System.out.println(data.get("Population"));
			String datayear = (String)data.get("year");
    		
			if(year == Integer.parseInt(datayear))
			{
				String pop = (String) data.get("category");
				pop = pop.toUpperCase();
				System.out.println(pop);
				JSONArray person = (JSONArray)data.get("laureates");
				for(int j = 0; j < person.size(); j++)
				{
					JSONObject eachperson = (JSONObject)person.get(j);
					
					System.out.println("- " + eachperson.get("firstname") + " " + eachperson.get("surname") + ": " + eachperson.get("motivation"));
					
				}
				System.out.println();
				
			}
		}
	}
}
