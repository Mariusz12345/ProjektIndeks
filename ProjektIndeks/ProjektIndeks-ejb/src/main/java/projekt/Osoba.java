package projekt;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "student")
@Table(name = "osoba",schema="indeks")
public class Osoba {

	
	@Id
	@SequenceGenerator(name = "id_studenta_seq", sequenceName = "indeks.id_studenta_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_studenta_seq")
	private Long id_studenta;
	
	@Column(name = "imie")
	private String imie;
	@Column(name = "nazwisko")
	private String nazwisko;
	public Long getId_studenta() {
		return id_studenta;
	}
	public void setId_studenta(Long id_studenta) {
		this.id_studenta = id_studenta;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	
	
	
	
}
