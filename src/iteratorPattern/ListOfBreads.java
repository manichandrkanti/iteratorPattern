package iteratorPattern;

public class ListOfBreads implements List<Bread> {
	 private Bread[] breads;
     
	    public ListOfBreads(Bread[] breads)
	    {
	        this.breads = breads;
	    }
	     
	    @Override
	    public Iterator<Bread> iterator() {
	        return new BreadIterator(breads);
	    }
}
