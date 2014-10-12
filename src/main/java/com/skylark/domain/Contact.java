package com.skylark.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by rmhedge on 10/10/14.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {

    private String firstName;
    private String lastName;
    private String middleName;
    private List<PhoneNumber> phoneNumberList;
    private List<Email> emailAddressList;
    private List<PhysicalAddress> physicalAddressList;

    public List<PhysicalAddress> getPhysicalAddressList() {
        return physicalAddressList;
    }

    public void setPhysicalAddressList(List<PhysicalAddress> physicalAddressList) {
        this.physicalAddressList = physicalAddressList;
    }

    public List<Email> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<Email> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<PhoneNumber> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





}
