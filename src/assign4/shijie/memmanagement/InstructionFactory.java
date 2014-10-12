package assign4.shijie.memmanagement;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public class InstructionFactory {

	private static Map<String, Class> _maps = new LinkedHashMap<String, Class>();
	
	static {
		_maps.put("a", AlloInst.class);
		_maps.put("r", FreeInst.class);
		_maps.put("+", PlusInst.class);
		_maps.put("-", SubInst.class);
		_maps.put("r", ResetInst.class);
	}
	
	public static IInstruction createInstruction(String line){
		if(line.trim().equals("") || line.indexOf(" ") ==-1) return null; 
		String action = line.trim().substring(0, line.indexOf(" "));
		
		try {
			return (IInstruction) _maps.get(action).
					getConstructor(String.class).newInstance(line);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
}
