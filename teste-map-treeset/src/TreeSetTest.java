import java.util.TreeSet;

import org.junit.Test;

import junit.framework.Assert;

public class TreeSetTest {

		

	@Test
	public void add(){
		Rapariga rapariga01 = new Rapariga("Rafaela", "12345678910", 22);
		Rapariga rapariga02 = new Rapariga("Juliana", "98765432110", 25);
		Rapariga rapariga03 = new Rapariga("Andrea", "25874136900", 20);
		TreeSet t = new TreeSet();
		t.add(rapariga01);
		t.add(rapariga02);
		t.add(rapariga03);
		Assert.assertTrue(t.contains(rapariga03));
	}
	
	@Test
	public void remove(){
		Rapariga rapariga01 = new Rapariga("Rafaela", "12345678910", 22);
		Rapariga rapariga02 = new Rapariga("Juliana", "98765432110", 25);
		Rapariga rapariga03 = new Rapariga("Andrea", "25874136900", 20);
		TreeSet t = new TreeSet();
		t.add(rapariga01);
		t.add(rapariga02);
		t.add(rapariga03);
		t.remove(rapariga02);
		Assert.assertFalse(t.contains(rapariga02));
	}
	
	@Test
	public void size(){
		Rapariga rapariga01 = new Rapariga("Rafaela", "12345678910", 22);
		Rapariga rapariga02 = new Rapariga("Juliana", "98765432110", 25);
		Rapariga rapariga03 = new Rapariga("Andrea", "25874136900", 20);
		TreeSet t = new TreeSet();
		t.add(rapariga01);
		t.add(rapariga02);
		t.add(rapariga03);
		Assert.assertTrue(t.size() == 3);
		
	}
	
	@Test
	public void clear(){
		Rapariga rapariga01 = new Rapariga("Rafaela", "12345678910", 22);
		Rapariga rapariga02 = new Rapariga("Juliana", "98765432110", 25);
		Rapariga rapariga03 = new Rapariga("Andrea", "25874136900", 20);
		TreeSet t = new TreeSet();
		t.add(rapariga01);
		t.add(rapariga02);
		t.add(rapariga03);
		t.clear();
		Assert.assertTrue(t.size() == 0);
		
	}
	@Test
	 public void contains(){
			Rapariga rapariga01 = new Rapariga("Rafaela", "12345678910", 22);
			Rapariga rapariga02 = new Rapariga("Juliana", "98765432110", 25);
			Rapariga rapariga03 = new Rapariga("Andrea", "25874136900", 20);
			TreeSet t = new TreeSet();
			t.add(rapariga01);
			t.add(rapariga02);
			t.add(rapariga03);
			t.remove(rapariga02);
			Assert.assertEquals(false, t.contains(rapariga02));
	 }
	
	@Test
	public void last(){
		Rapariga rapariga01 = new Rapariga("Rafaela", "12345678910", 22);
		Rapariga rapariga02 = new Rapariga("Juliana", "98765432110", 25);
		Rapariga rapariga03 = new Rapariga("Andrea", "25874136900", 50);
		TreeSet t = new TreeSet();
		t.add(rapariga01);
		t.add(rapariga02);
		t.add(rapariga03);
		Assert.assertEquals(rapariga03, t.last());
	}
	
	
	
	
}