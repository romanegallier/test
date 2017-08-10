package test.br.ufsc;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;

public class TestDataHora {
		
		/*Criacao de data*/
		@org.junit.Test
		public void criaDataNatal2017(){
			//Fixture Setup
			//Exercise SUT
			DateTime natal2017 = new DateTime(2017, 12, 25, 6, 5);
			//Result Verification
			assertEquals(2017, natal2017.getYear());
			assertEquals(12, natal2017.getMonthOfYear());
			assertEquals(25, natal2017.getDayOfMonth());
			assertEquals(6, natal2017.getHourOfDay());
			assertEquals(5, natal2017.getMinuteOfHour());
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


}
