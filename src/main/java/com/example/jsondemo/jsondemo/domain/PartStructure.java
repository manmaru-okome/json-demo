package com.example.jsondemo.jsondemo.domain;

import lombok.Data;

@Data
public class PartStructure {
    private Integer id;
    private Integer parentId;
    private Integer childId;
    private Integer numberOfMembers;
}
