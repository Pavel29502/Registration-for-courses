package ru.english.registration_for_courses.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "club_tag")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClubTag {

    @EmbeddedId
    private ClubTagId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id", referencedColumnName = "id")
    private Club club;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", referencedColumnName = "id")
    private Tag tag;
}


