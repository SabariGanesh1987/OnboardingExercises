package com.epam.java8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

import org.apache.commons.lang3.StringUtils;

public class PrintProductConsumer_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProdName("Mobile");
		product.setProdCategory("Electronic");
		product.setProdGrade("Gaming");
		product.setProdPrice(15000.00);
		String medium = "file";
		Consumer<Product> consumer;
		if (medium.equals("file") && !StringUtils.isEmpty(medium)) {
			File file = new File(System.getProperty("user.dir") + "\\filename.txt");
			if (file.exists()) {
				file.delete();
			}
			file.createNewFile();
			consumer = PrintProductConsumer_1::printInFile;
			
		} else {
			 consumer = t -> System.out.println(t);
			
		}
		consumer.accept(product);

	}

	static void printInFile(Product product) {

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(System.getProperty("user.dir") + "\\filename.txt");
			fileWriter.write(product.toString());
			fileWriter.close();
			System.out.println("Successfully written into file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
