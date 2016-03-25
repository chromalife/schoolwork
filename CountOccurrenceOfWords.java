import java.io.*;
import java.util.*;

public class CountOccurrenceOfWords
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<>();
		FileReader fr = new FileReader("WarOfTheWorlds.txt");
		Scanner sc = new Scanner(fr);
		while (sc.hasNext())
		{
			String text = sc.nextLine();
			String[] words = text.split("[ \n\t\r.,;:!?(){}]");
			
			for (int i = 0; i < words.length; i++)
			{
				String key = words[i].toLowerCase();

				if (key.length() > 0)
				{
					if (!map.containsKey(key))
					{
						map.put(key, 1);
					} else
					{
						int value = map.get(key);
						value++;
						map.put(key, value);
					}

				}
				//For Testing
				//System.out.println(sc.nextLine());

			}
		}
		sc.close();
		fr.close();

		// Get all entries into a set
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		// Get key and value from each entry
		for (Map.Entry<String, Integer> entry : entrySet)
			System.out.println(entry.getKey() + "\t\t" + entry.getValue());

	}

	
	

	

}
