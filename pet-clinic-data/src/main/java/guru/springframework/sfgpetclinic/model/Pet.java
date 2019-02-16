package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private PetType petType;
    private Owner owner;
    private LocalDate brithDate;


    public Pet(PetType petType, Owner owner, LocalDate brithDate) {
        this.petType = petType;
        this.owner = owner;
        this.brithDate = brithDate;
    }


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(LocalDate brithDate) {
        this.brithDate = brithDate;
    }
}
