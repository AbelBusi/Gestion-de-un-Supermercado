package vista;

import controlador.Reportes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author cesar
 */
public class FRM_MENU extends javax.swing.JFrame {

    /**
     * Creates new form FRM_MENU
     */
    
    public static JDesktopPane jDesktopPane_menu;
    
    public FRM_MENU() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de ventas MegaMarket");
        
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho =java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto =java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0,0,ancho,(alto-100));
        this.add(jDesktopPane_menu);
       
    }
    
    @Override
    public Image getIconImage(){
    
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/producto.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menu_usuario = new javax.swing.JMenu();
        menu_nuevoUsuario = new javax.swing.JMenuItem();
        gestionarUsuarios = new javax.swing.JMenuItem();
        menu_producto = new javax.swing.JMenu();
        nuevo_producto = new javax.swing.JMenuItem();
        MENU_GestionarProducto = new javax.swing.JMenuItem();
        MENU_Actualizar_stock = new javax.swing.JMenuItem();
        menu_cliente = new javax.swing.JMenu();
        MENU_nuevoCliente = new javax.swing.JMenuItem();
        MENU_GestionarClientes = new javax.swing.JMenuItem();
        menu_categoria = new javax.swing.JMenu();
        MENU_NuevoCategoria = new javax.swing.JMenuItem();
        MENU_gestionarCategoria = new javax.swing.JMenuItem();
        menu_facturar = new javax.swing.JMenu();
        MENU_nuevaVenta = new javax.swing.JMenuItem();
        MENU_GestionarVentas = new javax.swing.JMenuItem();
        menu_reportes = new javax.swing.JMenu();
        MENU_ReporteClientes = new javax.swing.JMenuItem();
        Menu_reporteCategoria = new javax.swing.JMenuItem();
        MENU_ReporteProductos = new javax.swing.JMenuItem();
        MENU_ReporteVentas = new javax.swing.JMenuItem();
        menu_cerrarSesion = new javax.swing.JMenu();
        MENU_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        menu_usuario.setForeground(new java.awt.Color(0, 0, 0));
        menu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        menu_usuario.setText("Usuario");
        menu_usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menu_usuario.setPreferredSize(new java.awt.Dimension(150, 50));

        menu_nuevoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        menu_nuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        menu_nuevoUsuario.setText("Nuevo Usuario");
        menu_nuevoUsuario.setPreferredSize(new java.awt.Dimension(150, 30));
        menu_nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nuevoUsuarioActionPerformed(evt);
            }
        });
        menu_usuario.add(menu_nuevoUsuario);

        gestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        gestionarUsuarios.setText("Gestionar Usuarios");
        gestionarUsuarios.setPreferredSize(new java.awt.Dimension(150, 30));
        gestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarUsuariosActionPerformed(evt);
            }
        });
        menu_usuario.add(gestionarUsuarios);

        jMenuBar1.add(menu_usuario);

        menu_producto.setForeground(new java.awt.Color(0, 0, 0));
        menu_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        menu_producto.setText("Producto");
        menu_producto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menu_producto.setPreferredSize(new java.awt.Dimension(150, 50));

        nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        nuevo_producto.setText("Nuevo Producto");
        nuevo_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_productoActionPerformed(evt);
            }
        });
        menu_producto.add(nuevo_producto);

        MENU_GestionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        MENU_GestionarProducto.setText("Gestionar Productos");
        MENU_GestionarProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        MENU_GestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_GestionarProductoActionPerformed(evt);
            }
        });
        menu_producto.add(MENU_GestionarProducto);

        MENU_Actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        MENU_Actualizar_stock.setText("Actualizar Stock");
        MENU_Actualizar_stock.setPreferredSize(new java.awt.Dimension(200, 30));
        MENU_Actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_Actualizar_stockActionPerformed(evt);
            }
        });
        menu_producto.add(MENU_Actualizar_stock);

        jMenuBar1.add(menu_producto);

        menu_cliente.setForeground(new java.awt.Color(0, 0, 0));
        menu_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        menu_cliente.setText("Cliente");
        menu_cliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menu_cliente.setPreferredSize(new java.awt.Dimension(150, 50));

        MENU_nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        MENU_nuevoCliente.setText("Nuevo Cliente");
        MENU_nuevoCliente.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_nuevoClienteActionPerformed(evt);
            }
        });
        menu_cliente.add(MENU_nuevoCliente);

        MENU_GestionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        MENU_GestionarClientes.setText("Gestionar Clientes");
        MENU_GestionarClientes.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_GestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_GestionarClientesActionPerformed(evt);
            }
        });
        menu_cliente.add(MENU_GestionarClientes);

        jMenuBar1.add(menu_cliente);

        menu_categoria.setForeground(new java.awt.Color(0, 0, 0));
        menu_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        menu_categoria.setText("Categoria");
        menu_categoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menu_categoria.setPreferredSize(new java.awt.Dimension(150, 50));

        MENU_NuevoCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        MENU_NuevoCategoria.setText("Nueva Categoria");
        MENU_NuevoCategoria.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_NuevoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_NuevoCategoriaActionPerformed(evt);
            }
        });
        menu_categoria.add(MENU_NuevoCategoria);

        MENU_gestionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        MENU_gestionarCategoria.setText("Gestionar Categoria");
        MENU_gestionarCategoria.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_gestionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_gestionarCategoriaActionPerformed(evt);
            }
        });
        menu_categoria.add(MENU_gestionarCategoria);

        jMenuBar1.add(menu_categoria);

        menu_facturar.setForeground(new java.awt.Color(0, 0, 0));
        menu_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        menu_facturar.setText("Facturar");
        menu_facturar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menu_facturar.setPreferredSize(new java.awt.Dimension(150, 50));

        MENU_nuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        MENU_nuevaVenta.setText("Nueva Venta");
        MENU_nuevaVenta.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_nuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_nuevaVentaActionPerformed(evt);
            }
        });
        menu_facturar.add(MENU_nuevaVenta);

        MENU_GestionarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        MENU_GestionarVentas.setText("Gestionar Ventas");
        MENU_GestionarVentas.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_GestionarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_GestionarVentasActionPerformed(evt);
            }
        });
        menu_facturar.add(MENU_GestionarVentas);

        jMenuBar1.add(menu_facturar);

        menu_reportes.setForeground(new java.awt.Color(0, 0, 0));
        menu_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        menu_reportes.setText("Reportes");
        menu_reportes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menu_reportes.setPreferredSize(new java.awt.Dimension(150, 50));

        MENU_ReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        MENU_ReporteClientes.setText("Reportes Clientes");
        MENU_ReporteClientes.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_ReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ReporteClientesActionPerformed(evt);
            }
        });
        menu_reportes.add(MENU_ReporteClientes);

        Menu_reporteCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        Menu_reporteCategoria.setText("Reportes Categorias");
        Menu_reporteCategoria.setPreferredSize(new java.awt.Dimension(150, 50));
        Menu_reporteCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_reporteCategoriaActionPerformed(evt);
            }
        });
        menu_reportes.add(Menu_reporteCategoria);

        MENU_ReporteProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        MENU_ReporteProductos.setText("Reportes Productos");
        MENU_ReporteProductos.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_ReporteProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ReporteProductosActionPerformed(evt);
            }
        });
        menu_reportes.add(MENU_ReporteProductos);

        MENU_ReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        MENU_ReporteVentas.setText("Reportes Ventas");
        MENU_ReporteVentas.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_ReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_ReporteVentasActionPerformed(evt);
            }
        });
        menu_reportes.add(MENU_ReporteVentas);

        jMenuBar1.add(menu_reportes);

        menu_cerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        menu_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        menu_cerrarSesion.setText("Cerrar Sesion");
        menu_cerrarSesion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        MENU_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        MENU_cerrarSesion.setText("Cerrar Sesion");
        MENU_cerrarSesion.setPreferredSize(new java.awt.Dimension(150, 50));
        MENU_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_cerrarSesionActionPerformed(evt);
            }
        });
        menu_cerrarSesion.add(MENU_cerrarSesion);

        jMenuBar1.add(menu_cerrarSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nuevoUsuarioActionPerformed
        // TODO add your handling code here:
        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane_menu.add(interUsuario);
        interUsuario.setVisible(true);
    }//GEN-LAST:event_menu_nuevoUsuarioActionPerformed

    private void MENU_nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_nuevoClienteActionPerformed
        // TODO add your handling code here:
        
        InterCliente interCliente = new InterCliente();
        jDesktopPane_menu.add(interCliente);
        interCliente.setVisible(true);
    }//GEN-LAST:event_MENU_nuevoClienteActionPerformed

    private void MENU_ReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ReporteVentasActionPerformed
        // TODO add your handling code here:
        Reportes reporte = new Reportes();
        reporte.ReportesVentas();
    }//GEN-LAST:event_MENU_ReporteVentasActionPerformed

    private void MENU_ReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ReporteClientesActionPerformed
        // TODO add your handling code here:
        Reportes reporte = new Reportes();
        reporte.ReportesClientes();
    }//GEN-LAST:event_MENU_ReporteClientesActionPerformed

    private void Menu_reporteCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_reporteCategoriaActionPerformed
        // TODO add your handling code here:
        Reportes reporte = new Reportes();
        reporte.ReportesCategorias();
        
    }//GEN-LAST:event_Menu_reporteCategoriaActionPerformed

    private void MENU_NuevoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_NuevoCategoriaActionPerformed
        // TODO add your handling code here:
        InternalJframeCategoria nueva_categoria = new InternalJframeCategoria();
        jDesktopPane_menu.add(nueva_categoria);
        nueva_categoria.setVisible(true);
        
        
    }//GEN-LAST:event_MENU_NuevoCategoriaActionPerformed

    private void MENU_gestionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_gestionarCategoriaActionPerformed
        // TODO add your handling code here:
        InternalFrameGestionarCategorias gestionarCategoria = new InternalFrameGestionarCategorias();
        jDesktopPane_menu.add(gestionarCategoria);
        gestionarCategoria.setVisible(true);
        
        
        
    }//GEN-LAST:event_MENU_gestionarCategoriaActionPerformed

    private void nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_productoActionPerformed
        // TODO add your handling code here:
        InterProducto entrarProducto = new InterProducto();
        jDesktopPane_menu.add(entrarProducto);
        entrarProducto.setVisible(true);
        
        
    }//GEN-LAST:event_nuevo_productoActionPerformed

    private void MENU_GestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_GestionarProductoActionPerformed
        // TODO add your handling code here:
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_MENU_GestionarProductoActionPerformed

    private void gestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarUsuariosActionPerformed
        // TODO add your handling code here:
        InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
        jDesktopPane_menu.add(interGestionarUsuario);
        interGestionarUsuario.setVisible(true);
        
    }//GEN-LAST:event_gestionarUsuariosActionPerformed

    private void MENU_Actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_Actualizar_stockActionPerformed
        // TODO add your handling code here:
        InterActualizarStock interActualizarStock = new InterActualizarStock();
        jDesktopPane_menu.add(interActualizarStock);
        interActualizarStock.setVisible(true);
    }//GEN-LAST:event_MENU_Actualizar_stockActionPerformed

    private void MENU_GestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_GestionarClientesActionPerformed
        // TODO add your handling code here:
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
        jDesktopPane_menu.add(interGestionarCliente);
        interGestionarCliente.setVisible(true);
        
    }//GEN-LAST:event_MENU_GestionarClientesActionPerformed

    private void MENU_nuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_nuevaVentaActionPerformed
        // TODO add your handling code here:
        InterFacturacion interFacturacion = new InterFacturacion();
        jDesktopPane_menu.add(interFacturacion);
        interFacturacion.setVisible(true);
        
    }//GEN-LAST:event_MENU_nuevaVentaActionPerformed

    private void MENU_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_cerrarSesionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_MENU_cerrarSesionActionPerformed

    private void MENU_GestionarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_GestionarVentasActionPerformed
        // TODO add your handling code here:
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDesktopPane_menu.add(interGestionarVentas);
        interGestionarVentas.setVisible(true);
        
    }//GEN-LAST:event_MENU_GestionarVentasActionPerformed

    private void MENU_ReporteProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_ReporteProductosActionPerformed
        // TODO add your handling code here:
        Reportes reporte = new Reportes();
        reporte.ReportesProductos();
    }//GEN-LAST:event_MENU_ReporteProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MENU_Actualizar_stock;
    private javax.swing.JMenuItem MENU_GestionarClientes;
    private javax.swing.JMenuItem MENU_GestionarProducto;
    private javax.swing.JMenuItem MENU_GestionarVentas;
    private javax.swing.JMenuItem MENU_NuevoCategoria;
    private javax.swing.JMenuItem MENU_ReporteClientes;
    private javax.swing.JMenuItem MENU_ReporteProductos;
    private javax.swing.JMenuItem MENU_ReporteVentas;
    private javax.swing.JMenuItem MENU_cerrarSesion;
    private javax.swing.JMenuItem MENU_gestionarCategoria;
    private javax.swing.JMenuItem MENU_nuevaVenta;
    private javax.swing.JMenuItem MENU_nuevoCliente;
    private javax.swing.JMenuItem Menu_reporteCategoria;
    private javax.swing.JMenuItem gestionarUsuarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_categoria;
    private javax.swing.JMenu menu_cerrarSesion;
    private javax.swing.JMenu menu_cliente;
    private javax.swing.JMenu menu_facturar;
    private javax.swing.JMenuItem menu_nuevoUsuario;
    private javax.swing.JMenu menu_producto;
    private javax.swing.JMenu menu_reportes;
    private javax.swing.JMenu menu_usuario;
    private javax.swing.JMenuItem nuevo_producto;
    // End of variables declaration//GEN-END:variables
}
