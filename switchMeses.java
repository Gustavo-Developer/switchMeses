import java.swing.JOptionPane;

public class switchMesesdoano {

    public static void main (String[] args){
        
    // declaração das variáveis
    int mes; 
    
    // entrada de dados

    mes = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 12"));

    switch (dia) {
        case 1:
            JOptionPane.showInputDialog (null, "Você escolheu Janeiro");
            break;
        case 2:
            JOptionPane.showInputDialog (null, "Você escolheu Fevereiro");
            break;
        case 3:
            JOptionPane.showInputDialog (null, "Você escolheu Março");
            break;
        case 4:
            JOptionPane.showInputDialog (null, "Você escolheu Abril");
            break;
        case 5:
            JOptionPane.showInputDialog (null, "Você escolheu Maio");
            break;
        case 6:
            JOptionPane.showInputDialog (null, "Você escolheu Junho");
            break;
        case 7:
            JOptionPane.showInputDialog (null, "Você escolheu Julho");
            break;
        case 8:
            JOptionPane.showInputDialog (null, "Você escolheu Agosto");
            break;
        case 9:
            JOptionPane.showInputDialog (null, "Você escolheu Setembro");
            break;
        case 10:
            JOptionPane.showInputDialog (null, "Você escolheu Outubro");
            break;
        case 11:
            JOptionPane.showInputDialog (null, "Você escolheu Novembro");
            break;
        case 12:
            JOptionPane.showInputDialog (null, "Você escolheu Desembro");
            break;
        default:
            JOptionPane.showInputDialog (null, "Mês inváldio");
            break;
        }
    }
}