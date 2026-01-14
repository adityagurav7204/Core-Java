package com.Interface13;

public interface shape {
	
	public void getArea();
	
}
class Circle implements shape
{
    int r;
    public Circle(int r)
    {
    	this.r=r;
    }
	@Override
	public void getArea() {
      double Area=3.14*r*r;
      System.out.println("Area of Circle: "+Area);
	}
	
}
class Triangle implements shape
{
   public int base;
   public int height;
   
   public Triangle(int base, int height)
   {
	   this.base=base;
	   this.height=height;
   }
	@Override
	public void getArea() {
		double Area = (base*height)*0.5;
		System.out.println("Area of Triangle: "+Area);
	}
}
class Rectangle implements shape
{
   public int len;
   public int bre;
   
   public Rectangle(int len, int bre)
   {
	   this.len=len;
	   this.bre=bre;
   }
	@Override
	public void getArea() {
		int Area = len*bre;	
		System.out.println("Area of Rectanle: "+Area);
	}
	
}

