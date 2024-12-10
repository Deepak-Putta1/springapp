package com.examly.springapp.service;
import com.examly.springapp.model.Addon;
import com.examly.springapp.repository.AddonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddonService {
    @Autowired
    private AddonRepository addonRepository;

    public Addon saveAddon(Addon addon){
       return addonRepository.save(addon);
    }
    public List<Addon> viewAddon(){
       return addonRepository.findAll();
    }
    public void deleteAddon(Integer id){
        addonRepository.deleteById(id);
    }
    public Addon editAddon(Addon edit){
        Integer id=edit.getAddonId();
        Addon add=addonRepository.findById(id).get();
        add.setAddOnsName(edit.getAddOnsName());
        add.setAddOnsPrice(edit.getAddOnsPrice());
        add.setAddOnsImageurl(edit.getAddOnsImageurl());
        return addonRepository.save(add);


    }
    public Addon viewAddonById(Integer id){
        return addonRepository.findById(id).get();
    }
}
