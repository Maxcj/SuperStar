package cn.maxcj.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors
public class UserInfo {
    private Integer infoID;
    private String name;
    private String tel;
    private String address;

    private String db_source;


}
