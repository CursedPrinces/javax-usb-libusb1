package javax.usb;

public interface UsbConst {

    Object DEVICE_SPEED_UNKNOWN = new Object();
    Object DEVICE_SPEED_LOW     = new Object();
    Object DEVICE_SPEED_FULL    = new Object();
    Object DEVICE_SPEED_HIGH    = new Object();

    byte ENDPOINT_DIRECTION_IN = (byte) 0x80;
    byte ENDPOINT_DIRECTION_MASK = (byte) 0x80;
    byte ENDPOINT_DIRECTION_OUT = 0;

    byte ENDPOINT_TYPE_CONTROL = 0;
    byte ENDPOINT_TYPE_ISOCHRONOUS = 1;
    byte ENDPOINT_TYPE_BULK = 2;
    byte ENDPOINT_TYPE_INTERRUPT = 3;
    byte ENDPOINT_TYPE_MASK = 0x03;

    byte DESCRIPTOR_TYPE_DEVICE = 1;
    byte DESCRIPTOR_TYPE_CONFIGURATION = 2;
    byte DESCRIPTOR_TYPE_STRING = 3;
    byte DESCRIPTOR_TYPE_INTERFACE = 4;
    byte DESCRIPTOR_TYPE_ENDPOINT = 5;

    /**
     * @see @{link http://www.usb.org/developers/defined_class/#BaseClass09h}
     */
    byte HUB_CLASSCODE = 9;

    byte REQUESTTYPE_DIRECTION_IN = (byte) 0x80;
    byte REQUESTTYPE_DIRECTION_MASK = (byte) 0x80;
    byte REQUESTTYPE_DIRECTION_OUT = 0;
    byte REQUESTTYPE_RECIPIENT_DEVICE = 0;
    byte REQUESTTYPE_RECIPIENT_ENDPOINT = 2;
    byte REQUESTTYPE_RECIPIENT_INTERFACE = 1;
    byte REQUESTTYPE_RECIPIENT_MASK = 31;
    byte REQUESTTYPE_RECIPIENT_OTHER = 3;
    byte REQUESTTYPE_TYPE_CLASS = 32;
    byte REQUESTTYPE_TYPE_MASK = 96;
    byte REQUESTTYPE_TYPE_RESERVED = 96;
    byte REQUESTTYPE_TYPE_STANDARD = 0;
    byte REQUESTTYPE_TYPE_VENDOR = 64;
}
