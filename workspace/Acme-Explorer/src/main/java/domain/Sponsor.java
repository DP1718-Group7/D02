
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Sponsor extends Actor {

	// Relationships
	private Collection<Sponsorship>	sponsorships;


	@Valid
	// TODO: Relationship pattern
	public Collection<Sponsorship> sponsorships() {
		return this.sponsorships;
	}
	public void setSponsorships(final Collection<Sponsorship> sponsorships) {
		this.sponsorships = sponsorships;
	}

}
