package com.narayanjoshi.simplesoapserverapp.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}

	@Bean(name = "UserService")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema userServiceSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("UserPort");
		wsdl11Definition.setLocationUri("/ws/user");
		wsdl11Definition.setTargetNamespace("com.narayanjoshi.simplesoapserverapp.gs_ws");
		wsdl11Definition.setSchema(userServiceSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema userServiceSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/UserService.xsd"));
	}

	@Bean(name = "CalculateService")
	public DefaultWsdl11Definition defaultWsdl11CalculateServiceDefinition(XsdSchema calculateService) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("CalculatePort");
		wsdl11Definition.setLocationUri("/ws/calc");
		wsdl11Definition.setTargetNamespace("com.narayanjoshi.simplesoapserverapp.gs_ws");
		wsdl11Definition.setSchema(calculateService);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema calculateService() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/CalculateService.xsd"));
	}


}