package xsl_processor;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Driver {

	public static void main(String[] args) {
		
	}
	
	public Node findAddress(String name, Document source) {
		   Element root = source.getDocumentElement();
		   NodeList nl = root.getChildNodes();
		   // iterate over all address nodes and find the one that has the correct addressee
		   for (int i=0;i<nl.getLength(); i++) {
		      Node n = nl.item(i);
		      if ((n.getNodeType() == Node.ELEMENT_NODE) && 
		          (((Element)n).getTagName().equals("address"))) {
		         // we have an address node, now we need to find the 
		         // 'addressee' child
		         Node addressee = ((Element)n).getElementsByTagName("addressee").item(0);
		         // there is the addressee, now get the text node and compare
		         Node child = addressee.getChildNodes().item(0);
		         do {
		            if ((child.getNodeType()==Node.TEXT_NODE) &&
		                (((Text)child).getData().equals(name))) {             
		               return n;
		            }
		            child = child.getNextSibling(); 
		                  } while (child != null);
		      }
		   }
		   return null;
		}
	
}
