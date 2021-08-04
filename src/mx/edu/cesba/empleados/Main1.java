/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class Main1 {
    public static void main(String[] args){
        Empleados e1=new Empleados();
        e1.Id=1;
        e1.Nombre=("Maria");
        e1.Apellido_Paterno=("Guerrero");
        e1.Apellido_Materno=("Cortes");
        e1.Edad=19;
        e1.Correo=("mari@gmail.com");
        e1.Telefono=442985689;
        e1.Salario=270000;
        e1.hiredate=("25 de agosto 2020");
        e1.getDetails();
    }
}
