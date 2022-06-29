package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "student")
public class Student {
    @Id
    private String student_id;
    private String name;
    private String address;
    private String contract_no;
    private String dob;
    private String gender;
}
