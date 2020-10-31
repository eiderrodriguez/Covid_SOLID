package srp;

public class Impact2 implements Impactable {
	double impact = 0;
	@Override
	public double getImpact(SRPCovid19Pacient p, double afection, double increment) {
		if(p.getYears()<10)
			impact = 0;
		else {
			impact = afection+increment;
		}
		return impact;
	}

}
