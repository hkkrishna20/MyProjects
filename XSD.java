
import java.io.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import org.xml.sax.SAXException;

public class Xsd {
	public static void main(String[] args) throws SAXException {
		   SchemaFactory factory = 
		            SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		        
		        File schemaLocation = new File("C:/Java_CGI/Day11/XmlProg/src/Product.xsd");
		        Schema schema = factory.newSchema(schemaLocation);
		        Validator validator = schema.newValidator();
		        Source source = new StreamSource("C:/Java_CGI/Day11/XmlProg/src/Product.xml");
		        
		        try {
		            validator.validate(source);
		            System.out.println(" is valid.");
		        }
		        catch (SAXException ex) {
		            System.out.println( " is not valid because ");
		            System.out.println(ex.getMessage());
		        } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		        
	}
}