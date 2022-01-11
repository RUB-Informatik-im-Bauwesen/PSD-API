package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import psd.PropertySetDef;

public class PSDImporter {
	
	public PropertySetDef loadFromFile(String path) {
		try {
			JAXBContext context = JAXBContext.newInstance("psd");
			Unmarshaller marshaller = context.createUnmarshaller();
			return (PropertySetDef)marshaller.unmarshal(new File(path));
		} catch (JAXBException e2) {
			e2.printStackTrace();
		}
		return null;
	}

}
