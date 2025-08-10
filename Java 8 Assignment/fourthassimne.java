package wiprofirst.javaeightassiment;

interface oninter{
	void bapu();
	default void bala() {
		System.out.println("hii bala");
	}
}
public class fourthassimne implements oninter {

	public static void main(String[] args) {
		fourthassimne fa = new fourthassimne();
		fa.bala();
		fa.bapu();
	}

	@Override
	public void bapu() {
		// TODO Auto-generated method stub
		System.out.println("hii bapu");
		
	}
}
