package isp;

import java.util.HashMap;
import java.util.Map;


public class ISPCovid19Pacient extends Pacient{
	
	public ISPCovid19Pacient(String name, int years) {
		super(name, years);
	}

	String name;
	Map<Symptom,Integer> symptoms = new HashMap<Symptom,Integer>();
	
	
	public void addSymptom(Symptom s, Integer w){ 
		symptoms.put(s, w);
	}
	
	double calcCovid19Impact() { 
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		for (Symptom s: symptoms.keySet()) 
			afection=afection+s.getSeverityIndex()*symptoms.get(s);
		afection = afection / (symptoms.size());
		//calculate increment
		CalcIncrement incr=new CalcIncrement(); 
		increment=incr.calculateIncrementPerYear (this, afection);
		//calculate impact
		impact=afection+increment; 
		
		return impact;
	} 
}
