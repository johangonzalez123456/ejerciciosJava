public class Camioneta extends Vehiculo {
    // Atributos adicionales
    private float tara;
    private float bruto;
    private boolean dobleTraccion;

    // Constructor por defecto
    public Camioneta() {
        super(); // Llamar al constructor de la clase base
        this.tara = 0;
        this.bruto = 0;
        this.dobleTraccion = false;
    }

    // Constructor con parámetros
    public Camioneta(String propietario, String marca, int cilindradas, float tara, float bruto, boolean dobleTraccion) {
        super(propietario, marca, 2009, 4, cilindradas);
        this.tara = tara;
        this.bruto = bruto;
        this.dobleTraccion = dobleTraccion;
    }

    // Sobreescritura del método toString
    @Override
    public String toString() {
        return super.toString() + ", Tara: " + tara + ", Bruto: " + bruto + ", Doble Tracción: " + dobleTraccion;
    }
}
