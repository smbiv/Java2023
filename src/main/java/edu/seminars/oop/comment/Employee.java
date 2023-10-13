package edu.seminars.oop.comment;

public record Employee(
    String fullName,
    int ageInYears,
    String position,
    String organizationId
) { }
