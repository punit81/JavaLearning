package ReflectionTesting;
import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
	Class cl=new SampleClass().getClass();
	Object o=cl.newInstance();
	Method m= cl.getDeclaredMethod("showMessage",int.class ,int.class );
	m.setAccessible(true);
	m.invoke(o,1,2);
}
}
