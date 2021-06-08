package com.yt.local.resposity;

import com.yt.local.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface IndexResposity extends JpaRepository<UserEntity, Long> {
        @Transactional
        @Modifying
        @Query(value = "delete from user where 1=1",nativeQuery =true)
        void deleteData();
}
