
package Modelo;


public class Producto {
    
    private String id;
    private int cantidad;
    private Double precio;
    private Double total;

    public Producto(String id, int cantidad, Double precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public Double Total(){
        Double total=cantidad*precio;
        return total;
    }
    
}
