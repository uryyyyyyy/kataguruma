package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Caluculator {
	
	public static List<PersonDTO> method(List<PersonDTO> list){
		Collections.sort(list, new Comparator<PersonDTO>(){

			@Override
			public int compare(PersonDTO o1, PersonDTO o2) {
				if(o1.getHeight() == o2.getHeight()){
					return Integer.valueOf(o1.getWeight()).compareTo(Integer.valueOf(o2.getWeight()));
				}
				return Integer.valueOf(o1.getHeight()).compareTo(Integer.valueOf(o2.getHeight()));
			}});
		return methoddd(list);
	}

	private static List<PersonDTO> methoddd(List<PersonDTO> sortedList) {
		List<PersonDTO> resultss = new ArrayList<>();
		for(PersonDTO moke : sortedList){
			List<PersonDTO> results = methods(sortedList, moke);
			if(resultss.size() < results.size()){
				resultss = new ArrayList<>(results);
			}
		}
		return resultss;
	}

	private static List<PersonDTO> methods(List<PersonDTO> sortedList,
			PersonDTO moke) {
		List<PersonDTO> results = new ArrayList<PersonDTO>();
		results.add(moke);
		for(PersonDTO dto : sortedList){
			if(dto.getWeight() > moke.getWeight() && dto.getHeight() > moke.getHeight()){
				moke = dto;
				results.add(dto);
			}
		}
		return results;
	}

}
