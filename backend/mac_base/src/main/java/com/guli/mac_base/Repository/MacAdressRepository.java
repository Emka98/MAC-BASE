package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.MacAdress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MacAdressRepository extends JpaRepository<MacAdress, Integer> {

}