
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Story extends DomainEntity {

	private String	title;
	private String	pieceOfText;
	private String	attachmentUrl;


	@NotBlank
	@NotNull
	@SafeHtml(whitelistType = WhiteListType.NONE)
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	@NotNull
	@SafeHtml(whitelistType = WhiteListType.NONE)
	public String getPieceOfText() {
		return this.pieceOfText;
	}
	public void setPieceOfText(final String pieceOfText) {
		this.pieceOfText = pieceOfText;
	}

	@NotNull
	@SafeHtml(whitelistType = WhiteListType.NONE)
	@URL
	public String getAttachmentUrl() {
		return this.attachmentUrl;
	}
	public void setAttachmentUrl(final String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

}
