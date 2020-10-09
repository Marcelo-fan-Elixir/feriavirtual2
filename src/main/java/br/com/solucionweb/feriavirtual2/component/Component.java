package br.com.solucionweb.feriavirtual2.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@org.springframework.stereotype.Component("Component")
public class Component {
	
	private static final Log LOG = LogFactory.getLog(Component.class);
	
	public void sayHello() {
		LOG.info("HELLO EXEMPO COMPONENT");
	}

}
