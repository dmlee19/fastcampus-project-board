package com.fastcampus.projectboard.repository;

import com.fastcampus.projectboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
