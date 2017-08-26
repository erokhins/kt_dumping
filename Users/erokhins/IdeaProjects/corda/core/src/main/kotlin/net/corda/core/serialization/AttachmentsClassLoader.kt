'getSystemClassLoader' @ [23:95] ==> @CallerSensitive public open fun getSystemClassLoader(): (ClassLoader..ClassLoader?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'SecureClassLoader' @ [23:121] ==> protected/*protected and package*/ constructor SecureClassLoader(p0: (ClassLoader..ClassLoader?)) defined in java.security.SecureClassLoader[JavaClassConstructorDescriptor]

'parent' @ [23:139] ==> value-parameter parent: ClassLoader = ... defined in net.corda.core.serialization.AttachmentsClassLoader.<init>[ValueParameterDescriptorImpl]

'HashMap' @ [24:38] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Attachment

'HashMap' @ [25:36] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SecureHash
    <V : (Any..Any?)> -> Attachment

'CordaSerializable' @ [27:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Exception' @ [28:54] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'path' @ [29:80] ==> public final val path: String defined in net.corda.core.serialization.AttachmentsClassLoader.OverlappingAttachments[PropertyDescriptorImpl]

'attachments' @ [33:28] ==> value-parameter attachments: List<Attachment> defined in net.corda.core.serialization.AttachmentsClassLoader.<init>[ValueParameterDescriptorImpl]

'attachment' @ [34:13] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.<init>[LocalVariableDescriptor]

'openAsJAR' @ [34:24] ==> public open fun openAsJAR(): JarInputStream defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'use' @ [34:36] ==> @InlineOnly public inline fun <T : Closeable?, R> JarInputStream.use(block: (JarInputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarInputStream
    <R> -> Unit

'jar' @ [36:33] ==> value-parameter jar: JarInputStream defined in net.corda.core.serialization.AttachmentsClassLoader.<init>.<anonymous>[ValueParameterDescriptorImpl]

'nextJarEntry' @ [36:37] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'entry' @ [45:32] ==> val entry: JarEntry defined in net.corda.core.serialization.AttachmentsClassLoader.<init>.<anonymous>[LocalVariableDescriptor]

'name' @ [45:38] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'toLowerCase' @ [45:43] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [45:57] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'path' @ [46:25] ==> val path: String defined in net.corda.core.serialization.AttachmentsClassLoader.<init>.<anonymous>[LocalVariableDescriptor]

'pathsToAttachments' @ [46:33] ==> private final val pathsToAttachments: HashMap<String, Attachment> defined in net.corda.core.serialization.AttachmentsClassLoader[PropertyDescriptorImpl]

'OverlappingAttachments' @ [47:31] ==> public constructor OverlappingAttachments(path: String) defined in net.corda.core.serialization.AttachmentsClassLoader.OverlappingAttachments[ClassConstructorDescriptorImpl]

'path' @ [47:54] ==> val path: String defined in net.corda.core.serialization.AttachmentsClassLoader.<init>.<anonymous>[LocalVariableDescriptor]

'pathsToAttachments' @ [48:21] ==> private final val pathsToAttachments: HashMap<String, Attachment> defined in net.corda.core.serialization.AttachmentsClassLoader[PropertyDescriptorImpl]

'path' @ [48:40] ==> val path: String defined in net.corda.core.serialization.AttachmentsClassLoader.<init>.<anonymous>[LocalVariableDescriptor]

'attachment' @ [48:48] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.<init>[LocalVariableDescriptor]

'idsToAttachments' @ [51:13] ==> private final val idsToAttachments: HashMap<SecureHash, Attachment> defined in net.corda.core.serialization.AttachmentsClassLoader[PropertyDescriptorImpl]

'attachment' @ [51:30] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.<init>[LocalVariableDescriptor]

'id' @ [51:41] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.Attachment[PropertyDescriptorImpl]

'attachment' @ [51:47] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.<init>[LocalVariableDescriptor]

'URLStreamHandler' @ [60:46] ==> public constructor URLStreamHandler() defined in java.net.URLStreamHandler[JavaClassConstructorDescriptor]

'UnsupportedOperationException' @ [62:19] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'URL' @ [66:51] ==> public constructor URL(p0: (URL..URL?), p1: (String..String?), p2: (URLStreamHandler..URLStreamHandler?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'+' @ [66:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'id' @ [66:76] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.Attachment[PropertyDescriptorImpl]

'path' @ [66:84] ==> value-parameter path: String? defined in net.corda.core.serialization.AttachmentsClassLoader.toURL[ValueParameterDescriptorImpl]

'fakeStreamHandler' @ [66:97] ==> private final val fakeStreamHandler: <no name provided> defined in net.corda.core.serialization.AttachmentsClassLoader[PropertyDescriptorImpl]

'name' @ [69:20] ==> value-parameter name: String defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[ValueParameterDescriptorImpl]

'replace' @ [69:25] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toLowerCase' @ [69:43] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathsToAttachments' @ [70:26] ==> private final val pathsToAttachments: HashMap<String, Attachment> defined in net.corda.core.serialization.AttachmentsClassLoader[PropertyDescriptorImpl]

'path' @ [70:45] ==> val path: String defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'ClassNotFoundException' @ [70:60] ==> public constructor ClassNotFoundException(p0: (String..String?)) defined in java.lang.ClassNotFoundException[JavaClassConstructorDescriptor]

'name' @ [70:83] ==> value-parameter name: String defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[ValueParameterDescriptorImpl]

'ByteArrayOutputStream' @ [71:22] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'attachment' @ [73:13] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'extractFile' @ [73:24] ==> public open fun extractFile(path: String, outputTo: OutputStream): Unit defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'path' @ [73:36] ==> val path: String defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'stream' @ [73:42] ==> val stream: ByteArrayOutputStream defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'ClassNotFoundException' @ [75:19] ==> public constructor ClassNotFoundException(p0: (String..String?)) defined in java.lang.ClassNotFoundException[JavaClassConstructorDescriptor]

'name' @ [75:42] ==> value-parameter name: String defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[ValueParameterDescriptorImpl]

'stream' @ [77:21] ==> val stream: ByteArrayOutputStream defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'toByteArray' @ [77:28] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'CodeSource' @ [80:26] ==> public constructor CodeSource(p0: (URL..URL?), p1: (Array<(CodeSigner..CodeSigner?)>..Array<out (CodeSigner..CodeSigner?)>?)) defined in java.security.CodeSource[JavaClassConstructorDescriptor]

'attachment' @ [80:37] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'toURL' @ [80:48] ==> private final fun Attachment.toURL(path: String?): URL defined in net.corda.core.serialization.AttachmentsClassLoader[SimpleFunctionDescriptorImpl]

'emptyArray' @ [80:61] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<CodeSigner> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> CodeSigner

'defineClass' @ [84:16] ==> protected/*protected and package*/ final fun defineClass(p0: (String..String?), p1: (ByteArray..ByteArray?), p2: Int, p3: Int, p4: (CodeSource..CodeSource?)): (Class<*>..Class<*>?) defined in net.corda.core.serialization.AttachmentsClassLoader[JavaMethodDescriptor]

'name' @ [84:28] ==> value-parameter name: String defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[ValueParameterDescriptorImpl]

'bytes' @ [84:34] ==> val bytes: (ByteArray..ByteArray?) defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'bytes' @ [84:44] ==> val bytes: (ByteArray..ByteArray?) defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'size' @ [84:50] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'codesource' @ [84:56] ==> val codesource: CodeSource defined in net.corda.core.serialization.AttachmentsClassLoader.findClass[LocalVariableDescriptor]

'pathsToAttachments' @ [88:26] ==> private final val pathsToAttachments: HashMap<String, Attachment> defined in net.corda.core.serialization.AttachmentsClassLoader[PropertyDescriptorImpl]

'name' @ [88:45] ==> value-parameter name: String defined in net.corda.core.serialization.AttachmentsClassLoader.findResource[ValueParameterDescriptorImpl]

'toLowerCase' @ [88:50] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'attachment' @ [89:16] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.findResource[LocalVariableDescriptor]

'toURL' @ [89:27] ==> private final fun Attachment.toURL(path: String?): URL defined in net.corda.core.serialization.AttachmentsClassLoader[SimpleFunctionDescriptorImpl]

'name' @ [89:33] ==> value-parameter name: String defined in net.corda.core.serialization.AttachmentsClassLoader.findResource[ValueParameterDescriptorImpl]

'getResource' @ [93:19] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in net.corda.core.serialization.AttachmentsClassLoader[JavaMethodDescriptor]

'name' @ [93:31] ==> value-parameter name: String defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[ValueParameterDescriptorImpl]

'url' @ [94:13] ==> val url: URL defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[LocalVariableDescriptor]

'protocol' @ [94:17] ==> public final val URL.protocol: (String..String?)[MyPropertyDescriptor]

'idsToAttachments' @ [95:26] ==> private final val idsToAttachments: HashMap<SecureHash, Attachment> defined in net.corda.core.serialization.AttachmentsClassLoader[PropertyDescriptorImpl]

'SecureHash' @ [95:43] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [95:54] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'url' @ [95:60] ==> val url: URL defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[LocalVariableDescriptor]

'host' @ [95:64] ==> public final val URL.host: (String..String?)[MyPropertyDescriptor]

'url' @ [96:20] ==> val url: URL defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[LocalVariableDescriptor]

'path' @ [96:24] ==> public final val URL.path: (String..String?)[MyPropertyDescriptor]

'substring' @ [96:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ByteArrayOutputStream' @ [98:26] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'attachment' @ [99:13] ==> val attachment: Attachment defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[LocalVariableDescriptor]

'extractFile' @ [99:24] ==> public open fun extractFile(path: String, outputTo: OutputStream): Unit defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'path' @ [99:36] ==> val path: String defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[LocalVariableDescriptor]

'stream' @ [99:42] ==> val stream: ByteArrayOutputStream defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[LocalVariableDescriptor]

'ByteArrayInputStream' @ [100:20] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'stream' @ [100:41] ==> val stream: ByteArrayOutputStream defined in net.corda.core.serialization.AttachmentsClassLoader.getResourceAsStream[LocalVariableDescriptor]

'toByteArray' @ [100:48] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

