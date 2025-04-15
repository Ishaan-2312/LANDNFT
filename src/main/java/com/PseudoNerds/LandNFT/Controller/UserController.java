package com.PseudoNerds.LandNFT.Controller;

import com.PseudoNerds.LandNFT.Entity.LandDetails;
import com.PseudoNerds.LandNFT.Entity.User;
import com.PseudoNerds.LandNFT.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        userService.registerUser(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getUserById")
    public ResponseEntity<Optional<User>> getUserById(@RequestParam Long id){
        Optional<User> user=userService.getUserById(id);
        if(!user.isEmpty()){
            return ResponseEntity.ok(user);
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }

    @GetMapping("/getLandDetailsById")
    public ResponseEntity<Set<Optional<LandDetails>>> getLandDetailsById(@RequestParam Long id)throws Exception{
        Set<Optional<LandDetails>> st=userService.getLandDetailsById(id);
        if(st.size()>0) {
            return ResponseEntity.ok(userService.getLandDetailsById(id));
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam Long id){
         userService.deleteUser(id);
         return ResponseEntity.ok("Deleted User");

    }


}
