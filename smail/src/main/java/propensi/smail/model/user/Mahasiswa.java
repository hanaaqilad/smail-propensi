package propensi.smail.model.user;

import lombok.*;
import lombok.experimental.SuperBuilder;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "mahasiswa")

public class Mahasiswa extends Pengguna {

    @Column(name = "jurusan")
    private String jurusan;

    @Column(name = "semester")
    private String semester;

    @Column(name = "ipk")
    private float ipk;
    
}
