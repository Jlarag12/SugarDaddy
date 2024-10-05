package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelClienteSugar extends JPanel
{

	private JPanel panel1S;
	private JPanel panel2S;
	private JLabel lblIngreParejaS;
	private JLabel lblActuaParejaS;
	private JLabel lblListaParejasS;
	private JLabel lblIngreNombrePareS;
	private JLabel lblIngreCupoPareS;
	private JTextArea txtListaParejasS;
	private JTextArea txtIngreNombrePareS;
	private JTextArea txtIngreCupoPareS;
	private JButton btnIngreParejaS;
	private JButton btnActuaParejaS;
	private JButton btnVolverS;
	 
	
	public PanelClienteSugar()
	{
		setLayout(new GridLayout(2,1));
		setBackground(Color.white);
		setBounds(30, 60, 500, 470);
		
		inicializarPanel1();
		inicializarPanel2();
		
		add(panel1S);
		add(panel2S);
		
		setVisible(true);
		
	}
	
	public void inicializarPanel1()
	{
		panel1S  = new JPanel();
		panel1S.setLayout(new GridLayout(8, 1));
		panel1S.setBackground(new Color(36, 113, 163));
		
		
		lblIngreParejaS = new JLabel("Agregar pareja: ", SwingConstants.CENTER);
		lblIngreParejaS.setOpaque(true);
		lblIngreParejaS.setBackground(new Color(36, 113, 163));
		panel1S.add(lblIngreParejaS);
		
		lblIngreNombrePareS = new JLabel("Digite el Nombre", SwingConstants.CENTER);
		lblIngreNombrePareS.setOpaque(true);
		lblIngreNombrePareS.setBackground(new Color(36, 113, 163));
		panel1S.add(lblIngreNombrePareS);
		
		txtIngreNombrePareS = new  JTextArea();
		panel1S.add(txtIngreNombrePareS);
		
		lblIngreCupoPareS = new JLabel("Digite el cupo", SwingConstants.CENTER);
		lblIngreCupoPareS.setOpaque(true);
		lblIngreCupoPareS.setBackground(new Color(36, 113, 163));
		panel1S.add(lblIngreCupoPareS);
		
		txtIngreCupoPareS = new JTextArea();
		panel1S.add(txtIngreCupoPareS);
		
		btnIngreParejaS = new  JButton("Crear");
		panel1S.add(btnIngreParejaS);
		
		lblActuaParejaS = new JLabel("Actualizar el cupo de una pareja: ", SwingConstants.CENTER);
		lblActuaParejaS.setOpaque(true);
		lblActuaParejaS.setBackground(new Color(36, 113, 163));
		panel1S.add(lblActuaParejaS);
		
		btnActuaParejaS = new JButton("Actualiza");
		panel1S.add(btnActuaParejaS);
		
	}
	
	public void inicializarPanel2()
	{
		panel2S = new JPanel();
		panel2S.setLayout(new GridLayout(3,1));
		panel2S.setBackground(new Color(36, 113, 163));
		
		lblListaParejasS = new JLabel("Estas son tus parejas actuales");
		lblListaParejasS.setOpaque(true);
		lblListaParejasS.setBackground(new Color(36, 113, 163));
		panel2S.add(lblListaParejasS);
		
		txtListaParejasS = new JTextArea();
		txtListaParejasS.setEditable(false);
		txtListaParejasS.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(txtListaParejasS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panel2S.add(scrollPane);
        
        btnVolverS = new JButton("Volver a las credenciales");
        btnVolverS.setOpaque(true);
        btnVolverS.setBackground(Color.LIGHT_GRAY);
        panel2S.add(btnVolverS);
        

	}

	public JPanel getPanel1S() {
		return panel1S;
	}

	public void setPanel1S(JPanel panel1s) {
		panel1S = panel1s;
	}

	public JPanel getPanel2S() {
		return panel2S;
	}

	public void setPanel2S(JPanel panel2s) {
		panel2S = panel2s;
	}

	public JLabel getLblIngreParejaS() {
		return lblIngreParejaS;
	}

	public void setLblIngreParejaS(JLabel lblIngreParejaS) {
		this.lblIngreParejaS = lblIngreParejaS;
	}

	public JLabel getLblActuaParejaS() {
		return lblActuaParejaS;
	}

	public void setLblActuaParejaS(JLabel lblActuaParejaS) {
		this.lblActuaParejaS = lblActuaParejaS;
	}

	public JLabel getLblListaParejasS() {
		return lblListaParejasS;
	}

	public void setLblListaParejasS(JLabel lblListaParejasS) {
		this.lblListaParejasS = lblListaParejasS;
	}

	public JLabel getLblIngreNombrePareS() {
		return lblIngreNombrePareS;
	}

	public void setLblIngreNombrePareS(JLabel lblIngreNombrePareS) {
		this.lblIngreNombrePareS = lblIngreNombrePareS;
	}

	public JLabel getLblIngreCupoPareS() {
		return lblIngreCupoPareS;
	}

	public void setLblIngreCupoPareS(JLabel lblIngreCupoPareS) {
		this.lblIngreCupoPareS = lblIngreCupoPareS;
	}

	public JTextArea getTxtListaParejasS() {
		return txtListaParejasS;
	}

	public void setTxtListaParejasS(JTextArea txtListaParejasS) {
		this.txtListaParejasS = txtListaParejasS;
	}

	public JTextArea getTxtIngreNombrePareS() {
		return txtIngreNombrePareS;
	}

	public void setTxtIngreNombrePareS(JTextArea txtIngreNombrePareS) {
		this.txtIngreNombrePareS = txtIngreNombrePareS;
	}

	public JTextArea getTxtIngreCupoPareS() {
		return txtIngreCupoPareS;
	}

	public void setTxtIngreCupoPareS(JTextArea txtIngreCupoPareS) {
		this.txtIngreCupoPareS = txtIngreCupoPareS;
	}

	public JButton getBtnIngreParejaS() {
		return btnIngreParejaS;
	}

	public void setBtnIngreParejaS(JButton btnIngreParejaS) {
		this.btnIngreParejaS = btnIngreParejaS;
	}

	public JButton getBtnActuaParejaS() {
		return btnActuaParejaS;
	}

	public void setBtnActuaParejaS(JButton btnActuaParejaS) {
		this.btnActuaParejaS = btnActuaParejaS;
	}

	public JButton getBtnVolverS() {
		return btnVolverS;
	}

	public void setBtnVolverS(JButton btnVolverS) {
		this.btnVolverS = btnVolverS;
	}

	
	
}
