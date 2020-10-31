package srp;

public class Afection implements Afectionable{
		double afection = 0;

		@Override
		public double getAfection(SRPCovid19Pacient p){
			for (Symptom s: p.symptoms.keySet()) 
				afection=afection+s.getSeverityIndex()*p.symptoms.get(s);
			afection = afection / (p.symptoms.size());
				
			return afection;
		}
}
