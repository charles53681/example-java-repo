package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        String DNI;

        Scanner scanner = new Scanner(System.in);
        CentroEducativo centroEducativo = new CentroEducativo();


        while(scanner.hasNext()){

//            eleccion = scanner.nextLine();
            String eleccion = scanner.nextLine();
            if(eleccion.equals("fin")){
                break;
            }

            if(eleccion.equals("agregar")){
                System.out.println("Agregar Alumno");
                System.out.println("Ingresar nombre");
                nombre = scanner.nextLine();
                System.out.println("Ingresar apellido");
                apellido = scanner.nextLine();
                System.out.println("Ingresar DNI");
                DNI = scanner.nextLine();
                Alumno nuevoAlumno = new Alumno(nombre,apellido,DNI);
                centroEducativo.agregarAlumno(nuevoAlumno);
                System.out.println(nuevoAlumno.toString());
            }

            if(eleccion.equals("centro")){
                centroEducativo.verAlumnos();
            }


        }

        /*
        while(!eleccion.equals("fin")){
            eleccion = scanner.nextLine();
            if(eleccion.equals("agregar")){
                System.out.println("Agregar Alumno");
                System.out.println("Ingresar nombre");
                nombre = scanner.nextLine();
                System.out.println("Ingresar apellido");
                apellido = scanner.nextLine();
                System.out.println("Ingresar DNI");
                DNI = scanner.nextLine();
                Alumno nuevoAlumno = new Alumno(nombre,apellido,DNI);
                System.out.println(nuevoAlumno.toString());
            }
        }*/

        /*
        String nombre;
        String apellido;
        String DNI;

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toUpperCase();

        while(!choice.equals("QUIT")) {
            String opcion = scanner.nextLine().toUpperCase();

            if(opcion.equals("AGREGAR")){
                System.out.println("Ingresar un Alumno NUEVO");
                System.out.println("Ingresar nombre");
                nombre= scanner.next();
                System.out.println("Ingresar apellido");
                apellido= scanner.next();
                System.out.println("Ingresar DNI");
                DNI= scanner.next();
                Alumno nuevoAlumno = new Alumno(nombre,apellido,DNI);
                System.out.println(nuevoAlumno.toString());
                choice = scanner.nextLine().toUpperCase();
            }

            choice = scanner.nextLine().toUpperCase();

        }
*/
        /*

        CentroEducativo c = new CentroEducativo();

        Alumno pepe = new Alumno("123", "Fulano", "Pepe");
        Alumno maria = new Alumno("124", "Mengano", "Maria");
        Alumno luis = new Alumno("125", "Sultano", "Luis");

        pepe.agregarExamen(new ExamenEscrito(40, 7, "00/00/0000"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "00/00/0000"));

        maria.agregarExamen(new ExamenEscrito(60, 4, "00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(65, 8, "00/00/0000"));
        maria.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));

        luis.agregarExamen(new ExamenEscrito(50, 9, "00/00/0000"));
        //luis.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE, "00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));

        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        c.agregarAlumno(luis);

        System.out.println("Cantidad de aprobados: " + c.cantAprobados());
*/
    }
}
