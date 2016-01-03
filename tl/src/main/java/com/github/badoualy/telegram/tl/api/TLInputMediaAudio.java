
package com.github.badoualy.telegram.tl.api;


import com.github.badoualy.telegram.tl.core.*;
import com.github.badoualy.telegram.tl.*;
import java.io.*;
import rx.Observable;

import static com.github.badoualy.telegram.tl.StreamUtils.*;



public class TLInputMediaAudio extends TLAbsInputMedia {
    public static final int CLASS_ID = 0x89938781;

    public TLInputMediaAudio() {

    }


    public TLInputMediaAudio(        com.github.badoualy.telegram.tl.api.TLAbsInputAudio _id) {
        this.id = _id;

    }


    public int getClassId() {
        return CLASS_ID;
    }


    protected com.github.badoualy.telegram.tl.api.TLAbsInputAudio id;


    public com.github.badoualy.telegram.tl.api.TLAbsInputAudio getId() {
        return id;
    }

    public void setId(com.github.badoualy.telegram.tl.api.TLAbsInputAudio value) {
        this.id = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeTLObject(this.id, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.id = (com.github.badoualy.telegram.tl.api.TLAbsInputAudio)readTLObject(stream, context);
    }



    @Override
    public String toString() {
        return "inputMediaAudio#89938781";
    }

}
