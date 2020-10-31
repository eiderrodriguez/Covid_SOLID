package dip;

public class CalcIncrement implements Incrementable{
	double increment = 0;
	
	public double calculateIncrementPerYear(DIPCovid19Pacient p, double afection) {
		if (p.getYears()>65) 
			increment=afection*0.5;
		return increment;
	}
}
