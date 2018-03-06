package practicas;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class lamina_botones extends JPanel {
	
	public lamina_botones(String titulo,String[] opciones){
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));//disposicion de tipo caja, elementos ordenados en vertical
		
		ButtonGroup grupo = new ButtonGroup();
		
		for(int i = 0; i < opciones.length; i++) {
			
			JRadioButton boton = new JRadioButton(opciones[i]);
			
			add(boton);
			grupo.add(boton);
			boton.setSelected(i == 0);
		}
		
	}
}
