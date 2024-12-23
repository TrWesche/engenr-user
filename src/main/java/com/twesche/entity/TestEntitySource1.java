package com.twesche.entity;


import com.twesche.annotation.EGRColumn;
import com.twesche.annotation.EGREntity;
import com.twesche.annotation.EGRMethod;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@EGREntity
//@Immutable
public class TestEntitySource1 {
    @Id
    @GeneratedValue
    @EGRColumn
    public Long id;

    @EGRColumn(canWriteValue = true)
    public String value1;

    @EGRColumn(canWriteValue = true)
    public String value2;

    public Integer value3;

    @EGRMethod
    public boolean someMethod()
    {
        return true;
    }
}
