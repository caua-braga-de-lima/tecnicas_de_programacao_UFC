package provaAF;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//CLASSE DE TESTE:
public class Teste2 extends JFrame
{
	public void getJanela()
	{
		this.setSize(600, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("JANELA PARA INSERCAO DE DADOS DO USUARIO");
		this.setLayout(new FlowLayout());
		JPanel painel = new JPanel();
		painel.setVisible(true);
		painel.setLayout(new FlowLayout());
		painel.add(new JLabel("INSIRA AS INFORMAÇÕES PARA A SEMANA: "));
		this.add(painel);
		JPanel painel2 = new JPanel();
		painel2.setVisible(true);
		painel2.setLayout(new GridLayout(4,4));
		painel2.add(new JLabel("Insira seu nome: "));
		painel2.add(this.getField());
		painel2.add(new JLabel("Insira o transporte: "));
		painel2.add(this.getField());
		painel2.add(new JLabel("Insira o destino: "));
		painel2.add(this.getField());
		painel2.add(new JLabel("Insira a placa: "));
		painel2.add(this.getField());
		this.add(painel2);
		this.add(this.getButton("Enviar"));
	}
	
	public JTextField getField()
	{
		JTextField field = new JTextField();
		field.setColumns(10);
		return field;
	}
	
	public JButton getButton(String nome)
	{
		JButton button = new JButton();
		button.setName(nome);
		return button;
	}

	public static void main(String[] args) 
	{
		Teste teste = new Teste();
		teste.getJanela();
	}
}

