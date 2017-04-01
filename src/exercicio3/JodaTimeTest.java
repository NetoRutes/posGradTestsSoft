package exercicio3;

import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.junit.Test;

public class JodaTimeTest {
	@Test
	public void testDataHoje() throws Exception {
		LocalDate hoje = new LocalDate(2017, 4, 1);
		assertEquals(1, hoje.getDayOfMonth());
		assertEquals(4, hoje.getMonthOfYear());
		assertEquals(2017, hoje.getYear());
	}
	
	@Test
	public void testDataNascimento() throws Exception {
		LocalDate hoje = new LocalDate(1991, 2, 12);
		assertEquals(12, hoje.getDayOfMonth());
		assertEquals(2, hoje.getMonthOfYear());
		assertEquals(1991, hoje.getYear());
	}
	
	@Test
	public void testHoraQueAcordei() throws Exception {
		LocalTime horaQueAcordei = new LocalTime(7,10);
		assertEquals(7, horaQueAcordei.getHourOfDay());
		assertEquals(10, horaQueAcordei.getMinuteOfHour());
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void testDataErrada() throws Exception {
		LocalDate dataErrada = new LocalDate(2017, 02, 29);
	}
	
	@Test
	public void testSomarUmdia() throws Exception {
		LocalDate dataCorreta = new LocalDate(2017, 02, 28);
		dataCorreta = dataCorreta.plusDays(1);  
		assertEquals(dataCorreta.getDayOfMonth(), 1);
		assertEquals(dataCorreta.getMonthOfYear(), 3);
		assertEquals(dataCorreta.getYear(), 2017);
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void testHorarioNegativo() throws Exception {
		LocalTime horarioNegativo = new LocalTime(-10, 1);
	}
	
	@Test
	public void testSubtrairUmMilissegundo() throws Exception {
		LocalTime horario = new LocalTime(00, 00, 00);
		horario = horario.minusMillis(1);
		assertEquals(horario,new LocalTime(23, 59, 59,999));
	}
	
	@Test
	public void testIsBefore() throws Exception {
		LocalTime horario = new LocalTime(00, 00, 00);
		assertTrue(horario.isBefore(new LocalTime(00, 00, 01)));
	}
	
	@Test
	public void testIsAfter() throws Exception {
		LocalTime horario = new LocalTime(23, 59, 59, 999);
		assertTrue(horario.isAfter(new LocalTime(00, 00, 00, 000)));
	}
	
	@Test
	public void testContarNumeroDeHoras() throws Exception {
		DateTime primeiroDia = new DateTime(2017, 03, 31, 18, 30);
		DateTime segundoDia = new DateTime(2017, 05, 06, 18, 30);
		Interval interval = new Interval(primeiroDia, segundoDia);
		Period period = new Period(interval.toDurationMillis());
		assertEquals(864, period.getHours());
	}
}
