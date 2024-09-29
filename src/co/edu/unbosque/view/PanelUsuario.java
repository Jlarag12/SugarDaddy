package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelUsuario extends JPanel
{
	private JLabel lblTituloU;
	private JButton btnClienteU,btnAdministradorU,btnRegistrarseU;

	
	public PanelUsuario() 
	{
		setLayout(new GridLayout(4,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		inializarComponentes();
		
		setVisible(false);
		
	}
	
	public void inializarComponentes()
	{
		lblTituloU = new JLabel("Sugar APP", SwingConstants.CENTER);
		lblTituloU.setOpaque(true);
		add(lblTituloU);
		
		btnClienteU = new JButton("Cliente");
		add(btnClienteU);
		
		btnAdministradorU = new JButton("Administrador");
		add(btnAdministradorU);
		
		btnRegistrarseU = new JButton("Registrarse");
		add(btnRegistrarseU);
	}

}
