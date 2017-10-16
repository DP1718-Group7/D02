
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Explorer extends Actor {

	// Attributes
	private CreditCard	creditCard;


	@Valid
	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	// Relationships
	private Collection<Story>				stories;
	private Finder							finder;
	private Collection<ContactEmergency>	contactEmergencies;
	private Collection<Application>			applications;
	private Collection<SurvivalClass>		survivalClasses;


	@Valid
	// TODO: Relationship pattern
	public Collection<Story> getStories() {
		return this.stories;
	}
	public void setStories(final Collection<Story> stories) {
		this.stories = stories;
	}

	@Valid
	// TODO: Relationship pattern
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

	@Valid
	// TODO: Relationship pattern
	public Collection<ContactEmergency> getContactEmergencies() {
		return this.contactEmergencies;
	}

	public void setContactEmergencies(final Collection<ContactEmergency> contactEmergencies) {
		this.contactEmergencies = contactEmergencies;
	}

	@Valid
	// TODO: Relationship pattern
	public Collection<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(final Collection<Application> applications) {
		this.applications = applications;
	}

	@Valid
	// TODO: Relationship pattern
	public Collection<SurvivalClass> getSurvivalClasses() {
		return this.survivalClasses;
	}

	public void setSurvivalClasses(final Collection<SurvivalClass> survivalClasses) {
		this.survivalClasses = survivalClasses;
	}
}
