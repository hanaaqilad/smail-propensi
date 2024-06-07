package propensi.smail.model.user;

import lombok.*;
import lombok.experimental.SuperBuilder;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "dosen")

public class Dosen extends Pengguna {


}
