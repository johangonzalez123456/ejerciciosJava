public class Auto  {
    // Atributos adicionales
    private boolean descapotable;
    private int pasajeros;

    // Constructor por defecto
    public Auto() {
        super(); // Llamar al constructor de la clase base
        this.descapotable = false;
        this.pasajeros = 5;
    }

    // Constructor con parámetros
    public Auto(String propietario, String marca, int cilindradas, boolean descapotable, int pasajeros) {
        super(propietario, marca, 2009, 4, cilindradas);
        this.descapotable = descapotable;
        this.pasajeros = pasajeros;
    }

    // Sobreescritura del método toString
    @Override
    public String toString() {
        return super.toString() + ", Descapotable: " + descapotable + ", Pasajeros: " + pasajeros;
    }
}
