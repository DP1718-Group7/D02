
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;

import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity {

	private String	keyWord;
	private Double	minPrice;
	private Double	maxPrice;
	private Date	startDate;
	private Date	endDate;


	@SafeHtml(whitelistType = WhiteListType.NONE)
	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(final String keyWord) {
		this.keyWord = keyWord;
	}

	@DecimalMin(value = "0.0")
	// @DecimalMax(value = "1000000.0")
	public Double getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(final Double minPrice) {
		this.minPrice = minPrice;
	}

	@DecimalMin(value = "0.0")
	// @DecimalMax(value = "1000000.0")
	public Double getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(final Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}
}
