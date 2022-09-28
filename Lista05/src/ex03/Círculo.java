package ex03;

public class Círculo 
{
	public double raio;
	
	public Círculo(double raio_)
	{
		this.raio = raio_;
	}
	public static double area(double raio)
	{
		double area = Math.pow((3.14) * (raio), 2);
		return area;	
	}
	
	public static double circunferencia(double raio)
	{
		double circunferencia = 2 * (3.14) * raio;
		return circunferencia;
	}
	
	public double aumentarCirculo(double aumento)
	{
		this.raio += (aumento / 100)*this.raio;
		return this.raio;
	}
	
}
