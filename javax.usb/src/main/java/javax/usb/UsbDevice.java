package javax.usb;

import javax.usb.event.*;
import java.util.*;

public interface UsbDevice {
    // -----------------------------------------------------------------------
    //
    // -----------------------------------------------------------------------

    String getManufacturerString() throws UsbException, java.io.UnsupportedEncodingException, UsbDisconnectedException;

    String getSerialNumberString() throws UsbException, java.io.UnsupportedEncodingException, UsbDisconnectedException;

    String getProductString() throws UsbException, java.io.UnsupportedEncodingException, UsbDisconnectedException;

    UsbStringDescriptor getUsbStringDescriptor(byte index);

    String getString(byte index) throws UsbException, UsbDisconnectedException;

    // -----------------------------------------------------------------------
    //
    // -----------------------------------------------------------------------

    UsbDeviceDescriptor getUsbDeviceDescriptor();

    Object getSpeed();

    boolean isConfigured();

    boolean isUsbHub();

    // -----------------------------------------------------------------------
    //
    // -----------------------------------------------------------------------

    void addUsbDeviceListener(UsbDeviceListener listener);

    void removeUsbDeviceListener(UsbDeviceListener listener);

    // -----------------------------------------------------------------------
    //
    // -----------------------------------------------------------------------

    UsbControlIrp createUsbControlIrp(byte bmRequestType, byte bRequest, short wValue, short wIndex);

    void asyncSubmit(List<UsbControlIrp> list) throws UsbException, IllegalArgumentException, UsbDisconnectedException;

    void asyncSubmit(UsbControlIrp irp) throws UsbException, IllegalArgumentException, UsbDisconnectedException;

    void syncSubmit(List<UsbControlIrp> list) throws UsbException, IllegalArgumentException, UsbDisconnectedException;

    void syncSubmit(UsbControlIrp irp) throws UsbException, IllegalArgumentException, UsbDisconnectedException;

    UsbPort getParentUsbPort() throws UsbDisconnectedException;

    byte getActiveUsbConfigurationNumber();

    UsbConfiguration getActiveUsbConfiguration();

    boolean containsUsbConfiguration(byte number);

    UsbConfiguration getUsbConfiguration(byte number);

    List<UsbConfiguration> getUsbConfigurations();
}
