package dip;

import java.util.HashMap;
import java.util.Map;

public class DIPCovid19Pacient extends Pacient {
	Map<Symptom,Integer> symptoms = new HashMap<Symptom,Integer>();
	
	public DIPCovid19Pacient(String name, int years) {
		super(name, years);
	}

	public void addSymptom(Symptom p, Integer w){ 
		symptoms.put(p,w);
	}
	
	double calcCovid19Impact() { 
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		CalcAfection ca=new CalcAfection(); 
		afection=ca.calculateSymptomsAfection (this);
		//calculate increment
		CalcIncrement incr=new CalcIncrement(); 
		increment=incr.calculateIncrementPerYear (this, afection);
		//calculate impact
		impact=afection+increment; 
		
		return impact;
	} 
}
