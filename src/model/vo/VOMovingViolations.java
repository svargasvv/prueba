package model.vo;

/**
 * Representation of a Trip object
 */
public class VOMovingViolations {
	//----------------------------------------------------------------
	//Atributos 
	//----------------------------------------------------------------
	private int object_ID;
	private int row; 
	private String location; 
	private int adress_ID;
	private int street_ID;
	private double xCoord;
	private double yCoord;
	private String ticket;
	private short fineAMT;
	private short totalPaid;
	private short penalty1;
	private short penalty2;
	private String accidentIndicator; 
	private String ticketDate;
	private String violationCode;
	private String violantionDesc; 
	
	public VOMovingViolations(String string, String string2, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return id - Identificador único de la infracción
	 */
	public int objectId() {
		// TODO Auto-generated method stub
		return object_ID;
	}	
	
	
	/**
	 * @return location - Dirección en formato de texto.
	 */
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	/**
	 * @return date - Fecha cuando se puso la infracción .
	 */
	public String getTicketIssueDate() {
		// TODO Auto-generated method stub
		return ticketDate;
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pagó el que recibió la infracción en USD.
	 */
	public int getTotalPaid() {
		// TODO Auto-generated method stub
		return totalPaid;
	}
	
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() {
		// TODO Auto-generated method stub
		return accidentIndicator;
	}
		
	/**
	 * @return description - Descripción textual de la infracción.
	 */
	public String  getViolationDescription() {
		// TODO Auto-generated method stub
		return violantionDesc;
	}
}
