package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.Cleanup;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		List<Human> inputList = inputToHumanList("input.txt");
		List<Human> outputList = calcMaxKataguruma(inputList);
		output(outputList);
	}

	private List<Human> calcMaxKataguruma(List<Human> inputList) {
		Human dummyBiggestGay = new Human(Integer.MAX_VALUE, Integer.MAX_VALUE);
		return dummyBiggestGay.howManyHumanCanRideOnYou(inputList);
	}

	private void output(List<Human> list) {
		for(Human human2 : list){
			System.out.println("(" + human2.getHeight() + ", " + human2.getWeight() + ")");
		}
	}

	private List<Human> inputToHumanList(String fileName) {
		try{
			List<String> strList = readAllLine(fileName);
			return toHumanList(strList);
		}catch(IOException e){
			throw new RuntimeException();
		}
	}

	private List<String> readAllLine(String fileName) throws IOException {
		@Cleanup BufferedReader br = createBufferdReader(fileName);
		List<String> strList = new ArrayList<>();
		String str = br.readLine();
		while(str != null){
			strList.add(str);
			str = br.readLine();
		}
		return strList;
	}

	private List<Human> toHumanList(List<String> strList) {
		List<Human> humanlist = new ArrayList<>();
		for(String str : strList){
			humanlist.add(toHuman(str));
		}
		return humanlist;
	}

	private Human toHuman(String str) {
		String[] personInfo = str.split(" ");
		return new Human(Integer.valueOf(personInfo[0]), Integer.valueOf(personInfo[1]));
	}

	private BufferedReader createBufferdReader(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		FileReader filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);
		return br;
	}
}
