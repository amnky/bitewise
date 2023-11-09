package com.example.assignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Uploads")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Uploads {
    @Id
    private ObjectId id;
    private String name;
    private String brand;
    private String serving_size;
    private String serving_unit;
    private String score;
}
