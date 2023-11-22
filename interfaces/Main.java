package interfaces;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        CadastroNota cadastroNota = new CadastroNota();
        String notaStr = JOptionPane.showInputDialog("Insira a nota do aluno");
        double nota = Double.parseDouble(notaStr);
        String conceito = cadastroNota.exibirConceito(nota);
        JOptionPane.showMessageDialog(null, conceito);
    }
    
}
