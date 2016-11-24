package com.dream.representation.music;

import com.dream.representation.common.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Track extends BaseObject implements Serializable {
    private Long id;
    private String name;
    private boolean release;
}
