package iteratorPattern;

public interface Iterator<TypesOfBread> 
{
   void restore();  

   TypesOfBread next();  

   TypesOfBread currentBread();   

   boolean hasNext();  
}
