
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Ranger extends Actor {

	// Relationships
	private Collection<Trip>	trip;
	private Curriculum			curriculum;


	@Valid
	// TODO: Relationship pattern
	public Collection<Trip> getTrip() {
		return this.trip;
	}

	public void setTrip(final Collection<Trip> trip) {
		this.trip = trip;
	}

	@Valid
	// TODO: Relationship pattern
	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(final Curriculum curriculum) {
		this.curriculum = curriculum;
	}

}
