package patrones.problema1;

public class Main1 {
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
