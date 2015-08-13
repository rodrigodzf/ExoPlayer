package com.google.android.exoplayer.upstream;

import android.util.Log;

import com.google.android.exoplayer.C;
import com.google.android.exoplayer.util.Util;

import java.io.EOFException;
import java.io.InputStream;
import java.net.*;
import java.io.IOException;

/**
 * Created by rodrigodiaz on 8/11/15.
 */
public class TcpDataSource implements UriDataSource{

    /**
     * The default maximum datagram packet size, in bytes.
     */
    public static final int DEFAULT_MAX_PACKET_SIZE = 2000;


    private DataSpec dataSpec;
//    private DatagramSocket socket;
    private Socket socket;
    private MulticastSocket multicastSocket;
    private InetAddress address;
    private InetSocketAddress socketAddress;
    private boolean opened;
    private InputStream inputStream;
    private byte[] packetBuffer;
    private int packetRemaining;

    private long bytesToSkip;
    private long bytesToRead;

    private long bytesSkipped;
    private long bytesRead;

    @Override
    public String getUri()  {
        return socket == null ? null : socket.getInetAddress().toString();
    }

    @Override
    public long open(DataSpec dataSpec) throws IOException {
        this.dataSpec = dataSpec;
        String uri = dataSpec.uri.toString();
//        String host = uri.substring(0, uri.indexOf(':'));
//        int port = Integer.parseInt(uri.substring(uri.indexOf(':') + 1));

        try {

            socket = new Socket("192.168.178.45", 8000);
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("TCP", "Can't open socket");

        }
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            closeConnection();
        }
        return C.LENGTH_UNBOUNDED;
    }

    @Override
    public void close() throws IOException {
        try {
            if (inputStream != null) {
//                Util.maybeTerminateInputStream(socket, bytesRemaining());
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            inputStream = null;
            closeConnection();
            if (opened) {
                opened = false;
            }
        }
    }

    @Override
    public int read(byte[] buffer, int offset, int readLength) throws IOException {
//        readLength = bytesToRead == C.LENGTH_UNBOUNDED ? readLength
//                : (int) Math.min(readLength, bytesToRead - bytesRead);
//        if (readLength == 0) {
//            // We've read all of the requested data.
//            return C.RESULT_END_OF_INPUT;
//        }

        inputStream = socket.getInputStream();
        int read = inputStream.read(buffer, offset, readLength);
        if (read == -1) {
            if (bytesToRead != C.LENGTH_UNBOUNDED && bytesToRead != bytesRead) {
                // The server closed the connection having not sent sufficient data.
                throw new EOFException();
            }
            return C.RESULT_END_OF_INPUT;
        }

        bytesRead += read;

        return read;
    }
    /**
     * Closes the current connection, if there is one.
     */
    private void closeConnection() {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            socket = null;
        }
    }
    /**
     * Returns the number of bytes that are still to be read for the current {@link DataSpec}.
     * <p>
     * If the total length of the data being read is known, then this length minus {@code bytesRead()}
     * is returned. If the total length is unknown, {@link C#LENGTH_UNBOUNDED} is returned.
     *
     * @return The remaining length, or {@link C#LENGTH_UNBOUNDED}.
     */
    protected final long bytesRemaining() {
        return bytesToRead == C.LENGTH_UNBOUNDED ? bytesToRead : bytesToRead - bytesRead;
    }

}
