'!!' @ [33:20] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: ExecutorService?): ExecutorService[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> ExecutorService

'newFixedThreadPool' @ [33:30] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'JvmStatic' @ [35:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'args' @ [37:26] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.test.clientserver.TestProcessServer.main[ValueParameterDescriptorImpl]

'toInt' @ [37:34] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'println' @ [38:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'portNumber' @ [38:43] ==> val portNumber: Int defined in org.jetbrains.kotlin.test.clientserver.TestProcessServer.main[LocalVariableDescriptor]

'ServerSocket' @ [40:28] ==> public constructor ServerSocket(p0: Int) defined in java.net.ServerSocket[JavaClassConstructorDescriptor]

'portNumber' @ [40:41] ==> val portNumber: Int defined in org.jetbrains.kotlin.test.clientserver.TestProcessServer.main[LocalVariableDescriptor]

'serverSocket' @ [43:36] ==> val serverSocket: ServerSocket defined in org.jetbrains.kotlin.test.clientserver.TestProcessServer.main[LocalVariableDescriptor]

'accept' @ [43:49] ==> public open fun accept(): (Socket..Socket?) defined in java.net.ServerSocket[JavaMethodDescriptor]

'println' @ [44:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'executor' @ [45:17] ==> public final val executor: ExecutorService defined in org.jetbrains.kotlin.test.clientserver.TestProcessServer[PropertyDescriptorImpl]

'execute' @ [45:26] ==> public abstract fun execute(p0: (Runnable..Runnable?)): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'ServerTest' @ [45:34] ==> public constructor ServerTest(clientSocket: Socket) defined in org.jetbrains.kotlin.test.clientserver.ServerTest[ClassConstructorDescriptorImpl]

'clientSocket' @ [45:45] ==> val clientSocket: (Socket..Socket?) defined in org.jetbrains.kotlin.test.clientserver.TestProcessServer.main[LocalVariableDescriptor]

'serverSocket' @ [49:13] ==> val serverSocket: ServerSocket defined in org.jetbrains.kotlin.test.clientserver.TestProcessServer.main[LocalVariableDescriptor]

'close' @ [49:26] ==> public open fun close(): Unit defined in java.net.ServerSocket[JavaMethodDescriptor]

'ObjectInputStream' @ [59:21] ==> public constructor ObjectInputStream(p0: (InputStream..InputStream?)) defined in java.io.ObjectInputStream[JavaClassConstructorDescriptor]

'clientSocket' @ [59:39] ==> public final val clientSocket: Socket defined in org.jetbrains.kotlin.test.clientserver.ServerTest[PropertyDescriptorImpl]

'getInputStream' @ [59:52] ==> public open fun getInputStream(): (InputStream..InputStream?) defined in java.net.Socket[JavaMethodDescriptor]

'ObjectOutputStream' @ [60:22] ==> public constructor ObjectOutputStream(p0: (OutputStream..OutputStream?)) defined in java.io.ObjectOutputStream[JavaClassConstructorDescriptor]

'clientSocket' @ [60:41] ==> public final val clientSocket: Socket defined in org.jetbrains.kotlin.test.clientserver.ServerTest[PropertyDescriptorImpl]

'getOutputStream' @ [60:54] ==> public open fun getOutputStream(): (OutputStream..OutputStream?) defined in java.net.Socket[JavaMethodDescriptor]

'input' @ [62:27] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'readObject' @ [62:33] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'assert' @ [63:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'message' @ [63:20] ==> var message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'NEW_TEST' @ [63:45] ==> enum entry NEW_TEST defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'message' @ [63:87] ==> var message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'className' @ [64:13] ==> private final lateinit var className: String defined in org.jetbrains.kotlin.test.clientserver.ServerTest[PropertyDescriptorImpl]

'input' @ [64:25] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'readObject' @ [64:31] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'testMethod' @ [65:13] ==> private final lateinit var testMethod: String defined in org.jetbrains.kotlin.test.clientserver.ServerTest[PropertyDescriptorImpl]

'input' @ [65:26] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'readObject' @ [65:32] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'println' @ [66:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'className' @ [66:49] ==> private final lateinit var className: String defined in org.jetbrains.kotlin.test.clientserver.ServerTest[PropertyDescriptorImpl]

'message' @ [68:13] ==> var message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'input' @ [68:23] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'readObject' @ [68:29] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'assert' @ [69:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'message' @ [69:20] ==> var message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'CLASS_PATH' @ [69:45] ==> enum entry CLASS_PATH defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'message' @ [69:91] ==> var message: MessageHeader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'input' @ [70:29] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'readObject' @ [70:35] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'executeTest' @ [72:26] ==> public final fun executeTest(classLoader: ClassLoader): String defined in org.jetbrains.kotlin.test.clientserver.ServerTest[SimpleFunctionDescriptorImpl]

'URLClassLoader' @ [72:38] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'classPath' @ [72:53] ==> val classPath: Array<URL> defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'JDK_EXT_JARS_CLASS_LOADER' @ [72:64] ==> public final val JDK_EXT_JARS_CLASS_LOADER: ClassLoader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion[PropertyDescriptorImpl]

'output' @ [73:13] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'writeObject' @ [73:20] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'RESULT' @ [73:46] ==> enum entry RESULT defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'output' @ [74:13] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'writeObject' @ [74:20] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'result' @ [74:32] ==> val result: String defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'output' @ [77:13] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'writeObject' @ [77:20] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'ERROR' @ [77:46] ==> enum entry ERROR defined in org.jetbrains.kotlin.test.clientserver.MessageHeader[FakeCallableDescriptorForObject]

'output' @ [78:13] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'writeObject' @ [78:20] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'e' @ [78:32] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'output' @ [81:13] ==> val output: ObjectOutputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'close' @ [81:20] ==> public open fun close(): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'input' @ [82:13] ==> val input: ObjectInputStream defined in org.jetbrains.kotlin.test.clientserver.ServerTest.run[LocalVariableDescriptor]

'close' @ [82:19] ==> public open fun close(): Unit defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'clientSocket' @ [83:13] ==> public final val clientSocket: Socket defined in org.jetbrains.kotlin.test.clientserver.ServerTest[PropertyDescriptorImpl]

'close' @ [83:26] ==> public open fun close(): Unit defined in java.net.Socket[JavaMethodDescriptor]

'getGeneratedClass' @ [88:21] ==> public fun getGeneratedClass(classLoader: ClassLoader, className: String): Class<*> defined in org.jetbrains.kotlin.codegen in file testUtils.kt[SimpleFunctionDescriptorImpl]

'classLoader' @ [88:39] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.executeTest[ValueParameterDescriptorImpl]

'className' @ [88:52] ==> private final lateinit var className: String defined in org.jetbrains.kotlin.test.clientserver.ServerTest[PropertyDescriptorImpl]

'getBoxMethodOrNull' @ [89:16] ==> public fun getBoxMethodOrNull(aClass: Class<*>): Method? defined in org.jetbrains.kotlin.codegen in file testUtils.kt[SimpleFunctionDescriptorImpl]

'clazz' @ [89:35] ==> val clazz: Class<*> defined in org.jetbrains.kotlin.test.clientserver.ServerTest.executeTest[LocalVariableDescriptor]

'invoke' @ [89:44] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'getProperty' @ [96:35] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'File' @ [97:29] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'javaHome' @ [97:34] ==> val javaHome: (String..String?) defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion.<init>[LocalVariableDescriptor]

'println' @ [98:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'extFolder' @ [98:21] ==> val extFolder: File defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion.<init>[LocalVariableDescriptor]

'canonicalPath' @ [98:31] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'extFolder' @ [99:29] ==> val extFolder: File defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion.<init>[LocalVariableDescriptor]

'listFiles' @ [99:39] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'listFiles' @ [100:34] ==> val listFiles: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion.<init>[LocalVariableDescriptor]

'filter' @ [100:45] ==> public inline fun <T> Array<out (File..File?)>.filter(predicate: ((File..File?)) -> Boolean): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'it' @ [100:54] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [100:57] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [100:62] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [100:82] ==> public inline fun <T, R> Iterable<(File..File?)>.map(transform: ((File..File?)) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [100:88] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [100:91] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [100:99] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'emptyList' @ [100:112] ==> public fun <T> emptyList(): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)

'JDK_EXT_JARS_CLASS_LOADER' @ [101:13] ==> public final val JDK_EXT_JARS_CLASS_LOADER: ClassLoader defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion[PropertyDescriptorImpl]

'URLClassLoader' @ [101:41] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'additionalJars' @ [101:56] ==> val additionalJars: List<(URL..URL?)> defined in org.jetbrains.kotlin.test.clientserver.ServerTest.Companion.<init>[LocalVariableDescriptor]

'toTypedArray' @ [101:71] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

