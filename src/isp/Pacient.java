package isp;

public class Pacient implements Yearable{
	String name; 
	int years; 
	
	public Pacient(String name, int years) {
		this.name = name;
		this.years = years;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}

}
