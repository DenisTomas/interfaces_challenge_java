package interfaces;

public class CadastroNota implements ConceitoAluno {
 public String exibirConceito(double nota) {
     if (nota == 1) {
         return EXCELENCIA;
     } else if (nota == 2) {
         return APROVEITAMENTO_SATISFATORIO;
     } else if (nota == 3) {
         return APROVEITAMENTO_INSUFICIENTE;
     } else {
        return "Input inválido";
     }
 }
}

