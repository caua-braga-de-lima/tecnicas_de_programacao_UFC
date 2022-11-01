package ExemplosLayout;

import java.awt.EventQueue;

public class MainCardLayout {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CardLayoutTest().setVisible(true);
			}
		});
	}
}
