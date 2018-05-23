package feladat2.exceptions;

public class ItIsNotTriangle extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		System.out.println("Fent �ll a h�romsz�g egyenl�tlens�ge!\n");
		return super.getMessage();
	}
	@Override
	public void printStackTrace() {
		System.out.println("Fent �ll a h�romsz�g egyenl�tlens�ge!\n");
		super.printStackTrace();
	}
}
