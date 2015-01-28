package br.gov.bnb.s476.proposta.concessao.fachada.applicationservice.resource.s400.cadastro.v4;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

    private static final String FILE_NAME = "jaxb-emp.xml";

    public static void main( String[] args ) {
        SolicitacaoCadastro emp = new SolicitacaoCadastro();

        jaxbObjectToXML(emp);

        SolicitacaoCadastro empFromFile = jaxbXMLToObject();
        System.out.println(empFromFile.toString());
    }

    public static SolicitacaoCadastro jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext
                    .newInstance(SolicitacaoCadastro.class);
            Unmarshaller un = context.createUnmarshaller();
            SolicitacaoCadastro emp = (SolicitacaoCadastro) un
                    .unmarshal(new File(FILE_NAME));
            return emp;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void jaxbObjectToXML( SolicitacaoCadastro emp ) {

        try {
            JAXBContext context = JAXBContext
                    .newInstance(SolicitacaoCadastro.class);
            Marshaller m = context.createMarshaller();
            // for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            m.marshal(emp, System.out);

            // Write to File
            m.marshal(emp, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
