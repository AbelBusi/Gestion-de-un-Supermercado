package controlador;

import Conexcion.conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import vista.InterFacturacion;

/**
 *
 * @author cesar
 */
public class VENTA_PDF {
    
    private String NombreCliente;
    private String CedulaCliente;
    private String telefonoCliente;
    private String direccionCliente;
    
    private String fechaActual="";
    private String nombreArchivoPDF="";
    
    public void DatosCliente(int idCliente){
        
        Connection cn =conexion.conectar();
        
        String sql ="SELECT * FROM CLIENTE WHERE ID_Cliente='"+idCliente+"'";
        Statement st;
        try {
            st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                NombreCliente=rs.getString("Nombre")+rs.getString("Apellido");
                CedulaCliente=rs.getString("Cedula");
                telefonoCliente=rs.getString("Telefono");
                direccionCliente=rs.getString("Direccion");
            
            }
            cn.close();
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "   Error no se pudo obtener el cliente");
        }
    
    }
    
    public void GenerarFactura(){
    
        try {
            
            Date date = new Date();
            fechaActual=new SimpleDateFormat("yyy/MM/dd").format(date);
            String fechaNueva ="";
            for(int i =0;i<fechaActual.length();i++){
                
                if(fechaActual.charAt(i)=='/'){
                    fechaNueva=fechaActual.replace("/", "_");
                
                }
            
            }
            nombreArchivoPDF="Venta_"+NombreCliente+"_"+fechaNueva+".pdf";
            FileOutputStream archivo ;
            File file = new File("src/pdf/"+nombreArchivoPDF);
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            Image img = Image.getInstance("src/img/megaMarket.png");
            
            Paragraph fecha =new Paragraph();
            
            Font negrita=new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLUE);
            
            fecha.add(Chunk.NEWLINE);
            fecha.add("Factura: 001"+"\nFecha: "+fechaActual+"\n\n");
            PdfPTable encabezado = new PdfPTable(4);
            encabezado.setWidthPercentage(100);
            encabezado.getDefaultCell().setBorder(0);
            
            float [] ColumnaEncabezado = new float[]{20f,30f,70f,40f};
            
            encabezado.setWidths(ColumnaEncabezado);
            
            encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            encabezado.addCell(img);
            
            String ruc ="353456774567643";
            String nombre ="MegaMarket";
            String telefono ="942 139 668";
            String direccion ="Chiclayo - Bolognesi";
            String razon ="la tecnologia avanza y nosotros nos adaptamos";
            
            encabezado.addCell("");
            encabezado.addCell("RUC :"+ruc+"\nNombre: " + nombre+"\nTelefono: "+telefono+"\nDireccion: "+direccion+"\nRazon: ");
            encabezado.addCell(fecha);
            doc.add(encabezado);
            
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);
            cliente.add("   Datos del cliente: "+"\n\n");
            doc.add(cliente);
            
            PdfPTable tablaCliente = new PdfPTable(4);
            
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);
            
            float [] ColumnaCliente = new float[] {25f,45f,30f,40f};
            
            tablaCliente.setWidths(ColumnaCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cliente1=new PdfPCell(new Phrase("Cedula/RUC: ",negrita));
            PdfPCell cliente2=new PdfPCell(new Phrase("Nombre: ",negrita));
            PdfPCell cliente3=new PdfPCell(new Phrase("Telefono: ",negrita));
            PdfPCell cliente4=new PdfPCell(new Phrase("Direccion: ",negrita));
            cliente1.setBorder(0);
            cliente2.setBorder(0);
            cliente3.setBorder(0);
            cliente4.setBorder(0);
            
            tablaCliente.addCell(cliente1);
            tablaCliente.addCell(cliente2);
            tablaCliente.addCell(cliente3);
            tablaCliente.addCell(cliente4);
            
            tablaCliente.addCell(CedulaCliente);
            tablaCliente.addCell(NombreCliente);
            tablaCliente.addCell(telefonoCliente);
            tablaCliente.addCell(direccionCliente);
            
            doc.add(tablaCliente);
            
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);
            
            float [] ColumnaProducto = new float[]{15f,50f,15f,20f};
            tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell producto1 = new PdfPCell(new Phrase("Cantidad: ",negrita));
            PdfPCell producto2 = new PdfPCell(new Phrase("Descripcion: ",negrita));
            PdfPCell producto3 = new PdfPCell(new Phrase("Precio unitario: ",negrita));
            PdfPCell producto4 = new PdfPCell(new Phrase("Precio final: ",negrita));
            
            
            producto1.setBorder(0);
            producto2.setBorder(0);
            producto3.setBorder(0);
            producto4.setBorder(0);
            
            producto1.setBackgroundColor(BaseColor.DARK_GRAY);
            producto2.setBackgroundColor(BaseColor.DARK_GRAY);
            producto3.setBackgroundColor(BaseColor.DARK_GRAY);
            producto4.setBackgroundColor(BaseColor.DARK_GRAY);
            
            
            tablaProducto.addCell(producto1);
            tablaProducto.addCell(producto2);
            tablaProducto.addCell(producto3);
            tablaProducto.addCell(producto4);
            
            for(int i=0;i<InterFacturacion.jTable_productos.getRowCount();i++){
                
                String producto =InterFacturacion.jTable_productos.getValueAt(i, 1).toString();
                String cantidad =InterFacturacion.jTable_productos.getValueAt(i, 2).toString();
                String precio =InterFacturacion.jTable_productos.getValueAt(i, 3).toString();
                String total =InterFacturacion.jTable_productos.getValueAt(i, 7).toString();
                
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(producto);
                tablaProducto.addCell(precio);
                tablaProducto.addCell(total);
            }
            
            doc.add(tablaProducto);
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a pagar: "+InterFacturacion.txt_total_pagar.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Cancelacion y firma\n\n");
            firma.add("_______________________");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por su compra\n\n");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            
            doc.close();
            archivo.close();
            
            
            Desktop.getDesktop().open(file);
            
            
            
            
        } catch (DocumentException  | IOException e) {
            JOptionPane.showMessageDialog(null, "Error con el generado de datos");
        }
    
    }
    
}
