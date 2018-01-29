package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
	/*
	* P1: For any non-null reference value x, x.equals(null) should return false.
	*/
	@Test public void t0() {
		assertFalse(new Object().equals(null));
	}
	@Test public void t1() {
		assertFalse(new C(0).equals(null));
	}
	@Test public void t2() {
		assertFalse(new D(0,0).equals(null));
	}
	/*
	* P2: It is reflexive: for any non-null reference value x, x.equals(x)
	* should return true.
	*/
	@Test public void t3() {
		Object o = new Object();
		assertTrue(o.equals(o));
	}
	@Test public void t4() {
		C c = new C(0);
		assertTrue(c.equals(c));
	}
	@Test public void t5() {
		D d = new D(0,0);
		assertTrue(d.equals(d));
	}
	/*
	* P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
	* should return true if and only if y.equals(x) returns true.
	*/
	@Test public void t6() {
		Object first = new Object();
		Object second = new Object();
		assertTrue(first.equals(second) == second.equals(first));
	}
	@Test public void t7() {
		C first = new C(0);
		C second = new C(0);
		assertTrue(first.equals(second) == second.equals(first));
	}
	@Test public void t8() {
		D first = new D(0,0);
		D second = new D(0,0);
		assertTrue(first.equals(second) == second.equals(first));
	}
	@Test public void t9() {
		Object first = new Object();
		C second = new C(0);
		assertTrue(first.equals(second) == second.equals(first));
	}
	
	@Test public void t10() {
		Object first = new Object();
		D second = new D(0,0);
		assertTrue(first.equals(second) == second.equals(first));
	}
	@Test public void t11() {
		C first = new C(0);
		D second = new D(0,0);
		assertTrue(first.equals(second) == second.equals(first));
	}
	@Test public void t12() {
		C first = new C(0);
		Object second = new Object();
		assertTrue(first.equals(second) == second.equals(first));
	}
	
	@Test public void t13() {
		D first = new D(0,0);
		Object second = new Object();
		assertTrue(first.equals(second) == second.equals(first));
	}
	@Test public void t14() {
		D first = new D(0,0);
		C second = new C(0);
		assertTrue(first.equals(second) == second.equals(first));
	}

}
