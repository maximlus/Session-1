public class Dog
{
	//atribites
	private String name;
	private int weight;
	private int energyLevel;
	private int bladder;
	private boolean isGood;
	//constructer
	public Dog()
	{
		name = "fido";
		weight = 6;
		energyLevel = 50;
		bladder = 50;
		isGood = true;
	}
	public Dog(String nameIn, int weightin)
	{
		name = nameIn;
		weight = weightIn;
		energyLevel = 50;
		bladder = 50;
		isGood = true;
	}
	//methodes
	public void eat()
	{
		weight++;
		energyLevel++;
		bladder++;
		
	}
	public void sleep()
	{
		energyLevel = 100;
		
	}
	public void chasePostman()
	{
		system.out.println("bark! Bark! Bark! Gurrr!");
		energyLevel--;
		weight--;
		isGood = false;
	}
	
	// getter methodes
	public String getName()
	{
		return name;
	}
	public boolean isGood()
	{
		return isGood;
	}
	
	public void setName(String nameIn)
	{
		name = nameIn;
		
	}
	public void setWeight(int weightIn)
	{
		weight = weightIn;
	}
	
}