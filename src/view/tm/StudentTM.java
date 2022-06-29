package view.tm;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentTM {
    private String student_id;
    private String name;
    private String address;
    private String contract_no ;
    private String dob;
    private String gender;
    private Button btn;
}
