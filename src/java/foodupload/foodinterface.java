package foodupload;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandeep
 */
import java.util.List;
import profiles.Profiles;

/**
 *
 * @author hp1
 */
public interface foodinterface{
    
    public void insert(foodgettersetter cgs);
        List  getcar_info();
        void delete(int pid);
        void update(foodgettersetter p);
foodgettersetter getcargettersetter(int p);
}
