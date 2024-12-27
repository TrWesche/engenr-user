package com.twesche.entity;


import com.twesche.annotation.EGRField;
import com.twesche.annotation.EGRType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@EGRType
//@Immutable
public class TestEntitySource1 {
    @Id
    @GeneratedValue
    @EGRField
    public Long id;

    @EGRField
    public String value1;

    @EGRField
    public String value2;

    public Integer value3;

//    @EGRMethod
    public boolean someMethod()
    {
        return true;
    }
}
