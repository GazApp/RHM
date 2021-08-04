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
public class Main {
    public static void main(String[] args){
        Empleados e1=new Empleados();
        Empleados e2=new Empleados();
        /*e1.Id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Id"));
        e1.Nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
        e1.Apellido_Paterno=JOptionPane.showInputDialog("Ingresa el apellido Paterno");
        e1.Apellido_Materno=JOptionPane.showInputDialog("Ingresa el apellido Materno");
        e1.Edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
        e1.Correo=JOptionPane.showInputDialog("correo");
        e1.Telefono=Integer.parseInt(JOptionPane.showInputDialog("ingresa telefono"));
        e1.Salario=Float.parseFloat(JOptionPane.showInputDialog("ingresa salario"));
        e1.hiredate=JOptionPane.showInputDialog("Fecha de contratacion");
        */
        e2.Id=Integer.parseInt(JOptionPane.showInputDialog("ingrese Id"));
        e2.Nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
        e2.Apellido_Paterno=JOptionPane.showInputDialog("Ingresa el apellido Paterno");
        e2.Apellido_Materno=JOptionPane.showInputDialog("Ingresa el apellido Materno");
        e2.Edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
        e2.Correo=JOptionPane.showInputDialog("correo");
        e2.Telefono=Integer.parseInt(JOptionPane.showInputDialog("ingresa telefono"));
        e2.Salario=Float.parseFloat(JOptionPane.showInputDialog("ingresa salario"));
        e2.hiredate=JOptionPane.showInputDialog("Fecha de contratacion");
       
        e2.getDetails();
    }
}

