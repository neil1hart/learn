package org.petclinic.person;

import org.springframework.util.ObjectUtils;

public class PersonName {
    private final String first;
    private final String last;

    public PersonName(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof PersonName)) return false;

        PersonName that = (PersonName) o;

        return ObjectUtils.nullSafeEquals(getFirst(), that.getFirst()) &&
                ObjectUtils.nullSafeEquals(getLast(), that.getLast());
    }

    @Override
    public int hashCode() {
        return ObjectUtils.nullSafeHashCode(getFirst()) * 23
                + ObjectUtils.nullSafeHashCode(getLast());
    }
}
