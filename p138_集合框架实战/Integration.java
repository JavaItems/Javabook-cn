import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Integration {
	/* 
	@param data
	@param mod
	@return Map
	*/
	public static Map grouping(int data[], int mod)
	{
		Map map = new HashMap();
		for (int i = 0; i < data.length; i++)
		{
			Integer key = new Integer(data[i] % mod);
			if(map.containsKey(key))
			{
				Collection col = (ArrayList) map.get(key);
				col.add(new Integer(data[i]));
			} else {
				Collection col = new ArrayList();
				col.add(new Integer(data[i]));
				map.put(key, col);
			}
		}
		
		return map;
	}
	
	
	public static void printMap(Map map)
	{
		Set set = map.entrySet();
		Iterator outerIt = set.iterator();
		while(outerIt.hasNext())
		{
			Map.Entry me = (Map.Entry)outerIt.next();
			Integer key = (Integer)me.getKey();
			System.out.println("<-- di "+ key + "  zu cheng yuan liebiao kaishi-->");
			Collection col = (Collection)me.getValue();
			Iterator innerIt = col.iterator();
			while(innerIt.hasNext())
			{
				System.out.println("cheng yuan bian hao" + innerIt.next());
				
			}
			System.out.println("<--di " + key +"  zu cehgyuan lirbiao jishu-->");
		}
	
	}

	public static void main(String args[])
	{
		
		int data[] = {12, 24, 59, 78, 30, 14, 32, 6, 5, 81, 48};
		Map map = Integration.grouping(data, 3);
		Integration.printMap(map);
		
		
	}	
}











