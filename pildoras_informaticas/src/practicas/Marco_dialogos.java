package practicas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco_dialogos extends JFrame {

	public Marco_dialogos(){
		
		setTitle("Prueba de Dialogos");
		setSize(600,450);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel lamina = new JPanel();
		lamina.setLayout(new GridLayout(2,3));
		
		lamina_tipo = new lamina_botones("Tipo", new String[] {"Mensaje","Confirmar","Opciones","Entrada"});
		
		lamina_tipo_mensajes = new lamina_botones("Tipo de Mensaje", new String[] {
				"ERROR_MESSAGE", "INFORMATION_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"
		});
		
		lamina_mensaje = new lamina_botones("Mensaje", new String[] {
				"Cadena", "Icono", "Componentes", "Object[]"
		});
		
		lamina_tipo_opcion = new lamina_botones("Confirmar", new String[] {
				"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"
		});
		
		lamina_opcion = new lamina_botones("Opcion", new String[] {
				"String[]","Icon[]","Object[]"
		});
		
		lamina_entrada = new lamina_botones("Entrada", new String[] {
				"Campo de texto","Combo"
		});
		
		
		lamina.add(lamina_tipo);
		lamina.add(lamina_tipo_mensajes);
		lamina.add(lamina_mensaje);
		lamina.add(lamina_tipo_opcion);
		lamina.add(lamina_opcion);
		lamina.add(lamina_entrada);
		
		//Construccion de lamina inferior
		
		JPanel lamina_inferior = new JPanel();
		JButton boton_mostrar = new JButton("Mostrar");
		
		lamina_inferior.add(boton_mostrar);
		
		add(lamina,BorderLayout.CENTER);
		add(lamina_inferior,BorderLayout.SOUTH);
	}
	
	private lamina_botones lamina_tipo, lamina_tipo_mensajes, lamina_mensaje, lamina_tipo_opcion, lamina_opcion, lamina_entrada;
}
