package hw7_java;
///fhgyhfusjidkolp;a
import java.util.ArrayList;

public class Child {
	String type;
	private int id;
	private int radius;
	private int anger;//خشم
	private int charisma;//کاریزما
	private int courage;//شجاعت
	private double posx,posy;
	private double vx,vy;
	private boolean fragile;

	public boolean isFragile() {
		return fragile;
	}

	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getAnger() {
		return anger;
	}

	public void setAnger(int anger) {
		this.anger = anger;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public double getPosx() {
		return posx;
	}

	public void setPosx(double posx) {
		this.posx = posx;
	}

	public double getPosy() {
		return posy;
	}

	public void setPosy(double posy) {
		this.posy = posy;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public void Place(int dt){
		posx=posx+vx*dt;
		posy=posy+vy*dt;
	}
	public void Speed(ArrayList<Child> list,Yard y){
		int i=(int) posx+radius;
		int j=(int) posy+radius;
		for(Child ch: list){
		if(posx==ch.getPosx() && posy==ch.getPosy()){
			vx=((Math.pow(radius,2)-Math.pow(ch.getRadius(),2))/(Math.pow(radius,2)+Math.pow(ch.getRadius(),2)))*vx+(2*(Math.pow(ch.getRadius(),2))/(Math.pow(radius,2)+Math.pow(ch.getRadius(),2)))*ch.getVx();
			//ch.setVx(Math.pow(ch.getRadius(),2)-((Math.pow(radius,2))/(Math.pow(radius,2)+Math.pow(ch.getRadius(),2)))*ch.getVx()+(2*(Math.pow(radius,2))/(Math.pow(radius,2)+Math.pow(ch.getRadius(),2)))*vx);
			
//			if((i==0 && j==0)||(i==y.getLength() && j==y.getLength())||(i==0 && j==y.getLength())||(i==y.getLength() && j==0)){
//				vx=-vx;
//				vy=-vy;
//			}

			if(((posx+radius) >= y.getLength() && vx>0)||((posx-radius)<=0 && vx<0)){
				vx=-vx;
			}
			
			if((posy+radius >= y.getLength() && vy>0)||(posy-radius <=0 && vy<0)){
				vy=-vy;
			}
			posx=(posx+vx);
			posy=(posy+vy);
		}		
		}
		
		
				
		

	else
		vx=vx;
	vy=vy;
}
}






