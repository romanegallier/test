package test.br.ufsc;

import static org.junit.Assert.assertEquals;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalTime;

public class TestHora {
	/*Criação de horas*/
	
	public void criaHora(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(12,5,6);
		//Result Verification
		assertEquals(12,hora.getHourOfDay());
		assertEquals(5,hora.getMinuteOfHour());
		assertEquals(6,hora.getSecondOfMinute());
		//Fixture Teardown
	}

	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeHoraNegativo(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(-1,2,2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeMinutaNegativa(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(1,-2,2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeSecondaNegativa(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(1,2,-2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeHoraGrande(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(25,2,2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeMinuta60(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(1,60,2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeMinuta61(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(1,61,2);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeSeconda60(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(1,60,0);
		//Result Verification
		//Fixture Teardown
	}
	
	@org.junit.Test(expected=IllegalFieldValueException.class)
	public void criaTimeSeconda61(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora =new LocalTime(1,61,0);
		//Result Verification
		//Fixture Teardown
	}
	/*Soma de horas*/
	
	@org.junit.Test
	public void somaHora(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		LocalTime hora2 = new LocalTime(10,10);
		//Result Verification
		assertEquals(hora2,hora.plusMinutes(5));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void somaHorapasaHora(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		LocalTime hora_mas1hora = new LocalTime(11,5);
		//Result Verification
		assertEquals(hora_mas1hora,hora.plusMinutes(60));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void somaHorapasaDia(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		//Result Verification
		assertEquals(hora,hora.plusMinutes(60*24));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void somaHoraVoltaHora(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		LocalTime hora_mas1hora = new LocalTime(9,5);
		//Result Verification
		assertEquals(hora_mas1hora,hora.plusMinutes(-60));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void somaHoraVoltaDia(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		//Result Verification
		assertEquals(hora,hora.plusMinutes(-60*24));
		//Fixture Teardown
	}
	/*Subtração de horas */
	@org.junit.Test
	public void subHora(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		LocalTime hora2 = new LocalTime(10,10);
		//Result Verification
		assertEquals(hora,hora2.minusMinutes(5));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void subHorapasaHora(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		LocalTime hora_mas1hora = new LocalTime(11,5);
		//Result Verification
		assertEquals(hora,hora_mas1hora.minusMinutes(60));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void subHorapasaDia(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		//Result Verification
		assertEquals(hora,hora.minusMinutes(60*24));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void subHoraVoltaHora(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		LocalTime hora_mas1hora = new LocalTime(11,5);
		//Result Verification
		assertEquals(hora_mas1hora,hora.minusMinutes(-60));
		//Fixture Teardown
	}
	
	@org.junit.Test
	public void subHoraVoltaDia(){
		//Fixture Setup
		//Exercise SUT
		LocalTime hora = new LocalTime(10,5);
		//Result Verification
		assertEquals(hora,hora.minusMinutes(-60*24));
		//Fixture Teardown
	}
}
