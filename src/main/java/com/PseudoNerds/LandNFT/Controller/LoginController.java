package com.PseudoNerds.LandNFT.Controller;

import com.PseudoNerds.LandNFT.Dto.LoginRequest;
import com.PseudoNerds.LandNFT.Util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class LoginController {

    @Autowired
    private JwtUtil jwtUtil;
    Logger log=LoggerFactory.getLogger(LoginController.class);

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest authRequest)throws Exception{
        String username= authRequest.getUsername();
        String password= authRequest.getPassword();
        String token= jwtUtil.generateToken(username,password);
//        log.info(token);
        if(jwtUtil.isTokenValid(token))return token;
        else throw new Exception("Token Invalid");

    }

}
