package bookforpeople.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "post_likes")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private OurUsers user;
}
