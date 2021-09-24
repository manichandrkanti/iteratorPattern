package iteratorPattern;

public class FlatBreadTest {

	public static void main(String[] args) {
		 {
		        Bread[] breads = new Bread[5];
		        breads[0] = new Bread("Flat bread");
		        breads[1] = new Bread("Round bread");
		        breads[2] = new Bread("Fresh bread");
		        breads[3] = new Bread("Wheat bread");
		        breads[4] = new Bread("Milk Bread");
		         
		        List<Bread> list = new ListOfBreads(breads);
		         
		        Iterator<Bread> iterator = list.iterator();
		         
		        while(iterator.hasNext()) {
		            Bread currentBread = iterator.next();
		            System.out.println("Current Available In Stock Breads at the Campbell  : "+currentBread.getName());
		        }
		    

	}
	}}
