package ru.english.registration_for_courses.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

//@Getter
//@Setter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//public class ClubTagId implements Serializable {
//
//    private UUID clubId;
//    private UUID tagId;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ClubTagId that = (ClubTagId) o;
//        return clubId.equals(that.clubId) && tagId.equals(that.tagId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(clubId, tagId);
//    }
//}
