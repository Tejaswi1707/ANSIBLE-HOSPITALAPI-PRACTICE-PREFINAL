package com.klef.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.springboot.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>
{
}
