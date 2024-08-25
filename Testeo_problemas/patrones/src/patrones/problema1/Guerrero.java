package patrones.problema1;

public class Guerrero extends Heroe {
    public Guerrero(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoVisual, experiencia, nivel, puntosHabilidad);
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("Habilidades de Guerrero: Ataque poderoso, Defensa robusta.");
    }
}
