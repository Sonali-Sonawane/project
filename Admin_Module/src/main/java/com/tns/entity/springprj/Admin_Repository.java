package com.tns.entity.springprj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Admin_Repository extends JpaRepository <Admin, Integer>
{

}
