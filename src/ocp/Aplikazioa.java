package ocp;

public class Aplikazioa {
	
	public static void main(String[] args) {
		OCPCovid19Pacient p = new OCPCovid19Pacient("Eider", 23);
		NeuroMuscularSymptom neuro = new NeuroMuscularSymptom(3,8,13);
		RespiratorySymptom resp = new RespiratorySymptom(4,9,14);
		CardioVascularSymptom cardio = new CardioVascularSymptom(5,10,15);
		
		p.addSymptom(neuro,1);
		p.addSymptom(resp, 2);
		p.addSymptom(cardio, 3);
		
		System.out.println(p.calcCovid19Impact());
		System.out.println(p.sanatedDays());
	}
}
