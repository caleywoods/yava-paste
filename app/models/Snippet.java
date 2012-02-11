package models;

import java.util.*;
import javax.persistence.*;

// Import plays JPA Api over Hibernate
import play.db.jpa.*;

// This marks Snippet as a managed JPA entity
// This also automatically provides a full set of
// JPA helpers
@Entity
public class Snippet extends Model {

  @Lob // This tells JPA to use a large text database type
  public String content;
  public String language;
  public boolean keep;
  public Date createdAt;
  public Date updatedAt;

  public Snippet(String content, String language, boolean keep) {
    this.content   = content;
    this.language  = language;
    this.keep      = keep;
    this.createdAt = new Date();
    this.updatedAt = new Date();
  }


}
