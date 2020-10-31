package ocp;

import java.util.HashMap;
import java.util.Map;

public class OCPCovid19Pacient extends Pacient{

	
	public OCPCovid19Pacient(String name, int years) {
		super(name, years);
	}
	
	Map<Symptom,Integer> symptoms = new HashMap<Symptom,Integer>();

	public void addSymptom(Symptom c, Integer p){ 
		symptoms.put(c, p);
	}
	
	public double calcCovid19Impact() { 
		double afection=0;
		double increment=0; 
		double impact;

		for (Symptom c:symptoms.keySet()) 
			afection=afection+c.getSeverityIndex()*symptoms.get(c);
		afection=afection/(symptoms.size());
		//calculate increment
		if (getYears()>65) 
			increment=afection*0.5; 
		//calculate impact
		impact=afection+increment;

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
