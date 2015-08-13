package paulscode.android.sound;

public class ALAN  // "OpenAL for Android".  Better than you'd get from "Android OpenAL", right?
{
    public static void initALAN(){

        System.loadLibrary("al-android");
        System.loadLibrary("ogg-decoder");

    }
    /**********************
     *  Enumerant values  *  These must match the definitions in al.h, alc.h, alext.h, and efx.h.
     **********************/
    public static final int AL_NONE                                 = 0;
    public static final int AL_FALSE                                = 0;
    public static final int AL_TRUE                                 = 1;
    public static final int AL_SOURCE_RELATIVE                      = 0x202;
    public static final int AL_CONE_INNER_ANGLE                     = 0x1001;
    public static final int AL_CONE_OUTER_ANGLE                     = 0x1002;
    public static final int AL_PITCH                                = 0x1003;
    public static final int AL_POSITION                             = 0x1004;
    public static final int AL_DIRECTION                            = 0x1005;
    public static final int AL_VELOCITY                             = 0x1006;
    public static final int AL_LOOPING                              = 0x1007;
    public static final int AL_BUFFER                               = 0x1009;
    public static final int AL_GAIN                                 = 0x100A;
    public static final int AL_MIN_GAIN                             = 0x100D;
    public static final int AL_MAX_GAIN                             = 0x100E;
    public static final int AL_ORIENTATION                          = 0x100F;
    public static final int AL_SOURCE_STATE                         = 0x1010;
    public static final int AL_INITIAL                              = 0x1011;
    public static final int AL_PLAYING                              = 0x1012;
    public static final int AL_PAUSED                               = 0x1013;
    public static final int AL_STOPPED                              = 0x1014;
    public static final int AL_BUFFERS_QUEUED                       = 0x1015;
    public static final int AL_BUFFERS_PROCESSED                    = 0x1016;
    public static final int AL_SEC_OFFSET                           = 0x1024;
    public static final int AL_SAMPLE_OFFSET                        = 0x1025;
    public static final int AL_BYTE_OFFSET                          = 0x1026;
    public static final int AL_SOURCE_TYPE                          = 0x1027;
    public static final int AL_STATIC                               = 0x1028;
    public static final int AL_STREAMING                            = 0x1029;
    public static final int AL_UNDETERMINED                         = 0x1030;
    public static final int AL_FORMAT_MONO8                         = 0x1100;
    public static final int AL_FORMAT_MONO16                        = 0x1101;
    public static final int AL_FORMAT_STEREO8                       = 0x1102;
    public static final int AL_FORMAT_STEREO16                      = 0x1103;
    public static final int AL_REFERENCE_DISTANCE                   = 0x1020;
    public static final int AL_ROLLOFF_FACTOR                       = 0x1021;
    public static final int AL_CONE_OUTER_GAIN                      = 0x1022;
    public static final int AL_MAX_DISTANCE                         = 0x1023;
    public static final int AL_FREQUENCY                            = 0x2001;
    public static final int AL_BITS                                 = 0x2002;
    public static final int AL_CHANNELS                             = 0x2003;
    public static final int AL_SIZE                                 = 0x2004;
    public static final int AL_UNUSED                               = 0x2010;
    public static final int AL_PENDING                              = 0x2011;
    public static final int AL_PROCESSED                            = 0x2012;
    public static final int AL_NO_ERROR                             = AL_FALSE;
    public static final int AL_INVALID_NAME                         = 0xA001;
    public static final int AL_INVALID_ENUM                         = 0xA002;
    public static final int AL_INVALID_VALUE                        = 0xA003;
    public static final int AL_INVALID_OPERATION                    = 0xA004;
    public static final int AL_OUT_OF_MEMORY                        = 0xA005;
    public static final int AL_VENDOR                               = 0xB001;
    public static final int AL_VERSION                              = 0xB002;
    public static final int AL_RENDERER                             = 0xB003;
    public static final int AL_EXTENSIONS                           = 0xB004;
    public static final int AL_DOPPLER_FACTOR                       = 0xC000;
    public static final int AL_DOPPLER_VELOCITY                     = 0xC001;
    public static final int AL_SPEED_OF_SOUND                       = 0xC003;
    public static final int AL_DISTANCE_MODEL                       = 0xD000;
    public static final int AL_INVERSE_DISTANCE                     = 0xD001;
    public static final int AL_INVERSE_DISTANCE_CLAMPED             = 0xD002;
    public static final int AL_LINEAR_DISTANCE                      = 0xD003;
    public static final int AL_LINEAR_DISTANCE_CLAMPED              = 0xD004;
    public static final int AL_EXPONENT_DISTANCE                    = 0xD005;
    public static final int AL_EXPONENT_DISTANCE_CLAMPED            = 0xD006;
    public static final int ALC_FALSE                               = 0;
    public static final int ALC_TRUE                                = 1;
    public static final int ALC_FREQUENCY                           = 0x1007;
    public static final int ALC_REFRESH                             = 0x1008;
    public static final int ALC_SYNC                                = 0x1009;
    public static final int ALC_MONO_SOURCES                        = 0x1010;
    public static final int ALC_STEREO_SOURCES                      = 0x1011;
    public static final int ALC_NO_ERROR                            = ALC_FALSE;
    public static final int ALC_INVALID_DEVICE                      = 0xA001;
    public static final int ALC_INVALID_CONTEXT                     = 0xA002;
    public static final int ALC_INVALID_ENUM                        = 0xA003;
    public static final int ALC_INVALID_VALUE                       = 0xA004;
    public static final int ALC_OUT_OF_MEMORY                       = 0xA005;
    public static final int ALC_DEFAULT_DEVICE_SPECIFIER            = 0x1004;
    public static final int ALC_DEVICE_SPECIFIER                    = 0x1005;
    public static final int ALC_EXTENSIONS                          = 0x1006;
    public static final int ALC_MAJOR_VERSION                       = 0x1000;
    public static final int ALC_MINOR_VERSION                       = 0x1001;
    public static final int ALC_ATTRIBUTES_SIZE                     = 0x1002;
    public static final int ALC_ALL_ATTRIBUTES                      = 0x1003;
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER            = 0x310;
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER    = 0x311;
    public static final int ALC_CAPTURE_SAMPLES                     = 0x312;
    public static final int AL_FORMAT_IMA_ADPCM_MONO16_EXT          = 0x10000;
    public static final int AL_FORMAT_IMA_ADPCM_STEREO16_EXT        = 0x10001;
    public static final int AL_FORMAT_WAVE_EXT                      = 0x10002;
    public static final int AL_FORMAT_VORBIS_EXT                    = 0x10003;
    public static final int AL_FORMAT_QUAD8_LOKI                    = 0x10004;
    public static final int AL_FORMAT_QUAD16_LOKI                   = 0x10005;
    public static final int AL_FORMAT_MONO_FLOAT32                  = 0x10010;
    public static final int AL_FORMAT_STEREO_FLOAT32                = 0x10011;
    public static final int AL_FORMAT_MONO_DOUBLE_EXT               = 0x10012;
    public static final int AL_FORMAT_STEREO_DOUBLE_EXT             = 0x10013;
    public static final int ALC_CHAN_MAIN_LOKI                      = 0x500001;
    public static final int ALC_CHAN_PCM_LOKI                       = 0x500002;
    public static final int ALC_CHAN_CD_LOKI                        = 0x500003;
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER       = 0x1012;
    public static final int ALC_ALL_DEVICES_SPECIFIER               = 0x1013;
    public static final int AL_FORMAT_QUAD8                         = 0x1204;
    public static final int AL_FORMAT_QUAD16                        = 0x1205;
    public static final int AL_FORMAT_QUAD32                        = 0x1206;
    public static final int AL_FORMAT_REAR8                         = 0x1207;
    public static final int AL_FORMAT_REAR16                        = 0x1208;
    public static final int AL_FORMAT_REAR32                        = 0x1209;
    public static final int AL_FORMAT_51CHN8                        = 0x120A;
    public static final int AL_FORMAT_51CHN16                       = 0x120B;
    public static final int AL_FORMAT_51CHN32                       = 0x120C;
    public static final int AL_FORMAT_61CHN8                        = 0x120D;
    public static final int AL_FORMAT_61CHN16                       = 0x120E;
    public static final int AL_FORMAT_61CHN32                       = 0x120F;
    public static final int AL_FORMAT_71CHN8                        = 0x1210;
    public static final int AL_FORMAT_71CHN16                       = 0x1211;
    public static final int AL_FORMAT_71CHN32                       = 0x1212;
    public static final int AL_FORMAT_MONO_MULAW                    = 0x10014;
    public static final int AL_FORMAT_STEREO_MULAW                  = 0x10015;
    public static final int AL_FORMAT_QUAD_MULAW                    = 0x10021;
    public static final int AL_FORMAT_REAR_MULAW                    = 0x10022;
    public static final int AL_FORMAT_51CHN_MULAW                   = 0x10023;
    public static final int AL_FORMAT_61CHN_MULAW                   = 0x10024;
    public static final int AL_FORMAT_71CHN_MULAW                   = 0x10025;
    public static final int AL_FORMAT_MONO_IMA4                     = 0x1300;
    public static final int AL_FORMAT_STEREO_IMA4                   = 0x1301;
    public static final int ALC_CONNECTED                           = 0x313;
    public static final int AL_SOURCE_DISTANCE_MODEL                = 0x200;
    public static final int ALC_EFX_MAJOR_VERSION                   = 0x20001;
    public static final int ALC_EFX_MINOR_VERSION                   = 0x20002;
    public static final int ALC_MAX_AUXILIARY_SENDS                 = 0x20003;
    public static final int AL_METERS_PER_UNIT                      = 0x20004;
    public static final int AL_DIRECT_FILTER                        = 0x20005;
    public static final int AL_AUXILIARY_SEND_FILTER                = 0x20006;
    public static final int AL_AIR_ABSORPTION_FACTOR                = 0x20007;
    public static final int AL_ROOM_ROLLOFF_FACTOR                  = 0x20008;
    public static final int AL_CONE_OUTER_GAINHF                    = 0x20009;
    public static final int AL_DIRECT_FILTER_GAINHF_AUTO            = 0x2000A;
    public static final int AL_AUXILIARY_SEND_FILTER_GAIN_AUTO      = 0x2000B;
    public static final int AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO    = 0x2000C;
    public static final int AL_REVERB_DENSITY                       = 0x0001;
    public static final int AL_REVERB_DIFFUSION                     = 0x0002;
    public static final int AL_REVERB_GAIN                          = 0x0003;
    public static final int AL_REVERB_GAINHF                        = 0x0004;
    public static final int AL_REVERB_DECAY_TIME                    = 0x0005;
    public static final int AL_REVERB_DECAY_HFRATIO                 = 0x0006;
    public static final int AL_REVERB_REFLECTIONS_GAIN              = 0x0007;
    public static final int AL_REVERB_REFLECTIONS_DELAY             = 0x0008;
    public static final int AL_REVERB_LATE_REVERB_GAIN              = 0x0009;
    public static final int AL_REVERB_LATE_REVERB_DELAY             = 0x000A;
    public static final int AL_REVERB_AIR_ABSORPTION_GAINHF         = 0x000B;
    public static final int AL_REVERB_ROOM_ROLLOFF_FACTOR           = 0x000C;
    public static final int AL_REVERB_DECAY_HFLIMIT                 = 0x000D;
    public static final int AL_EAXREVERB_DENSITY                    = 0x0001;
    public static final int AL_EAXREVERB_DIFFUSION                  = 0x0002;
    public static final int AL_EAXREVERB_GAIN                       = 0x0003;
    public static final int AL_EAXREVERB_GAINHF                     = 0x0004;
    public static final int AL_EAXREVERB_GAINLF                     = 0x0005;
    public static final int AL_EAXREVERB_DECAY_TIME                 = 0x0006;
    public static final int AL_EAXREVERB_DECAY_HFRATIO              = 0x0007;
    public static final int AL_EAXREVERB_DECAY_LFRATIO              = 0x0008;
    public static final int AL_EAXREVERB_REFLECTIONS_GAIN           = 0x0009;
    public static final int AL_EAXREVERB_REFLECTIONS_DELAY          = 0x000A;
    public static final int AL_EAXREVERB_REFLECTIONS_PAN            = 0x000B;
    public static final int AL_EAXREVERB_LATE_REVERB_GAIN           = 0x000C;
    public static final int AL_EAXREVERB_LATE_REVERB_DELAY          = 0x000D;
    public static final int AL_EAXREVERB_LATE_REVERB_PAN            = 0x000E;
    public static final int AL_EAXREVERB_ECHO_TIME                  = 0x000F;
    public static final int AL_EAXREVERB_ECHO_DEPTH                 = 0x0010;
    public static final int AL_EAXREVERB_MODULATION_TIME            = 0x0011;
    public static final int AL_EAXREVERB_MODULATION_DEPTH           = 0x0012;
    public static final int AL_EAXREVERB_AIR_ABSORPTION_GAINHF      = 0x0013;
    public static final int AL_EAXREVERB_HFREFERENCE                = 0x0014;
    public static final int AL_EAXREVERB_LFREFERENCE                = 0x0015;
    public static final int AL_EAXREVERB_ROOM_ROLLOFF_FACTOR        = 0x0016;
    public static final int AL_EAXREVERB_DECAY_HFLIMIT              = 0x0017;
    public static final int AL_CHORUS_WAVEFORM                      = 0x0001;
    public static final int AL_CHORUS_PHASE                         = 0x0002;
    public static final int AL_CHORUS_RATE                          = 0x0003;
    public static final int AL_CHORUS_DEPTH                         = 0x0004;
    public static final int AL_CHORUS_FEEDBACK                      = 0x0005;
    public static final int AL_CHORUS_DELAY                         = 0x0006;
    public static final int AL_DISTORTION_EDGE                      = 0x0001;
    public static final int AL_DISTORTION_GAIN                      = 0x0002;
    public static final int AL_DISTORTION_LOWPASS_CUTOFF            = 0x0003;
    public static final int AL_DISTORTION_EQCENTER                  = 0x0004;
    public static final int AL_DISTORTION_EQBANDWIDTH               = 0x0005;
    public static final int AL_ECHO_DELAY                           = 0x0001;
    public static final int AL_ECHO_LRDELAY                         = 0x0002;
    public static final int AL_ECHO_DAMPING                         = 0x0003;
    public static final int AL_ECHO_FEEDBACK                        = 0x0004;
    public static final int AL_ECHO_SPREAD                          = 0x0005;
    public static final int AL_FLANGER_WAVEFORM                     = 0x0001;
    public static final int AL_FLANGER_PHASE                        = 0x0002;
    public static final int AL_FLANGER_RATE                         = 0x0003;
    public static final int AL_FLANGER_DEPTH                        = 0x0004;
    public static final int AL_FLANGER_FEEDBACK                     = 0x0005;
    public static final int AL_FLANGER_DELAY                        = 0x0006;
    public static final int AL_FREQUENCY_SHIFTER_FREQUENCY          = 0x0001;
    public static final int AL_FREQUENCY_SHIFTER_LEFT_DIRECTION     = 0x0002;
    public static final int AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION    = 0x0003;
    public static final int AL_VOCAL_MORPHER_PHONEMEA               = 0x0001;
    public static final int AL_VOCAL_MORPHER_PHONEMEA_COARSE_TUNING = 0x0002;
    public static final int AL_VOCAL_MORPHER_PHONEMEB               = 0x0003;
    public static final int AL_VOCAL_MORPHER_PHONEMEB_COARSE_TUNING = 0x0004;
    public static final int AL_VOCAL_MORPHER_WAVEFORM               = 0x0005;
    public static final int AL_VOCAL_MORPHER_RATE                   = 0x0006;
    public static final int AL_PITCH_SHIFTER_COARSE_TUNE            = 0x0001;
    public static final int AL_PITCH_SHIFTER_FINE_TUNE              = 0x0002;
    public static final int AL_RING_MODULATOR_FREQUENCY             = 0x0001;
    public static final int AL_RING_MODULATOR_HIGHPASS_CUTOFF       = 0x0002;
    public static final int AL_RING_MODULATOR_WAVEFORM              = 0x0003;
    public static final int AL_AUTOWAH_ATTACK_TIME                  = 0x0001;
    public static final int AL_AUTOWAH_RELEASE_TIME                 = 0x0002;
    public static final int AL_AUTOWAH_RESONANCE                    = 0x0003;
    public static final int AL_AUTOWAH_PEAK_GAIN                    = 0x0004;
    public static final int AL_COMPRESSOR_ONOFF                     = 0x0001;
    public static final int AL_EQUALIZER_LOW_GAIN                   = 0x0001;
    public static final int AL_EQUALIZER_LOW_CUTOFF                 = 0x0002;
    public static final int AL_EQUALIZER_MID1_GAIN                  = 0x0003;
    public static final int AL_EQUALIZER_MID1_CENTER                = 0x0004;
    public static final int AL_EQUALIZER_MID1_WIDTH                 = 0x0005;
    public static final int AL_EQUALIZER_MID2_GAIN                  = 0x0006;
    public static final int AL_EQUALIZER_MID2_CENTER                = 0x0007;
    public static final int AL_EQUALIZER_MID2_WIDTH                 = 0x0008;
    public static final int AL_EQUALIZER_HIGH_GAIN                  = 0x0009;
    public static final int AL_EQUALIZER_HIGH_CUTOFF                = 0x000A;
    public static final int AL_EFFECT_FIRST_PARAMETER               = 0x0000;
    public static final int AL_EFFECT_LAST_PARAMETER                = 0x8000;
    public static final int AL_EFFECT_TYPE                          = 0x8001;
    public static final int AL_EFFECT_NULL                          = 0x0000;
    public static final int AL_EFFECT_REVERB                        = 0x0001;
    public static final int AL_EFFECT_CHORUS                        = 0x0002;
    public static final int AL_EFFECT_DISTORTION                    = 0x0003;
    public static final int AL_EFFECT_ECHO                          = 0x0004;
    public static final int AL_EFFECT_FLANGER                       = 0x0005;
    public static final int AL_EFFECT_FREQUENCY_SHIFTER             = 0x0006;
    public static final int AL_EFFECT_VOCAL_MORPHER                 = 0x0007;
    public static final int AL_EFFECT_PITCH_SHIFTER                 = 0x0008;
    public static final int AL_EFFECT_RING_MODULATOR                = 0x0009;
    public static final int AL_EFFECT_AUTOWAH                       = 0x000A;
    public static final int AL_EFFECT_COMPRESSOR                    = 0x000B;
    public static final int AL_EFFECT_EQUALIZER                     = 0x000C;
    public static final int AL_EFFECT_EAXREVERB                     = 0x8000;
    public static final int AL_EFFECTSLOT_EFFECT                    = 0x0001;
    public static final int AL_EFFECTSLOT_GAIN                      = 0x0002;
    public static final int AL_EFFECTSLOT_AUXILIARY_SEND_AUTO       = 0x0003;
    public static final int AL_EFFECTSLOT_NULL                      = 0x0000;
    public static final int AL_LOWPASS_GAIN                         = 0x0001;
    public static final int AL_LOWPASS_GAINHF                       = 0x0002;
    public static final int AL_HIGHPASS_GAIN                        = 0x0001;
    public static final int AL_HIGHPASS_GAINLF                      = 0x0002;
    public static final int AL_BANDPASS_GAIN                        = 0x0001;
    public static final int AL_BANDPASS_GAINLF                      = 0x0002;
    public static final int AL_BANDPASS_GAINHF                      = 0x0003;
    public static final int AL_FILTER_FIRST_PARAMETER               = 0x0000;
    public static final int AL_FILTER_LAST_PARAMETER                = 0x8000;
    public static final int AL_FILTER_TYPE                          = 0x8001;
    public static final int AL_FILTER_NULL                          = 0x0000;
    public static final int AL_FILTER_LOWPASS                       = 0x0001;
    public static final int AL_FILTER_HIGHPASS                      = 0x0002;
    public static final int AL_FILTER_BANDPASS                      = 0x0003;


