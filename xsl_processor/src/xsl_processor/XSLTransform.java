package xsl_processor;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTransform {
	
	
	  public static void main(String args[]) throws Exception {
		    StreamSource source = new StreamSource("phonebook.xml");
		    StreamSource stylesource = new StreamSource("phonebook.xsl");

		    TransformerFactory factory = TransformerFactory.newInstance();
		    Transformer transformer = factory.newTransformer(stylesource);

		    StreamResult result = new StreamResult(System.out);
		    transformer.transform(source, result);
		  }
	  
	  
	 
		  //----------------- the example below does not work
	  
    //public static void main( String [] args ) throws Exception {
//        if ( args.length < 2 || !args[0].endsWith(".xsl") ) {
//            System.err.println("usage: XSLTransform file.xsl file.xml");
//            System.exit(1);
//        }
//        String xslFile = "addressbook.xsl"; 
//        String xmlFile = "addressbook.xml";
//
//        TransformerFactory factory = TransformerFactory.newInstance();
//        Transformer transformer = 
//            factory.newTransformer( new StreamSource( xslFile ) );
//        StreamSource xmlsource = new StreamSource( xmlFile );
//        StreamResult output = new StreamResult( System.out );
//        transformer.transform( xmlsource, output );
//    }
}