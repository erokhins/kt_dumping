'Socket' @ [30:16] ==> public constructor Socket(p0: (String..String?), p1: Int) defined in java.net.Socket[JavaClassConstructorDescriptor]

'serverPort' @ [30:36] ==> public final val serverPort: Int defined in org.jetbrains.kotlin.test.clientserver.TestProxy[PropertyDescriptorImpl]

'use' @ [30:48] ==> @InlineOnly public inline fun <T : Closeable?, R> Socket.use(block: (Socket) -> String): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> Socket
    <R> -> String

'ObjectOutputStream' @ [32:26] ==> public constructor ObjectOutputStream(p0: (OutputStream..OutputStream?)) defined in java.io.ObjectOutputStream[JavaClassConstructorDescriptor]

'clientSocket' @ [32:45] ==> value-parameter clientSocket: Socket defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[ValueParameterDescriptorImpl]

'getOutputStream' @ [32:58] ==> public open fun getOutputStream(): (OutputStream..OutputStream?) defined in java.net.Socket[JavaMethodDescriptor]

'ObjectInputStream' @ [33:25] ==> public constructor ObjectInputStream(p0: (InputStream..InputStream?)) defined in java.io.ObjectInputStream[JavaClassConstructorDescriptor]

'clientSocket' @ [33:43] ==> value-parameter clientSocket: Socket defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[ValueParameterDescriptorImpl]

'getInputStream' @ [33:56] ==> public open fun getInputStream(): (InputStream..InputStream?) defined in java.net.Socket[JavaMethodDescriptor]

'output' @ [35:17] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'writeObject' @ [35:24] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'NEW_TEST' @ [35:50] ==> enum entry NEW_TEST defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'output' @ [36:17] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'writeObject' @ [36:24] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'testClass' @ [36:36] ==> public final val testClass: String defined in org.jetbrains.kotlin.test.clientserver.TestProxy[PropertyDescriptorImpl]

'output' @ [37:17] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'writeObject' @ [37:24] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'output' @ [39:17] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'writeObject' @ [39:24] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'CLASS_PATH' @ [39:50] ==> enum entry CLASS_PATH defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'output' @ [41:17] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'writeObject' @ [41:24] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'filterOutJdkJars' @ [41:36] ==> public final fun filterOutJdkJars(classPath: List<URL>): List<URL> defined in org.jetbrains.kotlin.test.clientserver.TestProxy[SimpleFunctionDescriptorImpl]

'classPath' @ [41:53] ==> public final val classPath: List<URL> defined in org.jetbrains.kotlin.test.clientserver.TestProxy[PropertyDescriptorImpl]

'toTypedArray' @ [41:64] ==> public inline fun <reified T> Collection<URL>.toTypedArray(): Array<URL> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> URL

'input' @ [43:31] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'readObject' @ [43:37] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'if (message == MessageHeader.RESULT) {
                    input.readObject() as String
                }
                else if (message == MessageHeader.ERROR) {
                    throw input.readObject() as Exception
                }
                else {
                    fail("Unknown message: $message")
                }' @ [44:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'message' @ [44:21] ==> val message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'RESULT' @ [44:46] ==> enum entry RESULT defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'input' @ [45:21] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'readObject' @ [45:27] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'if (message == MessageHeader.ERROR) {
                    throw input.readObject() as Exception
                }
                else {
                    fail("Unknown message: $message")
                }' @ [47:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'message' @ [47:26] ==> val message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'ERROR' @ [47:51] ==> enum entry ERROR defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'input' @ [48:27] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'readObject' @ [48:33] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'fail' @ [51:21] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'message' @ [51:45] ==> val message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'output' @ [54:17] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'close' @ [54:24] ==> public open fun close(): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'input' @ [55:17] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.TestProxy.runTest.<anonymous>[LocalVariableDescriptor]

'close' @ [55:23] ==> public open fun close(): Unit defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'getProperty' @ [61:31] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'File' @ [62:26] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'javaHome' @ [62:31] ==> val javaHome: (String..String?) defined in org.jetbrains.kotlin.test.clientserver.TestProxy.filterOutJdkJars[LocalVariableDescriptor]

'classPath' @ [63:16] ==> value-parameter classPath: List<URL> defined in org.jetbrains.kotlin.test.clientserver.TestProxy.filterOutJdkJars[ValueParameterDescriptorImpl]

'filterNot' @ [63:26] ==> public inline fun <T> Iterable<URL>.filterNot(predicate: (URL) -> Boolean): List<URL> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> URL

'File' @ [64:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [64:18] ==> value-parameter it: URL defined in org.jetbrains.kotlin.test.clientserver.TestProxy.filterOutJdkJars.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [64:21] ==> public final val URL.file: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [64:27] ==> public fun File.startsWith(other: File): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'javaFolder' @ [64:38] ==> val javaFolder: File defined in org.jetbrains.kotlin.test.clientserver.TestProxy.filterOutJdkJars[LocalVariableDescriptor]

