package com.examly.springapp.controller;
import com.examly.springapp.model.Addon;
import com.examly.springapp.service.AddonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Configuration
@RestController
@RequestMapping("/admin")
public class AddonController {
    @Autowired
    private AddonService addonService;

    @PostMapping("/saveaddon")
    public Addon saveAddon(@RequestBody Addon addon){
        return  addonService.saveAddon(addon);
    }

    @GetMapping("/viewaddon")
    public List<Addon> viewAddon(){
       return addonService.viewAddon();
    }
    @GetMapping("/viewaddon/{id}")
    public Addon viewAddonById(@PathVariable (value = "id")int id){
        return addonService.viewAddonById(id);
    }

    @DeleteMapping("/deleteaddon/{id}")
    public void deleteAddonById(@PathVariable (value = "id")int id){
        addonService.deleteAddon(id);
    }

    @PutMapping("/editaddon/{id}")
    public Addon editAddon(@PathVariable Integer id,@RequestBody Addon addon){
        return addonService.editAddon(addon);
    }
}
