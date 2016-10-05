package ganada.core;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.xml.internal.ws.api.Component;

import ganada.mc.action.MCAction;

public class ReflectionsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Set<Class> set = Reflections.getClasses("ganada.mc.action");
		for (Class cls : set) {
			if (cls.isAnnotationPresent(MCAction.class)) {
				System.out.println("class:" + cls.getName());
			}
			MCAction action = (MCAction) cls.getAnnotation(MCAction.class);
			
			if (action != null)
				System.out.println("key:" + action.value());
		}
	}

}
