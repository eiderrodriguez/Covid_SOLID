package srp;

public class Aplikazioa {
	
	public static void main(String[] args) {
		SRPCovid19Pacient p = new SRPCovid19Pacient("Eider", 23);
		NeuroMuscularSymptom neuro = new NeuroMuscularSymptom(3,8,13);
		RespiratorySymptom resp = new RespiratorySymptom(4,9,14);
		CardioVascularSymptom cardio = new CardioVascularSymptom(51,10,15);
		
		p.addSymptom(neuro,1);
		p.addSymptom(resp, 2);
		p.addSymptom(cardio, 3);
		
		Afectionable af = new Afection();
		Incrementable in = new Increment();
		Impactable im = new Impact();
		
		System.out.println(p.calcCovid19Impact(af, in, im));
		
	}
}
