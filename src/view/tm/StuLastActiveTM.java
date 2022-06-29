package view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class StuLastActiveTM {
    private int ColNo;
    private String Student_RegN0;
    private String LastAct ;

}

