package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
    private String room_type_id;
    private String room_type;
    private String key_money;
    private String qty;
}
