import java.util.HashMap;
import java.util.Map;


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


    @Override
    public Heroe clone() {
        try {
            return (Heroe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se pudo clonar el héroe", e);
        }
    }


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


    public abstract void mostrarHabilidades();
}


class Guerrero extends Heroe {
    public Guerrero(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoVisual, experiencia, nivel, puntosHabilidad);
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("Habilidades de Guerrero: Ataque poderoso, Defensa robusta.");
    }
}

class Mago extends Heroe {
    public Mago(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoVisual, experiencia, nivel, puntosHabilidad);
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("Habilidades de Mago: Hechizos mágicos, Invocaciones.");
    }
}

class Arquero extends Heroe {
    public Arquero(String nombre, String aspectoVisual, int experiencia, int nivel, int puntosHabilidad) {
        super(nombre, aspectoVisual, experiencia, nivel, puntosHabilidad);
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("Habilidades de Arquero: Tiro con arco, Evasión rápida.");
    }
}

class GestorDeClonacion {
    private Map<String, Heroe> prototipos = new HashMap<>();

    public GestorDeClonacion() {

        prototipos.put("guerrero", new Guerrero("Guerrero", "Armadura pesada", 1000, 10, 5));
        prototipos.put("mago", new Mago("Mago", "Túnica mágica", 1500, 12, 7));
        prototipos.put("arquero", new Arquero("Arquero", "Ropa ligera", 800, 8, 4));
    }
    public Heroe clonarHeroe(String tipoHeroe) {
        Heroe heroe = prototipos.get(tipoHeroe);
        return heroe != null ? heroe.clone() : null;
    }
}

public class Main {
    public static void main(String[] args) {
        GestorDeClonacion gestor = new GestorDeClonacion();

        Heroe clonGuerrero = gestor.clonarHeroe("guerrero");
        clonGuerrero.setNombre("Guerrero Clonado");
        clonGuerrero.setAspectoVisual("Armamento ligero");
        clonGuerrero.mostrarHabilidades();
        System.out.println("Nombre: " + clonGuerrero.getNombre());
        System.out.println("Aspecto: " + clonGuerrero.getAspectoVisual());
        System.out.println("Experiencia: " + clonGuerrero.getExperiencia());
        System.out.println("Nivel: " + clonGuerrero.getNivel());
        System.out.println("Puntos de Habilidad: " + clonGuerrero.getPuntosHabilidad());

    }
}
