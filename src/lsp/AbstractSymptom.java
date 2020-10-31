package lsp;

public abstract class AbstractSymptom {
	
	public String name;
	int covidImpact; 
	int severityIndex;
	
	public AbstractSymptom(String name, int covidImpact, int severityIndex) {
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

	
	public void show(){
		System.out.println("symptom value: "+name+" severityIndex: "+severityIndex+" covidImpact: "+covidImpact);
	}
}
