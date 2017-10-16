
package domain;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class SystemConfiguration {

	private Double	vatNumber;
	private String	bannerUrl;
	private String	welcomeMessage;
	private String	defaultCC;


	@Min(0)
	public Double getVatNumber() {
		return this.vatNumber;
	}
	public void setVatNumber(final Double vatNumber) {
		this.vatNumber = vatNumber;
	}
	@NotBlank
	@URL
	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public void setBannerUrl(final String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	@NotBlank
	public String welcomeMessage() {
		return this.welcomeMessage;
	}
	public void setWelcomeMessage(final String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	@NotBlank
	public String getDefaultCC() {
		return this.defaultCC;
	}
	public void setDefaultCC(final String defaultCC) {
		this.defaultCC = defaultCC;
	}
}
