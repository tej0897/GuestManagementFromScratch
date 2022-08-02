
package com.VivekGuestManagement.GuestManagement.controller;


import com.VivekGuestManagement.GuestManagement.Exceptions.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {

    private GuestDaoService controller = new GuestDaoService();

    @GetMapping("/guests")
    public List<Guest> getGuestList(){

        return controller.getGuests();
    }

    @GetMapping("/guests/{id}")
    public Guest getGuest(@PathVariable int id){
        Guest guest = controller.getGuestByID(id);

        if (guest == null) {
            throw new UserNotFoundException("ID: " + id);
        }
        return guest;
    }
}
