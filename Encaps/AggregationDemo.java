package com.ABC.Encaps;

class Engine
{
	private String type;
	
	public Engine(String type)
	{
		this.type=type;
	}
	public void start()
	{
		System.out.println(type+" engine is starting");
	}
}
class Car1
{
	private String brand;
	private Engine engine;
	public Car1(String brand,Engine engine)
	{
		this.brand=brand;
		this.engine=engine;
	}
	public void startCar()
	{
		System.out.println(brand+" car is starting.");
		engine.start();
	}
}
public class AggregationDemo {

	public static void main(String[] args) {
		Engine engine = new Engine("v8");
		Car1 car = new Car1("Ford",engine);
		
		car.startCar();

	}

}
