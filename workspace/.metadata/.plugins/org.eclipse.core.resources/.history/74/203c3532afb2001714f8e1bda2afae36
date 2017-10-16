
package domain;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Stage {

	private String	title;
	private String	description;
	private Double	price;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}
	public void setDescription(final String description) {
		this.description = description;
	}
	@Min(0)
	public Double getPrice() {
		return this.price;
	}
	public void setPrice(final Double price) {
		this.price = price;
	}
}
