package com.eduardojr.bootcampclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardojr.bootcampclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
