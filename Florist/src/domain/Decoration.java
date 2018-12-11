package domain;

public class Decoration extends Item{
	
	private String material;
	
	public Decoration(String material, double price) {
		super(price);
		try {
			checkMaterial(material);
			this.material = material;
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

	
	public String getMaterial() {
		return material;
	}



	//metode per checkejar material si és fusta o plàstic	
	private void checkMaterial(String material) throws Exception{
		if (!material.equalsIgnoreCase("wood") && !material.equalsIgnoreCase("plastic")){
			throw new Exception("Decoration must be made of wood or plastic");
		}
	}
}
