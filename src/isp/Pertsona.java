package isp;

public class Pertsona implements Yearable{
	String name; 
	int adina; 
	
	public Pertsona(String name, int adina) {
		this.name = name;
		this.adina = adina;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdina() {
		return adina;
	}
	public void setAdina(int adina) {
		this.adina = adina;
	}
	@Override
	public int getYears() {
		return adina;
	}
}
