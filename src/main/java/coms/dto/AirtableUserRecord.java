package coms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

//TODO: Crear simil para la clase ProjectDTO (AirtableProjectRecord)
//TODO: Revisar que no coincide con los atributos de UserDTO

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirtableUserRecord {

    @JsonProperty("Nombre")
    private String name;

    @JsonProperty("Apellido")
    private String lastName;

    @JsonProperty("Correo Moby")
    private String correoMoby;

    @JsonProperty("Provincia")
    private String province;

    @JsonProperty("Localidad")
    private String locality;

    @JsonProperty("Tecnologia Actual")
    private String currentTech;

    // Es un solo referente, pero airtable lo muestra como una lista con un solo elemento (una garcha)
    @JsonProperty("Referente")
    private List<String> referent;

    @JsonProperty("Talent Partner")
    private List<String> talentPartner;

    @JsonProperty("Proyectos")
    private List<String> projects;

    @JsonProperty("Firma URL")
    private String signatureURL;

    @JsonProperty("Es Referente?")
    private Boolean isReferent;

    @JsonProperty("Es Talent Partner?")
    private Boolean isTalentPartner;

    @JsonProperty("Fecha de Alta")
    private String entryDate;

    @JsonProperty("Foto de Perfil URL")
    private String profilePicture;

    @JsonProperty("Direccion")
    private String address;

    @JsonProperty("Observaciones")
    private String observation;

    @JsonProperty("Tecnologia")
    private List<String> technology;

    @JsonProperty("Historial de Tecnologias")
    private List<String> techHistory;

}
