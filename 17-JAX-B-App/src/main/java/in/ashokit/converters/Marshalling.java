package in.ashokit.converters;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.ashokit.domain.Customer;

public class Marshalling {

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Raj");
		customer.setCustomerEmail("raj@gmail.com");
		customer.setCustomerAge(25);

		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(customer, System.out);

	}

}
