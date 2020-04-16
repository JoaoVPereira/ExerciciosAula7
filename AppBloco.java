package ExerciciosAula7;
import javax.swing.*;

public class AppBloco {
    public static void main(String...x){
        int menu;
        String nota;
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
        

        do {
        menu =Integer.parseInt(JOptionPane.showInputDialog("1.Insira uma nota\n2.Remova uma nota\n3.Altere uma nota\n4.Listar todas as notas\n5.Sair"));

            if( menu == 1){
                nota = JOptionPane.showInputDialog("Digite o valor da nota a ser inserida");
                blocoDeNotas.inserirNota(nota);
            }else if( menu == 2){
                nota = JOptionPane.showInputDialog("Digite a nota a ser removida:");
                blocoDeNotas.removerNota(nota);
            }else if(menu == 3){
                nota = JOptionPane.showInputDialog("Digite a nota a ser removida");
                String nova = JOptionPane.showInputDialog("Digite a nota a ser adicionada");
                blocoDeNotas.alterarNota(nota, nova);
            }else if (menu == 4){
                blocoDeNotas.listarNota();
            }else if (menu == 5 ){
                JOptionPane.showMessageDialog(null,"Programa encerrado");
            }

        }while( menu !=5);
    }


}