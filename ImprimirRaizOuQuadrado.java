import javax.swing.JOptionPane;

public class ImprimirRaizOuQuadrado{

   public static void main (String[] args){
   
      int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      
      double raiz = Math.sqrt(n);
      double quadrado = Math.pow(n,2);
      
      if (n >= 0){
         JOptionPane.showMessageDialog(null, "O resultado foi maior que zero: " + raiz);
      }else{
         JOptionPane.showMessageDialog(null, "O resultado foi menor que zero: " + quadrado);
      }
   }
}