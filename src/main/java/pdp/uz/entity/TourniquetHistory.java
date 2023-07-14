package pdp.uz.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TourniquetHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private TourniquetCard tourniquetCard;

    private Timestamp enteredAt;

    private Timestamp exitedAt;
}
