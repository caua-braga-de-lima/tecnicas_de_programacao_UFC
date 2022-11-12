package ex01;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class MenuPanel extends JPanel
{
	public MenuPanel(ColorPanel colorPanel)
	{
		getMenuButtons(colorPanel);
		this.setLayout(new FlowLayout());
	}

	public void getMenuButtons(ColorPanel colorPanel) 
	{
		this.add(new Button(colorPanel, "Amarelo", Color.YELLOW ));
		this.add(new Button(colorPanel, "Azul", Color.BLUE));
		this.add(new Button(colorPanel, "Verde", Color.GREEN ));
	}
	

	
}
