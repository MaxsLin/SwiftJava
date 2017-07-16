
import java_swift

/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// JAVA_HOME: /Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home ///
/// Sun Jul 16 10:59:43 BST 2017 ///

/// interface com.jh.SwiftHello$Listener ///

public protocol SwiftHello_Listener: JavaProtocol {

    /// public abstract void com.jh.SwiftHello$Listener.setCacheDir(java.lang.String)

    func setCacheDir( cacheDir: String? )
    func setCacheDir( _ _cacheDir: String? )

    /// public abstract void com.jh.SwiftHello$Listener.processNumber(double)

    func processNumber( number: Double )
    func processNumber( _ _number: Double )

    /// public abstract void com.jh.SwiftHello$Listener.processText(java.lang.String)

    func processText( text: String? )
    func processText( _ _text: String? )

}

open class SwiftHello_ListenerForward: JNIObjectForward, SwiftHello_Listener {

    private static var SwiftHello_ListenerJNIClass: jclass?

    /// public abstract void com.jh.SwiftHello$Listener.setCacheDir(java.lang.String)

    private static var setCacheDir_MethodID_4: jmethodID?

    open func setCacheDir( cacheDir: String? ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: cacheDir, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "setCacheDir", methodSig: "(Ljava/lang/String;)V", methodCache: &SwiftHello_ListenerForward.setCacheDir_MethodID_4, args: &__args, locals: &__locals )
    }

    open func setCacheDir( _ _cacheDir: String? ) {
        setCacheDir( cacheDir: _cacheDir )
    }

    /// public abstract void com.jh.SwiftHello$Listener.processNumber(double)

    private static var processNumber_MethodID_5: jmethodID?

    open func processNumber( number: Double ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: number, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processNumber", methodSig: "(D)V", methodCache: &SwiftHello_ListenerForward.processNumber_MethodID_5, args: &__args, locals: &__locals )
    }

    open func processNumber( _ _number: Double ) {
        processNumber( number: _number )
    }

    /// public abstract void com.jh.SwiftHello$Listener.processText(java.lang.String)

    private static var processText_MethodID_6: jmethodID?

    open func processText( text: String? ) {
        var __args = [jvalue]( repeating: jvalue(), count: 1 )
        var __locals = [jobject]()
        __args[0] = JNIType.encode( value: text, locals: &__locals )
        JNIMethod.CallVoidMethod( object: javaObject, methodName: "processText", methodSig: "(Ljava/lang/String;)V", methodCache: &SwiftHello_ListenerForward.processText_MethodID_6, args: &__args, locals: &__locals )
    }

    open func processText( _ _text: String? ) {
        processText( text: _text )
    }

}


private typealias SwiftHello_Listener_setCacheDir_0_type = @convention(c) ( _: UnsafeMutablePointer<JNIEnv?>, _: jobject?, _: jobject? ) -> ()

private func SwiftHello_Listener_setCacheDir_0( _ __env: UnsafeMutablePointer<JNIEnv?>, _ __this: jobject?, _ cacheDir: jobject? ) -> () {
    SwiftHello_ListenerBase.swiftObject( jniEnv: __env, javaObject: __this ).setCacheDir( JNIType.decode( type: String(), from: cacheDir ) )
}

private typealias SwiftHello_Listener_processNumber_1_type = @convention(c) ( _: UnsafeMutablePointer<JNIEnv?>, _: jobject?, _: jdouble ) -> ()

private func SwiftHello_Listener_processNumber_1( _ __env: UnsafeMutablePointer<JNIEnv?>, _ __this: jobject?, _ number: jdouble ) -> () {
    SwiftHello_ListenerBase.swiftObject( jniEnv: __env, javaObject: __this ).processNumber( JNIType.decode( type: Double(), from: number ) )
}

private typealias SwiftHello_Listener_processText_2_type = @convention(c) ( _: UnsafeMutablePointer<JNIEnv?>, _: jobject?, _: jobject? ) -> ()

private func SwiftHello_Listener_processText_2( _ __env: UnsafeMutablePointer<JNIEnv?>, _ __this: jobject?, _ text: jobject? ) -> () {
    SwiftHello_ListenerBase.swiftObject( jniEnv: __env, javaObject: __this ).processText( JNIType.decode( type: String(), from: text ) )
}

open class SwiftHello_ListenerBase: JNIObjectProxy, SwiftHello_Listener {

    private static var nativesRegistered = false

    private static func registerNatives() {
        if ( !nativesRegistered ) {
            var natives = [JNINativeMethod]()

            let SwiftHello_Listener_setCacheDir_0_thunk: SwiftHello_Listener_setCacheDir_0_type = SwiftHello_Listener_setCacheDir_0
            natives.append( JNINativeMethod( name: strdup("__setCacheDir"), signature: strdup("(Ljava/lang/String;)V"), fnPtr: unsafeBitCast( SwiftHello_Listener_setCacheDir_0_thunk, to: UnsafeMutableRawPointer.self ) ) )

            let SwiftHello_Listener_processNumber_1_thunk: SwiftHello_Listener_processNumber_1_type = SwiftHello_Listener_processNumber_1
            natives.append( JNINativeMethod( name: strdup("__processNumber"), signature: strdup("(D)V"), fnPtr: unsafeBitCast( SwiftHello_Listener_processNumber_1_thunk, to: UnsafeMutableRawPointer.self ) ) )

            let SwiftHello_Listener_processText_2_thunk: SwiftHello_Listener_processText_2_type = SwiftHello_Listener_processText_2
            natives.append( JNINativeMethod( name: strdup("__processText"), signature: strdup("(Ljava/lang/String;)V"), fnPtr: unsafeBitCast( SwiftHello_Listener_processText_2_thunk, to: UnsafeMutableRawPointer.self ) ) )

            withUnsafePointer(to: &natives[0]) {
                nativesPtr in
                let clazz = JNI.FindClass( "org/genie/com_jh/SwiftHello_ListenerProxy" )
                if JNI.api.RegisterNatives( JNI.env, clazz, nativesPtr, jint(natives.count) ) != jint(JNI_OK) {
                    JNI.report( "Unable to register java natives" )
                }
            }

            nativesRegistered = true
        }
    }

    public convenience init() {
        self.init( javaObject: nil )
    }

    public required init( javaObject: jobject? ) {
        super.init( javaObject: javaObject )
        SwiftHello_ListenerBase.registerNatives()
        createProxy( javaClassName: "org/genie/com_jh/SwiftHello_ListenerProxy" )
    }

    static func swiftObject( jniEnv: UnsafeMutablePointer<JNIEnv?>?, javaObject: jobject? ) -> SwiftHello_ListenerBase {
        return unsafeBitCast( swiftPointer( jniEnv: jniEnv, object: javaObject ), to: SwiftHello_ListenerBase.self )
    }

    /// public abstract void com.jh.SwiftHello$Listener.setCacheDir(java.lang.String)

    open func setCacheDir( cacheDir: String? ) /**/ {
    }

    open func setCacheDir( _ _cacheDir: String? ) /**/ {
        setCacheDir( cacheDir: _cacheDir )
    }

    /// public abstract void com.jh.SwiftHello$Listener.processNumber(double)

    open func processNumber( number: Double ) /**/ {
    }

    open func processNumber( _ _number: Double ) /**/ {
        processNumber( number: _number )
    }

    /// public abstract void com.jh.SwiftHello$Listener.processText(java.lang.String)

    open func processText( text: String? ) /**/ {
    }

    open func processText( _ _text: String? ) /**/ {
        processText( text: _text )
    }

}
