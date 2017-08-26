'SOCKET_ANY_FREE_PORT' @ [26:66] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'UnicastRemoteObject' @ [28:3] ==> protected/*protected and package*/ constructor UnicastRemoteObject(p0: Int, p1: (RMIClientSocketFactory..RMIClientSocketFactory?), p2: (RMIServerSocketFactory..RMIServerSocketFactory?)) defined in java.rmi.server.UnicastRemoteObject[JavaClassConstructorDescriptor]

'port' @ [28:23] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.<init>[ValueParameterDescriptorImpl]

'clientLoopbackSocketFactory' @ [28:54] ==> public final val clientLoopbackSocketFactory: LoopbackNetworkInterface.ClientLoopbackSocketFactory defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[DeserializedPropertyDescriptor]

'serverLoopbackSocketFactory' @ [28:108] ==> public final val serverLoopbackSocketFactory: LoopbackNetworkInterface.ServerLoopbackSocketFactory defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[DeserializedPropertyDescriptor]

'`in`' @ [31:9] ==> public final val `in`: InputStream defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer[PropertyDescriptorImpl]

'close' @ [31:14] ==> public open fun close(): Unit defined in java.io.InputStream[JavaMethodDescriptor]

'ByteArray' @ [35:19] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'length' @ [35:29] ==> value-parameter length: Int defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[ValueParameterDescriptorImpl]

'`in`' @ [36:25] ==> public final val `in`: InputStream defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer[PropertyDescriptorImpl]

'read' @ [36:30] ==> public open fun read(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): Int defined in java.io.InputStream[JavaMethodDescriptor]

'buf' @ [36:35] ==> val buf: ByteArray defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[LocalVariableDescriptor]

'length' @ [36:43] ==> value-parameter length: Int defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[ValueParameterDescriptorImpl]

'if (readBytes == length) buf
               else buf.copyOfRange(0, readBytes)' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ByteArray, elseBranch: ByteArray): ByteArray[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ByteArray

'readBytes' @ [37:20] ==> val readBytes: Int defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[LocalVariableDescriptor]

'length' @ [37:33] ==> value-parameter length: Int defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[ValueParameterDescriptorImpl]

'buf' @ [37:41] ==> val buf: ByteArray defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[LocalVariableDescriptor]

'buf' @ [38:21] ==> val buf: ByteArray defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[LocalVariableDescriptor]

'copyOfRange' @ [38:25] ==> @InlineOnly public inline fun ByteArray.copyOfRange(fromIndex: Int, toIndex: Int): ByteArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'readBytes' @ [38:40] ==> val readBytes: Int defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer.read[LocalVariableDescriptor]

'`in`' @ [42:13] ==> public final val `in`: InputStream defined in org.jetbrains.kotlin.daemon.client.RemoteInputStreamServer[PropertyDescriptorImpl]

'read' @ [42:18] ==> public abstract fun read(): Int defined in java.io.InputStream[JavaMethodDescriptor]

