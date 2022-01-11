package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import psd.PropertySetDef;

public class PSDExporter {
	
	public void saveToFile(String path, PropertySetDef propSetDef) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance("psd");

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

			OutputStream outputStream = new FileOutputStream(path);

			QName qName = new QName("","PropertySetDef"); 
			JAXBElement<PropertySetDef> root = new JAXBElement<>(qName, PropertySetDef.class, propSetDef);
			marshaller.marshal(root, outputStream);

		} catch (JAXBException | FileNotFoundException e2) {
			e2.printStackTrace();
		}
	}

}
