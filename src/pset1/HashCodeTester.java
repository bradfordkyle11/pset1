package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashCodeTester {
	/*
	* P5: If two objects are equal according to the equals(Object)
	* method, then calling the hashCode method on each of
	* the two objects must produce the same integer result.
	*/
	@Test public void t0() {
		Object first = new Object();
		Object second = first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t1() {
		C first = new C(0);
		C second = first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t3() {
		D first = new D(0,0);
		D second = first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t4() {
		Object first = new Object();
		C second = (C) first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t5() {
		Object first = new Object();
		D second = (D) first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t6() {
		C first = new C(0);
		Object second = first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t7() {
		C first = new C(0);
		D second = (D) first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t8() {
		D first = new D(0,0);
		Object second = first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}
	@Test public void t9() {
		D first = new D(0,0);
		C second = first;
		assertTrue((first.hashCode() == second.hashCode()) || !first.equals(second));
	}		
}
