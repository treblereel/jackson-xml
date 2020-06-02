package org.treblereel.gwt.jackson.client.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 4/6/20
 */
public class ItemDefinition {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String structureRef;

    public String getStructureRef() {
        return structureRef;
    }

    public void setStructureRef(String structureRef) {
        this.structureRef = structureRef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ItemDefinition)) {
            return false;
        }
        ItemDefinition that = (ItemDefinition) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getStructureRef(), that.getStructureRef());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStructureRef());
    }

    @Override
    public String toString() {
        return "ItemDefinition{" +
                "id='" + id + '\'' +
                ", structureRef='" + structureRef + '\'' +
                '}';
    }
}