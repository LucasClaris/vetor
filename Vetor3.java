
//carregando e extraindo inf de um vetor
import javax.swing.JOptionPane;
public class Vetor3 {
    
        public static void main(String[] args) {
        int vet[] = new int[5];
        // carga do vetor
        for (int i = 0; i < 5; i++) {
        vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        }
        // exibição do vetor - 1
        for (int i = 0; i < 5; i++) {
        JOptionPane.showMessageDialog(null, vet[i] + "\n");
        }
    
            // exibição do vetor - 2
        String vetor = "";
        for (int i = 0; i < 5; i++) {
            vetor += vet[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, vetor);
  }
}
