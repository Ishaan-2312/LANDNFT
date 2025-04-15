package com.PseudoNerds.LandNFT.Controller;

import com.PseudoNerds.LandNFT.Dto.LoginRequest;
import com.PseudoNerds.LandNFT.Util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LoginController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest authRequest)throws Exception{
        String username= authRequest.getUsername();
        String password= authRequest.getPassword();
        String token= jwtUtil.generateToken(username,password);
        if(jwtUtil.isTokenValid(token))return token;
        else throw new Exception("Token Invalid");

    }

}
