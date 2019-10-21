package com.opslab.bean;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@XmlRootElement(name = "record")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItvSysFamilyList {

    @XmlElement(name = "family_member")
    private List<ItvSysFamily> familyList;

    public List<ItvSysFamily> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<ItvSysFamily> familyList) {
        this.familyList = familyList;
    }
}
