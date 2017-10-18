
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class MiscellaneousRecord extends DomainEntity {

	// Attributes
	private String	title;
	private String	attachmentLink;


	@NotBlank
	@NotNull
	@SafeHtml(whitelistType = WhiteListType.NONE)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@SafeHtml(whitelistType = WhiteListType.NONE)
	@URL
	public String getAttachmentLink() {
		return this.attachmentLink;
	}

	public void setAttachmentLink(final String attachmentLink) {
		this.attachmentLink = attachmentLink;
	}


	// Relationships
	private Collection<Comment>	comments;


	@Valid
	// TODO: Relationship pattern
	public Collection<Comment> getComments() {
		return this.comments;
	}

	public void setComment(final Collection<Comment> comments) {
		this.comments = comments;
	}

}
