package projekt;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
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
@DiscriminatorColumn(name = "zaliczenieRoku", discriminatorType = DiscriminatorType.STRING)
@Table(name = "ocena", schema = "indeks")
public class Ocena {

	@Id
	@SequenceGenerator(name = "id_zaliczenia_seq", sequenceName = "indeks.id_zaliczenia_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_zaliczenia_seq")
	private Long id_zaliczenia;
	
	@Column(name = "wpisDoIndeksu")
	private String wpisDoIndeksu;

	

}
