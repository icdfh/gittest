package bookforpeople.demo.repository;

import bookforpeople.demo.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
