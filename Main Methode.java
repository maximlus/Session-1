public class Program
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
		Dog d2 = new Dog("Lady", 6);
		
		//d1.setName("Fido");
		//d1.setWeight(6);
		//d2.setName("Lady");
		//d2.setWeight(4);
		
		
		
		d1.eat();
		d2.sleep();
		d1.chasePostman();
		
		system.out.println("name: " + d1.GetName() + " Yay");
		
	}
}