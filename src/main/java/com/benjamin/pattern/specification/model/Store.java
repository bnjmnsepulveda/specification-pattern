package com.benjamin.pattern.specification.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
@AllArgsConstructor
public class Store {
    private Integer id;
    private String name;
}
