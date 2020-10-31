package srp;

public class Increment2 implements Incrementable{
	double increment = 0;
	@Override
	public double getIncrement(SRPCovid19Pacient p, double afection) {
		if (p.getYears()>65) 
			increment=afection*0.5;
		else if(p.getYears()>45 && p.getYears()<=65)
			increment = afection * 0.3;
		return increment;
	}

}
