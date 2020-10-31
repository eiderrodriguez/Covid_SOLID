package isp;

public class CalcIncrement {
	
	public double calculateIncrementPerYear(Yearable y, double afection){
		if (y.getYears()>65) 
			return afection*0.5; 
		else return 0;
	}
}