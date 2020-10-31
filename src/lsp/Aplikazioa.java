package lsp;

public class Aplikazioa {
	
	public static void main(String[] args) {
		
		LSPCovid19Pacient p = new LSPCovid19Pacient("Garazi", 21);
		IncurableSymptom s1 = new IncurableSymptom("Tristura", 3, 8);
		CardioVascularSymptom s2 = new CardioVascularSymptom("CardioVascular", 4, 9);
		RespiratorySymptom s3 = new RespiratorySymptom("Respiratory", 5, 10);
		NeuroMuscularSymptom s4 = new NeuroMuscularSymptom("NeuroMuscular", 6, 11);
		
		p.addSymptom(s1, 3);
		p.addSymptom(s2, 4);
		p.addSymptom(s3, 5);
		p.addSymptom(s4, 6);
		
		p.showSymptoms();
		p.cure();
	}
}