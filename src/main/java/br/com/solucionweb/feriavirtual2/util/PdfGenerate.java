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

import br.com.solucionweb.feriavirtual2.model.Contrato;

@Component
public class PdfGenerate {

	private static Font fonteVermelha = new Font(Font.FontFamily.TIMES_ROMAN,
			12, Font.NORMAL, BaseColor.RED);
	private static Font negritoPequena = new Font(Font.FontFamily.HELVETICA,
			10, Font.BOLD);
	private static Font fonteCabecalho = new Font(Font.FontFamily.COURIER, 18,
			Font.BOLD);
	
	public void test(Contrato contrato) {
		try {
	        Document document = new Document();
	        PdfWriter.getInstance(document, new FileOutputStream("D:\\pdfTest\\CONTRATO_" + contrato.getTipoContrato().getNombreTipoContrato() + "_" + contrato.getUsuario().getRutUsuario() + ".pdf"));
	        document.open();
	        // Left
	        Paragraph paragraph = new Paragraph(contrato.getTipoContrato().getDescripcionTipoContrato(), fonteCabecalho);
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
	        
	        if (contrato.getIdTipoContrato() == 1) {
	        	paragraph = new Paragraph("Este contrato internacional se refiere a un pacto entre personas jurídicas, que adquieren unas oblicaciones,"
	        			+ "				   donde se ligan como ´´COMPRADOR´´ y ´´VENDEDO´´, las cuales están establecidas en diferentes países, el país"
	        			+ "				   importador ESTADOS UNIDOS y el exportador CHILE, donde se pacta una serie se sucesos como precio, donde se"
	        			+ " 			   paga la mercancía, donde se deja la mercancían segun cantidad, y donde se puede encontrar un equilibrio entre"
	        			+ "				   escasez y exceso.");
		        paragraph.setAlignment(Element.ALIGN_CENTER);
		        document.add(paragraph);
			}
	        
	        if (contrato.getIdTipoContrato() == 2) {
	        	paragraph = new Paragraph("Este contrato nacional se refiere a un pacto entre personas jurídicas, que adquieren unas oblicaciones,"
	        			+ "				   donde se ligan como ´´COMPRADOR´´ y ´´VENDEDO´´, las cuales están establecidas en CHILE, donde se pacta una serie se sucesos como precio, donde se"
	        			+ " 			   paga la mercancía, donde se deja la mercancían segun cantidad, y donde se puede encontrar un equilibrio entre"
	        			+ "				   escasez y exceso.");
		        paragraph.setAlignment(Element.ALIGN_CENTER);
		        document.add(paragraph);
			}
	        
	        if (contrato.getIdTipoContrato() == 3) {
	        	paragraph = new Paragraph("Este contrato internacional se refiere a un pacto entre personas jurídicas, que adquieren unas oblicaciones,"
	        			+ "				   donde se ligan como ´´COMPRADOR´´ y ´´VENDEDO´´, las cuales están establecidas en diferentes países, el país"
	        			+ "				   importador ESTADOS UNIDOS y el exportador CHILE, donde se pacta una serie se sucesos como precio, donde se"
	        			+ " 			   paga la mercancpia, donde se deja la mercancían segun cantidad, y donde se puede encontrar un equilibrio entre"
	        			+ "				   escasez y exceso.");
		        paragraph.setAlignment(Element.ALIGN_CENTER);
		        document.add(paragraph);
			}
	        
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
	        
	        paragraph = new Paragraph("FECHA INICIO CONTRATO: " + contrato.getFechaInicio(),  negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("FECHA TERMINO CONTRATO: " + contrato.getFechaTermino(),  negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("PERSONA A CONTRATAR :" + contrato.getUsuario().getNombreUsuario(),  negritoPequena);
	        document.add(paragraph);
	        paragraph = new Paragraph("RUT :" + contrato.getUsuario().getRutUsuario(), negritoPequena);
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
	        
			paragraph.add(new Paragraph("__________________________                                              __________________________",negritoPequena));
			paragraph.add(new Paragraph("     FIRMA CONTRATANTE                                                          FIRMA CONTRATADO",negritoPequena));
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
			paragraph = new Paragraph("Archivo generado el dia: : "
					+ new Date(), negritoPequena);
	        document.add(paragraph);
			
	        document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
