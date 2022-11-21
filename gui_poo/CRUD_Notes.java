/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.gui_poo;

//@author Billy

import java.io.File;
import java.io.IOException; 
import java.io.FileWriter;

public class CRUD_Notes {
    //Crea Archivo.txt
    public static void createFile(String name){
    try {
          File myObj = new File(name +".txt");
          if (myObj.createNewFile()) {
            System.out.println("Se creo: " + myObj.getName());
          } else {
            System.out.println("Ya existe.");
          }
        } catch (IOException e) {
          System.out.println("Ocurrio un Error...");
          e.printStackTrace();
        }}
    
    //Elimina un Archivo.txt
    public static void deleteFile(String name){
    File myObj = new File(name +".txt"); 
    if (myObj.delete()) { 
      System.out.println("Se elimino: " + myObj.getName());
    } else {
      System.out.println("Fallo la Eliminacion");
    }}
    
    public static void writeFile(String name,String data){
try {
      FileWriter myWriter = new FileWriter(name+".txt");
      myWriter.write(data);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error...");
      e.printStackTrace();
    }
    }

    
}
