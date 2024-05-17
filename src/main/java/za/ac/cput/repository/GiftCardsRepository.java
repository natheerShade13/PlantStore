package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.GiftCards;

@Repository
public interface GiftCardsRepository extends JpaRepository<GiftCards, Long> {
}
