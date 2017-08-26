'infos' @ [24:60] ==> private final val infos: List<ProtoBuf.SinceKotlinInfo> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable[PropertyDescriptorImpl]

'getOrNull' @ [24:66] ==> public fun <T> List<ProtoBuf.SinceKotlinInfo>.getOrNull(index: Int): ProtoBuf.SinceKotlinInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SinceKotlinInfo

'id' @ [24:76] ==> value-parameter id: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable.get[ValueParameterDescriptorImpl]

'SinceKotlinInfoTable' @ [27:21] ==> private constructor SinceKotlinInfoTable(infos: List<ProtoBuf.SinceKotlinInfo>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable[ClassConstructorDescriptorImpl]

'emptyList' @ [27:42] ==> public fun <T> emptyList(): List<ProtoBuf.SinceKotlinInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SinceKotlinInfo

'if (table.infoCount == 0) EMPTY else SinceKotlinInfoTable(table.infoList)' @ [30:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SinceKotlinInfoTable, elseBranch: SinceKotlinInfoTable): SinceKotlinInfoTable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SinceKotlinInfoTable

'table' @ [30:21] ==> value-parameter table: ProtoBuf.SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable.Companion.create[ValueParameterDescriptorImpl]

'infoCount' @ [30:27] ==> public final val ProtoBuf.SinceKotlinInfoTable.infoCount: Int[MyPropertyDescriptor]

'EMPTY' @ [30:43] ==> public final val EMPTY: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable.Companion[PropertyDescriptorImpl]

'SinceKotlinInfoTable' @ [30:54] ==> private constructor SinceKotlinInfoTable(infos: List<ProtoBuf.SinceKotlinInfo>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable[ClassConstructorDescriptorImpl]

'table' @ [30:75] ==> value-parameter table: ProtoBuf.SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable.Companion.create[ValueParameterDescriptorImpl]

'infoList' @ [30:81] ==> public final val ProtoBuf.SinceKotlinInfoTable.infoList: (MutableList<(ProtoBuf.SinceKotlinInfo..ProtoBuf.SinceKotlinInfo?)>..List<(ProtoBuf.SinceKotlinInfo..ProtoBuf.SinceKotlinInfo?)>?)[MyPropertyDescriptor]

'if (patch == 0) "$major.$minor" else "$major.$minor.$patch"' @ [42:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'patch' @ [42:21] ==> public final val patch: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'major' @ [42:35] ==> public final val major: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'minor' @ [42:42] ==> public final val minor: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'major' @ [42:56] ==> public final val major: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'minor' @ [42:63] ==> public final val minor: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'patch' @ [42:70] ==> public final val patch: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'when {
            this == INFINITY -> {
                // Do nothing: absence of version means INFINITY
            }
            major > MAJOR_MASK || minor > MINOR_MASK || patch > PATCH_MASK -> {
                writeVersionFull(major or (minor shl 8) or (patch shl 16))
            }
            else -> {
                writeVersion(major or (minor shl MAJOR_BITS) or (patch shl (MAJOR_BITS + MINOR_BITS)))
            }
        }' @ [47:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [48:13] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[LazyClassReceiverParameterDescriptor]

'INFINITY' @ [48:21] ==> @JvmField public final val INFINITY: SinceKotlinInfo.Version defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'major' @ [51:13] ==> public final val major: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'MAJOR_MASK' @ [51:21] ==> private const final val MAJOR_MASK: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'minor' @ [51:35] ==> public final val minor: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'MINOR_MASK' @ [51:43] ==> private const final val MINOR_MASK: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'patch' @ [51:57] ==> public final val patch: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'PATCH_MASK' @ [51:65] ==> private const final val PATCH_MASK: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'invoke' @ [52:17] ==> public abstract operator fun invoke(p1: Int): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'major' @ [52:34] ==> public final val major: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'minor' @ [52:44] ==> public final val minor: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'patch' @ [52:61] ==> public final val patch: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'invoke' @ [55:17] ==> public abstract operator fun invoke(p1: Int): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'major' @ [55:30] ==> public final val major: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'minor' @ [55:40] ==> public final val minor: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'MAJOR_BITS' @ [55:50] ==> private const final val MAJOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'patch' @ [55:66] ==> public final val patch: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[PropertyDescriptorImpl]

'MAJOR_BITS' @ [55:77] ==> private const final val MAJOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'MINOR_BITS' @ [55:90] ==> private const final val MINOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'asString' @ [59:43] ==> public final fun asString(): String defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[SimpleFunctionDescriptorImpl]

'JvmField' @ [62:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Version' @ [63:28] ==> public constructor Version(major: Int, minor: Int, patch: Int = ...) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[ClassConstructorDescriptorImpl]

'-' @ [69:44] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'shl' @ [69:45] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'MAJOR_BITS' @ [69:51] ==> private const final val MAJOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'-' @ [70:44] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'shl' @ [70:45] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'MINOR_BITS' @ [70:51] ==> private const final val MINOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'-' @ [71:44] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'shl' @ [71:45] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PATCH_BITS' @ [71:51] ==> private const final val PATCH_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'when {
                versionFull != null -> Version(
                        major = versionFull and 255,
                        minor = (versionFull shr 8) and 255,
                        patch = (versionFull shr 16) and 255
                )
                version != null -> Version(
                        major = version and MAJOR_MASK,
                        minor = (version shr MAJOR_BITS) and MINOR_MASK,
                        patch = (version shr (MAJOR_BITS + MINOR_BITS)) and PATCH_MASK
                )
                else -> Version.INFINITY
            }' @ [73:69] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SinceKotlinInfo.Version, entry1: SinceKotlinInfo.Version, entry2: SinceKotlinInfo.Version): SinceKotlinInfo.Version[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Version

'versionFull' @ [74:17] ==> value-parameter versionFull: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'Version' @ [74:40] ==> public constructor Version(major: Int, minor: Int, patch: Int = ...) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[ClassConstructorDescriptorImpl]

'versionFull' @ [75:33] ==> value-parameter versionFull: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'and' @ [76:33] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'versionFull' @ [76:34] ==> value-parameter versionFull: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'and' @ [77:33] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'versionFull' @ [77:34] ==> value-parameter versionFull: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'version' @ [79:17] ==> value-parameter version: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'Version' @ [79:36] ==> public constructor Version(major: Int, minor: Int, patch: Int = ...) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[ClassConstructorDescriptorImpl]

'version' @ [80:33] ==> value-parameter version: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'MAJOR_MASK' @ [80:45] ==> private const final val MAJOR_MASK: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'and' @ [81:33] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'version' @ [81:34] ==> value-parameter version: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'MAJOR_BITS' @ [81:46] ==> private const final val MAJOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'MINOR_MASK' @ [81:62] ==> private const final val MINOR_MASK: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'and' @ [82:33] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'version' @ [82:34] ==> value-parameter version: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion.decode[ValueParameterDescriptorImpl]

'MAJOR_BITS' @ [82:47] ==> private const final val MAJOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'MINOR_BITS' @ [82:60] ==> private const final val MINOR_BITS: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'PATCH_MASK' @ [82:77] ==> private const final val PATCH_MASK: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'Version' @ [84:25] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[FakeCallableDescriptorForObject]

'INFINITY' @ [84:33] ==> @JvmField public final val INFINITY: SinceKotlinInfo.Version defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[PropertyDescriptorImpl]

'+' @ [90:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'version' @ [90:21] ==> public final val version: SinceKotlinInfo.Version defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[PropertyDescriptorImpl]

'level' @ [90:30] ==> public final val level: DeprecationLevel defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[PropertyDescriptorImpl]

'if (errorCode != null) " error $errorCode" else ""' @ [90:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'errorCode' @ [90:44] ==> public final val errorCode: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[PropertyDescriptorImpl]

'errorCode' @ [90:72] ==> public final val errorCode: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[PropertyDescriptorImpl]

'if (message != null) ": $message" else ""' @ [90:95] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'message' @ [90:99] ==> public final val message: String? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[PropertyDescriptorImpl]

'message' @ [90:120] ==> public final val message: String? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[PropertyDescriptorImpl]

'when (proto) {
                is ProtoBuf.Class -> if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null
                is ProtoBuf.Constructor -> if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null
                is ProtoBuf.Function -> if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null
                is ProtoBuf.Property -> if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null
                is ProtoBuf.TypeAlias -> if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null
                else -> throw IllegalStateException("Unexpected declaration: ${proto::class.java}")
            }' @ [94:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int, entry5: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'proto' @ [94:28] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null' @ [95:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [95:42] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'hasSinceKotlinInfo' @ [95:48] ==> public open fun hasSinceKotlinInfo(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'proto' @ [95:70] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'sinceKotlinInfo' @ [95:76] ==> public final val ProtoBuf.Class.sinceKotlinInfo: Int[MyPropertyDescriptor]

'if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null' @ [96:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [96:48] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'hasSinceKotlinInfo' @ [96:54] ==> public open fun hasSinceKotlinInfo(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor[JavaMethodDescriptor]

'proto' @ [96:76] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'sinceKotlinInfo' @ [96:82] ==> public final val ProtoBuf.Constructor.sinceKotlinInfo: Int[MyPropertyDescriptor]

'if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null' @ [97:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [97:45] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'hasSinceKotlinInfo' @ [97:51] ==> public open fun hasSinceKotlinInfo(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]

'proto' @ [97:73] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'sinceKotlinInfo' @ [97:79] ==> public final val ProtoBuf.Function.sinceKotlinInfo: Int[MyPropertyDescriptor]

'if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null' @ [98:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [98:45] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'hasSinceKotlinInfo' @ [98:51] ==> public open fun hasSinceKotlinInfo(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]

'proto' @ [98:73] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'sinceKotlinInfo' @ [98:79] ==> public final val ProtoBuf.Property.sinceKotlinInfo: Int[MyPropertyDescriptor]

'if (proto.hasSinceKotlinInfo()) proto.sinceKotlinInfo else return null' @ [99:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'proto' @ [99:46] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'hasSinceKotlinInfo' @ [99:52] ==> public open fun hasSinceKotlinInfo(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeAlias[JavaMethodDescriptor]

'proto' @ [99:74] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'sinceKotlinInfo' @ [99:80] ==> public final val ProtoBuf.TypeAlias.sinceKotlinInfo: Int[MyPropertyDescriptor]

'IllegalStateException' @ [100:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'proto' @ [100:80] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'java' @ [100:93] ==> public val <T> KClass<out MessageLite>.java: Class<out MessageLite> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MessageLite

'table' @ [103:24] ==> value-parameter table: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'id' @ [103:30] ==> val id: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'Version' @ [105:27] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version[FakeCallableDescriptorForObject]

'decode' @ [105:35] ==> public final fun decode(version: Int?, versionFull: Int?): SinceKotlinInfo.Version defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Version.Companion[SimpleFunctionDescriptorImpl]

'if (info.hasVersion()) info.version else null' @ [106:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'info' @ [106:25] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'hasVersion' @ [106:30] ==> public open fun hasVersion(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo[JavaMethodDescriptor]

'info' @ [106:44] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'version' @ [106:49] ==> public final val ProtoBuf.SinceKotlinInfo.version: Int[MyPropertyDescriptor]

'if (info.hasVersionFull()) info.versionFull else null' @ [107:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'info' @ [107:25] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'hasVersionFull' @ [107:30] ==> public open fun hasVersionFull(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo[JavaMethodDescriptor]

'info' @ [107:48] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'versionFull' @ [107:53] ==> public final val ProtoBuf.SinceKotlinInfo.versionFull: Int[MyPropertyDescriptor]

'when (info.level!!) {
                ProtoBuf.SinceKotlinInfo.Level.WARNING -> DeprecationLevel.WARNING
                ProtoBuf.SinceKotlinInfo.Level.ERROR -> DeprecationLevel.ERROR
                ProtoBuf.SinceKotlinInfo.Level.HIDDEN -> DeprecationLevel.HIDDEN
            }' @ [110:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeprecationLevel, entry1: DeprecationLevel, entry2: DeprecationLevel): DeprecationLevel[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeprecationLevel

'info' @ [110:31] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'level' @ [110:36] ==> public final val ProtoBuf.SinceKotlinInfo.level: (ProtoBuf.SinceKotlinInfo.Level..ProtoBuf.SinceKotlinInfo.Level?)[MyPropertyDescriptor]

'WARNING' @ [111:48] ==> enum entry WARNING defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo.Level[FakeCallableDescriptorForObject]

'WARNING' @ [111:76] ==> enum entry WARNING defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'ERROR' @ [112:48] ==> enum entry ERROR defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo.Level[FakeCallableDescriptorForObject]

'ERROR' @ [112:74] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'HIDDEN' @ [113:48] ==> enum entry HIDDEN defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo.Level[FakeCallableDescriptorForObject]

'HIDDEN' @ [113:75] ==> enum entry HIDDEN defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'if (info.hasErrorCode()) info.errorCode else null' @ [116:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'info' @ [116:33] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'hasErrorCode' @ [116:38] ==> public open fun hasErrorCode(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo[JavaMethodDescriptor]

'info' @ [116:54] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'errorCode' @ [116:59] ==> public final val ProtoBuf.SinceKotlinInfo.errorCode: Int[MyPropertyDescriptor]

'if (info.hasMessage()) nameResolver.getString(info.message) else null' @ [118:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'info' @ [118:31] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'hasMessage' @ [118:36] ==> public open fun hasMessage(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfo[JavaMethodDescriptor]

'nameResolver' @ [118:50] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[ValueParameterDescriptorImpl]

'getString' @ [118:63] ==> @NotNull public abstract fun getString(index: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'info' @ [118:73] ==> val info: ProtoBuf.SinceKotlinInfo defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'message' @ [118:78] ==> public final val ProtoBuf.SinceKotlinInfo.message: Int[MyPropertyDescriptor]

'SinceKotlinInfo' @ [120:20] ==> public constructor SinceKotlinInfo(version: SinceKotlinInfo.Version, level: DeprecationLevel, errorCode: Int?, message: String?) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo[ClassConstructorDescriptorImpl]

'version' @ [120:36] ==> val version: SinceKotlinInfo.Version defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'level' @ [120:45] ==> val level: DeprecationLevel defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'errorCode' @ [120:52] ==> val errorCode: Int? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

'message' @ [120:63] ==> val message: String? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfo.Companion.create[LocalVariableDescriptor]

