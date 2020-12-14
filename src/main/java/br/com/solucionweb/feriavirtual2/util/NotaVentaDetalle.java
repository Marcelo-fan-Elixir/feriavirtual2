package br.com.solucionweb.feriavirtual2.util;

import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import br.com.solucionweb.feriavirtual2.model.VentaDetalle;

@Component
public class NotaVentaDetalle {

	private static Font fonteVermelha = new Font(Font.FontFamily.TIMES_ROMAN,
			12, Font.NORMAL, BaseColor.RED);
	private static Font negritoPequena = new Font(Font.FontFamily.HELVETICA,
			10, Font.BOLD);
	private static Font fonteCabecalho = new Font(Font.FontFamily.COURIER, 18,
			Font.BOLD);
	
	public void generaNotaVenta(VentaDetalle ventaDetalle) {
		try {
	        Document document = new Document();
	        PdfWriter.getInstance(document, new FileOutputStream("C:\\pdfTest\\NOTA_VENTA_" + ventaDetalle.getIdVentaDetalle()+ "_" + 
	        					  ventaDetalle.getCabeceraVenta().getFechaVenta() + "_" + ventaDetalle.getCabeceraVenta().getTipoVenta().getNombreTipoVenta() + ".pdf"));
	        document.open();
	        // Left
	        Paragraph paragraph = new Paragraph(ventaDetalle.getDescripcionVentaDetalle(), fonteCabecalho);
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	      //--------------------------------------------------------------------
			paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	      //-----------------------------------------------------------------------
	        

	        	paragraph = new Paragraph("Nota de venta realizada por FERIA VIRTUAL");
		        paragraph.setAlignment(Element.ALIGN_CENTER);
		        document.add(paragraph);
			
	        
	        
	        
	      //--------------------------------------------------------------------
			paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	      //-----------------------------------------------------------------------
	        
	        paragraph = new Paragraph("FECHA:     " + ventaDetalle.getCabeceraVenta().getFechaVenta(),  negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("RUT USUARIO:     " + ventaDetalle.getCabeceraVenta().getUsuario().getRutUsuario(),  negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("VENTA REALIZADA EN:     " + ventaDetalle.getCabeceraVenta().getUsuario().getComuna().getNombreComuna(),  negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("TIPO DE VENTA:     " + ventaDetalle.getCabeceraVenta().getTipoVenta().getNombreTipoVenta(), negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
			
	      //--------------------------------------------------------------------
			paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	      //-----------------------------------------------------------------------
	        
	        paragraph = new Paragraph("VALOR VENTA:     " + ventaDetalle.getTotalVentaDetalle(), negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("IVA:     " + ventaDetalle.getIvaVentaDetalle(), negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("VALOR BRUTO:     " + ventaDetalle.getValorBrutoVentaDetalle(), negritoPequena);
	        document.add(paragraph);
			
			//--------------------------------------------------------------------
			paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	        
	        paragraph = new Paragraph(" ");
	        paragraph.setAlignment(Element.ALIGN_CENTER);
	        document.add(paragraph);
	      //-----------------------------------------------------------------------
			paragraph = new Paragraph("Archivo generado el dia: "
					+ new Date(), negritoPequena);
	        document.add(paragraph);
			
	        document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
