package dip;

public class CalcAfection implements Afectionable{
	double afection = 0;
	
	public double calculateSymptomsAfection(DIPCovid19Pacient p) {
		for (Symptom s: p.symptoms.keySet()) 
			afection=afection+s.getSeverityIndex()*p.symptoms.get(s);
		afection = afection / (p.symptoms.size());
			
		return afection;
	}
}
