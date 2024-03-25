package inatel.c214;

import static org.junit.Assert.*;

import com.google.gson.JsonParseException;
import org.junit.Test;

import inatel.c214.Horarios;

public class RequestHorariosTest {

    @Test
    public void testCalculatePredio() {
        RequestHorarios request = new RequestHorarios();
        assertEquals(0, request.calculatePredio(1));
    }

    @Test
    public void testCalculatePredio2() {
        RequestHorarios request = new RequestHorarios();
        assertEquals(0, request.calculatePredio(5));
    }

    @Test
    public void testErrorCalculatePredio() {
        RequestHorarios request = new RequestHorarios();
        assertNotEquals(1, request.calculatePredio(1));
    }

    @Test
    public void testErrorCalculatePredio2() {
        RequestHorarios request = new RequestHorarios();
        assertNotEquals(1, request.calculatePredio(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculatePredioThrowsExceptionForZeroOrNegativeSala() {
        RequestHorarios request = new RequestHorarios();
        request.calculatePredio(0);
    }


    @Test(expected = NullPointerException.class)
    public void requestHorariosThrowsExceptionForNullInput() {
        RequestHorarios request = new RequestHorarios();
        request.requestHorarios(null);
    }

    @Test(expected = JsonParseException.class)
    public void requestHorariosThrowsExceptionForInvalidJson() {
        RequestHorarios request = new RequestHorarios();
        request.requestHorarios("invalid json");

    }
}