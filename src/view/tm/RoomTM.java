package view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class RoomTM {
        private String room_type_id;
        private String room_type;
        private String key_money;
        private String qty;
}
