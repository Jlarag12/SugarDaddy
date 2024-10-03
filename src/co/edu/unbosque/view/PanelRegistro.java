package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class PanelRegistro extends JPanel
{

	private JLabel lblIntruccionR,lblIdR,lblNombreR,lblContraseñaR,lblCupoR;
	private JTextArea txtIdR,txtNombreR,txtCupoR;
	private JButton btnRegistroR;
	private JButton btnVolver;
	private JTextField txtContraseñaR;

	public PanelRegistro ()
	{
		setLayout(new GridLayout(10,1));
		setBackground(Color.white);
		setBounds(50, 40, 450, 500);
		inicializarComponentes();
		
		setVisible(true);
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
		
		txtContraseñaR = new JTextField();
		add(txtContraseñaR);
		
		lblCupoR = new JLabel("Ingrese suy cupo: ", SwingConstants.CENTER);
		lblCupoR.setOpaque(true);
		lblCupoR.setBackground(Color.green);
		add(lblCupoR);
		
		txtCupoR = new JTextArea();
		add(txtCupoR);
		
		btnRegistroR = new JButton("Registrarse");
		btnRegistroR.setActionCommand("Prueba boton registro");
		add(btnRegistroR);
		
	
	}
	
	public String getId() {
        return txtIdR.getText();
    }

    public String getNombre() {
        return txtNombreR.getText();
    }

    public String getContraseña() {
        return txtContraseñaR.getText();
    }

    public String getCupo() {
        return txtCupoR.getText();
    }

    public JButton getBotonRegistroCliente() {
        return btnRegistroR;
    }
}
