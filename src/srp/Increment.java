package srp;

public class Increment implements Incrementable{
	double increment = 0;
	@Override
	public double getIncrement(SRPCovid19Pacient p, double afection) {
		if (p.getYears()>65) 
			increment=afection*0.5;
		return increment;
	}
}
