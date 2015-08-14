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

public class UpdateGroupUserInvited extends Update {

    public static final int HEADER = 0x15;
    public static UpdateGroupUserInvited fromBytes(byte[] data) throws IOException {
        return Bser.parse(new UpdateGroupUserInvited(), data);
    }

    private int groupId;
    private long rid;
    private int uid;
    private int inviterUid;
    private long date;

    public UpdateGroupUserInvited(int groupId, long rid, int uid, int inviterUid, long date) {
        this.groupId = groupId;
        this.rid = rid;
        this.uid = uid;
        this.inviterUid = inviterUid;
        this.date = date;
    }

    public UpdateGroupUserInvited() {

    }

    public int getGroupId() {
        return this.groupId;
    }

    public long getRid() {
        return this.rid;
    }

    public int getUid() {
        return this.uid;
    }

    public int getInviterUid() {
        return this.inviterUid;
    }

    public long getDate() {
        return this.date;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.groupId = values.getInt(1);
        this.rid = values.getLong(5);
        this.uid = values.getInt(2);
        this.inviterUid = values.getInt(3);
        this.date = values.getLong(4);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.groupId);
        writer.writeLong(5, this.rid);
        writer.writeInt(2, this.uid);
        writer.writeInt(3, this.inviterUid);
        writer.writeLong(4, this.date);
    }

    @Override
    public String toString() {
        String res = "update GroupUserInvited{";
        res += "groupId=" + this.groupId;
        res += ", rid=" + this.rid;
        res += ", uid=" + this.uid;
        res += ", inviterUid=" + this.inviterUid;
        res += ", date=" + this.date;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
