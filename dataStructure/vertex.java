package dataStructure;

import utils.Point3D;

public class vertex implements node_data {
	int key;
	double weight;
	int tag;
	Point3D point;
public vertex (int key, Point3D p) {
	this.key=key;
	weight = Double.MAX_VALUE; // infinity 
	this.point = new Point3D(p);
}
public vertex (Point3D p) {
	this.point = new Point3D(p);
}
	@Override
	public int getKey() {
		return this.key;
	}

	@Override
	public Point3D getLocation() {
		// TODO Auto-generated method stub
		return this.point;
	}

	@Override
	public void setLocation(Point3D p) {
		this.point = new Point3D(p);
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setWeight(double w) {
		this.weight = w;
	}

	@Override
	public String getInfo() {
String ans = "the key is: " + this.key  +"\n"+ "point is : x: " 
	+this.point.x() +" y: " +this.point.y() + " z- " +this.point.z();
return ans;
	}

	@Override
	public void setInfo(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTag() {
		// TODO Auto-generated method stub
		return this.tag;
	}

	@Override
	public void setTag(int t) {
		this.tag = t;		
	}

}
