package feladat2.exceptions;

public class ItIsNotRectangular extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		System.out.printf("Oldalak oldala egyenlo, igy nem t�glalap!\n");
		return super.getMessage();
	}
	@Override
	public void printStackTrace(){
		System.out.printf("Oldalak oldala egyenlo, igy nem t�glalap!\n");
		super.printStackTrace();
	}
}
