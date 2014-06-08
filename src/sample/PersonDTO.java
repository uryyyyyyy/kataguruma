package sample;

public class PersonDTO {
	
	private final int height;
	private final int weight;
	
	public PersonDTO(int height, int weight){
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

}
