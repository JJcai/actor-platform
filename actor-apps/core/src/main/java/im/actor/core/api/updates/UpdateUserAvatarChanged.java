package im.actor.core.api.updates;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.*;

public class UpdateUserAvatarChanged extends Update {

    public static final int HEADER = 0x10;
    public static UpdateUserAvatarChanged fromBytes(byte[] data) throws IOException {
        return Bser.parse(new UpdateUserAvatarChanged(), data);
    }

    private int uid;
    private ApiAvatar avatar;

    public UpdateUserAvatarChanged(int uid, @Nullable ApiAvatar avatar) {
        this.uid = uid;
        this.avatar = avatar;
    }

    public UpdateUserAvatarChanged() {

    }

    public int getUid() {
        return this.uid;
    }

    @Nullable
    public ApiAvatar getAvatar() {
        return this.avatar;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.uid = values.getInt(1);
        this.avatar = values.optObj(2, new ApiAvatar());
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.uid);
        if (this.avatar != null) {
            writer.writeObject(2, this.avatar);
        }
    }

    @Override
    public String toString() {
        String res = "update UserAvatarChanged{";
        res += "uid=" + this.uid;
        res += ", avatar=" + (this.avatar != null ? "set":"empty");
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
