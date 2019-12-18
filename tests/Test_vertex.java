package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructure.vertex;
import utils.Point3D;

class Test_vertex {

	@Test
	void test() {
		Point3D p = new Point3D(5, 3.2, 5.6);
	vertex test = new vertex (2,p);	
	System.out.println(test.getInfo());
	int key_exepted = test.getKey();
	assertEquals (2, test.getKey());
	
	}

}
