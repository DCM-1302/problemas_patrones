package patrones.problema1;

public class Mago extends Heroe {
    public Mago(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoVisual, experiencia, nivel, puntosHabilidad);
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("Habilidades de Mago: Hechizos mágicos, Invocaciones.");
    }
}
