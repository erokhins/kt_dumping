'comparePaths' @ [26:33] ==> public open fun comparePaths(@Nullable p0: String?, @Nullable p1: String?): Int defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'path' @ [26:46] ==> public final val path: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'other' @ [26:52] ==> value-parameter other: PathFunctionPair defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair.compareTo[ValueParameterDescriptorImpl]

'path' @ [26:58] ==> public final val path: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'pathComp' @ [28:13] ==> val pathComp: Int defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair.compareTo[LocalVariableDescriptor]

'pathComp' @ [28:35] ==> val pathComp: Int defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair.compareTo[LocalVariableDescriptor]

'function' @ [30:16] ==> public final val function: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'compareTo' @ [30:25] ==> public open fun compareTo(other: String): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'other' @ [30:35] ==> value-parameter other: PathFunctionPair defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair.compareTo[ValueParameterDescriptorImpl]

'function' @ [30:41] ==> public final val function: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'when (other) {
                is PathFunctionPair ->
                    FileUtil.pathsEqual(path, other.path) && function == other.function
                else ->
                    false
            }' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'other' @ [34:19] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair.equals[ValueParameterDescriptorImpl]

'pathsEqual' @ [36:30] ==> public open fun pathsEqual(@Nullable p0: String?, @Nullable p1: String?): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'path' @ [36:41] ==> public final val path: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'other' @ [36:47] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair.equals[ValueParameterDescriptorImpl]

'path' @ [36:53] ==> public final val path: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'function' @ [36:62] ==> public final val function: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'other' @ [36:74] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair.equals[ValueParameterDescriptorImpl]

'function' @ [36:80] ==> public final val function: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'*' @ [41:36] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'pathHashCode' @ [41:50] ==> public open fun pathHashCode(@Nullable p0: String?): Int defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'path' @ [41:63] ==> public final val path: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'function' @ [41:71] ==> public final val function: String defined in org.jetbrains.kotlin.jps.incremental.storages.PathFunctionPair[PropertyDescriptorImpl]

'hashCode' @ [41:80] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

