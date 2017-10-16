
package domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class LegalText {

	private String	title;
	private String	body;
	private String	numberLaw;
	private Date	momentRegistered;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getBody() {
		return this.body;
	}
	public void setBody(final String body) {
		this.body = body;
	}
	@Min(1)
	public String getNumberLaw() {
		return this.numberLaw;
	}
	public void setNumberLaw(final String numberLaw) {
		this.numberLaw = numberLaw;
	}
	@Past
	public Date getMomentRegistered() {
		return this.momentRegistered;
	}
	public void setMomentRegistered(final Date momentRegistered) {
		this.momentRegistered = momentRegistered;
	}

}
