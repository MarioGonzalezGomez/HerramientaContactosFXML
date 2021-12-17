package mggcode.personasfxml.mapper;

import mggcode.personasfxml.dao.Persona;
import mggcode.personasfxml.dto.PersonaProperty;

public class PersonaMapper {
    public Persona toDao(PersonaProperty personaObservable) {
        Persona persona = new Persona();
        persona.setNombre(personaObservable.getNombre());
        persona.setApellido1(personaObservable.getApellido1());
        persona.setApellido2(personaObservable.getApellido2());
        persona.setCorreo(personaObservable.getCorreo());
        persona.setDireccion(personaObservable.getDireccion());
        persona.setEmpresa(personaObservable.getEmpresa());

        return persona;
    }

    public void toDto(Persona persona) {
        PersonaProperty personaObservavle = new PersonaProperty();
        personaObservavle.setNombre(persona.getNombre());
        personaObservavle.setApellido1(persona.getApellido1());
        personaObservavle.setApellido2(persona.getApellido2());
        personaObservavle.setCorreo(persona.getCorreo());
        personaObservavle.setDireccion(persona.getDireccion());
        personaObservavle.setEmpresa(persona.getEmpresa());
    }
}
