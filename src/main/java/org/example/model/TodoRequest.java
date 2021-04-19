package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// Entity는 아니기 때문에 Entity 어노테이션은 안붙여준다.
public class TodoRequest {
    private String title;
    private Long order;
    private Boolean completed;
}
