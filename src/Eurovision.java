import java.util.*;

public class Eurovision {
    private List<Pais> paisList = new ArrayList<>();


    public Eurovision(List<Pais> paisList){
        this.paisList=paisList;
    }

    public void votar(){

//        List<Pais> auxPais = paisList;
//        List<Integer> votos = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,10,12));
//         Collections.shuffle(votos);
//        for (int i = 0; i < 10; i++) {
//            int auxRandom = (int) Math.random()* auxPais.size();
//            if (auxPais.get(auxRandom)==pais && i>10){
//                i--;
//                auxPais.remove(auxRandom);
//            }else{
//                auxPais.get(auxRandom).setPuntuacion(votos.get(i));
//
//            }
//        }
        for (Pais pais:paisList){
            List<Pais> auxPais = paisList;
        List<Integer> votos = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,10,12));
         Collections.shuffle(votos);
        for (int i = 0; i < 10; i++) {
            int auxRandom = (int) (Math.random()*auxPais.size());
            if (auxPais.get(auxRandom)==pais && i>10){
                i--;
                auxPais.remove(auxRandom);
            }else{
                auxPais.get(auxRandom).setPuntuacion(votos.get(i));

            }
        }
        }
    }



    @Override
    public String toString(){
        return paisList.toString();
    }

}
