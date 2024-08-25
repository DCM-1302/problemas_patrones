package patrones.problema1;

import java.util.HashMap;
import java.util.Map;

public class GestorDeClonacion {
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
