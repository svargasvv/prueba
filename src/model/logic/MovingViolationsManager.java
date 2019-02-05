package model.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSeparatorUI;

import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.LinkedList;

public class MovingViolationsManager implements IMovingViolationsManager {
	
	private LinkedList<VOMovingViolations> arreglo;
	
	public void loadMovingViolations(String movingViolationsFile){
		
		File archivo = new File(movingViolationsFile);
		try {
			Scanner sc = new Scanner(archivo);
			
			while(sc.hasNext()){
				sc.nextLine();
				String actual = sc.nextLine();
				
				actual=actual.replace(",,,", ",-1,-1,");
				actual=actual.replace(",,", ",-1,");
				actual=actual.replace(", ", "_");
				
				StringTokenizer st = new StringTokenizer(actual,",");
				
				ArrayList<String> datosActual = new ArrayList<String>();
				
				while(st.hasMoreTokens()){
					
					datosActual.add(st.nextToken());
					
				}
				
				arreglo.add(new VOMovingViolations(datosActual.get(0), 
						datosActual.get(1), datosActual.get(2), datosActual.get(3), datosActual.get(4), datosActual.get(5),datosActual.get(6), datosActual.get(7),
						datosActual.get(8), datosActual.get(9), datosActual.get(10), datosActual.get(11), datosActual.get(12), 
						datosActual.get(13), datosActual.get(14), datosActual.get(15)));

			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

		
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		LinkedList <VOMovingViolations> retorno = new LinkedList <VOMovingViolations>();
		for ( int i = 0 ; i<arreglo.getSize(); i++)
		{
			VOMovingViolations act = arreglo.getElement(i);
			if ( act.getViolationCode()== violationCode)
			{
				retorno.add(act);
			}
		}
		return retorno;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		// TODO Auto-generated method stub
		LinkedList <VOMovingViolations> retorno= new LinkedList <VOMovingViolations>();
		for ( int i = 0 ; i<arreglo.getSize(); i++)
		{
			VOMovingViolations act = arreglo.getElement(i);
			if ( act.getAccidentIndicator()== accidentIndicator)
			{
				retorno.add(act);
			}
		}
		
		
		return retorno;
	}	


}
