package NewSpring.SpringApp;

public class Address {
	
	private String Village;
	private String Tal;
	private String Dist;
	public String getVillage() {
		return Village;
	}
	public void setVillage(String village) {
		Village = village;
	}
	public String getTal() {
		return Tal;
	}
	public void setTal(String tal) {
		Tal = tal;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	@Override
	public String toString() {
		return "Address [Village=" + Village + ", Tal=" + Tal + ", Dist=" + Dist + "]";
	}


}
