package org.example.kp1.link;

import org.example.kp1.link.ShortLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortLinkRepository extends JpaRepository<ShortLink, Long> {
}
