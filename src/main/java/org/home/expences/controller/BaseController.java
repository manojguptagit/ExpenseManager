package org.home.expences.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

/**
 * 
 * @author lenovo
 *
 */
@Scope(value = "session")
@Named
public abstract class BaseController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8672576446138479111L;

	@PostConstruct
	protected abstract void onCreateBean();

	/**
	 * Shows message
	 * 
	 * @param summary
	 * @param detail
	 * @param severity
	 */
	protected void showMessage(String summary, String detail, Severity severity) {
		FacesMessage facesMessage = new FacesMessage(severity, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
}
