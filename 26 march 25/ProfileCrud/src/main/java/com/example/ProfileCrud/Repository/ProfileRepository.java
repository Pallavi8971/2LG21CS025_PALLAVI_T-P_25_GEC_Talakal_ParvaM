package com.example.ProfileCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.example.ProfileCrud.Model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>  {

    @SuppressWarnings("unchecked")
    Profile save(Profile pro);
}