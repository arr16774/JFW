import java.util.*;
	
// clase para decidir cual tipo de HASH se va a emplear
	
public class factory {
	
	
	//use getShape method to get object of type shape
	
	
	public AbstractSet getList(String shapeType){
		if(shapeType == null){
			return null;
	}
		if(shapeType.equalsIgnoreCase("HashSet")){
			return new HashSet();
	} 
		else if(shapeType.equalsIgnoreCase("TreeSet")){
			return new TreeSet();
	} 
		else if(shapeType.equalsIgnoreCase("LinkedHashSet")){
			return new LinkedHashSet();
	
	}
	
	return null;
	
	
	}
	
}
