package in.ashokit.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.ashokit.domain.Customer;

public class UnMarshalling {

	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object obj = unmarshaller.unmarshal(new File("customer.xml"));
		Customer c = (Customer) obj;
		System.out.println(c);
	}

}
