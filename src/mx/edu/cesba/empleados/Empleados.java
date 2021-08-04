/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.empleados;

/**
 *
 * @author danny
 */
public class Empleados {
    
    int Id = 1;
    String Nombre;
    String Apellido_Paterno;
    String Apellido_Materno;
    int Edad;
    String Correo;
    int Telefono;
    float Salario;
    String hiredate;
//Metodo:son las acciones que realiza un objeto

    public void getDetails() {
        System.out.println("Id: " + Id);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido_Materno: " + Apellido_Paterno);
        System.out.println("LastName: " + Apellido_Materno);
        System.out.println("Age: " + Edad);
        System.out.println("Email: " + Correo);
        System.out.println("Phone Number: " + Telefono);
        System.out.println("Salary: " + Salario);
        System.out.println("Hire Date: " + hiredate);

    }
}

