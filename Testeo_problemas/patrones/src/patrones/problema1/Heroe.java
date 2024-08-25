package patrones.problema1;

abstract class Heroe implements Cloneable {
    private String nombre;
    private String aspectoVisual;
    private int experiencia;
    private int nivel;
    private int puntosHabilidad;

    public Heroe(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        this.nombre = nombre;
        this.aspectoVisual = aspectoVisual;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.puntosHabilidad = puntosHabilidad;
    }

    // Método para clonar el héroe
    @Override
    public Heroe clone() {
        try {
            return (Heroe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se pudo clonar el héroe", e);
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAspectoVisual() {
        return aspectoVisual;
    }

    public void setAspectoVisual(String aspectoVisual) {
        this.aspectoVisual = aspectoVisual;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosHabilidad() {
        return puntosHabilidad;
    }

    public void setPuntosHabilidad(int puntosHabilidad) {
        this.puntosHabilidad = puntosHabilidad;
    }

    // Método abstracto que deben implementar las subclases para mostrar las habilidades
    public abstract void mostrarHabilidades();
}
