import javax.swing.JOptionPane;

public class SubstituiValor{

   public static void main (String[] args){
      
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
      int n3 = 5;
      int resultado = n1 + n2;
      
      if (resultado <= 20){
         JOptionPane.showMessageDialog(null, "O valor foi maior que 20" + n3);
      } else {
         JOptionPane.showMessageDialog(null, "O resultado foi: " + resultado);
      }
   }
} 