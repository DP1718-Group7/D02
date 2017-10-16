
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Story {

	private String	title;
	private String	pieceOfText;
	private String	attachmentUrl;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getPieceOfText() {
		return this.pieceOfText;
	}
	public void setPieceOfText(final String pieceOfText) {
		this.pieceOfText = pieceOfText;
	}
	@URL
	public String getAttachmentUrl() {
		return this.attachmentUrl;
	}
	public void setAttachmentUrl(final String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

}
