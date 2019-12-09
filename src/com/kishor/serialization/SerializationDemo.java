package com.kishor.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String as[]) throws Exception {
		
		Pulsar p = new Pulsar();
		
		serialize("pulsar.ser", p);
		
		Pulsar p1 = (Pulsar) deSrialize("pulsar.ser");
		
		System.out.println(p1.toString());
		

	}
	
	private static void serialize(String outFile, Object serializableObject) throws Exception {
		FileOutputStream fos = new FileOutputStream(outFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serializableObject);
	}

	private static Object deSrialize(String serilizedObject) throws Exception {
		FileInputStream fis = new FileInputStream(serilizedObject);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return ois.readObject();
	}
}
