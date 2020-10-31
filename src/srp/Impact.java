package srp;

public class Impact implements Impactable{
	double impact = 0;
	@Override
	public double getImpact(SRPCovid19Pacient p, double afection, double increment) {
		impact = afection+increment;
		return impact;
	}
}
