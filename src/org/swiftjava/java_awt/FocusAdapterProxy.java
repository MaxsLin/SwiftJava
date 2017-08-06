
/// class java.awt.event.FocusAdapter ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class FocusAdapterProxy extends java.awt.event.FocusAdapter {

    long __swiftObject;

    /// public java.awt.event.FocusAdapter()

    FocusAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.event.FocusAdapter.focusGained(java.awt.event.FocusEvent)

    public native void __focusGained( long __swiftObject, java.awt.event.FocusEvent e );

    boolean entered_focusGained_0;

    public void focusGained( java.awt.event.FocusEvent e ) {
        if ( !entered_focusGained_0 ) {
            entered_focusGained_0 = true;
            __focusGained( __swiftObject, e);
            entered_focusGained_0 = false;
        }
        else
            super.focusGained( e );
    }

    /// public void java.awt.event.FocusAdapter.focusLost(java.awt.event.FocusEvent)

    public native void __focusLost( long __swiftObject, java.awt.event.FocusEvent e );

    boolean entered_focusLost_1;

    public void focusLost( java.awt.event.FocusEvent e ) {
        if ( !entered_focusLost_1 ) {
            entered_focusLost_1 = true;
            __focusLost( __swiftObject, e);
            entered_focusLost_1 = false;
        }
        else
            super.focusLost( e );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_2;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_2 ) {
            entered_equals_2 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_2 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_3;

    public java.lang.String toString() {
        if ( !entered_toString_3 ) {
            entered_toString_3 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_3 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_4;

    public int hashCode() {
        if ( !entered_hashCode_4 ) {
            entered_hashCode_4 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_4 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}