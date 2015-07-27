public class TurDegistirme {

	public static void main(String[] args) {
		double doub = 2.14;
		String str= "12";
		
		System.out.println(doub);
		
		int c = (int) doub;// integera çevrildi
		
		System.out.println(c);
		
		String yeni = doub+str;
		
		System.out.println(yeni);//ikisinden biri string ise toplar
		
		int yeni2 = Integer.parseInt(str);/*stringi integer yaptık*/
		
		System.out.println(yeni2);
		System.out.println(yeni2+doub);/*artık toplanıyor*/
	/*
	 
	 Integer.toString(12); --> parantez içerisinde verilen int türünü String'e çevirir. 
	 Double.parseDouble(12); --> parantez içerisinde verilen int türünü double türüne çevirir. 
	 Double.toString(12.45); --> parantez içerisinde verilen double türünü String'e çevirir. 
	 */
	}

}

