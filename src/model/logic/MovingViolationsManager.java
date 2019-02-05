package model.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.LinkedList;

public class MovingViolationsManager implements IMovingViolationsManager {
	
	private LinkedList<VOMovingViolations> arreglo;
	
	public void loadMovingViolations(String movingViolationsFile){
		
		File archivo = new File(movingViolationsFile);
		try {
			Scanner sca = new Scanner(archivo);
			
			while(sca.hasNext()){
				sca.nextLine();
				String actual = sca.next();
				StringTokenizer st = new StringTokenizer(actual,",");
				
				while(st.hasMoreTokens()){
					ArrayList<String> datosActual = new ArrayList<String>();
					datosActual.add(st.nextToken());
					arreglo.add(new VOMovingViolations(datosActual.get(0), datosActual.get(1), datosActual.get(2), datosActual.get(3), datosActual.get(4), datosActual.get(5)));

				}
	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

		
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		
		return null;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		// TODO Auto-generated method stub
		return null;
	}	


}
