
package domain;

import java.util.Collection;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class SurvivalClass {

	private String					title;
	private String					description;
	private Date					momentOrganized;
	private Location				location;
	private Collection<Explorer>	explorer;


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
	public Date getMomentOrganized() {
		return this.momentOrganized;
	}

	public void setMomentOrganized(final Date momentOrganized) {
		this.momentOrganized = momentOrganized;
	}
	public Location getLocation() {
		return this.location;
	}
	public void setLocation(final Location location) {
		this.location = location;
	}

	public Collection<Explorer> getExplorer() {
		return this.explorer;
	}

	public void setExplorer(final Collection<Explorer> explorer) {
		this.explorer = explorer;
	}

}
