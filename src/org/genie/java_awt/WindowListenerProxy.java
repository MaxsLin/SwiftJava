
/// interface java.awt.event.WindowListener ///

package org.genie.java_awt;

public class WindowListenerProxy implements java.awt.event.WindowListener {

    long swiftObject;

    WindowListenerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract void java.awt.event.WindowListener.windowOpened(java.awt.event.WindowEvent)

    public native void __windowOpened( java.awt.event.WindowEvent arg0 );

    public void windowOpened( java.awt.event.WindowEvent arg0 ) {
        __windowOpened( arg0 );
    }

    /// public abstract void java.awt.event.WindowListener.windowClosing(java.awt.event.WindowEvent)

    public native void __windowClosing( java.awt.event.WindowEvent arg0 );

    public void windowClosing( java.awt.event.WindowEvent arg0 ) {
        __windowClosing( arg0 );
    }

    /// public abstract void java.awt.event.WindowListener.windowClosed(java.awt.event.WindowEvent)

    public native void __windowClosed( java.awt.event.WindowEvent arg0 );

    public void windowClosed( java.awt.event.WindowEvent arg0 ) {
        __windowClosed( arg0 );
    }

    /// public abstract void java.awt.event.WindowListener.windowIconified(java.awt.event.WindowEvent)

    public native void __windowIconified( java.awt.event.WindowEvent arg0 );

    public void windowIconified( java.awt.event.WindowEvent arg0 ) {
        __windowIconified( arg0 );
    }

    /// public abstract void java.awt.event.WindowListener.windowDeiconified(java.awt.event.WindowEvent)

    public native void __windowDeiconified( java.awt.event.WindowEvent arg0 );

    public void windowDeiconified( java.awt.event.WindowEvent arg0 ) {
        __windowDeiconified( arg0 );
    }

    /// public abstract void java.awt.event.WindowListener.windowActivated(java.awt.event.WindowEvent)

    public native void __windowActivated( java.awt.event.WindowEvent arg0 );

    public void windowActivated( java.awt.event.WindowEvent arg0 ) {
        __windowActivated( arg0 );
    }

    /// public abstract void java.awt.event.WindowListener.windowDeactivated(java.awt.event.WindowEvent)

    public native void __windowDeactivated( java.awt.event.WindowEvent arg0 );

    public void windowDeactivated( java.awt.event.WindowEvent arg0 ) {
        __windowDeactivated( arg0 );
    }

}
