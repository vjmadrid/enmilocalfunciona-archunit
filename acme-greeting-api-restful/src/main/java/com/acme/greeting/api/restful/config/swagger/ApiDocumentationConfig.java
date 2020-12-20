package com.acme.greeting.api.restful.config.swagger;

import io.swagger.annotations.Contact;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.License;

@SwaggerDefinition(
        info = @Info(
                description = "Acme Resources",
                version = "V12.0.12",
                title = "Acme Resource API",
                contact = @Contact(
                   name = "Victor Madrid", 
                   email = "global@acme.corp.com", 
                   url = "http://www.acme.corp.com"
                ),
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://acme.corp.com")
)
public class ApiDocumentationConfig {

}
