package com.cedaniel200.screenplay.dojo.runner;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/inicio_sesion.feature",
glue = {"com.cedaniel200.screenplay.dojo.stepdefinition"}, snippets = SnippetType.CAMELCASE)
public class InicioSesion {

}
