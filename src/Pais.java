import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private String nombreParticipante;
    private String cancion;
    private TreeMap<String,Integer> votacionesRealizadas;
    private TreeMap<String,Integer> votacionesRecibidas ;
    private int puntuacion;

    public Pais (String nombre, String nombreParticipante, String cancion){
        this.nombre=nombre;
        this.nombreParticipante=nombreParticipante;
        this.cancion=cancion;
        this.puntuacion=0;
        this.votacionesRealizadas = new TreeMap<>();
        this.votacionesRecibidas = new TreeMap<>();
    }


    public String getCancion(){
        return cancion;
    }
    public String getNombre(){
        return nombre;
    }
    public TreeMap<String,Integer> getVotacionesRealizadas(){
        return votacionesRealizadas;
    }
    public int getPuntuacion(){
        return puntuacion;
    }

    public void votar(List<Pais> paisList){
        int[] puntuaciones = new int[]{1,2,3,4,5,6,7,8,10,12};
        for (int i = 0; i < puntuaciones.length; i++) {
            this.votacionesRealizadas.put(paisList.get(i).nombre,puntuaciones[i]);
            paisList.get(i).recibirVoto(this.getNombre(),puntuaciones[i]);
        }
    }

    public void recibirVoto(String nombre,int voto){
        this.votacionesRecibidas.put(nombre,voto);
        this.puntuacion+=voto;
    }

    @Override
    public int compareTo(Pais o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public String toString(){
        return "Nombre del País: " + nombre + ", Participante: " + nombreParticipante + ", Canción: " + cancion ;
    }

}
