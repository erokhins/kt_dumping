'getValue' @ [40:30] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'isEnabled' @ [40:35] ==> value-parameter isEnabled: () -> Boolean defined in org.jetbrains.kotlin.incremental.CacheVersion.<init>[ValueParameterDescriptorImpl]

'versionFile' @ [44:13] ==> private final val versionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'readText' @ [44:25] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toInt' @ [44:36] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JvmMetadataVersion' @ [55:28] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [55:47] ==> @field:JvmField public final val INSTANCE: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion.Companion[DeserializedPropertyDescriptor]

'JvmBytecodeBinaryVersion' @ [56:28] ==> public companion object defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [56:53] ==> @field:JvmField public final val INSTANCE: JvmBytecodeBinaryVersion defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion.Companion[DeserializedPropertyDescriptor]

'ownVersion' @ [57:20] ==> private final val ownVersion: Int defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'bytecode' @ [58:20] ==> val bytecode: JvmBytecodeBinaryVersion defined in org.jetbrains.kotlin.incremental.CacheVersion.<get-expectedVersion>[LocalVariableDescriptor]

'major' @ [58:29] ==> public final val major: Int defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion[DeserializedPropertyDescriptor]

'bytecode' @ [58:45] ==> val bytecode: JvmBytecodeBinaryVersion defined in org.jetbrains.kotlin.incremental.CacheVersion.<get-expectedVersion>[LocalVariableDescriptor]

'minor' @ [58:54] ==> public final val minor: Int defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion[DeserializedPropertyDescriptor]

'metadata' @ [59:20] ==> val metadata: JvmMetadataVersion defined in org.jetbrains.kotlin.incremental.CacheVersion.<get-expectedVersion>[LocalVariableDescriptor]

'major' @ [59:29] ==> public final val major: Int defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedPropertyDescriptor]

'metadata' @ [59:44] ==> val metadata: JvmMetadataVersion defined in org.jetbrains.kotlin.incremental.CacheVersion.<get-expectedVersion>[LocalVariableDescriptor]

'minor' @ [59:53] ==> public final val minor: Int defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedPropertyDescriptor]

'when (versionFile.exists() to isEnabled) {
                true  to true -> if (actualVersion != expectedVersion) whenVersionChanged else Action.DO_NOTHING
                false to true -> whenTurnedOn
                true  to false -> whenTurnedOff
                else -> Action.DO_NOTHING
            }' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CacheVersion.Action, entry1: CacheVersion.Action, entry2: CacheVersion.Action, entry3: CacheVersion.Action): CacheVersion.Action[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Action

'versionFile' @ [63:19] ==> private final val versionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'exists' @ [63:31] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'isEnabled' @ [63:43] ==> private final val isEnabled: Boolean defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'to' @ [64:17] ==> public infix fun <A, B> Boolean.to(that: Boolean): Pair<Boolean, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Boolean
    <B> -> Boolean

