package com.example.ProfileCrud.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProfileCrud.Model.Profile;
import com.example.ProfileCrud.Repository.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> listAll() {
        return profileRepository.findAll();
    }

    public void saveProfile(Profile profile) {
        profileRepository.save(profile);
    }

    public Profile getProfile(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}