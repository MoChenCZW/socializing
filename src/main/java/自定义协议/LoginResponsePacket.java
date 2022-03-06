package 自定义协议;

import lombok.Data;

import static 自定义协议.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {
    //是否登录成功
    private boolean success;
    //如果失败，返回的信息
    private String reason;
    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
