package 自定义协议;

import lombok.Data;

import static 自定义协议.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {
    //定义用户信息
    private Integer userId;
    private String username;
    private String password;
    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
