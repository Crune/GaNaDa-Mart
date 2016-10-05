package ganada.core;

import java.util.Set;
import java.util.HashSet;
import java.net.URL;
import java.io.File;
import java.lang.reflect.Modifier;

public class Reflections {

	private Reflections() {
	}

	public static Set<Class> getClasses(String packageName) {
		Set<Class> classes = new HashSet<Class>();
		String packageNameSlash = "./" + packageName.replace(".", "/");
		URL directoryURL = Thread.currentThread().getContextClassLoader().getResource(packageNameSlash);
		String directoryString = directoryURL.getFile();
		File directory = new File(directoryString);
		if (directory.exists()) {
			String[] files = directory.list();
			for (String fileName : files) {
				if (fileName.endsWith(".class")) {
					fileName = fileName.substring(0, fileName.length() - 6);
					try {
						Class c = Class.forName(packageName + "." + fileName);
						if (!Modifier.isAbstract(c.getModifiers()))
							classes.add(c);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return classes;
	}
}
