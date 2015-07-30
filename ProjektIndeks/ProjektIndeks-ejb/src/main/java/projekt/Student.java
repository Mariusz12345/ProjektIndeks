package projekt;

import javax.persistence.Column;

import javax.persistence.Entity;



@Entity
public class Student extends Osoba {
	
	
	@Column(name = "nrAlbumu")
	private Long nrAlbumu;

	public Long getNrAlbumu() {
		return nrAlbumu;
	}

	public void setNrAlbumu(Long nrAlbumu) {
		this.nrAlbumu = nrAlbumu;
	}

	public Student(Long id_studenta, String imie, String nazwisko, Long nrAlbumu) {
		super(id_studenta, imie, nazwisko);
		this.nrAlbumu = nrAlbumu;
	}
	
	
	
	

}
