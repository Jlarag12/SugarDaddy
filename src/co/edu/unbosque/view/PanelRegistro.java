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

	private JLabel lblIntruccionR;
	private JLabel lblIdR;
	private JLabel lblNombreR;
	private JLabel lblContraseñaR;
	private JLabel lblCupoR;
	private JTextArea txtIdR;
	private JTextArea txtNombreR;
	private JTextArea txtCupoR;
	private JButton btnRegistroR;
	private JButton btnVolverR;
	private JTextField txtContraseñaR;

	public PanelRegistro ()
	{
		setLayout(new GridLayout(11,1));
		setBackground(new Color(36, 113, 163));
		setBounds(45, 40, 470, 530);
		inicializarComponentes();
		
		setVisible(false);
	}
	
	public void inicializarComponentes()
	{
		
		lblIntruccionR = new JLabel("Digite el ID, nombre, contraseña y cupo de su cuenta" +"\n"+ "en las casillas establecidas");
		lblIntruccionR.setOpaque(true);
		lblIntruccionR.setBackground(new Color(36, 113, 163));
		add(lblIntruccionR);
		
		lblIdR = new JLabel("Ingrese su ID: ", SwingConstants.CENTER);
		lblIdR.setOpaque(true);
		lblIdR.setBackground(new Color(36, 113, 163));
		add(lblIdR);
		
		txtIdR = new JTextArea();
		add(txtIdR);
		
		lblNombreR = new JLabel("Ingrese su nombre: ", SwingConstants.CENTER);
		lblNombreR.setOpaque(true);
		lblNombreR.setBackground(new Color(36, 113, 163));
		add(lblNombreR);
		
		txtNombreR = new JTextArea();
		add(txtNombreR);
		
		lblContraseñaR = new JLabel("Ingrese su contraseña: ", SwingConstants.CENTER);
		lblContraseñaR.setOpaque(true);
		lblContraseñaR.setBackground(new Color(36, 113, 163));
		add(lblContraseñaR);
		
		txtContraseñaR = new JTextField();
		add(txtContraseñaR);
		
		lblCupoR = new JLabel("Ingrese suy cupo: ", SwingConstants.CENTER);
		lblCupoR.setOpaque(true);
		lblCupoR.setBackground(new Color(36, 113, 163));
		add(lblCupoR);
		
		txtCupoR = new JTextArea();
		add(txtCupoR);
		
		btnRegistroR = new JButton("Registrarse");
		btnRegistroR.setActionCommand("Prueba boton registro");
		add(btnRegistroR);
		
		btnVolverR = new JButton("Volver");
		btnVolverR.setActionCommand("Prueba boton volver");
		btnVolverR.setOpaque(true);
		btnVolverR.setBackground(Color.LIGHT_GRAY);
		add(btnVolverR);
	
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
	 
	 
	 
	public JLabel getLblIntruccionR() {
		return lblIntruccionR;
	}

	public void setLblIntruccionR(JLabel lblIntruccionR) {
		this.lblIntruccionR = lblIntruccionR;
	}

	public JLabel getLblIdR() {
		return lblIdR;
	}

	public void setLblIdR(JLabel lblIdR) {
		this.lblIdR = lblIdR;
	}

	public JLabel getLblNombreR() {
		return lblNombreR;
	}

	public void setLblNombreR(JLabel lblNombreR) {
		this.lblNombreR = lblNombreR;
	}

	public JLabel getLblContraseñaR() {
		return lblContraseñaR;
	}

	public void setLblContraseñaR(JLabel lblContraseñaR) {
		this.lblContraseñaR = lblContraseñaR;
	}

	public JLabel getLblCupoR() {
		return lblCupoR;
	}

	public void setLblCupoR(JLabel lblCupoR) {
		this.lblCupoR = lblCupoR;
	}

	public JTextArea getTxtIdR() {
		return txtIdR;
	}

	public void setTxtIdR(JTextArea txtIdR) {
		this.txtIdR = txtIdR;
	}

	public JTextArea getTxtNombreR() {
		return txtNombreR;
	}

	public void setTxtNombreR(JTextArea txtNombreR) {
		this.txtNombreR = txtNombreR;
	}

	public JTextArea getTxtCupoR() {
		return txtCupoR;
	}

	public void setTxtCupoR(JTextArea txtCupoR) {
		this.txtCupoR = txtCupoR;
	}

	public JButton getBtnRegistroR() {
		return btnRegistroR;
	}

	public void setBtnRegistroR(JButton btnRegistroR) {
		this.btnRegistroR = btnRegistroR;
	}

	public JButton getBtnVolverR() {
		return btnVolverR;
	}

	public void setBtnVolverR(JButton btnVolver) {
		this.btnVolverR = btnVolver;
	}

	public JTextField getTxtContraseñaR() {
		return txtContraseñaR;
	}

	public void setTxtContraseñaR(JTextField txtContraseñaR) {
		this.txtContraseñaR = txtContraseñaR;
	}
	
	
}
