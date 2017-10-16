
package domain;

import java.util.Collection;

public class Explorer extends Actor {

	private Collection<Story>				story;
	private Finder							finder;
	private Collection<ContactEmergency>	contactEmergency;
	private Collection<Application>			application;
	private CreditCard						creditCard;
	private Collection<SurvivalClass>		survivalClasses;


	public Explorer() {
		super();
	}

	public Collection<Story> getStories() {
		return this.story;
	}
	public void setStories(final Collection<Story> story) {
		this.story = story;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Collection<Story> getStory() {
		return this.story;
	}

	public void setStory(final Collection<Story> story) {
		this.story = story;
	}

	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

	public Collection<ContactEmergency> getContactEmergency() {
		return this.contactEmergency;
	}

	public void setContactEmergency(final Collection<ContactEmergency> contactEmergency) {
		this.contactEmergency = contactEmergency;
	}

	public Collection<Application> getApplication() {
		return this.application;
	}

	public void setApplication(final Collection<Application> application) {
		this.application = application;
	}

	public Collection<SurvivalClass> getSurvivalClasses() {
		return this.survivalClasses;
	}

	public void setSurvivalClasses(final Collection<SurvivalClass> survivalClasses) {
		this.survivalClasses = survivalClasses;
	}
}
