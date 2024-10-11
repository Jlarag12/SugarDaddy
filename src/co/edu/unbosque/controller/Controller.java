package co.edu.unbosque.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import co.edu.unbosque.model.Admin;
import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.Pareja;
import co.edu.unbosque.model.exception.ClienteNoExisteException;
import co.edu.unbosque.model.facade.Facade;
import co.edu.unbosque.model.persistence.ArchivoClientes;
import co.edu.unbosque.model.persistence.ArchivoLog;
import co.edu.unbosque.model.persistence.ArchivoParejas;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
//En los metodos declaro la varible cliente con diferentes nombres porque no estoy seguro de donde sale la infomacion de cada uno.
	//En los metodos el modelo Cliente tiene 3 nombre cliente, clienteAntiguo y clienteActual, seria cambiar de donde se saca la informacion.
	ArchivoLog archivo = new ArchivoLog();
	Facade facade = new Facade();
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
		
		ventana.getPanelR().getBtnRegistroR().addActionListener(new ActionListener()
		{
		 
		@Override public void actionPerformed(ActionEvent e) {
			registrarClienteRegistro(); 
		} });
		/*
		 * ventana.getPanelR().getBtnRegistroR().addActionListener(new ActionListener()
		 * {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * registrarClienteRegistro();
		 * 
		 * } });
		 */
		
		  ventana.getPanelS().getBtnActuaParejaS().addActionListener(new
		  ActionListener() {
		  
			  @Override public void actionPerformed(ActionEvent e) {
				  actualizarParejaCliente();
			  } 
		  });
		 
		
		  ventana.getPanelS().getBtnIngreParejaS().addActionListener(new
		  ActionListener() {
		  
			  @Override public void actionPerformed(ActionEvent e) { 
				  crearParejaCliente();
		  } });
		 
		
		  ventana.getPanelD().getBtnBorrarD().addActionListener(new ActionListener() {
		  
			  @Override public void actionPerformed(ActionEvent e) { 
				  borrarParejasAdmin();
		  
			  } 
		  });
		 
		
		  ventana.getPanelD().getBtnActualizarD().addActionListener(new
		  ActionListener() {
		 
			  @Override public void actionPerformed(ActionEvent e) {
			  actualizarClienteAdmin();
		  
		  } });
		 
		
		  ventana.getPanelD().getBtnEliminarD().addActionListener(new ActionListener()
		  {
			  @Override public void actionPerformed(ActionEvent e) {
			  eliminarClienteAdmin();		  
		  } });
		 
		
		  ventana.getPanelD().getBtnCrearD().addActionListener(new ActionListener() {
		  
		  @Override public void actionPerformed(ActionEvent e) {
			  crearClienteAdmin();
		  } });
		 
		
		  ventana.getPanelC().getBtnIngresarC().addActionListener(new ActionListener()
		  {
		  
		  @Override public void actionPerformed(ActionEvent e) { 
				verificarCliente();
		  } });
		
		 ventana.getPanelA().getBtnIngresarA().addActionListener(new ActionListener()
			 {
			 @Override public void actionPerformed(ActionEvent e) {
				 verificarAdmin();
			 } 
		 });
		 
		
		ventana.getPanelR().getBotonRegistroCliente().addActionListener(this);
	}
	
	public void crearPareja()
	{
		ventana.getPanelC().setVisible(false);
		ventana.getPanelS().setVisible(true);
		System.out.println("Cambio del panel Login al panel de registro de parejas");
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
	
	private void registrarClienteRegistro() 
	{
	        try {
	            long id = Long.parseLong(ventana.getPanelR().getTxtIdR().getText());
	            String nombre = ventana.getPanelR().getTxtNombreR().getText();
	            long cupo = Long.parseLong(ventana.getPanelR().getTxtCupoR().getText());
	            String contrasena = ventana.getPanelR().getContraseña();
	            
	            Cliente cliente = new Cliente();
	            cliente.setId(id);
	            cliente.setNombre(nombre);
	            cliente.setCupo(cupo);
	            cliente.setContrasena(contrasena);
	            cliente.setNumeroTarjeta(generarNumeroAleatorio()); 
	            
	            boolean creado = facade.crearCliente(cliente);

	            if (creado) {
	                ventana.mostrarMensajeExito("Cliente registrado exitosamente.");
	            } else {
	                ventana.mostrarMensajeError("No se puede crear el cliente.");
	            }
	        } catch (NumberFormatException e) {
	            ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en id y cupo");
	        }
	   }
	
	public String generarNumeroAleatorio() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }
	  
	private void actualizarParejaCliente() 
	  {
	    try {

	    	long id = Long.parseLong(ventana.getPanelS().getTxtIngreIdPareS().getText());
	        String nombrePareja = ventana.getPanelS().getTxtIngreNombrePareS().getText();
	        long cupoAsignado = Long.parseLong(ventana.getPanelS().getTxtIngreCupoPareS().getText());
 
	        System.out.println("ID Actua: " + id);
	        System.out.println("nombre Actua: " + nombrePareja);
	        System.out.println("cupo Actua: " + cupoAsignado);
	        
	        long idCliente = Long.parseLong(ventana.getPanelC().getTxtIdC().getText());
	        
	        Cliente cliente = new Cliente();
	        cliente.setId(idCliente);
	        
	        Cliente clienteActual = facade.encontrarCliente(cliente);
	        
	        Pareja parejaActualizada = new Pareja();
	        parejaActualizada.setId(id);
	        parejaActualizada.setNombre(nombrePareja);
	        
	        Pareja parejaAntigua = facade.encontrarPareja(parejaActualizada);
	        System.out.println("parejaAntigua ID Actua: " + id);
	        System.out.println("parejaAntigua nombre Actua: " + nombrePareja);
	        System.out.println("parejaAntigua cupo Actua: " + parejaAntigua.getAsignacion());
	        
	        
	        
	        Cliente clienteActualizado = clienteActual;
	        System.out.println("Cliente Actualizado, saldo antiguo: " + clienteActualizado.getCupo());
	        clienteActualizado.setCupo(clienteActual.getCupo() + parejaAntigua.getAsignacion());
	        System.out.println("Cliente Actualizado, saldo nuevo: " + clienteActualizado.getCupo());
	        //System.out.println("Cupo Actual Cliente: " + clienteActualizado.getCupo());
	        
	        if(clienteActualizado.getCupo() >= cupoAsignado) {
	        	
	        	clienteActualizado.setCupo(clienteActualizado.getCupo()-cupoAsignado);
		        parejaActualizada.setAsignacion(cupoAsignado);
		        
	        	facade.actualizarCliente(clienteActual, clienteActualizado);
		        
	        	
	        	System.out.println("Pareja a Actualizar id: " + parejaActualizada.getId());
	        	System.out.println("Pareja a Actualizar nombre: " + parejaActualizada.getNombre());
	        	System.out.println("Pareja a Actualizar asignacion: " + parejaActualizada.getAsignacion());
	        	
		        boolean actualizacion = facade.actualizar(parejaAntigua, parejaActualizada, cliente);
		        
		        if (actualizacion) {
		            ventana.mostrarMensajeExito("Pareja actualizada exitosamente.");
		            listarParejas(cliente.getId());
		        } else {
		            ventana.mostrarMensajeError("No se pudo actualizar la pareja.");
		        }
	        }
	    } catch (NumberFormatException e) {
	        ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en cupo");
	    }
	}
	
	private void crearParejaCliente() 
	{
		listarParejas(Long.parseLong(ventana.getPanelC().getTxtIdC().getText()));
	    try {
	    	long id = Long.parseLong(ventana.getPanelS().getTxtIngreIdPareS().getText());
	        String nombrePareja = ventana.getPanelS().getTxtIngreNombrePareS().getText();
	        long cupoAsignado = Long.parseLong(ventana.getPanelS().getTxtIngreCupoPareS().getText());
	        
	        long idCliente = Long.parseLong(ventana.getPanelC().getTxtIdC().getText());
	        
	        boolean existePareja = facade.consultarParejaRegistrada(idCliente, id);
	        
	        if(!existePareja) {
	        	System.out.println("Id en ParejaCliente: " + ventana.getPanelC().getTxtIdC().getText());
		        
		        Cliente cliente = new Cliente();
		        cliente.setId(idCliente);
		        
		        Cliente clienteActual = facade.encontrarCliente(cliente);

		        Cliente clienteActualizado = clienteActual;
		        System.out.println("Cupo Actual Cliente: " + clienteActualizado.getCupo());
		        
		        Pareja pareja = new Pareja();
	        	pareja.setId(id);
		        pareja.setNombre(nombrePareja);
		        pareja.setAsignacion(cupoAsignado);
		        
		        if(clienteActualizado.getCupo() >= cupoAsignado) {
		        	clienteActualizado.setCupo(clienteActualizado.getCupo()-cupoAsignado);
		        	
		        	facade.actualizarCliente(clienteActual, clienteActualizado);
		       
			        boolean asignado = facade.asignarParejaACliente(clienteActualizado.getId(), pareja);

			        if (asignado) {
			            ventana.mostrarMensajeExito("Pareja creada y asignada exitosamente.");
			            listarParejas(clienteActualizado.getId());
			        } else {
			            ventana.mostrarMensajeError("No se pudo asignar la pareja.");
			        }
		        }else {
		        	ventana.mostrarMensajeError("El cupo ingresado excede la capacidad.");
		        } 
	        }else {
	        	ventana.mostrarMensajeError("La pareja ya existe.");
	        }
	    } catch (NumberFormatException e) {
	        ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en cupo");
	    }
	}
	
	public void borrarParejasAdmin() 
	{
		 boolean estatus = facade.eliminarArchivo();
		 
		 if(estatus) {
			 ventana.mostrarMensajeExito("Todas las parejas han sido borradas "); 
		 }else {
			 ventana.mostrarMensajeError("Ocurrio un error al borrar el archivo");
		 } 
	}
	
	public void actualizarClienteAdmin() 
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
                listarClientes();
            } else {
                ventana.mostrarMensajeError("El cliente no existe ");
            }
        } catch (NumberFormatException e) {
            ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en id y cupo");
        }
    }
	
	public void eliminarClienteAdmin() 
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
                listarClientes();
            } else {
                ventana.mostrarMensajeError("El cliente no existe ");
            }
        } catch (NumberFormatException e) {
            ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en id");
        }
	}
	
	  public void crearClienteAdmin() 
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
	                listarClientes();
	            } else {
	                ventana.mostrarMensajeError("El cliente ya existe ");
	            }
	        } catch (NumberFormatException e) {
	            ventana.mostrarMensajeError("Datos inválidos, verificar que se ingresen solo numeros en id y cupo");
	        }
	    }
	
	public void verificarAdmin()
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
			ventana.getPanelD().setVisible(true);
			
			listarClientes();
			
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
	}
	
	public void listarClientes() {
		ArrayList<Cliente> clientes = facade.listarClientes();
		StringBuilder sb = new StringBuilder();
		for(Cliente cliente: clientes) {
			sb.append(cliente.toString() + "\n");
		}
		ventana.getPanelD().getTxtClientesD().setText(sb.toString());
	}
	
	public void listarParejas(long idCliente) {
		ArrayList<Pareja> parejas = facade.listarParejas(idCliente);
		StringBuilder sb = new StringBuilder();
		for(Pareja pareja: parejas) {
			System.out.println("Pareja Nombre: " + pareja.getNombre());
			System.out.println("Asignacion: " +pareja.getAsignacion());
			sb.append(pareja.toString() + "\n");
		}
		ventana.getPanelS().getTxtListaParejasS().setText(sb.toString());
	}
	
	public void verificarCliente()
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
				listarParejas(id);
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
	}
	
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