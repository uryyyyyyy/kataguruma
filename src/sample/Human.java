package sample;

import java.util.ArrayList;
import java.util.List;

public class Human {

	private final int height;
	private final int weight;
	private List<Human> katagurumas;

	public Human(int height, int weight){
		this.height = height;
		this.weight = weight;
		this.katagurumas = new ArrayList<Human>();
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public List<Human> answerOfKataguruma(List<Human> list){
		if(!katagurumas.isEmpty()){
			return katagurumas;
		}

		for(Human human : list){
			if(this.weight < human.getWeight() && this.height < human.getHeight() ){
				List<Human> mokeHumans = human.answerOfKataguruma(list);
				if(katagurumas.size() <= mokeHumans.size()){
					katagurumas = new ArrayList<>(mokeHumans);
					katagurumas.add(human);
				}
			}
		}
		return katagurumas;
	}

}
