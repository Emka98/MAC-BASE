package com.devtiro.mac_base.Repository;

import com.devtiro.mac_base.Model.MacAddress;
import com.devtiro.mac_base.Model.Range;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MacAddressRepository extends JpaRepository<MacAddress,Integer> {
    @Query("SELECT mac FROM MacAddress mac WHERE mac.returned = true AND mac.idOwner = :range")
    Optional<MacAddress> findAllReturnedByRange(@Param("range") Range range);


}
