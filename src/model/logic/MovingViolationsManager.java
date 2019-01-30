package model.logic;

import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.ILinkedList;

public class MovingViolationsManager implements IMovingViolationsManager {

	
	public void loadMovingViolations(String movingViolationsFile){
		// TODO Auto-generated method stub
		
	}

		
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsWithAccident(String accidentIndicator) {
		// TODO Auto-generated method stub
		return null;
	}	


}
