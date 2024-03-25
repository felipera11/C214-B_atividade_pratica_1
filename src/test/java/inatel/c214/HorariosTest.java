package inatel.c214;

import static org.junit.Assert.*;

import org.junit.Test;

public class HorariosTest{

    @Test
    public void testGetNomeDoProfessor(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        assertEquals("Chris", horario.getNomeDoProfessor());
    }

    @Test
    public void testGetHorarioDeAtendimento(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        assertEquals("10:00", horario.getHorarioDeAtendimento());
    }

    @Test
    public void testGetPeriodo(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        assertEquals("Manhã", horario.getPeriodo());
    }

    @Test
    public void testGetSala(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        assertEquals(1, horario.getSala());
    }

    @Test
    public void testGetPredio(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        assertEquals(1, horario.getPredio());
    }

    @Test
    public void testSetNomeDoProfessor(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        horario.setNomeDoProfessor("Renzo");
        assertEquals("Renzo", horario.getNomeDoProfessor());
    }

    @Test
    public void testSetHorarioDeAtendimento(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        horario.setHorarioDeAtendimento("11:00");
        assertEquals("11:00", horario.getHorarioDeAtendimento());
    }

    @Test
    public void testSetPeriodo(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        horario.setPeriodo("Tarde");
        assertEquals("Tarde", horario.getPeriodo());
    }

    @Test
    public void testSetSala(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        horario.setSala(2);
        assertEquals(2, horario.getSala());
    }

    @Test
    public void testSetPredio(){
        Horarios horario = new Horarios("Chris", "10:00", "Manhã", 1, 1);
        horario.setPredio(2);
        assertEquals(2, horario.getPredio());
    }
}