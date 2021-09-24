package iteratorPattern;

public class BreadIterator implements Iterator<Bread> {
	  private Bread[] breads;
	    private int position;
	     
	    public BreadIterator(Bread[] breads)
	    {
	        this.breads = breads;
	        position = 0;
	    }
	 
	    @Override
	    public void restore() {
	        position = 0;
	    }
	 
	    @Override
	    public Bread next() { 
	        return breads[position++];
	    }
	 
	    @Override
	    public Bread currentBread() {
	        return breads[position];
	    }
	 
	    @Override
	    public boolean hasNext() {
	        if(position >= breads.length)
	            return false;
	        return true;
	    }
}
