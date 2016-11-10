/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomercadona;

/**
 *
 * @author JUAN
 */
public class ProductoCaduca extends Producto{
    
    private String fecha_caducidad;

    public void mostrar(){
        //Con el super se llama a todos los atributos que tenga el padre
        super.mostrar();
        System.out.println(this.fecha_caducidad);
    }
    
    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }
    
    
    
}
