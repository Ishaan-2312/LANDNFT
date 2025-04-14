package com.PseudoNerds.LandNFT.Service;


import com.PseudoNerds.LandNFT.Entity.LandDetails;
import com.PseudoNerds.LandNFT.Repository.LandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LandDetailsService {
    @Autowired
    private LandRepository landRepository;

    public Optional<LandDetails> getLandDetailsByPropertyId(String propertyId) throws Exception{
        Optional<LandDetails> landDetails=landRepository.findByPropertyId(propertyId);
//        if(landDetails.isEmpty()){
//            throw new Exception("Property is Not yet Registered Or PropertyId is wrong!");
//        }
        return  landDetails;
    }
}
