/**
 * 
 */
package org.home.expences.controller;

import javax.faces.application.FacesMessage;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;

/**
 * @author lenovo
 *
 */
@Scope("session")
@Named(value = "navigationController")
public class NavigationController extends BaseController {
	
	 static final Logger logger = LogManager.getLogger(NavigationController.class.getName());
	/**
	 * 
	 */
	private static final long serialVersionUID = -5548783283224572805L;

	@Override
	protected void onCreateBean() {
		super.showMessage("This is a summary", "This is a detail",
				FacesMessage.SEVERITY_INFO);
		this.setMessage("This is a sample message");
		logger.info(this.getMessage());
	}
	
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
