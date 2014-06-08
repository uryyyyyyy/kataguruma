package sample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Caluculator {
	
	public static int method(List<PersonDTO> list){
		Collections.sort(list, new Comparator<PersonDTO>(){

			@Override
			public int compare(PersonDTO o1, PersonDTO o2) {
				return Integer.valueOf(o1.getHeight()).compareTo(Integer.valueOf(o2.getHeight()));
			}});
		return method2(list);
	}

	private static int method2(List<PersonDTO> sortedList) {
		
		PersonDTO moke = sortedList.get(0);
		int count = 1;
		for(PersonDTO dto : sortedList){
			if(dto.getWeight() > moke.getWeight()){
				moke = dto;
				++count;
			}
		}
		return count;
	}

}
