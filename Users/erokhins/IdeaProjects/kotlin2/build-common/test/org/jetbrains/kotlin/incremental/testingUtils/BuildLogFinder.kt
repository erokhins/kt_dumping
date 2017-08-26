'dir' @ [32:21] ==> value-parameter dir: File defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[ValueParameterDescriptorImpl]

'list' @ [32:25] ==> public open fun list(): (Array<(String..String?)>..Array<out (String..String?)>?) defined in java.io.File[JavaMethodDescriptor]

'arrayOf' @ [32:35] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (String..String?)): Array<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.String..kotlin.String?)

'names' @ [33:21] ==> val names: (Array<(String..String?)>..Array<out (String..String?)>) defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[LocalVariableDescriptor]

'filter' @ [33:27] ==> public inline fun <T> Array<out (String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'File' @ [33:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [33:41] ==> value-parameter dir: File defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[ValueParameterDescriptorImpl]

'it' @ [33:46] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [33:50] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'toSet' @ [33:59] ==> public fun <T> Iterable<(String..String?)>.toSet(): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'when {
            isGradleEnabled && GRADLE_LOG in files -> GRADLE_LOG
            isDataContainerBuildLogEnabled && DATA_CONTAINER_LOG in files -> DATA_CONTAINER_LOG
            SIMPLE_LOG in files -> SIMPLE_LOG
            else -> null
        }' @ [34:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'isGradleEnabled' @ [35:13] ==> private final val isGradleEnabled: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder[PropertyDescriptorImpl]

'GRADLE_LOG' @ [35:32] ==> private const final val GRADLE_LOG: String defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.Companion[PropertyDescriptorImpl]

'files' @ [35:46] ==> val files: Set<(String..String?)> defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[LocalVariableDescriptor]

'GRADLE_LOG' @ [35:55] ==> private const final val GRADLE_LOG: String defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.Companion[PropertyDescriptorImpl]

'isDataContainerBuildLogEnabled' @ [36:13] ==> private final val isDataContainerBuildLogEnabled: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder[PropertyDescriptorImpl]

'DATA_CONTAINER_LOG' @ [36:47] ==> private const final val DATA_CONTAINER_LOG: String defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.Companion[PropertyDescriptorImpl]

'files' @ [36:69] ==> val files: Set<(String..String?)> defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[LocalVariableDescriptor]

'DATA_CONTAINER_LOG' @ [36:78] ==> private const final val DATA_CONTAINER_LOG: String defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.Companion[PropertyDescriptorImpl]

'SIMPLE_LOG' @ [37:13] ==> private const final val SIMPLE_LOG: String defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.Companion[PropertyDescriptorImpl]

'files' @ [37:27] ==> val files: Set<(String..String?)> defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[LocalVariableDescriptor]

'SIMPLE_LOG' @ [37:36] ==> private const final val SIMPLE_LOG: String defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.Companion[PropertyDescriptorImpl]

'File' @ [41:16] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [41:21] ==> value-parameter dir: File defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[ValueParameterDescriptorImpl]

'matchedName' @ [41:26] ==> val matchedName: String? defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder.findBuildLog[LocalVariableDescriptor]

