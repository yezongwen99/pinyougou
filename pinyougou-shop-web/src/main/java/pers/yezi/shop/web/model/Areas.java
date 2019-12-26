package pers.yezi.shop.web.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Areas implements Serializable {
    private static final long serialVersionUID = 4338092941111931030L;

    private Integer id;

    private String areaid;

    private String area;

    private String cityid;
}
