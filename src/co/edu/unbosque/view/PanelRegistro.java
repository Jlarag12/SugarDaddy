package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingContainer;

public class PanelRegistro extends JPanel
{

	private JLabel lblIntruccionR,lblIdR,lblNombreR,lblContraseñaR,lblCupoR;
	private JTextArea txtIdR,txtNombreR,txtContraseñaR,txtCupoR;
	private JButton btnRegistroR;
	
	public PanelRegistro ()
	{
		setLayout(new GridLayout(10,1));
		setBackground(Color.white);
		setBounds(20, 30, 450, 450);
		inicializarComponentes();
		
		setVisible(false);
	}
	
	public void inicializarComponentes()
	{
		
		lblIntruccionR = new JLabel("Digite el ID, nombre, contraseña y cupo de su cuenta" +"\n"+ "en las casillas establecidas");
		lblIntruccionR.setOpaque(true);
		lblIntruccionR.setBackground(Color.green);
		add(lblIntruccionR);
		
		lblIdR = new JLabel("Ingrese su ID: ", SwingConstants.CENTER);
		lblIdR.setOpaque(true);
		lblIdR.setBackground(Color.green);
		add(lblIdR);
		
		txtIdR = new JTextArea();
		add(txtIdR);
		
		lblNombreR = new JLabel("Ingrese su nombre: ", SwingConstants.CENTER);
		lblNombreR.setOpaque(true);
		lblNombreR.setBackground(Color.green);
		add(lblNombreR);
		
		txtNombreR = new JTextArea();
		add(txtNombreR);
		
		lblContraseñaR = new JLabel("Ingrese su contraseña: ", SwingConstants.CENTER);
		lblContraseñaR.setOpaque(true);
		lblContraseñaR.setBackground(Color.green);
		add(lblContraseñaR);
		
		txtContraseñaR = new JTextArea();
		add(txtContraseñaR);
		
		lblCupoR = new JLabel("Ingrese suy cupo: ", SwingConstants.CENTER);
		lblCupoR.setOpaque(true);
		lblCupoR.setBackground(Color.green);
		add(lblCupoR);
		
		txtCupoR = new JTextArea();
		add(txtCupoR);
		
		btnRegistroR = new JButton("Registrarse");
		add(btnRegistroR);
		
	
	}


}
