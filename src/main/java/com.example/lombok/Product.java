package com.example.lombok;

import lombok.*;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Setter
@Getter
@RequiredArgsConstructor(staticName = "of")
public class Product {
    private int weight;
   @NonNull
   private String description;
}
