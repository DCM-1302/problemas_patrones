package patrones.problema1;

public class Arquero extends Heroe {
    public Arquero(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoVisual, experiencia, nivel, puntosHabilidad);
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("Habilidades de Arquero: Tiro con arco, Evasión rápida.");
    }
}
