package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CentroEducativoTest {

    @Test
    public void agregarAlumno() {
    }

    @Test
    public void cantAprobadosTest() {
        Alumno a= new Alumno("75154247","Charles", "Torres");
        a.agregarExamen(new ExamenEscrito(40, 8, "00/00/0000"));

        assertEquals("El alumno no desaprobo ningun examen debe ser true",true,a.aprobo());


    }
}