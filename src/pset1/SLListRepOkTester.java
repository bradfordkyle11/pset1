package pset1;

import org.junit.Test;
import pset1.SLList.Node;
import static org.junit.Assert.*;

public class SLListRepOkTester {
	@Test public void t0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
	}
	@Test public void t1() {
		SLList l = new SLList();
		Node n = new Node();
		n.next = n;
		l.header = n;
		assertFalse(l.repOk());
	}
	@Test public void t2() {
		SLList l = new SLList();
		Node n = new Node();
		l.header = n;
		assertTrue(l.repOk());
	}
	@Test public void t3() {
		SLList l = new SLList();
		Node n = new Node();
		Node n2 = new Node();
		l.header = n;
		n.next = n2;
		n2.next = n;
		assertFalse(l.repOk());
	}
	@Test public void t4() {
		SLList l = new SLList();
		Node n = new Node();
		Node n2 = new Node();
		l.header = n;
		n.next = n2;
		assertTrue(l.repOk());
	}
	@Test public void t5() {
		SLList l = new SLList();
		Node n = new Node();
		Node n2 = new Node();
		l.header = n;
		n.next = n2;
		n2.next = n2;
		assertFalse(l.repOk());
	}
}
