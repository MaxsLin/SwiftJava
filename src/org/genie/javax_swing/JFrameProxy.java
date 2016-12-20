
/// class javax.swing.JFrame ///

package org.genie.javax_swing;

public class JFrameProxy extends javax.swing.JFrame {

    long swiftObject;

    /// public javax.swing.JFrame() throws java.awt.HeadlessException

    JFrameProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JFrame(java.awt.GraphicsConfiguration)

    JFrameProxy( java.awt.GraphicsConfiguration arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JFrame(java.lang.String) throws java.awt.HeadlessException

    JFrameProxy( java.lang.String arg0 , long swiftObject ) {
        super( arg0 );
        this.swiftObject = swiftObject;
    }

    /// public javax.swing.JFrame(java.lang.String,java.awt.GraphicsConfiguration)

    JFrameProxy( java.lang.String arg0, java.awt.GraphicsConfiguration arg1 , long swiftObject ) {
        super( arg0, arg1 );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.Window.paint(java.awt.Graphics)

    public native void __paint( java.awt.Graphics arg0 );

    boolean entered_paint_0;

    public void paint( java.awt.Graphics arg0 ) {
        if ( !entered_paint_0 ) {
            entered_paint_0 = true;
            __paint( arg0 );
            entered_paint_0 = false;
        }
        else
            super.paint( arg0 );
    }

}
