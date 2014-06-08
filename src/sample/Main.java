package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		FileReader filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);
		
		String str = br.readLine();
		List<PersonDTO> list = new ArrayList<>();
		  while(str != null){
		    list.add(method1(str));	    
		    str = br.readLine();
		  }
		  br.close();
		  for(PersonDTO dto : Caluculator.method(list)){
			  System.out.println(dto.getHeight() + " " + dto.getWeight());
		  }
	}

	public static PersonDTO method1(String str) {
		String[] personInfo = str.split(" ");
		return new PersonDTO(Integer.valueOf(personInfo[0]), Integer.valueOf(personInfo[1]));
	}

}
