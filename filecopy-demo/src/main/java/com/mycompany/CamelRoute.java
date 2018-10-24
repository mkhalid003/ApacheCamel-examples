package com.mycompany;

import org.apache.camel.builder.RouteBuilder;

public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("file:src/inbox?noop=true")
		.log("${body}")
		.to("file:src/outbox")
		.end();
	}
}
