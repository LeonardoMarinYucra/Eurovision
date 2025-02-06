import java.util.TreeMap;
import java.util.TreeSet;

public class Pais {
    private String nombre;
    private String nombreParticipante;
    private String cancion;
    private int puntuacion;
    private TreeMap<Pais,Integer> votaciones ;

    public Pais (String nombre, String nombreParticipante, String cancion){
        this.nombre=nombre;
        this.nombreParticipante=nombreParticipante;
        this.cancion=cancion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion=puntuacion;
    }

    @Override
    public String toString(){
        return "Nombre del País: " + nombre + ", Participante: " + nombreParticipante + ", Canción: " + cancion + ", Puntuación: " + puntuacion;
    }
}
