package janelasDialogos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TiposJanelasDialogo {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		
		JOptionPane.showMessageDialog(null, "Ol� "+ nome + ", seja bem vindo ao m�dulo de interfaces gr�ficas no Java!");

	     int opcao = JOptionPane.showConfirmDialog(null,  nome +"! Voc� gosta de programar? ");
//		  System.out.println("reposta: "+ opcao);
		if(opcao==1) {
			JOptionPane.showMessageDialog(null, " Que pena. Mas com as janelas voc� vai gostar");
		}else if(opcao==0) {
			JOptionPane.showMessageDialog(null, " Ent�o estude bem o Java Swing. Ele pode abrir v�rias portas para voc�");
		}else {
			JOptionPane.showMessageDialog(null, "At� mais!");
		}
	
		  ImageIcon icone = new ImageIcon("img/disturbio-do-sono.png");
			
		Object[] botoes = {"Sim", "N�o", "Talvez", "Sono", "�gua" , "Prova", "Lista"};
		  int resposta = JOptionPane.showOptionDialog(null,
		      "Lembrete, aqui no Java Swing tudo � objeto. Voc� gosta disto?",
		      "Aten��o",
		      JOptionPane.OK_CANCEL_OPTION,
		      JOptionPane.ERROR_MESSAGE,
		      icone, 
		      botoes, 
		      botoes[4]);	
		  System.out.println("Resposta: "+ resposta);
		
//			
//			int input = JOptionPane.showConfirmDialog(null, "Voc� est� com sono?", "Dormir/Acordar", JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.QUESTION_MESSAGE, icon);

//			// 0=yes, 1=no, 2=cancel
//			System.out.println(input);
		
		
	}
	
}
