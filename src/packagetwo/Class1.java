package packagetwo;

public class Class1 {

    public String nombre;
    private int edad;

    public Class1() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
        if(edad >1 && edad <100){
            this.edad = edad;
        }else{
            System.out.println("Edad invalida");
        }
        
    }
    
    
    
}
