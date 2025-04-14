package com.PseudoNerds.LandNFT.Repository;

import com.PseudoNerds.LandNFT.Entity.LandDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LandRepository extends JpaRepository<LandDetails,Long> {
    Optional<LandDetails> findByPropertyId(String propertyId);

}
