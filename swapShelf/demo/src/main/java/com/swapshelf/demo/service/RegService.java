package com.swapshelf.demo.service;



@Service
public class RegService {
    public boolean register(String username,String password){
        if(repo.findByUserUsername(username)!=null){
            return false;
        }
        login newuser=new login(String username,String password);
        repo.save(newuser);
        return true;
    }

}
