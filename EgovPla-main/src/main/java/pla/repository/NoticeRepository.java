package pla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pla.entity.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
