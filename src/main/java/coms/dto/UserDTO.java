package coms.dto;


import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private String airtable_id;

    private String name;
    private String lastName;

    private String email;
    private String profilePicture;

    private String province;
    private String locality;

    private String currentTech;
    private UserReferenceDTO referent; //nullable
    private UserReferenceDTO talentPartner; //nullable

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateEntered;
    private String signatureUrl;

    private String address;
    private String observation;

    // Projects related
    private List<String> projects;
}
