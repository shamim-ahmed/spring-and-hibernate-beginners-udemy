package edu.buet.cse.section23.project2.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Instructor_detail")
public class InstructorDetail {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "youtube_channel")
  private String youtubeChannel;

  @Column(name = "hobby")
  private String hobby;

  @OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
  private Instructor instructor;

  public InstructorDetail() {}

  public InstructorDetail(String youtubeChannel, String hobby) {
    this.youtubeChannel = youtubeChannel;
    this.hobby = hobby;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getYoutubeChannel() {
    return youtubeChannel;
  }

  public void setYoutubeChannel(String youtubeChannel) {
    this.youtubeChannel = youtubeChannel;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public Instructor getInstructor() {
    return instructor;
  }

  public void setInstructor(Instructor instructor) {
    this.instructor = instructor;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[").append("id = ").append(id).append(", youtubeChannel = ")
        .append(youtubeChannel).append(", hobby = ").append(hobby).append("]");

    return builder.toString();
  }
}
