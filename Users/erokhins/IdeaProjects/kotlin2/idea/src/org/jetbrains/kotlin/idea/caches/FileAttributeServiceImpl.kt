'newConcurrentMap' @ [27:71] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> newConcurrentMap(): ConcurrentMap<(String..String?), (FileAttribute..FileAttribute?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> FileAttribute

'attributes' @ [30:9] ==> public final val attributes: MutableMap<String, FileAttribute> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[PropertyDescriptorImpl]

'id' @ [30:20] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.register[ValueParameterDescriptorImpl]

'FileAttribute' @ [30:26] ==> public constructor FileAttribute(@NonNls @NotNull p0: String, p1: Int, p2: Boolean) defined in com.intellij.openapi.vfs.newvfs.FileAttribute[JavaClassConstructorDescriptor]

'id' @ [30:40] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.register[ValueParameterDescriptorImpl]

'version' @ [30:44] ==> value-parameter version: Int defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.register[ValueParameterDescriptorImpl]

'fixedSize' @ [30:53] ==> value-parameter fixedSize: Boolean defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.register[ValueParameterDescriptorImpl]

'write' @ [34:16] ==> public open fun <T> write(file: VirtualFile, id: String, value: T, writeValueFun: (DataOutput, T) -> Unit): CachedAttributeData<T> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'file' @ [34:22] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeEnumAttribute[ValueParameterDescriptorImpl]

'id' @ [34:28] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeEnumAttribute[ValueParameterDescriptorImpl]

'value' @ [34:32] ==> value-parameter value: T defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeEnumAttribute[ValueParameterDescriptorImpl]

'writeINT' @ [35:33] ==> public open fun writeINT(@NotNull p0: DataOutput, p1: Int): Unit defined in com.intellij.util.io.DataInputOutputUtil[JavaMethodDescriptor]

'output' @ [35:42] ==> value-parameter output: DataOutput defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeEnumAttribute.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [35:50] ==> value-parameter v: T defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeEnumAttribute.<anonymous>[ValueParameterDescriptorImpl]

'ordinal' @ [35:52] ==> public final val ordinal: Int defined in kotlin.Enum[DeserializedPropertyDescriptor]

'read' @ [40:16] ==> public open fun <T> read(file: VirtualFile, id: String, readValueFun: (DataInput) -> T): CachedAttributeData<T>? defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'file' @ [40:21] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.readEnumAttribute[ValueParameterDescriptorImpl]

'id' @ [40:27] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.readEnumAttribute[ValueParameterDescriptorImpl]

'deserializeEnumValue' @ [41:13] ==> private final fun <T : Enum<T>> deserializeEnumValue(i: Int, klass: Class<T>): T defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Enum<T>> -> T

'readINT' @ [41:54] ==> public open fun readINT(@NotNull p0: DataInput): Int defined in com.intellij.util.io.DataInputOutputUtil[JavaMethodDescriptor]

'input' @ [41:62] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.readEnumAttribute.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [41:70] ==> value-parameter klass: Class<T> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.readEnumAttribute[ValueParameterDescriptorImpl]

'write' @ [47:16] ==> public open fun <T> write(file: VirtualFile, id: String, value: Boolean, writeValueFun: (DataOutput, Boolean) -> Unit): CachedAttributeData<Boolean> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'file' @ [47:22] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeBooleanAttribute[ValueParameterDescriptorImpl]

'id' @ [47:28] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeBooleanAttribute[ValueParameterDescriptorImpl]

'value' @ [47:32] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeBooleanAttribute[ValueParameterDescriptorImpl]

'writeINT' @ [48:33] ==> public open fun writeINT(@NotNull p0: DataOutput, p1: Int): Unit defined in com.intellij.util.io.DataInputOutputUtil[JavaMethodDescriptor]

'output' @ [48:42] ==> value-parameter output: DataOutput defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeBooleanAttribute.<anonymous>[ValueParameterDescriptorImpl]

'if (v) 1 else 0' @ [48:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'v' @ [48:54] ==> value-parameter v: Boolean defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.writeBooleanAttribute.<anonymous>[ValueParameterDescriptorImpl]

'read' @ [53:16] ==> public open fun <T> read(file: VirtualFile, id: String, readValueFun: (DataInput) -> Boolean): CachedAttributeData<Boolean>? defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'file' @ [53:21] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.readBooleanAttribute[ValueParameterDescriptorImpl]

'id' @ [53:27] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.readBooleanAttribute[ValueParameterDescriptorImpl]

'>' @ [54:13] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'readINT' @ [54:33] ==> public open fun readINT(@NotNull p0: DataInput): Int defined in com.intellij.util.io.DataInputOutputUtil[JavaMethodDescriptor]

'input' @ [54:41] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.readBooleanAttribute.<anonymous>[ValueParameterDescriptorImpl]

'attributes' @ [59:25] ==> public final val attributes: MutableMap<String, FileAttribute> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[PropertyDescriptorImpl]

'id' @ [59:36] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [59:49] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'id' @ [59:91] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[ValueParameterDescriptorImpl]

'CachedAttributeData' @ [61:20] ==> public constructor CachedAttributeData<out T>(value: T, timeStamp: Long) defined in org.jetbrains.kotlin.idea.caches.CachedAttributeData[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> T

'value' @ [61:40] ==> value-parameter value: T defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[ValueParameterDescriptorImpl]

'file' @ [61:59] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[ValueParameterDescriptorImpl]

'timeStamp' @ [61:64] ==> public final val VirtualFile.timeStamp: Long[MyPropertyDescriptor]

'attribute' @ [63:9] ==> val attribute: FileAttribute defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[LocalVariableDescriptor]

'writeAttribute' @ [63:19] ==> @NotNull public open fun writeAttribute(@NotNull p0: VirtualFile): DataOutputStream defined in com.intellij.openapi.vfs.newvfs.FileAttribute[JavaMethodDescriptor]

'file' @ [63:34] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[ValueParameterDescriptorImpl]

'use' @ [63:40] ==> @InlineOnly public inline fun <T : Closeable?, R> DataOutputStream.use(block: (DataOutputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> DataOutputStream
    <R> -> Unit

'writeTIME' @ [64:33] ==> public open fun writeTIME(@NotNull p0: DataOutput, p1: Long): Unit defined in com.intellij.util.io.DataInputOutputUtil[JavaMethodDescriptor]

'it' @ [64:43] ==> value-parameter it: DataOutputStream defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [64:47] ==> val data: CachedAttributeData<T> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[LocalVariableDescriptor]

'timeStamp' @ [64:52] ==> public final val timeStamp: Long defined in org.jetbrains.kotlin.idea.caches.CachedAttributeData[DeserializedPropertyDescriptor]

'invoke' @ [65:13] ==> public abstract operator fun invoke(p1: DataOutput, p2: T): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [65:27] ==> value-parameter it: DataOutputStream defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [65:31] ==> value-parameter value: T defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[ValueParameterDescriptorImpl]

'data' @ [68:16] ==> val data: CachedAttributeData<T> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.write[LocalVariableDescriptor]

'attributes' @ [72:25] ==> public final val attributes: MutableMap<String, FileAttribute> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl[PropertyDescriptorImpl]

'id' @ [72:36] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [72:49] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'id' @ [72:91] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read[ValueParameterDescriptorImpl]

'attribute' @ [74:22] ==> val attribute: FileAttribute defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read[LocalVariableDescriptor]

'readAttribute' @ [74:32] ==> @Nullable public open fun readAttribute(@NotNull p0: VirtualFile): DataInputStream? defined in com.intellij.openapi.vfs.newvfs.FileAttribute[JavaMethodDescriptor]

'file' @ [74:46] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read[ValueParameterDescriptorImpl]

'stream' @ [75:16] ==> val stream: DataInputStream defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read[LocalVariableDescriptor]

'use' @ [75:23] ==> @InlineOnly public inline fun <T : Closeable?, R> DataInputStream.use(block: (DataInputStream) -> CachedAttributeData<T>?): CachedAttributeData<T>? defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> DataInputStream
    <R> -> CachedAttributeData<T>?

'readTIME' @ [76:49] ==> public open fun readTIME(@NotNull p0: DataInput): Long defined in com.intellij.util.io.DataInputOutputUtil[JavaMethodDescriptor]

'it' @ [76:58] ==> value-parameter it: DataInputStream defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [77:25] ==> public abstract operator fun invoke(p1: DataInput): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [77:38] ==> value-parameter it: DataInputStream defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read.<anonymous>[ValueParameterDescriptorImpl]

'if (file.timeStamp == timeStamp) {
                CachedAttributeData(value, timeStamp)
            }
            else {
                null
            }' @ [79:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CachedAttributeData<T>?, elseBranch: CachedAttributeData<T>?): CachedAttributeData<T>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CachedAttributeData<T>?

'file' @ [79:17] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read[ValueParameterDescriptorImpl]

'timeStamp' @ [79:22] ==> public final val VirtualFile.timeStamp: Long[MyPropertyDescriptor]

'timeStamp' @ [79:35] ==> val timeStamp: Long defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read.<anonymous>[LocalVariableDescriptor]

'CachedAttributeData' @ [80:17] ==> public constructor CachedAttributeData<out T>(value: T, timeStamp: Long) defined in org.jetbrains.kotlin.idea.caches.CachedAttributeData[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> T

'value' @ [80:37] ==> val value: T defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read.<anonymous>[LocalVariableDescriptor]

'timeStamp' @ [80:44] ==> val timeStamp: Long defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.read.<anonymous>[LocalVariableDescriptor]

'klass' @ [89:22] ==> value-parameter klass: Class<T> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.deserializeEnumValue[ValueParameterDescriptorImpl]

'getMethod' @ [89:28] ==> @CallerSensitive public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'Suppress' @ [91:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'method' @ [92:22] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.deserializeEnumValue[LocalVariableDescriptor]

'invoke' @ [92:29] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'values' @ [94:16] ==> val values: Array<T> defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.deserializeEnumValue[LocalVariableDescriptor]

'i' @ [94:23] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.caches.FileAttributeServiceImpl.deserializeEnumValue[ValueParameterDescriptorImpl]

