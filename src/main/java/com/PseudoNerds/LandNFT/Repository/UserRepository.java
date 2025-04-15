package com.PseudoNerds.LandNFT.Repository;

import com.PseudoNerds.LandNFT.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> getUserByownerWalletAddress(String ownerWalletAddress);

}
