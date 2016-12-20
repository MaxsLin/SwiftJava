
/// class java.awt.event.MouseAdapter ///

package org.genie.java_awt;

public class MouseAdapterProxy extends java.awt.event.MouseAdapter {

    long swiftObject;

    /// public java.awt.event.MouseAdapter()

    MouseAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.event.MouseAdapter.mousePressed(java.awt.event.MouseEvent)

    public native void __mousePressed( java.awt.event.MouseEvent arg0 );

    boolean entered_mousePressed_0;

    public void mousePressed( java.awt.event.MouseEvent arg0 ) {
        if ( !entered_mousePressed_0 ) {
            entered_mousePressed_0 = true;
            __mousePressed( arg0 );
            entered_mousePressed_0 = false;
        }
        else
            super.mousePressed( arg0 );
    }

    /// public void java.awt.event.MouseAdapter.mouseReleased(java.awt.event.MouseEvent)

    public native void __mouseReleased( java.awt.event.MouseEvent arg0 );

    boolean entered_mouseReleased_1;

    public void mouseReleased( java.awt.event.MouseEvent arg0 ) {
        if ( !entered_mouseReleased_1 ) {
            entered_mouseReleased_1 = true;
            __mouseReleased( arg0 );
            entered_mouseReleased_1 = false;
        }
        else
            super.mouseReleased( arg0 );
    }

    /// public void java.awt.event.MouseAdapter.mouseClicked(java.awt.event.MouseEvent)

    public native void __mouseClicked( java.awt.event.MouseEvent arg0 );

    boolean entered_mouseClicked_2;

    public void mouseClicked( java.awt.event.MouseEvent arg0 ) {
        if ( !entered_mouseClicked_2 ) {
            entered_mouseClicked_2 = true;
            __mouseClicked( arg0 );
            entered_mouseClicked_2 = false;
        }
        else
            super.mouseClicked( arg0 );
    }

    /// public void java.awt.event.MouseAdapter.mouseExited(java.awt.event.MouseEvent)

    public native void __mouseExited( java.awt.event.MouseEvent arg0 );

    boolean entered_mouseExited_3;

    public void mouseExited( java.awt.event.MouseEvent arg0 ) {
        if ( !entered_mouseExited_3 ) {
            entered_mouseExited_3 = true;
            __mouseExited( arg0 );
            entered_mouseExited_3 = false;
        }
        else
            super.mouseExited( arg0 );
    }

    /// public void java.awt.event.MouseAdapter.mouseEntered(java.awt.event.MouseEvent)

    public native void __mouseEntered( java.awt.event.MouseEvent arg0 );

    boolean entered_mouseEntered_4;

    public void mouseEntered( java.awt.event.MouseEvent arg0 ) {
        if ( !entered_mouseEntered_4 ) {
            entered_mouseEntered_4 = true;
            __mouseEntered( arg0 );
            entered_mouseEntered_4 = false;
        }
        else
            super.mouseEntered( arg0 );
    }

    /// public void java.awt.event.MouseAdapter.mouseMoved(java.awt.event.MouseEvent)

    public native void __mouseMoved( java.awt.event.MouseEvent arg0 );

    boolean entered_mouseMoved_5;

    public void mouseMoved( java.awt.event.MouseEvent arg0 ) {
        if ( !entered_mouseMoved_5 ) {
            entered_mouseMoved_5 = true;
            __mouseMoved( arg0 );
            entered_mouseMoved_5 = false;
        }
        else
            super.mouseMoved( arg0 );
    }

    /// public void java.awt.event.MouseAdapter.mouseDragged(java.awt.event.MouseEvent)

    public native void __mouseDragged( java.awt.event.MouseEvent arg0 );

    boolean entered_mouseDragged_6;

    public void mouseDragged( java.awt.event.MouseEvent arg0 ) {
        if ( !entered_mouseDragged_6 ) {
            entered_mouseDragged_6 = true;
            __mouseDragged( arg0 );
            entered_mouseDragged_6 = false;
        }
        else
            super.mouseDragged( arg0 );
    }

    /// public void java.awt.event.MouseAdapter.mouseWheelMoved(java.awt.event.MouseWheelEvent)

    public native void __mouseWheelMoved( java.awt.event.MouseWheelEvent arg0 );

    boolean entered_mouseWheelMoved_7;

    public void mouseWheelMoved( java.awt.event.MouseWheelEvent arg0 ) {
        if ( !entered_mouseWheelMoved_7 ) {
            entered_mouseWheelMoved_7 = true;
            __mouseWheelMoved( arg0 );
            entered_mouseWheelMoved_7 = false;
        }
        else
            super.mouseWheelMoved( arg0 );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_8;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_8 ) {
            entered_equals_8 = true;
            boolean __return = __equals( arg0 );
            entered_equals_8 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_9;

    public java.lang.String toString() {
        if ( !entered_toString_9 ) {
            entered_toString_9 = true;
            java.lang.String __return = __toString( );
            entered_toString_9 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_10;

    public int hashCode() {
        if ( !entered_hashCode_10 ) {
            entered_hashCode_10 = true;
            int __return = __hashCode( );
            entered_hashCode_10 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
