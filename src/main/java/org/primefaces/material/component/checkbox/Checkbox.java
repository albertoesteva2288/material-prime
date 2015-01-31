package org.primefaces.material.component.checkbox;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;

import org.primefaces.component.selectbooleancheckbox.SelectBooleanCheckbox;
import org.primefaces.material.MaterialPrime;

@ResourceDependencies({
	@ResourceDependency(library = "primefaces", name = "jquery/jquery.js"),
	@ResourceDependency(library = "primefaces", name = "primefaces.js"),
	@ResourceDependency(library = "material-prime", name = "libs/bootstrap.js"),
	@ResourceDependency(library = "material-prime", name = "libs/bootstrap.css"),
	@ResourceDependency(library = "material-prime", name = "libs/material.css"),
	@ResourceDependency(library = "material-prime", name = "libs/material.js"),
	@ResourceDependency(library = "material-prime", name = "libs/ripples.css"),
	@ResourceDependency(library = "material-prime", name = "libs/ripples.js"),
	@ResourceDependency(library = "material-prime", name = "core/material-prime.js"),
	@ResourceDependency(library = "material-prime", name = "checkbox/checkbox.js")
})
public class Checkbox extends SelectBooleanCheckbox {
	public static final String COMPONENT_TYPE = "org.primefaces.material.component.Checkbox";
	
	public Checkbox() {
		setRendererType(CheckboxRenderer.RENDERER_TYPE);
	}
	
	@Override
	public String getFamily() {
		return MaterialPrime.COMPONENT_FAMILY;
	}
}