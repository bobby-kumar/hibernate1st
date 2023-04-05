package Connection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Student_details")
public class StudentDetails {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	   private int std_id;
	  @Column(name="student_id",length=50 )
         private String std_name;
	  @Column(name="contact",length=10)
         private String contact;
         
         
         
}
