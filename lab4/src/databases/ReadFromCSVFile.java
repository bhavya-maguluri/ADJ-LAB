
package databases;

import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class ReadFromCSVFile {
	
	public ArrayList readFromCSV() {
			CSVReader reader;
			
			ArrayList<StudentPOJOClass> slist = new ArrayList<StudentPOJOClass>();
			
			try {
				reader = new CSVReader(new FileReader("./sgrades.csv"));
				String[] row;
				while((row=reader.readNext())!=null) {
					
					StudentPOJOClass std = new StudentPOJOClass(); 
					std.setRegno(row[0]);
					std.setCoa(row[1]);
					std.setDbms(row[2]);
					std.setFlat(row[3]);
					std.setWad(row[4]);
					std.setOe(row[5]);
					slist.add(std);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			return slist;
		}

}
