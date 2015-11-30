package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.Utils;




import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.Utils;

public class RandomF {

	public void imprimirResultados(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9,String a10,String a11,String a12,String a13,String a14,String a15,String a16,String a17,String a18,String a19){


		try{
			File f=new File("/tmp/pred.txt");
			FileWriter fw = new FileWriter(f.getAbsolutePath());

			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write("@relation popular");
			bw.newLine();
			bw.newLine();
			for(int i=1;i<=15;i++){
				bw.write("@attribute a"+i+" numeric");
				bw.newLine();
			}

			bw.write("@attribute a16 {0, 1}");
			bw.newLine();
			bw.write("@attribute a17 {0, 1}");
			bw.newLine();
			bw.write("@attribute a18 {0, 1}");
			bw.newLine();
			bw.write("@attribute a19 {0, 1}");
			bw.newLine();
			bw.newLine();

			bw.write("@data");
			bw.newLine();
			bw.write(a1+","+a2+","+a3+","+a4+","+a5+","+a6+","+a7+","+a8+","+a9+","+a10+","+a11+","+a12+","+a13+","+a14+","+a15+","+a16+","+a17+","+a18+","+a19);
			bw.newLine();
			bw.close();

			//JOptionPane.showMessageDialog (null, "El archivo se guardo con los parametros satisfactoriamente.", "Archivo Guardado", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception ee){
			//JOptionPane.showMessageDialog (null, "No se llev� a cabo la simulaci�n.", "Error", JOptionPane.ERROR_MESSAGE);

		}
	}
	public  BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;

		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + filename);
		}

		return inputReader;
	}

	public String darPrediccion(){
		try{

			BufferedReader datafile = readDataFile("rfor.txt");
			BufferedReader datafile2 = readDataFile("/tmp/pred.txt");

			Instances train = new Instances(datafile);
			train.setClassIndex(train.numAttributes() - 1);
			Instances test = new Instances(datafile2);
			test.setClassIndex(test.numAttributes() - 1);
			if (!train.equalHeaders(test))
				throw new IllegalArgumentException(
						"Train and test set are not compatible!");

			// train classifier
			RandomForest cls = new RandomForest();

			cls.buildClassifier(train);


			int i=0;
			double pred = cls.classifyInstance(test.instance(i));
			double[] dist = cls.distributionForInstance(test.instance(i));
			test.classAttribute().value((int) pred);
			if(test.classAttribute().value((int) pred)=="1"){
				return "El articulo va a ser popular";
			}else{
				return "El articulo no va a ser popular";
			}
		}
		catch(Exception e){

		}
		return "No";
	}
	

}


