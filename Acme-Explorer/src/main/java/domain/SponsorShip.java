
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class SponsorShip {

	private String		bannerUrl;
	private String		infoPage;
	private CreditCard	creditCard;
	private Trip		trip;


	@NotBlank
	@URL
	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public void setBannerUrl(final String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	@NotBlank
	@URL
	public String getInfoPage() {
		return this.infoPage;
	}
	public void setInfoPage(final String infoPage) {
		this.infoPage = infoPage;
	}
	public CreditCard getCreditCard() {
		return this.creditCard;
	}
	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Trip getTrip() {
		return this.trip;
	}

	public void setTrip(final Trip trip) {
		this.trip = trip;
	}

}
