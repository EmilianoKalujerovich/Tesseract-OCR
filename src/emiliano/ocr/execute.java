package emiliano.ocr;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class execute {

	public static void main(String[] args) {


		File image = new File("C:\\imagee");

		Tesseract tesseract = new Tesseract();
		try {

			String text = tesseract.doOCR(image);
			System.out.print(text);
			
		} catch (TesseractException e) {
			e.printStackTrace();
		}
	}

}
