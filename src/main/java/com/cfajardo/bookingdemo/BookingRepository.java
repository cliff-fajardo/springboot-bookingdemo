package com.cfajardo.bookingdemo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {

    /*
        implementation done by Spring via convention
        see: Sec. 3.4 - https://docs.spring.io/spring-data/jpa/docs/1.9.6.RELEASE/reference/html/
     */
    List<HotelBooking> findByPricePerNightLessThan(double price);

}
