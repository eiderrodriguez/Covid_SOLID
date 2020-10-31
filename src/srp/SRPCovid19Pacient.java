package srp;

import java.util.HashMap;
import java.util.Map;

public class SRPCovid19Pacient extends Pacient{

	
	public SRPCovid19Pacient(String name, int years) {
		super(name, years);
	}
	
	Map<Symptom,Integer> symptoms = new HashMap<Symptom,Integer>();

	public void addSymptom(Symptom c, Integer p){ 
		symptoms.put(c, p);
	}
	
	public double calcCovid19Impact(Afectionable af, Incrementable in, Impactable im) { 
		//calculate afection
		double afection = af.getAfection(this);
		//calculate increment
		double increment = in.getIncrement(this, afection);
		//calculate impact
		double impact = im.getImpact(this, afection, increment);

		return impact;
	}
	
	public int sanatedDays() {
		int egunak = 0;
		for (Symptom c:symptoms.keySet()) {
			if(c.affectedDays>egunak) {
				egunak = c.affectedDays;
			}
		}		
		return egunak;
	}
}
