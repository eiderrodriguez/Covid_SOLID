package dip;

public class Aplikazioa {
	public static void main(String[] args) {
		
		DIPCovid19Pacient p = new DIPCovid19Pacient("Eider", 23);
		Symptom s1 = new Symptom("Neuro", 3, 8);
		Symptom s2 = new Symptom("CardioVascular", 4, 9);
		Symptom s3 = new Symptom("Respiratory", 5, 10);
		
		p.addSymptom(s1, 6);
		p.addSymptom(s2, 7);
		p.addSymptom(s3, 8);
		
		System.out.println(p.calcCovid19Impact());
	}
}
