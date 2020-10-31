package lsp;

public class Symptom extends AbstractSymptom implements ICure{ 
	
	public Symptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
	}

	@Override
	public void cure() {
		System.out.println("treatment applied to: "+name);
	}
}