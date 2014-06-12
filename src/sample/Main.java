package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Human> list = input();

		output(list);
	}

	private static void output(List<Human> list) {
		Human human = new Human(0, 0);
		for(Human human2 : human.answerOfKataguruma(list)){
			System.out.println("(" + human2.getHeight() + ", " + human2.getWeight() + ")");
		}
	}

	private static List<Human> input() throws FileNotFoundException,
	IOException {
		File file = new File("input.txt");
		FileReader filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);
		String str = br.readLine();
		List<Human> list = new ArrayList<>();
		while(str != null){
			list.add(method1(str));	    
			str = br.readLine();
		}
		br.close();
		return list;
	}

	public static Human method1(String str) {
		String[] personInfo = str.split(" ");
		return new Human(Integer.valueOf(personInfo[0]), Integer.valueOf(personInfo[1]));
	}

}
