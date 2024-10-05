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
		setBackground(new Color(36, 113, 163));
		setBounds(30, 60, 500, 470);
		inicialiarComponentes();
		
		setVisible(false);
	}
	
	public void inicialiarComponentes()
	{
		
		
		lblIdA = new JLabel("Ingrese su ID: ", SwingConstants.CENTER);
		lblIdA.setOpaque(true);
		lblIdA.setBackground(new Color(36, 113, 163));
		add(lblIdA);
		
		txtIdA = new JTextArea();
		add(txtIdA);
		
		lblContraseñaA = new JLabel("Ingrese si Contraseña:", SwingConstants.CENTER);
		lblContraseñaA.setOpaque(true);
		lblContraseñaA.setBackground(new Color(36, 113, 163));
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

	public JLabel getLblIdA() {
		return lblIdA;
	}

	public void setLblIdA(JLabel lblIdA) {
		this.lblIdA = lblIdA;
	}

	public JLabel getLblContraseñaA() {
		return lblContraseñaA;
	}

	public void setLblContraseñaA(JLabel lblContraseñaA) {
		this.lblContraseñaA = lblContraseñaA;
	}

	public JTextArea getTxtIdA() {
		return txtIdA;
	}

	public void setTxtIdA(JTextArea txtIdA) {
		this.txtIdA = txtIdA;
	}

	public JTextArea getTxtContraseñaA() {
		return txtContraseñaA;
	}

	public void setTxtContraseñaA(JTextArea txtContraseñaA) {
		this.txtContraseñaA = txtContraseñaA;
	}

	public JButton getBtnIngresarA() {
		return btnIngresarA;
	}

	public void setBtnIngresarA(JButton btnIngresarA) {
		this.btnIngresarA = btnIngresarA;
	}

	public JButton getBtnVolverA() {
		return btnVolverA;
	}

	public void setBtnVolverA(JButton btnVolverA) {
		this.btnVolverA = btnVolverA;
	}

	
}
