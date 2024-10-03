package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelAdmin extends JPanel
{
	private JLabel lblIdA;
	private JLabel lblContraseñaA;
	private JTextArea txtIdA;
	private JTextArea txtContraseñaA;
	private JButton btnIngresarA;
	private JButton btnVolverA;
	
	public PanelAdmin() 
	{
		setLayout(new GridLayout(6,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		inicialiarComponentes();
		
		setVisible(false);
	}
	
	public void inicialiarComponentes()
	{
		
		
		lblIdA = new JLabel("Ingrese su ID: ", SwingConstants.CENTER);
		lblIdA.setOpaque(true);
		lblIdA.setBackground(Color.green);
		add(lblIdA);
		
		txtIdA = new JTextArea();
		add(txtIdA);
		
		lblContraseñaA = new JLabel("Ingrese si Contraseña:", SwingConstants.CENTER);
		lblContraseñaA.setOpaque(true);
		lblContraseñaA.setBackground(Color.green);
		add(lblContraseñaA);
		
		txtContraseñaA = new JTextArea();
		add(txtContraseñaA);
		
		btnIngresarA = new JButton("Ingresar");
		add(btnIngresarA);
		
		btnVolverA = new JButton("Volver");
		btnVolverA.setOpaque(true);
		btnVolverA.setBackground(Color.LIGHT_GRAY);
		add(btnVolverA);
		
	}

}
