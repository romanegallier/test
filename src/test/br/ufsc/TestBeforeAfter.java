package test.br.ufsc;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;

public class TestBeforeAfter {
	@org.junit.Test
	public void AfterYears(){
		//Fixture Setup
		LocalDate natal2017 = new LocalDate(2017,12,25);
		LocalDate natal2018 = new LocalDate(2018,12,25);
		//Exercise SUT
		boolean ehDepois = natal2018.isAfter(natal2017);
		//Result Verification
		assertTrue(ehDepois);
		//Fixture Teardown
	}
	
	public void AfterMonth(){
		//Fixture Setup
		LocalDate data1 = new LocalDate(2017,11,25);
		LocalDate data2 = new LocalDate(2017,12,25);
		//Exercise SUT
		boolean ehDepois = data2.isAfter(data1);
		//Result Verification
		assertTrue(ehDepois);
		//Fixture Teardown
	}
	
	public void AfterDia(){
		//Fixture Setup
		LocalDate data1 = new LocalDate(2017,12,24);
		LocalDate data2 = new LocalDate(2017,12,25);
		//Exercise SUT
		boolean ehDepois = data2.isAfter(data1);
		//Result Verification
		assertTrue(ehDepois);
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void AfterYearsFalse(){
		//Fixture Setup
		LocalDate natal2017 = new LocalDate(2017,12,25);
		LocalDate natal2018 = new LocalDate(2018,12,25);
		//Exercise SUT
		boolean ehDepois = natal2017.isAfter(natal2018);
		//Result Verification
		assertFalse(ehDepois);
		//Fixture Teardown
	}
	
	public void AfterMonthFalse(){
		//Fixture Setup
		LocalDate data1 = new LocalDate(2017,11,25);
		LocalDate data2 = new LocalDate(2017,12,25);
		//Exercise SUT
		boolean ehDepois = data1.isAfter(data2);
		//Result Verification
		assertFalse(ehDepois);
		//Fixture Teardown
	}
	
	public void AfterDiaFalse(){
		//Fixture Setup
		LocalDate data1 = new LocalDate(2017,12,24);
		LocalDate data2 = new LocalDate(2017,12,25);
		//Exercise SUT
		boolean ehDepois = data1.isAfter(data2);
		//Result Verification
		assertFalse(ehDepois);
		//Fixture Teardown
	}

}
