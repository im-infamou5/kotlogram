package com.github.badoualy.telegram.tl.core;

import com.github.badoualy.telegram.tl.StreamUtils;
import com.github.badoualy.telegram.tl.TLContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Basic class of gzipped object
 *
 * @author Korshakov Stepan <me@ex3ndr.com>
 */
public class TLGzipObject extends TLObject {
    public static final int CLASS_ID = 0x3072CFA1;

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    public TLGzipObject(byte[] packedData) {
        this.packedData = packedData;
    }

    public TLGzipObject() {

    }

    private byte[] packedData;

    public byte[] getPackedData() {
        return packedData;
    }

    public void setPackedData(byte[] packedData) {
        this.packedData = packedData;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        StreamUtils.writeTLBytes(packedData, stream);
    }

    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        packedData = StreamUtils.readTLBytes(stream);
    }

    @Override
    public String toString() {
        return "gzip_packed#3072cfa1";
    }
}
