package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.samples.petclinic.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class ProductType extends BaseEntity {
    @NotNull
    @Column(unique = true)
    @Size(min=3,max=50)
    String name;
}
