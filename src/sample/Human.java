package sample;

import java.util.ArrayList;
import java.util.List;

public class Human {

	private final int height;
	private final int weight;
	private List<Human> cache;

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

	public List<Human> howManyHumanCanRideOnYou(List<Human> list){
		if(!(this.cache == null)){
			return this.cache;
		}

		this.cache = new ArrayList<Human>();
		for(Human human : list){
			if(this.weight > human.getWeight() && this.height > human.getHeight() ){
				List<Human> mokeHumans = human.howManyHumanCanRideOnYou(list);
				if(this.cache.size() <= mokeHumans.size()){
					this.cache = new ArrayList<>(mokeHumans);
					this.cache.add(human);
				}
			}
		}
		return this.cache;
	}

}
