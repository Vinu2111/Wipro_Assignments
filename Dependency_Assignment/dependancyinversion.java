package wiprofirst.dependancyinversion;


//Abstration
interface Engine
{
	void start();
}

//lower level module

class electrical_Engine implements Engine
{

	@Override
	public void start() {
System.out.println("Engine Started!");		
	}
	
}

//higher level modules
class Car
{
	private Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	
	void drive()
	{
		engine.start();
		System.out.println("car started Driving!");
	}
}

public class dependancyinversion {

	public static void main(String[] args) {

		Engine engine=new electrical_Engine();
		Car car=new Car(engine);
		car.drive();
		
	}

}