package sample;

import java.util.ArrayList;
import java.util.List;

public class Human {

	private final int height;
	private final int weight;

	public Human(int height, int weight){
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public List<Human> answerOfKataguruma(List<Human> list){

		List<Human> list2 = new ArrayList<>();
		for(Human human : list){
			list2 = sample(list, list2, human);
		}
		list2.add(this);
		return list2;
	}

	private List<Human> sample(List<Human> list, List<Human> list2, Human human) {
		if(this.weight < human.getWeight() && this.height < human.getHeight() ){
			list2 = sample2(human.answerOfKataguruma(list), list2, human);
		}
		return list2;
	}

	private List<Human> sample2(List<Human> list, List<Human> list2, Human human) {
		if(list2.size() < list.size()){
			list2 = list;
		}
		return list2;
	}

}
