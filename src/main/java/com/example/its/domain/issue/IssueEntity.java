package com.example.its.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Constructor;

@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String summary;
    private String description;

}
