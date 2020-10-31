package srp;

public class Afection2 implements Afectionable{
	double afection = 0;
	double elems = 0;

	@Override
	public double getAfection(SRPCovid19Pacient p){
		for (Symptom s:p.symptoms.keySet()) 
			if (s.getCovidImpact()>50) {
				afection = afection +s.getSeverityIndex()*p.symptoms.get(s);
				elems++; 
			}
		afection = afection /elems;


		return afection;
	}
}