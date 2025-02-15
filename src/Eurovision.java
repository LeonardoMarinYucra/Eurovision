import java.util.*;

public class Eurovision {
    private List<Pais> paisList = new ArrayList<>();



    public Eurovision(List<Pais> paisList){
        this.paisList=paisList;
        votarTodos();
    }


    private void votarTodos(){

        Iterator<Pais> iterador = paisList.iterator();
        while (iterador.hasNext()) {
            Pais pais = iterador.next();
            List<Pais> auxPais = new ArrayList<>(paisList);
            auxPais.remove(pais);
            Collections.shuffle(auxPais);
            pais.votar(auxPais);
        }
    }

    public String mostrarPaises(){
        String cadenaPaises = "\nLISTA DE PAISES\n\n";
        for (Pais pais:this.paisList){
            cadenaPaises += pais.toString() + "\n";
            cadenaPaises += "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        }
        return cadenaPaises;
    }
    public String mostrarPaisesAlfabeticamente(){
        String cadenaPaisesAlf = "\nPAISES POR ORDEN ALFABÉTICO\n\n";
        List<Pais> paisesAlf = new ArrayList<>(paisList);
        Collections.sort(paisesAlf);
        for (Pais pais:paisesAlf){
            cadenaPaisesAlf += pais.toString() + ", Votos:" + pais.getVotacionesRealizadas() + "\n";
            cadenaPaisesAlf += "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        }
        return cadenaPaisesAlf;
    }
    public String mostrarPaisesPuntuacion(){
        String cadenaPaisesPt = "\nPAISES POR ORDEN PUNTUACIÓN\n\n";
        List<Pais> paisesPt = new ArrayList<>(paisList);
        Collections.sort(paisesPt);
        for (Pais pais:paisesPt){
            cadenaPaisesPt += pais.toString() + ", Puntuación:" + pais.getPuntuacion() + "\n";
            cadenaPaisesPt += "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        }
        return cadenaPaisesPt;
    }
    public String cancionesAlfabeticamente(){
        String cadenaCanciones = "\nCANCIONES ORDENADAS ALFABÉTICAMENTE\n\n";
        List<String> canciones = new ArrayList<>();
        for (Pais pais:paisList){
            canciones.add(pais.getCancion());
        }
        Collections.sort(canciones);
        for (String cancion:canciones){
            cadenaCanciones += cancion + "\n";
        }
        return cadenaCanciones;
    }

    @Override
    public String toString(){
        return paisList.toString();
    }

}
