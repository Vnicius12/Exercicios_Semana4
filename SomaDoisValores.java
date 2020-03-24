import javax.swing.JOptionPane;

public class SomaDoisValores{

   public static void main (String [] args){
   
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
      
      int resultado = n1 + n2;
      
      if (resultado > 10){
         JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
      }else {
         JOptionPane.showMessageDialog(null, "O resultado foi menor que 10");
      }
   }
}