package ExerciciosAula7;
import java.util.ArrayList;
import javax.swing.*;

public class BlocoDeNotas {
    private ArrayList<String> notas = new ArrayList<String>();
    

    public void inserirNota(String nota ){
        notas.add(nota);
    }

    public void removerNota(String nota){
        int posicao = buscarNota(nota);
        if(posicao >= 0){
        notas.remove(nota);
        
        }
    }
    public int buscarNota (String nota){
        for(int i=0; i < notas.size(); i++){
            if(notas.get(i).equals(nota))
                return i;            
    }
    return -1;  
    }
    public void alterarNota(String antiga, String nova){
        for(int i=0; i < notas.size(); i++){
            if(notas.get(i).equals(antiga))
                notas.remove(antiga);        
        }
        notas.add(nova);       
    
    }

    public void listarNota(){
        for(String minhaNota:notas){
            minhaNota = "Notas: " + minhaNota;
            JOptionPane.showMessageDialog(null, String.format(minhaNota));
        }
    }
    
}