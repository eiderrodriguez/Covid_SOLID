package lsp;

import java.util.HashMap;
import java.util.Map;

public class LSPCovid19Pacient extends Pacient { 
	
	String name;
	Map<AbstractSymptom,Integer> symptoms=new HashMap<AbstractSymptom,Integer>();
	
	public LSPCovid19Pacient(String name, int years) {
		super(name, years);
	}
	
	
	public void addSymptom(AbstractSymptom p, Integer w){ 
		symptoms.put(p,w);
	}
	public void showSymptoms(){
		for (AbstractSymptom s: symptoms.keySet())
			s.show();
	}
	public void cure(){
		for (AbstractSymptom s: symptoms.keySet())
			if(s instanceof Symptom)
				((Symptom) s).cure();
	} 
}