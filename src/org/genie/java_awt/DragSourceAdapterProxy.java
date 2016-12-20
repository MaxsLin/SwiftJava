
/// class java.awt.dnd.DragSourceAdapter ///

package org.genie.java_awt;

public class DragSourceAdapterProxy extends java.awt.dnd.DragSourceAdapter {

    long swiftObject;

    /// public java.awt.dnd.DragSourceAdapter()

    DragSourceAdapterProxy( long swiftObject ) {
        super( );
        this.swiftObject = swiftObject;
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragEnter(java.awt.dnd.DragSourceDragEvent)

    public native void __dragEnter( java.awt.dnd.DragSourceDragEvent arg0 );

    boolean entered_dragEnter_0;

    public void dragEnter( java.awt.dnd.DragSourceDragEvent arg0 ) {
        if ( !entered_dragEnter_0 ) {
            entered_dragEnter_0 = true;
            __dragEnter( arg0 );
            entered_dragEnter_0 = false;
        }
        else
            super.dragEnter( arg0 );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragOver(java.awt.dnd.DragSourceDragEvent)

    public native void __dragOver( java.awt.dnd.DragSourceDragEvent arg0 );

    boolean entered_dragOver_1;

    public void dragOver( java.awt.dnd.DragSourceDragEvent arg0 ) {
        if ( !entered_dragOver_1 ) {
            entered_dragOver_1 = true;
            __dragOver( arg0 );
            entered_dragOver_1 = false;
        }
        else
            super.dragOver( arg0 );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dropActionChanged(java.awt.dnd.DragSourceDragEvent)

    public native void __dropActionChanged( java.awt.dnd.DragSourceDragEvent arg0 );

    boolean entered_dropActionChanged_2;

    public void dropActionChanged( java.awt.dnd.DragSourceDragEvent arg0 ) {
        if ( !entered_dropActionChanged_2 ) {
            entered_dropActionChanged_2 = true;
            __dropActionChanged( arg0 );
            entered_dropActionChanged_2 = false;
        }
        else
            super.dropActionChanged( arg0 );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragExit(java.awt.dnd.DragSourceEvent)

    public native void __dragExit( java.awt.dnd.DragSourceEvent arg0 );

    boolean entered_dragExit_3;

    public void dragExit( java.awt.dnd.DragSourceEvent arg0 ) {
        if ( !entered_dragExit_3 ) {
            entered_dragExit_3 = true;
            __dragExit( arg0 );
            entered_dragExit_3 = false;
        }
        else
            super.dragExit( arg0 );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragDropEnd(java.awt.dnd.DragSourceDropEvent)

    public native void __dragDropEnd( java.awt.dnd.DragSourceDropEvent arg0 );

    boolean entered_dragDropEnd_4;

    public void dragDropEnd( java.awt.dnd.DragSourceDropEvent arg0 ) {
        if ( !entered_dragDropEnd_4 ) {
            entered_dragDropEnd_4 = true;
            __dragDropEnd( arg0 );
            entered_dragDropEnd_4 = false;
        }
        else
            super.dragDropEnd( arg0 );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)

    public native void __dragMouseMoved( java.awt.dnd.DragSourceDragEvent arg0 );

    boolean entered_dragMouseMoved_5;

    public void dragMouseMoved( java.awt.dnd.DragSourceDragEvent arg0 ) {
        if ( !entered_dragMouseMoved_5 ) {
            entered_dragMouseMoved_5 = true;
            __dragMouseMoved( arg0 );
            entered_dragMouseMoved_5 = false;
        }
        else
            super.dragMouseMoved( arg0 );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( java.lang.Object arg0 );

    boolean entered_equals_6;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_6 ) {
            entered_equals_6 = true;
            boolean __return = __equals( arg0 );
            entered_equals_6 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString();

    boolean entered_toString_7;

    public java.lang.String toString() {
        if ( !entered_toString_7 ) {
            entered_toString_7 = true;
            java.lang.String __return = __toString( );
            entered_toString_7 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode();

    boolean entered_hashCode_8;

    public int hashCode() {
        if ( !entered_hashCode_8 ) {
            entered_hashCode_8 = true;
            int __return = __hashCode( );
            entered_hashCode_8 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

}
