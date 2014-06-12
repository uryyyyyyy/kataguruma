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
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public List<Human> answerOfKataguruma(List<Human> list){
		if(!(this.katagurumas == null)){
			return this.katagurumas;
		}

		List<Human> cache = new ArrayList<Human>();
		for(Human human : list){
			if(this.weight < human.getWeight() && this.height < human.getHeight() ){
				List<Human> mokeHumans = human.answerOfKataguruma(list);
				if(cache.size() <= mokeHumans.size()){
					cache = new ArrayList<>(mokeHumans);
					cache.add(human);
				}
			}
		}
		return this.katagurumas = cache;
	}

}
