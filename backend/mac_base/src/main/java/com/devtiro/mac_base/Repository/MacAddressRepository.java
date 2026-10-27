package com.devtiro.mac_base.Repository;

import com.devtiro.mac_base.Model.MacAddress;
import com.devtiro.mac_base.Model.RangeMac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface MacAddressRepository extends JpaRepository<MacAddress,Integer> {
    @Query("SELECT mac FROM MacAddress mac WHERE mac.idOwner = :range ORDER BY mac.returned DESC")
    List<MacAddress> findHighestByRange(@Param("range") RangeMac range);



}