'if (actualVersion != expectedVersion) whenVersionChanged else Action.DO_NOTHING' @ [64:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CacheVersion.Action, elseBranch: CacheVersion.Action): CacheVersion.Action[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Action

'actualVersion' @ [64:38] ==> private final val actualVersion: Int? defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'expectedVersion' @ [64:55] ==> private final val expectedVersion: Int defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'whenVersionChanged' @ [64:72] ==> private final val whenVersionChanged: CacheVersion.Action defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'DO_NOTHING' @ [64:103] ==> enum entry DO_NOTHING defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'to' @ [65:17] ==> public infix fun <A, B> Boolean.to(that: Boolean): Pair<Boolean, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Boolean
    <B> -> Boolean

'whenTurnedOn' @ [65:34] ==> private final val whenTurnedOn: CacheVersion.Action defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'to' @ [66:17] ==> public infix fun <A, B> Boolean.to(that: Boolean): Pair<Boolean, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Boolean
    <B> -> Boolean

'whenTurnedOff' @ [66:35] ==> private final val whenTurnedOff: CacheVersion.Action defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'DO_NOTHING' @ [67:32] ==> enum entry DO_NOTHING defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'!' @ [71:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnabled' @ [71:14] ==> private final val isEnabled: Boolean defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'!' @ [73:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'versionFile' @ [73:14] ==> private final val versionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'parentFile' @ [73:26] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'exists' @ [73:37] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'versionFile' @ [74:13] ==> private final val versionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'parentFile' @ [74:25] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [74:36] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'versionFile' @ [77:9] ==> private final val versionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'writeText' @ [77:21] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'expectedVersion' @ [77:31] ==> private final val expectedVersion: Int defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'toString' @ [77:47] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'versionFile' @ [81:9] ==> private final val versionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'delete' @ [81:21] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'TestOnly' @ [84:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'versionFile' @ [86:17] ==> private final val versionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[PropertyDescriptorImpl]

'CacheVersion' @ [99:9] ==> public constructor CacheVersion(ownVersion: Int, versionFile: File, whenVersionChanged: CacheVersion.Action, whenTurnedOn: CacheVersion.Action, whenTurnedOff: CacheVersion.Action, isEnabled: () -> Boolean) defined in org.jetbrains.kotlin.incremental.CacheVersion[ClassConstructorDescriptorImpl]

'NORMAL_VERSION' @ [99:35] ==> private val NORMAL_VERSION: Int defined in org.jetbrains.kotlin.incremental in file CacheVersion.kt[PropertyDescriptorImpl]

'File' @ [100:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dataRoot' @ [100:41] ==> value-parameter dataRoot: File defined in org.jetbrains.kotlin.incremental.normalCacheVersion[ValueParameterDescriptorImpl]

'NORMAL_VERSION_FILE_NAME' @ [100:51] ==> private val NORMAL_VERSION_FILE_NAME: String defined in org.jetbrains.kotlin.incremental in file CacheVersion.kt[PropertyDescriptorImpl]

'REBUILD_CHUNK' @ [101:63] ==> enum entry REBUILD_CHUNK defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'REBUILD_CHUNK' @ [102:57] ==> enum entry REBUILD_CHUNK defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'CLEAN_NORMAL_CACHES' @ [103:58] ==> enum entry CLEAN_NORMAL_CACHES defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'isEnabled' @ [104:59] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'CacheVersion' @ [107:9] ==> public constructor CacheVersion(ownVersion: Int, versionFile: File, whenVersionChanged: CacheVersion.Action, whenTurnedOn: CacheVersion.Action, whenTurnedOff: CacheVersion.Action, isEnabled: () -> Boolean) defined in org.jetbrains.kotlin.incremental.CacheVersion[ClassConstructorDescriptorImpl]

'DATA_CONTAINER_VERSION' @ [107:35] ==> private val DATA_CONTAINER_VERSION: Int defined in org.jetbrains.kotlin.incremental in file CacheVersion.kt[PropertyDescriptorImpl]

'File' @ [108:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dataRoot' @ [108:41] ==> value-parameter dataRoot: File defined in org.jetbrains.kotlin.incremental.dataContainerCacheVersion[ValueParameterDescriptorImpl]

'DATA_CONTAINER_VERSION_FILE_NAME' @ [108:51] ==> private val DATA_CONTAINER_VERSION_FILE_NAME: String defined in org.jetbrains.kotlin.incremental in file CacheVersion.kt[PropertyDescriptorImpl]

'REBUILD_ALL_KOTLIN' @ [109:63] ==> enum entry REBUILD_ALL_KOTLIN defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'REBUILD_ALL_KOTLIN' @ [110:57] ==> enum entry REBUILD_ALL_KOTLIN defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'CLEAN_DATA_CONTAINER' @ [111:58] ==> enum entry CLEAN_DATA_CONTAINER defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'isEnabled' @ [112:59] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

