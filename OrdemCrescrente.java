import javax.swing.JOptionPane;

public class OrdemCrescrente{

   public static void main (String [] args){
      
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
      int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero: "));
      
      if (n1 > n2 && n2 > n3){
         JOptionPane.showMessageDialog(null, "O resltado foi: " + n1 + " " + n2 + " " + n3);
      }if(n2 > n1 && n1 > n3){
         JOptionPane.showMessageDialog(null, "O resultado foi: " + n2 + " " + n1 + " " + n3);
      }if(n3 > n1 && n2 > n1){
         JOptionPane.showMessageDialog(null, "O resultado foi: " + n3 + " " + n2 + " " + n1);
      }
   }
}