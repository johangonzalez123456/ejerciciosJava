public class Casa {
    // Atributos privados
    private int numHabitaciones;
    private int cantPuertas;
    
    // Atributos públicos
    public int cantVentanas;
    public int cantBaños;
    
    // Atributos con acceso package-private (~ en UML)
    String color;
    int cantPlantas;

    // Atributos booleanos
    private boolean tieneLineaFija;
    private boolean tieneTvCable;
    private boolean tieneAguaCorriente;

    // Constructor para inicializar los atributos
    public Casa(int numHabitaciones, int cantPuertas, int cantVentanas, int cantBaños,
                String color, int cantPlantas, boolean tieneLineaFija, 
                boolean tieneTvCable, boolean tieneAguaCorriente) {
        this.numHabitaciones = numHabitaciones;
        this.cantPuertas = cantPuertas;
        this.cantVentanas = cantVentanas;
        this.cantBaños = cantBaños;
        this.color = color;
        this.cantPlantas = cantPlantas;
        this.tieneLineaFija = tieneLineaFija;
        this.tieneTvCable = tieneTvCable;
        this.tieneAguaCorriente = tieneAguaCorriente;
    }

    // Métodos getters y setters para los atributos privados
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public boolean isTieneLineaFija() {
        return tieneLineaFija;
    }

    public void setTieneLineaFija(boolean tieneLineaFija) {
        this.tieneLineaFija = tieneLineaFija;
    }

    public boolean isTieneTvCable() {
        return tieneTvCable;
    }

    public void setTieneTvCable(boolean tieneTvCable) {
        this.tieneTvCable = tieneTvCable;
    }

    public boolean isTieneAguaCorriente() {
        return tieneAguaCorriente;
    }

    public void setTieneAguaCorriente(boolean tieneAguaCorriente) {
        this.tieneAguaCorriente = tieneAguaCorriente;
    }
}
