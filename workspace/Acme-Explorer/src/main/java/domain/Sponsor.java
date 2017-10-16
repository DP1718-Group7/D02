
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
	private Collection<SponsorShip>	sponsorships;


	@Valid
	// TODO: Relationship pattern
	public Collection<SponsorShip> sponsorships() {
		return this.sponsorships;
	}
	public void setSponsorships(final Collection<SponsorShip> sponsorships) {
		this.sponsorships = sponsorships;
	}

}
