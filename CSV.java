package bankAccountApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		String datarow;
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			while((datarow=br.readLine())!=null) {
			String[] dataRows=datarow.split(",");
			data.add(dataRows);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
