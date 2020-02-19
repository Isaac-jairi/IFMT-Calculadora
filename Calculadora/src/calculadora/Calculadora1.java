package calculadora;

import javax.swing.JOptionPane;

public class Calculadora1 {
    public static void main(String[] args) {
        
        
        String n1 = JOptionPane.showInputDialog("Digite o Primeiro Numero");
        String n2 = JOptionPane.showInputDialog("Digite o Segundo Numero");
        String op = JOptionPane.showInputDialog("Digite a operação que deseja fazer: 1 para Multiplicação, 2 para Divisão,3 para Adição ou 4 para Subtração: ");
        
        double n1d = Double.parseDouble(n1);
        double n2d = Double.parseDouble(n1);
        int opi = Integer.parseInt(op);
        
        Operacoes opc = new Operacoes();
        
        
        if(opi == 1){
            double aux = opc.multiplicacao(n1d, n2d);
            JOptionPane.showMessageDialog(null,"A multiplicação dos numeros é: " + aux);
        }
        
        if(opi == 2){
            double aux = opc.divisao(n1d, n2d);
            JOptionPane.showMessageDialog(null,"A divisão dos numeros é: " + aux);
        }
        
        if(opi == 3){
            double aux = opc.soma(n1d, n2d);
            JOptionPane.showMessageDialog(null,"A soma dos numeros é: " + aux);
        }
        
        if(opi == 4){
            double aux = opc.subtracao(n1d, n2d);
            JOptionPane.showMessageDialog(null,"A subtração dos numeros é: " + aux);
        }
        
    }
    
}
