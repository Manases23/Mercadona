/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomercadona;

import java.util.ArrayList;


public class EjemploMercadona {

   public static ArrayList <Empleado> empleados = new ArrayList <Empleado>();
   public static ArrayList <Producto> productos = new ArrayList <Producto>();
    
    
   
   
public static void rellenarDatos (){
    
    //COMO SOLO VOY A TRABAJAR CON BEBIDAS RELLENO SOLO DATOS DE BEBIDAS
    
    Bebida b; 
    BebidaAlcohol bal;
    //creo 10 bebidas sin alcohol y las meto en producto
    for (int i = 0; i < 10; i++) {
        b = new Bebida();
        b.setCodigo("BEBIDA111"+i);
        b.setFecha_caducidad("12/03/2018");
        b.setAzucar("15%"+i);
        b.setNombre("CocaCola "+i);
        b.setPeso(2);
        productos.add(b);
    }
    //creo 10 bebidas con alcohol y las meto en producto
    for (int i = 0; i < 10; i++) {
        bal = new BebidaAlcohol();
        bal.setCodigo("BEBIDAAlcohol111"+i);
        bal.setFecha_caducidad("12/03/2018");
        bal.setAzucar("10%"+i);
        bal.setGraduacion(1.6*i);
        bal.setNombre("Cerveza x");
        productos.add(bal);
    }

    //creo el resto de productos por si acaso hacen falta
    
    Producto p;
    ProductoCaduca pc;
    for (int i = 0; i < 10; i++) {
        p = new Producto();
        p.setCodigo("PROD111"+i);
        p.setNombre("Lata");
        productos.add(p);
    
        pc = new ProductoCaduca();
        pc.setCodigo("PRODCA111" +i);
        pc.setFecha_caducidad("23/02/2017");
        pc.setNombre("Carne");
        productos.add(pc);
    }
    
}  
    //----1-----Mostrar todos los productos
public static void mostrarTodosProductos(){
    for (Producto producto : productos) {
        System.out.println(producto.getCodigo());
    }
}


    //-----2-----Muestro todas las bebidas (tengan graduación o no) a través de su azucar
public static void mostrarBebidas(){
    for (int i = 0; i < productos.size(); i++) {
        if(productos.get(i) instanceof Bebida){
            System.out.println( ((Bebida)productos.get(i)).getAzucar() );
        }
    }
}

    //-----3-----Mostrar el azucar de las bebidas no alcohólicas
public static void mostrarAzucarBebidasNoAlcohólicas(){
    for (int i = 0; i < productos.size(); i++){
        //Tiene que ser bebida pero no bebida con alcohol
        if((productos.get(i) instanceof Bebida) && 
          (!(productos.get(i) instanceof BebidaAlcohol))){
            System.out.println( ((Bebida)productos.get(i)).getAzucar() );
        }
    }
}


    //-----4-----Muestro la media en grados de las bebidas alcohólicas
public static void mediaGraduacionAlcohol(){
    
    double media = 0.0; 
    double suma = 0.0;
    int contador = 0;
    
    for (int i = 0; i < productos.size(); i++) {
        if(productos.get(i) instanceof BebidaAlcohol){            
            //AQUI ES DONDE ME PIERDO POR COMPLETO, NO PUEDO LLEGAR A GRADUACION
            //PARA LLEGAR A GRADUACIÓN HAY QUE HACER UN CASTING
            suma = suma + ((BebidaAlcohol)productos.get(i)).getGraduacion();
            contador = contador + 1;
        }   
        media = suma / contador;
    }
    System.out.println("Las bebidas alcohólicas tienen una media de " + media + 
            " grados"); 
}


        //  ----------------SOBRECARGA A NIVEL DE CLASE---------------------
        //  -------EN CADA CLASE HACEMOS UN MOSTRAR, CON SUPER Y DEMÁS------

    //-----5-----Mostrar todos los productos con la funcion mostrar en la clase
public static void mostrarTodosLosProductos(){
    for (Producto producto : productos) {
        producto.mostrar();
        System.out.println("");
    }
}



   
    public static void main(String[] args) {
       rellenarDatos();
        
       //----1----
       //mostrarTodosProductos();
       
       //----2----
       //mostrarBebidas();
       
       //----3----
       //mostrarAzucarBebidasNoAlcohólicas();
       
       //----4----
       //mediaGraduacionAlcohol();
       
       //----5----
       //mostrarTodosLosProductos();
    }
    
}
