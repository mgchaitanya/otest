package run;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyItem {
	/** Primary key */
	private Integer id;

	/**
	 * @return database-generated primary key
	 */
	@Id @GeneratedValue
	public Integer getId() {
		return id;
	}
	protected void setId(Integer id) {
		this.id = id;
	}
	
}
