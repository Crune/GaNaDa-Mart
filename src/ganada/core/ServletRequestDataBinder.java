package ganada.core;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Set;

import javax.servlet.ServletRequest;

public class ServletRequestDataBinder {
	public static Object bind(ServletRequest request, Class<?> dataType, String dataName) throws Exception {
		if (isPrimitiveType(dataType)) {
			return createValueObject(dataType, request.getParameter(dataName));
		}

		Set<String> paramNames = request.getParameterMap().keySet();
		Object dataObject = dataType.newInstance();
		Method m = null;

		for (String paramName : paramNames) {
			m = findSetter(dataType, paramName);
			if (m != null) {
				m.invoke(dataObject, createValueObject(m.getParameterTypes()[0], request.getParameter(paramName)));
			}
		}
		return dataObject;
	}

	private static boolean isPrimitiveType(Class<?> type) {
		if (type.getName().equals("int") || type == Integer.class || type.getName().equals("long") || type == Long.class
				|| type.getName().equals("float") || type == Float.class || type.getName().equals("double")
				|| type == Double.class || type.getName().equals("boolean") || type == Boolean.class
				|| type == Date.class || type == String.class) {
			return true;
		}
		return false;
	}

	private static Object createValueObject(Class<?> type, String value) {
		return DAO.cVO(type, value);
	}

	private static Method findSetter(Class<?> type, String name) {
		Method[] methods = type.getMethods();

		String propName = null;
		for (Method m : methods) {
			if (!m.getName().startsWith("set"))
				continue;

			propName = m.getName().substring(3);
			if (propName.toLowerCase().equals(name.toLowerCase())) {
				return m;
			}
		}
		return null;
	}
}