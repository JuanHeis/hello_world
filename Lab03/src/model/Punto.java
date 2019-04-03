package model;

public class Punto implements Comparable<Punto>{
	private Double x;
	private Double y;
	
	public Punto(Double x, Double y) {
		this.x=x;
		this.y=y;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "("+String.format("%.1f",this.x)+","+String.format("%.1f",this.y)+")";
	}

	@Override
	public int compareTo(Punto o) {
		return (this.getX() > o.getX())? 1:-1;
	}
	
	
}
