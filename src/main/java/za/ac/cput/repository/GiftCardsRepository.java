package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.GiftCards;

public interface GiftCardsRepository extends JpaRepository<GiftCards, String> {
}
