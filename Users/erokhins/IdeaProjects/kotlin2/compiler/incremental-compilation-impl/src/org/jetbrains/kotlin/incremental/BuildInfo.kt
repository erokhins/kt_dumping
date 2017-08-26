'ObjectInputStream' @ [25:21] ==> public constructor ObjectInputStream(p0: (InputStream..InputStream?)) defined in java.io.ObjectInputStream[JavaClassConstructorDescriptor]

'FileInputStream' @ [25:39] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'file' @ [25:55] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.BuildInfo.Companion.read[ValueParameterDescriptorImpl]

'use' @ [25:62] ==> @InlineOnly public inline fun <T : Closeable?, R> ObjectInputStream.use(block: (ObjectInputStream) -> BuildInfo): BuildInfo defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ObjectInputStream
    <R> -> BuildInfo

'it' @ [26:25] ==> value-parameter it: ObjectInputStream defined in org.jetbrains.kotlin.incremental.BuildInfo.Companion.read.<anonymous>[ValueParameterDescriptorImpl]

'readObject' @ [26:28] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'ObjectOutputStream' @ [34:13] ==> public constructor ObjectOutputStream(p0: (OutputStream..OutputStream?)) defined in java.io.ObjectOutputStream[JavaClassConstructorDescriptor]

'FileOutputStream' @ [34:32] ==> public constructor FileOutputStream(p0: (File..File?)) defined in java.io.FileOutputStream[JavaClassConstructorDescriptor]

'file' @ [34:49] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.BuildInfo.Companion.write[ValueParameterDescriptorImpl]

'use' @ [34:56] ==> @InlineOnly public inline fun <T : Closeable?, R> ObjectOutputStream.use(block: (ObjectOutputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ObjectOutputStream
    <R> -> Unit

'it' @ [35:17] ==> value-parameter it: ObjectOutputStream defined in org.jetbrains.kotlin.incremental.BuildInfo.Companion.write.<anonymous>[ValueParameterDescriptorImpl]

'writeObject' @ [35:20] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'buildInfo' @ [35:32] ==> value-parameter buildInfo: BuildInfo defined in org.jetbrains.kotlin.incremental.BuildInfo.Companion.write[ValueParameterDescriptorImpl]

