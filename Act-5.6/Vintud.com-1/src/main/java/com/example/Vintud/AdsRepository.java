package com.example.Vintud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdsRepository extends JpaRepository<AnnouncementImpl, Long> {

}
