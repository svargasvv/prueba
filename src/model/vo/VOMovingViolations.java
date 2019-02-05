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
	private String violationDesc; 
	
	public VOMovingViolations(String pObject_ID, String pRow, String pLocation, String pAdress_ID, String pStreet_ID,
			String pXCoord, String pYCoord, String pTicket, String pFineAMT, String pTotalPaid, String pPenalty1 , String pPenalty2, String 
			pAccidentIndicator , String pTicketDate, String pViolationCode, String pViolationDesc)
	{
		object_ID= Integer.parseInt(pObject_ID);
		row = Integer.parseInt(pRow);
		location = pLocation;
		adress_ID= Integer.parseInt(pAdress_ID);
		street_ID = Integer.parseInt(pStreet_ID);
		xCoord= Double.parseDouble(pXCoord);
		yCoord= Double.parseDouble(pYCoord);
		ticket= pTicket;
		fineAMT= Short.parseShort(pFineAMT);
		totalPaid = Short.parseShort(pTotalPaid);
		penalty1 = Short.parseShort(pPenalty1);
		penalty2 = Short.parseShort(pPenalty2);
		accidentIndicator= pAccidentIndicator;
		ticketDate = pTicketDate;
		violationCode = pViolationCode;
		violationDesc = pViolationDesc;
		
		
		
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
		return violationDesc;
	}
	
	/**
	 * 
	 */
	public String getViolationCode()
	{
		return violationCode; 
	}
}
