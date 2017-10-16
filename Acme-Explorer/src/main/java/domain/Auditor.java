
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Auditor extends Actor {

	private Collection<Note>	note;
	private Collection<Audit>	audit;


	public Auditor() {
		super();
	}

	public Collection<Note> getNote() {
		return this.note;
	}
	public void setNote(final Collection<Note> note) {
		this.note = note;
	}
	public Collection<Audit> getAudit() {
		return this.audit;
	}
	public void setAudit(final Collection<Audit> audit) {
		this.audit = audit;
	}

}