    /*************************************
     *  Interface to the native library  *  (TODO: access to alc device and context, misc internal functions)
     *************************************/
    public static native boolean create(); // Must be called once, before calling other AL methods!
    public static native void destroy(); // Must be called before shutting down the app!
    public static native void alAuxiliaryEffectSlotf( int asid, int param, float value );
    public static native void alAuxiliaryEffectSlotfv( int asid, int param, float[] values );
    public static native void alAuxiliaryEffectSloti( int asid, int param, int value );
    public static native void alAuxiliaryEffectSlotiv( int asid, int param, int[] values );
    public static native void alBuffer3f( int bid, int param, float value1, float value2, float value3 );
    public static native void alBuffer3i( int bid, int param, int value1, int value2, int value3 );
    public static native void alBufferData( int bid, int format, byte[] data, int size, int freq );
    public static native void alBufferf( int bid, int param, float value );
    public static native void alBufferfv( int bid, int param, float[] values );
    public static native void alBufferi( int bid, int param, int value );
    public static native void alBufferiv( int bid, int param, int[] values );
    public static native void alDeleteAuxiliaryEffectSlots( int n, int[] slots );
    public static native void alDeleteBuffers( int n, int[] buffers );
    public static native void alDeleteEffects( int n, int[] effects );
    public static native void alDeleteFilters( int n, int[] filters );
    public static native void alDeleteSources( int n, int[] sources );
    public static native void alDisable( int capability );
    public static native void alDistanceModel( int distanceModel );
    public static native void alDopplerFactor( float value );
    public static native void alDopplerVelocity( float value );
    public static native void alEffectf( int eid, int param, float value );
    public static native void alEffectfv( int eid, int param, float[] values );
    public static native void alEffecti( int eid, int param, int value );
    public static native void alEffectiv( int eid, int param, int[] values );
    public static native void alEnable( int capability );
    public static native void alFilterf( int fid, int param, float value );
    public static native void alFilterfv( int fid, int param, float[] values );
    public static native void alFilteri( int fid, int param, int value );
    public static native void alFilteriv( int fid, int param, int[] values );
    public static native void alGenAuxiliaryEffectSlots( int n, int[] slots );
    public static native void alGenBuffers( int n, int[] buffers );
    public static native void alGenEffects( int n, int[] effects );
    public static native void alGenFilters( int n, int[] filters );
    public static native void alGenSources( int n, int[] sources );
    public static native void alGetAuxiliaryEffectSlotf( int asid, int pname, float[] value );
    public static native void alGetAuxiliaryEffectSlotfv( int asid, int pname, float[] values );
    public static native void alGetAuxiliaryEffectSloti( int asid, int pname, int[] value );
    public static native void alGetAuxiliaryEffectSlotiv( int asid, int pname, int[] values );
    public static native boolean alGetBoolean( int param );
    public static native void alGetBooleanv( int param, byte[] data );
    public static native void alGetBuffer3f( int bid, int param, float[] value1, float[] value2, float[] value3 );
    public static native void alGetBuffer3i( int bid, int param, int[] value1, int[] value2, int[] value3 );
    public static native void alGetBufferf( int bid, int param, float[] value );
    public static native void alGetBufferfv( int bid, int param, float[] values );
    public static native void alGetBufferi( int bid, int param, int[] value );
    public static native void alGetBufferiv( int bid, int param, int[] values );
    public static native double alGetDouble( int param );
    public static native void alGetDoublev( int param, double[] data );
    public static native void alGetEffectf( int eid, int pname, float[] value );
    public static native void alGetEffectfv( int eid, int pname, float[] values );
    public static native void alGetEffecti( int eid, int pname, int[] value );
    public static native void alGetEffectiv( int eid, int pname, int[] values );
    public static native int alGetEnumValue( String ename );
    public static native int alGetError();
    public static native void alGetFilterf( int fid, int pname, float[] value );
    public static native void alGetFilterfv( int fid, int pname, float[] values );
    public static native void alGetFilteri( int fid, int pname, int[] value );
    public static native void alGetFilteriv( int fid, int pname, int[] values );
    public static native float alGetFloat( int param );
    public static native void alGetFloatv( int param, float[] data );
    public static native int alGetInteger( int param );
    public static native void alGetIntegerv( int param, int[] data );
    public static native void alGetListener3f( int param, float[] value1, float[] value2, float[] value3 );
    public static native void alGetListener3i(int param, int[] value1, int[] value2, int[] value3 );
    public static native void alGetListenerf( int param, float[] value );
    public static native void alGetListenerfv( int param, float[] values );
    public static native void alGetListeneri( int param, int[] value );
    public static native void lGetListeneriv( int param, int[] values );
    public static native void alGetSource3f( int sid, int param, float[] value1, float[] value2, float[] value3 );
    public static native void alGetSource3i( int sid, int param, int[] value1, int[] value2, int[] value3 );
    public static native void alGetSourcef( int sid, int param, float[] value );
    public static native void alGetSourcefv( int sid, int param, float[] values );
    public static native void alGetSourcei( int sid, int param, int[] value );
    public static native void alGetSourceiv( int sid, int param, int[] values );
    public static native String alGetString( int param );
    public static native boolean alIsAuxiliaryEffectSlot( int slot );
    public static native boolean alIsBuffer( int bid );
    public static native boolean alIsEffect( int eid );
    public static native boolean alIsEnabled( int capability );
    public static native boolean alIsExtensionPresent( String extname );
    public static native boolean alIsFilter( int fid );
    public static native boolean alIsSource( int sid );
    public static native void alListener3f( int param, float value1, float value2, float value3 );
    public static native void alListener3i(int param, int value1, int value2, int value3 );
    public static native void alListenerf( int param, float value );
    public static native void alListenerfv( int param, float[] values );
    public static native void alListeneri( int param, int value );
    public static native void alListeneriv( int param, int[] values );
    public static native void alSource3f( int sid, int param, float value1, float value2, float value3 );
    public static native void alSource3i( int sid, int param, int value1, int value2, int value3 );
    public static native void alSourcef( int sid, int param, float value );
    public static native void alSourcefv( int sid, int param, float[] values );
    public static native void alSourcei( int sid, int param, int value );
    public static native void alSourceiv( int sid, int param, int[] values );
    public static native void alSourcePause( int sid );
    public static native void alSourcePausev( int ns, int[] sids );
    public static native void alSourcePlay(int sid);
    public static native void alSourcePlayv( int ns, int[] sids );
    public static native void alSourceQueueBuffers( int sid, int numEntries, int[] bids );
    public static native void alSourceRewind( int sid );
    public static native void alSourceRewindv( int ns, int[] sids );
    public static native void alSourceStop( int sid );
    public static native void alSourceStopv( int ns, int[] sids );
    public static native void alSourceUnqueueBuffers( int sid, int numEntries, int[] bids );
    public static native void alSpeedOfSound( float value );
}

