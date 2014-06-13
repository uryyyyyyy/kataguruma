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
			if(!isSmallThanMe(human) ){
				continue;
			}
			calc(list, human);
		}
		return this.cache;
	}

	private void calc(List<Human> list, Human human) {
		List<Human> currentResult = human.howManyHumanCanRideOnYou(list);
		if(isBiggerResult(currentResult)){
			this.cache = new ArrayList<>(currentResult);
			this.cache.add(human);
		}
	}

	private boolean isBiggerResult(List<Human> currentResult) {
		return this.cache.size() <= currentResult.size();
	}

	private boolean isSmallThanMe(Human human) {
		return this.weight > human.getWeight() && this.height > human.getHeight();
	}

}
