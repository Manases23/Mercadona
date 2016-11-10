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
public class Producto {
    
    private String codigo;
    private String nombre;
    private int peso;
    
    //Hemos añadido el mostrar para poder llamarlo en el main
    public void mostrar(){
        System.out.println(this.codigo);
        System.out.println(this.nombre);
        System.out.println(this.peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
