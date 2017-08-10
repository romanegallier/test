package test.br.ufsc;

import static org.junit.Assert.*;

import org.joda.time.*;

public class Test {
	
	/*Criacao de data*/
	@org.junit.Test
	public void criaDataNatal2017(){
		//Fixture Setup
		//Exercise SUT
		LocalDate natal2017 = new LocalDate(2017,12,25);
		//Result Verification
		assertEquals(2017, natal2017.getYear());
		assertEquals(12, natal2017.getMonthOfYear());
		assertEquals(25, natal2017.getDayOfMonth());
		//Fixture Teardown
	}

	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaDataDiaNegativo(){
		//Fixture Setup
		//Exercise SUT
		LocalDate dataInvalida = new LocalDate(2017,1,-1);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaDataDeAnoBissextoInvalido(){
		//Fixture Setup
		//Exercise SUT
		LocalDate dia29Fevereiro = new LocalDate(2017,2,29);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaDataMesInvalido(){
		//Fixture Setup
		//Exercise SUT
		LocalDate dia = new LocalDate(2017,13,2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaDataMesNegativo(){
		//Fixture Setup
		//Exercise SUT
		LocalDate dia = new LocalDate(2017,0,2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaDataDiaNul(){
		//Fixture Setup
		//Exercise SUT
		LocalDate diaNul = new LocalDate(2017,4,0);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaData31Avril(){
		//Fixture Setup
		//Exercise SUT
		LocalDate diaNul = new LocalDate(2017,4,31);
		//Result Verification
		//Fixture Teardown
	}
	
	/*Soma de datas*/
	
	@org.junit.Test
	public void somaDataDays(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		LocalDate janeiro8_2017 = new LocalDate(2017,1,8);
		//Result Verification
		assertEquals(janeiro8_2017, janeiro1_2017.plusDays(7));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void somaPassaMes(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		LocalDate janeiro8_2017 = new LocalDate(2017,2,2);
		//Result Verification
		assertEquals(janeiro8_2017, janeiro1_2017.plusDays(32));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void somaPassaAnno(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		LocalDate janeiro1_2018 = new LocalDate(2018,1,1);
		//Result Verification
		assertEquals(janeiro1_2018, janeiro1_2017.plusDays(365));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void somaZero(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		//Result Verification
		assertEquals(janeiro1_2017, janeiro1_2017.plusDays(0));
		//Fixture Teardown
	}
	
	/*Substracao de data*/
	
	@org.junit.Test
	public void subDataDays(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		LocalDate janeiro8_2017 = new LocalDate(2017,1,8);
		//Result Verification
		assertEquals(janeiro1_2017, janeiro8_2017.minusDays(7));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void subPassaMes(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		LocalDate febrero2_2017 = new LocalDate(2017,2,2);
		//Result Verification
		assertEquals(janeiro1_2017, febrero2_2017.minusDays(32));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void subPassaAnno(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		LocalDate janeiro1_2018 = new LocalDate(2018,1,1);
		//Result Verification
		assertEquals(janeiro1_2017, janeiro1_2018.minusDays(365));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void subZero(){
		//Fixture Setup
		//Exercise SUT
		LocalDate janeiro1_2017 = new LocalDate(2017,1,1);
		//Result Verification
		assertEquals(janeiro1_2017, janeiro1_2017.minusDays(0));
		//Fixture Teardown
	}
	

}
