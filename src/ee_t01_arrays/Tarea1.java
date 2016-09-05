/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** 
Este proyecto consistirá en una clase que lea de un archivo, especificado como el primer parámetro de la clase lo siguiente:
ENTRADA:
6
1
2
3
4
5
6

SALIDA:
6
5
4
3
2
1
La primer linea es el numero de elementos y las siguientes son los elementos específicos.
Lo anterior meterlo en un array e imprimir en consola el mismo de manera descendente */
 
 
 
package ee_t01_arrays;

/** SE IMPORTAN LAS CLASES QUE SE VAYAN A USAR DE SUS RESPECTIVOS PAQUETES Y LIBRERIAS */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author INGRID NIÑO
 */
 
public class Tarea1 {
    
    public static void main(String[] args) {
        /** Se declara un objeto de la clase Tarea1 */
        Tarea1 a=new Tarea1();
        
        /**En esta línea de código se muestra un cuadro de dialogo donde se pide introducir el nombre del archivo 
        ejem. "prueba" (prueba es el nombre del archivo)*/
        String nomArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        try{
        //Aqui se lee el nombre del archivo introducido
        BufferedReader br=new BufferedReader(new FileReader(nomArchivo + ".txt"));
        String l;
            l = br.readLine();
        
        int cont=0;
        int x;
        
        /** Con ayuda de un contador se puede hacer que la primera línea del archivo 
         sea asignado como el tamaño del arreglo, utilizando el arreglo que ya se declara en el main,
         despues de ser asignado el tamaño del arreglo se utilizan los demas elementos del archivo para llenar el arreglo*/
        while(l!=null){
            if(cont==0){
                x = Integer.parseInt(l);
                args =new String [x];
                cont ++;
            }else{
                args [cont-1] = l;
                cont++;
            }
            l=br.readLine();
        }
        /** Con un try catch se maneja la excepción que se presenta cuando un archivo no es encontrado, 
            y en este caso se arroja un cuadro de mensaje diciendo que el archivo no fue encontrado*/
    }catch(IOException e){
        JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
    }
        /** Este for se utiliza para imprimir los números de forma descendente*/
         for(int i=args.length;i>0;i--){
            System.out.println(i);
        }
    }
    
}
