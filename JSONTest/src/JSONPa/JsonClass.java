package JSONPa;
import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*;
public class JsonClass {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Object obj = new JSONParser().parse(new FileReader("JSONfile.json")); 
		JSONObject jo = (JSONObject) obj;
		Map AppSettings = ((Map)jo.get("AppSettings"));
		Iterator<Map.Entry> itr1 = AppSettings.entrySet().iterator(); 
        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
	}

}
