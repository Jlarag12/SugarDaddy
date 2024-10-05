package co.edu.unbosque.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.facade.Facade;
import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoLog;
import co.edu.unbosque.model.persistence.ArchivoParejas;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	ArchivoLog archivo = new ArchivoLog();
	//Facade facade = new Facade();
	ArchivoClientes archivoClientes = new ArchivoClientes();
	ArchivoParejas arcparejas = new ArchivoParejas();
	VentanaPrincipal ventana;
	
	public Controller() {
		ventana = new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		ventana.getPanelU().getBtnClienteU().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inicioCliente();
				
			}
		});
		ventana.getPanelU().getBtnAdministradorU().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inicioAdmin();
				
			}
		});
		ventana.getPanelU().getBtnRegistrarseU().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inicioRegistro();
				
			}
		});
		ventana.getPanelA().getBtnVolverA().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlUsuario();
				
			}
		});
		ventana.getPanelC().getBtnVolverC().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlUsuario();
				
			}
		});
		ventana.getPanelR().getBtnVolverR().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlUsuario();
				
			}
		});
		ventana.getPanelD().getBtnVolverD().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlAdmin();
				
			}
		});
		ventana.getPanelS().getBtnVolverS().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				volverAlCliente();
				
			}
		});
		/*
		 * ventana.getPanelD().getBtnBorrarD().addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { borrarParejasAdmin();
		 * 
		 * } });
		 */
		/*
		 * ventana.getPanelD().getBtnActualizarD().addActionListener(new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * actualizarClienteAdmin();
		 * 
		 * } });
		 */
		/*
		 * ventana.getPanelD().getBtnEliminarD().addActionListener(new ActionListener()
		 * {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * eliminarClienteAdmin();
		 * 
		 * } });
		 */
		/*
		 * ventana.getPanelD().getBtnCrearD().addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { crearClienteAdmin();
		 * 
		 * } });
		 */
		/*
		 * ventana.getPanelC().getBtnIngresarC().addActionListener(new ActionListener()
		 * {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { verificarCliente();
		 * 
		 * } });
		 */
		/*
		 * ventana.getPanelA().getBtnIngresarA().addActionListener(new ActionListener()
		 * {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { verificarAdmin();
		 * 
		 * } });
		 */ 
		
		ventana.getPanelR().getBotonRegistroCliente().addActionListener(this);
	}
	
	public void inicioCliente()
	{
		ventana.getPanelU().setVisible(false);
		ventana.getPanelC().setVisible(true);
		System.out.println("Cambio del panel inicial al panel de verificacion de cliente");
	}
	public void inicioAdmin()
	{
		ventana.getPanelU().setVisible(false);
		ventana.getPanelA().setVisible(true);
		System.out.println("Cambio del panel principal al panel de verificación de admin");
	}
	public void inicioRegistro()
	{
		ventana.getPanelU().setVisible(false);
		ventana.getPanelR().setVisible(true);
		System.out.println("Cambio del panel principal al panel de registro de cliente");
	}
	public void volverAlUsuario()
	{
		ventana.getPanelR().setVisible(false);
		ventana.getPanelC().setVisible(false);
		ventana.getPanelA().setVisible(false);
		ventana.getPanelU().setVisible(true);
		System.out.println("Cambio de los paneles al panel usuario");
	}
	public void volverAlAdmin()
	{
		ventana.getPanelD().setVisible(false);
		ventana.getPanelA().setVisible(true);
		System.out.println("Cambio de panel del crud al credenciales del admin");
	}
	public void volverAlCliente()
	{
		ventana.getPanelS().setVisible(false);
		ventana.getPanelC().setVisible(true);
		System.out.println("Cambio de panel manejo del cliente a credenciales del cliente");
	}
	 /*public void borrarParejasAdmin() 
	  {
	        try {
	            List<Cliente> clientes = facade.obtenerTodosLosClientes();
	            for (Cliente cliente : clientes) {
	                cliente.setPareja(null); // Asumo que la logica hay un setparejas que llame el archivo parejas y lo limpie
	            }
	            boolean guardado = facade.guardarClientes(clientes);
	            if (guardado) {
	                ventana.mostrarMensajeExito("Todas las parejas han sido borradas ");
	            } else {
	                ventana.mostrarMensajeError("Ocurrio un error al borrar ");
	            }
	        } catch (FileNotFoundException e) {
	            ventana.mostrarMensajeError("Ocurrió un error al borrar ");
	        }
	    }*/
	/*public void actualizarClienteAdmin() 
	 {
        try {
            long id = Long.parseLong(ventana.ingresarDatosLong("Ingrese el ID del cliente a actualizar "));
            String nombre = ventana.ingresarDatoString("Ingrese el nombre del cliente a actualizar ");
            String nuevaContrasena = ventana.ingresarDatoString("Ingrese la nueva contraseña ");
            long nuevoCupo = Long.parseLong(ventana.ingresarDatosLong("Ingrese el nuevo cupo "));

            Cliente clienteAntiguo = new Cliente();
            clienteAntiguo.setId(id);
            clienteAntiguo.setNombre(nombre);

            Cliente clienteNuevo = new Cliente();
            clienteNuevo.setId(id);
            clienteNuevo.setNombre(nombre);
            clienteNuevo.setContrasena(nuevaContrasena);
            clienteNuevo.setCupo(nuevoCupo);

            boolean actualizado = facade.actualizarCliente(clienteAntiguo, clienteNuevo);

            if (actualizado) {
                ventana.mostrarMensajeExito("Cliente actualizado exitosamente ");
            } else {
                ventana.mostrarMensajeError("El cliente no existe ");
            }
        } catch (NumberFormatException e) {
            ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en id y cupo");
        }
    }*/
	/*public void eliminarClienteAdmin() 
	{
        try {
            long id = Long.parseLong(ventana.ingresarDatosLong("Ingrese el ID "));
            String nombre = ventana.ingresarDatoString("Ingrese el nombre ");

            Cliente cliente = new Cliente();
            cliente.setId(id);
            cliente.setNombre(nombre);

            boolean eliminado = facade.eliminar(cliente);

            if (eliminado) {
                ventana.mostrarMensajeExito("Cliente eliminado exitosamente ");
            } else {
                ventana.mostrarMensajeError("El cliente no existe ");
            }
        } catch (NumberFormatException e) {
            ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en id");
        }
	}*/
	 /*public void crearClienteAdmin() 
	  {
	        try {
	            long id = Long.parseLong(ventana.ingresarDatosLong("Ingrese el ID"));
	            String nombre = ventana.ingresarDatoString("Ingrese el nombre ");
	            String contrasena = ventana.ingresarDatoString("Ingrese la contraseña");
	            long cupo = Long.parseLong(ventana.ingresarDatosLong("Ingrese el Cupo"));

	            Cliente cliente = new Cliente();
	            cliente.setId(id);
	            cliente.setNombre(nombre);
	            cliente.setContrasena(contrasena);
	            cliente.setCupo(cupo);

	            boolean creado = facade.crearCliente(cliente);

	            if (creado) {
	                ventana.mostrarMensajeExito("Cliente creado exitosamente ");
	            } else {
	                ventana.mostrarMensajeError("El cliente ya existe ");
	            }
	        } catch (NumberFormatException e) {
	            ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en id y cupo");
	        }
	    }*/
	/*public void verificarAdmin()
	{
		try {
			int id = Integer.parseInt(ventana.getPanelA().getTxtIdA().getText());
			String contraseña = ventana.getPanelA().getTxtContraseñaA().getText();
			
			Admin adminLogin = new Admin();
			adminLogin.setId(id);
			adminLogin.setContrasena(contraseña);
			boolean esValido = facade.loginAdmin(adminLogin);
			
			if (esValido) 
			{
			System.out.println("Admin verificado con exito");
			ventana.mostrarMensajeExito("Admin verificado con exito");
			ventana.getPanelA().setVisible(false);
			ventana.getPanelD().setVisible(false);
			}else
			{
				System.out.println("ID o contraseña incorrectos");
				ventana.mostrarMensajeExito("ID o contraseña incorrectos");
			}
			
		} catch (NumberFormatException e) 
		{
			System.out.println("El ID debe ser un numero entero");
			ventana.mostrarMensajeError("El ID debe ser un numero entero");
		}
	}*/
	/*public void verificarCliente()
	{
		try {
			int id = Integer.parseInt(ventana.getPanelC().getTxtIdC().getText());
			String contraseña = ventana.getPanelC().getTxtContraseñaC().getText();
			
			boolean esValido = facade.verificarCliente(id, contraseña);
					
				if (esValido) 
				{
				System.out.println("Cliente verificado con exito");
				ventana.mostrarMensajeExito("Cliente verificado con exito");
				ventana.getPanelC().setVisible(false);
				ventana.getPanelS().setVisible(true);
				}else
				{
					System.out.println("ID o contraseña incorrectos");
				    ventana.mostrarMensajeError("ID o contraseña incorrectos");
				}
		} catch (NumberFormatException e) 
		{
			System.out.println("El ID debe ser un numero entero");
			ventana.mostrarMensajeError("El ID debe ser un numero entero");
		}
	}*/
	
	public void escribirArchivoPlano() {
		archivo.escribirArchivo("Ingresar Texto");
	}
	
	public String leerArchivo() {
		return archivo.leerArchivo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		
		String mensaje = ventana.getPanelR().getContraseña();
		
		System.out.println("mensaje: " + mensaje);
	}
	
	/*public void escribirArchivoBinario() {
		
		ArrayList<ClienteDTO> clientes = new ArrayList<>();
		ClienteDTO cliente = new ClienteDTO();
		cliente.setId(1212312312);
		cliente.setNombre("Eduardo");
		
		clientes.add(cliente);
		
		archivoClientes.escribirArchivo(clientes);
	}
	
	public ArrayList<ClienteDTO> devolverListadoClientes(){
		return archivoClientes.leerArchivo();
	}
	
	public void escribirArchivoProp() {
		arcparejas.escribirArchivo("vv", "prueba");
	}
	
	public String leerArchivoProp() throws IOException {
		arcparejas.leerArchivo();
		return arcparejas.getDatos().getProperty("vv");
<<<<<<< HEAD
	}*/
}