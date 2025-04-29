/******************************************************************************
Este ejercicio es para usar el paradigma objetos, conceptos fundamentales,
y estructurar clases.
Se podra:
Agregar estudiantes, mostra estudiantes, buscar, y eliminar estudiantes.
El mismo tiene un menu de opciones..

*******************************************************************************/
import java.util.*;
import java.util.Scanner;

public class Estudiante
{
    private String nombre;
    private int edad;
    private double notaFinal;
    
    //Invocando a los constructores de mi clase Estudiante
    public Estudiante(String nombre, int edad, double notaFinal)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }
    
    
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public int getId() { return id; }
    public double getNota() { return nota; }

    public void setNombre(String nombre) { this.nombre = nombre;}
    public void setEdad(int edad) { this.edad = edad;}
    public void setNota(double nota) { this.nota = nota;}
    
    public static void agregar_estudiante(ArrayList<Estudiante>estudiante,Scanner scn)
    {
        System.out.println("*Ingrese el nombre y apellido del estudiante: ");
        String nombre = scn.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scn.nextInt();
        System.out.println("Ingrese la nota del estudiante: ");
        double notaFinal = scn.nextDouble();
        estudiantes.add(new Estudiante(nombre, edad, id, nota));
        System.out.println("*****Estudiante agregado de manera correcta *******");
    }
    
    public static void mostrarEstudiantes(ArrayList<Estudiante>estudiantes)
    {
        for(Estudiante e : estudiantes)
        {
            System.out.println("ID: "+e.getId()+ "Nombre: "+getNombre());
        }
    }
    
    
    public static void buscarEstudiante(ArrayList<Estudiante>estudiantes, Scanner scn)
    {
    System.out.println("Ingrese el id del estudiante: ");
    int id = scn.nextInt();
    boolean encontrar = false;
    for(Estudiante e: estudiantes)
    {
        if(e.get.Id == id)
        {
            System.out.println("Encontrado: "+ getNombre()+ "Nota: "+ get.notaFinal);
            encontrado = true; 
            break;
        }
    }
    if(!econtrado)
    {
        System.out.println("Estudiante no encontrado en el sistema");
    }
        
    }
    
    void eliminarEstudiante(ArrayList<Estudiante>estudiantes, Scanner scn)
    {
        System.out.println("ID A ELIMINAR:");
        int id ) scn.nextInt();
        estudiantes.removeIf(e->e.getId()== id);
        System.out.println("Estudiante eliminado... ");
    }
}



public class GestionEstudiantes
{
	public static void main(String[] args) 
	{
	    ArrayList<Estudiante>estudiantes = new ArrayList<>();
	    Scanner scn = new Scanner(System.in);
	    int opcion;
		
		do 
		{
		    System.out.println("*****MENU DE ESTUDIANTES *******");
		    System.out.println("1-AGREGAR ESTUDIANTE ");
		    System.out.println("MOSTRAR ESTUDIANTES ");
		    System.out.println("3- Buscar estudiante");
		    System.out.println("4- Eliminar estudiante ");
		    System.out.println("5- Salir del programa ");
		    System.out.println("Ingrese una opcion!!!");
		    opcion = scn.nextInt();
		    scn.nextLine();
		    
		    switch(opcion)
		    {
		        case 1:
		            agregar_estudiante(estudiantes, scn);
		            break;
		            
		          case 2:
		              mostrarEstudiantes(estudiantes);
		              break;
		          case 3:
		              buscarEstudiante(estudiantes,scn);
		              break;
		              
		          case 4:
		              eliminarEstudiante(estudiantes,scn);
		              
		          case 5:
		              System.out.println("SALIR DEL PROGRAMA...");
		          
		          default:
		          System.out.println("OPCION INCORRECTA.Ingrese otra opcion!");
		              
		    }
		    
		} while (opcion != 5);
	}
}
