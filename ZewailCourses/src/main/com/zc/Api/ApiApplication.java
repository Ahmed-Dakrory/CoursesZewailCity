package main.com.zc.Api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ApiApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(EmailApiReg.class);
		return classes;
	}

}
