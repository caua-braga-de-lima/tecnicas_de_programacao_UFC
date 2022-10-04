package ex03;

public class Círculo 
{
	public double raio;
	
	public Círculo(double raio_)
	{
		this.raio = raio_;
	}
	public double area()
	{
		double area = Math.pow(this.raio, 2)*3.14;
		return area;	
	}
	
	public double circunferencia()
	{
		double circunferencia = 2 * (3.14) * this.raio;
		return circunferencia;
	}
	
	public double aumentarCirculo(double aumento)
	{
		this.raio += (aumento / 100)*this.raio;
		return this.raio;
	}
	
}
