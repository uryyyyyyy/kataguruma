package sample;

import java.util.ArrayList;
import java.util.List;

public class Human {

	private final int height;
	private final int weight;
	private List<Human> cacheKataguruma;

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

	public List<Human> howManyHumanCanKatagurumaOnYou(List<Human> list){
		if(this.cacheKataguruma != null){
			return this.cacheKataguruma;
		}
		this.cacheKataguruma = new ArrayList<Human>();
		for(Human human : list){
			if(isSmallerThanMe(human) ){
			addKataguruma(list, human);
			}
		}
		return this.cacheKataguruma;
	}

	private void addKataguruma(List<Human> list, Human human) {
		List<Human> currentKataguruma = human.howManyHumanCanKatagurumaOnYou(list);
		if(isBiggerKataguruma(currentKataguruma)){
			this.cacheKataguruma = new ArrayList<>(currentKataguruma);
			this.cacheKataguruma.add(human);
		}
	}

	private boolean isBiggerKataguruma(List<Human> currentKataguruma) {
		return this.cacheKataguruma.size() <= currentKataguruma.size();
	}

	private boolean isSmallerThanMe(Human human) {
		return this.weight > human.getWeight() && this.height > human.getHeight();
	}

}
