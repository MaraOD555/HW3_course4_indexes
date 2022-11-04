package ru.hogwarts.school.HW3_course4_indexes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.HW3_course4_indexes.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> { //расширяет PagingAndSortingRepository
     Optional<Avatar> findAvatarByStudentId (long studentId);
}
