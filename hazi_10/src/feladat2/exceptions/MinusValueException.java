package feladat2.exceptions;

public class MinusValueException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		System.out.println("Negativ ertek nem lehet, se nulla!\n");
		return super.getMessage();
	}
	@Override
	public void printStackTrace() {
		System.out.println("Negativ ertek nem lehet, se nulla!\n");
		super.printStackTrace();
	}
}
