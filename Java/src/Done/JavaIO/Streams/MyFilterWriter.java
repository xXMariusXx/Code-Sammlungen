package Done.JavaIO.Streams;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFilterWriter extends FilterWriter {

    protected MyFilterWriter(Writer writer)
    {
        super(writer);
    }

    @Override
    public void write(int c) throws IOException {
        super.write(Character.toUpperCase(c));
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = off; i < len ; i++) {
            cbuf[i] = Character.toUpperCase(cbuf[i]);
        }
        super.write(cbuf, off, len);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        this.write(str.toCharArray(),off,len);
    }
}
