
/// class javax.swing.table.DefaultTableCellRenderer$UIResource ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class DefaultTableCellRenderer_UIResourceProxy extends javax.swing.table.DefaultTableCellRenderer.UIResource {

    long __swiftObject;

    /// public javax.swing.table.DefaultTableCellRenderer$UIResource()

    DefaultTableCellRenderer_UIResourceProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public java.awt.Component javax.swing.table.DefaultTableCellRenderer.getTableCellRendererComponent(javax.swing.JTable,java.lang.Object,boolean,boolean,int,int)

    public native java.awt.Component __getTableCellRendererComponent( long __swiftObject, javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column );

    boolean entered_getTableCellRendererComponent_0;

    public java.awt.Component getTableCellRendererComponent( javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
        if ( !entered_getTableCellRendererComponent_0 ) {
            entered_getTableCellRendererComponent_0 = true;
            java.awt.Component __return = __getTableCellRendererComponent( __swiftObject, table, value, isSelected, hasFocus, row, column);
            entered_getTableCellRendererComponent_0 = false;
            return __return;
        }
        else
            return super.getTableCellRendererComponent( table, value, isSelected, hasFocus, row, column );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}