package inatel.c214;

import static org.junit.Assert.*;

import org.junit.Test;

public class HorariosTest{

    @Test
    public void testGetNomeDoProfessor(){
        Horarios horario = new Horarios("Professor", "10:00", "Manhã", 1, 1);
        assertEquals("Professor", horario.getNomeDoProfessor());
    }

    @Test
    public void testGetHorarioDeAtendimento(){
        Horarios horario = new Horarios("Professor", "10:00", "Manhã", 1, 1);
        assertEquals("10:00", horario.getHorarioDeAtendimento());
    }

    @Test
    public void testGetPeriodo(){
        Horarios horario = new Horarios("Professor", "10:00", "Manhã", 1, 1);
        assertEquals("Manhã", horario.getPeriodo());
    }

    @Test
    public void testGetSala(){
        Horarios horario = new Horarios("Professor", "10:00", "Manhã", 1, 1);
        assertEquals(1, horario.getSala());
    }

    @Test
    public void testGetPredio(){
        Horarios horario = new Horarios("Professor", "10:00", "Manhã", 1, 1);
        assertEquals(1, horario.getPredio());
    }

}