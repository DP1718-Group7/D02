
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class EndorserRecord extends DomainEntity {

	private String				name;
	private String				email;
	private String				phone;
	private String				linkedInLink;
	private Collection<Comment>	comments;


	@NotBlank
	public String getName() {
		return this.name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	@NotBlank
	@Email
	public String getEmail() {
		return this.email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	@NotBlank
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	@NotBlank
	@URL
	public String getLinkedInLink() {
		return this.linkedInLink;
	}
	public void setLinkedInLink(final String linkedInLink) {
		this.linkedInLink = linkedInLink;
	}

	public Collection<Comment> getComments() {
		return this.comments;
	}

	public void setComment(final Collection<Comment> comments) {
		this.comments = comments;
	}
}
