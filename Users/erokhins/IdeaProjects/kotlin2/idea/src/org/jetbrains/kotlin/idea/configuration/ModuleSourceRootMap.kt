'this' @ [31:36] ==> public constructor ModuleSourceRootMap(modules: Collection<Module>) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[ClassConstructorDescriptorImpl]

'project' @ [31:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>[ValueParameterDescriptorImpl]

'allModules' @ [31:49] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'allModulesByExternalPath' @ [34:9] ==> private final val allModulesByExternalPath: Map<String, List<Module>> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[PropertyDescriptorImpl]

'modules' @ [34:36] ==> public final val modules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[PropertyDescriptorImpl]

'filter' @ [35:18] ==> public inline fun <T> Iterable<Module>.filter(predicate: (Module) -> Boolean): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'it' @ [35:27] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'externalProjectPath' @ [35:30] ==> public val Module.externalProjectPath: String? defined in org.jetbrains.kotlin.idea.configuration in file ModuleSourceRootMap.kt[PropertyDescriptorImpl]

'it' @ [35:61] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'externalProjectId' @ [35:64] ==> public val Module.externalProjectId: String? defined in org.jetbrains.kotlin.idea.configuration in file ModuleSourceRootMap.kt[PropertyDescriptorImpl]

'groupBy' @ [36:18] ==> public inline fun <T, K> Iterable<Module>.groupBy(keySelector: (Module) -> String): Map<String, List<Module>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <K> -> String

'it' @ [36:28] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'externalProjectPath' @ [36:31] ==> public val Module.externalProjectPath: String? defined in org.jetbrains.kotlin.idea.configuration in file ModuleSourceRootMap.kt[PropertyDescriptorImpl]

'baseModuleByExternalPath' @ [38:9] ==> private final val baseModuleByExternalPath: Map<String, Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[PropertyDescriptorImpl]

'allModulesByExternalPath' @ [38:36] ==> private final val allModulesByExternalPath: Map<String, List<Module>> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[PropertyDescriptorImpl]

'mapValues' @ [39:18] ==> public inline fun <K, V, R> Map<out String, List<Module>>.mapValues(transform: (Map.Entry<String, List<Module>>) -> Module): Map<String, Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<Module>
    <R> -> Module

'component1' @ [39:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<Module>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<Module>

'component2' @ [39:37] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<Module>>.component2(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<Module>

'modules' @ [40:21] ==> val modules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>[LocalVariableDescriptor]

'reduce' @ [40:29] ==> public inline fun <S, T : Module> Iterable<Module>.reduce(operation: (Module, Module) -> Module): Module defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Module
    <T : S> -> Module

'if (isSourceRootPrefix(m2.externalProjectId!!, m1.externalProjectId!!)) m2 else m1' @ [41:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Module, elseBranch: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Module

'isSourceRootPrefix' @ [41:29] ==> private fun isSourceRootPrefix(externalId: String, previousModuleExternalId: String): Boolean defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'm2' @ [41:48] ==> value-parameter m2: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'externalProjectId' @ [41:51] ==> public val Module.externalProjectId: String? defined in org.jetbrains.kotlin.idea.configuration in file ModuleSourceRootMap.kt[PropertyDescriptorImpl]

'm1' @ [41:72] ==> value-parameter m1: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'externalProjectId' @ [41:75] ==> public val Module.externalProjectId: String? defined in org.jetbrains.kotlin.idea.configuration in file ModuleSourceRootMap.kt[PropertyDescriptorImpl]

'm2' @ [41:97] ==> value-parameter m2: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'm1' @ [41:105] ==> value-parameter m1: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'modules' @ [47:16] ==> value-parameter modules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules[ValueParameterDescriptorImpl]

'groupBy' @ [48:18] ==> public inline fun <T, K> Iterable<Module>.groupBy(keySelector: (Module) -> Module): Map<Module, List<Module>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <K> -> Module

'module' @ [49:40] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[ValueParameterDescriptorImpl]

'externalProjectPath' @ [49:47] ==> public val Module.externalProjectPath: String? defined in org.jetbrains.kotlin.idea.configuration in file ModuleSourceRootMap.kt[PropertyDescriptorImpl]

'if (externalPath == null) module else (baseModuleByExternalPath[externalPath] ?: module)' @ [50:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Module, elseBranch: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Module

'externalPath' @ [50:25] ==> val externalPath: String? defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[LocalVariableDescriptor]

'module' @ [50:47] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[ValueParameterDescriptorImpl]

'baseModuleByExternalPath' @ [50:60] ==> private final val baseModuleByExternalPath: Map<String, Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[PropertyDescriptorImpl]

'externalPath' @ [50:85] ==> val externalPath: String? defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[LocalVariableDescriptor]

'module' @ [50:102] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [52:18] ==> public inline fun <K, V, R> Map<out Module, List<Module>>.map(transform: (Map.Entry<Module, List<Module>>) -> ModuleSourceRootGroup): List<ModuleSourceRootGroup> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Module
    <V> -> List<Module>
    <R> -> ModuleSourceRootGroup

'component1' @ [52:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Module, List<Module>>.component1(): Module defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Module
    <V> -> List<Module>

'component2' @ [52:33] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Module, List<Module>>.component2(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Module
    <V> -> List<Module>

'ModuleSourceRootGroup' @ [53:21] ==> public constructor ModuleSourceRootGroup(baseModule: Module, sourceRootModules: List<Module>) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[ClassConstructorDescriptorImpl]

'module' @ [53:43] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[LocalVariableDescriptor]

'if (sourceRootModules.size > 1) sourceRootModules - module else sourceRootModules' @ [54:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Module>, elseBranch: List<Module>): List<Module>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Module>

'sourceRootModules' @ [54:47] ==> val sourceRootModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[LocalVariableDescriptor]

'size' @ [54:65] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'sourceRootModules' @ [54:75] ==> val sourceRootModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[LocalVariableDescriptor]

'module' @ [54:95] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[LocalVariableDescriptor]

'sourceRootModules' @ [54:107] ==> val sourceRootModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.groupByBaseModules.<anonymous>[LocalVariableDescriptor]

'groupByBaseModules' @ [58:64] ==> public final fun groupByBaseModules(modules: Collection<Module>): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[SimpleFunctionDescriptorImpl]

'listOf' @ [58:83] ==> public fun <T> listOf(element: Module): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'module' @ [58:90] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap.toModuleGroup[ValueParameterDescriptorImpl]

'single' @ [58:99] ==> public fun <T> List<ModuleSourceRootGroup>.single(): ModuleSourceRootGroup defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'externalId' @ [62:11] ==> value-parameter externalId: String defined in org.jetbrains.kotlin.idea.configuration.isSourceRootPrefix[ValueParameterDescriptorImpl]

'length' @ [62:22] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'previousModuleExternalId' @ [62:31] ==> value-parameter previousModuleExternalId: String defined in org.jetbrains.kotlin.idea.configuration.isSourceRootPrefix[ValueParameterDescriptorImpl]

'length' @ [62:56] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'previousModuleExternalId' @ [62:66] ==> value-parameter previousModuleExternalId: String defined in org.jetbrains.kotlin.idea.configuration.isSourceRootPrefix[ValueParameterDescriptorImpl]

'startsWith' @ [62:91] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'externalId' @ [62:102] ==> value-parameter externalId: String defined in org.jetbrains.kotlin.idea.configuration.isSourceRootPrefix[ValueParameterDescriptorImpl]

'getExternalProjectId' @ [65:35] ==> @Nullable @Contract public open fun getExternalProjectId(@Nullable p0: Module?): String? defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]

'this' @ [65:56] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.externalProjectId[ReceiverParameterDescriptorImpl]

'getExternalProjectPath' @ [68:35] ==> @Nullable @Contract public open fun getExternalProjectPath(@Nullable p0: Module?): String? defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]

'this' @ [68:58] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.externalProjectPath[ReceiverParameterDescriptorImpl]

'mapNotNull' @ [71:12] ==> public inline fun <T, R : Any> Iterable<ModuleSourceRootGroup>.mapNotNull(transform: (ModuleSourceRootGroup) -> ModuleSourceRootGroup?): List<ModuleSourceRootGroup> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup
    <R : Any> -> ModuleSourceRootGroup

'if (it.baseModule in excludeModules)
            null
        else {
            val remainingSourceRootModules = it.sourceRootModules - excludeModules
            if (remainingSourceRootModules.isEmpty())
                null
            else
                ModuleSourceRootGroup(it.baseModule, remainingSourceRootModules)
        }' @ [72:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleSourceRootGroup?, elseBranch: ModuleSourceRootGroup?): ModuleSourceRootGroup?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleSourceRootGroup?

'it' @ [72:13] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.exclude.<anonymous>[ValueParameterDescriptorImpl]

'baseModule' @ [72:16] ==> public final val baseModule: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[PropertyDescriptorImpl]

'excludeModules' @ [72:30] ==> value-parameter excludeModules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.exclude[ValueParameterDescriptorImpl]

'it' @ [75:46] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.exclude.<anonymous>[ValueParameterDescriptorImpl]

'sourceRootModules' @ [75:49] ==> public final val sourceRootModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[PropertyDescriptorImpl]

'excludeModules' @ [75:69] ==> value-parameter excludeModules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.exclude[ValueParameterDescriptorImpl]

'if (remainingSourceRootModules.isEmpty())
                null
            else
                ModuleSourceRootGroup(it.baseModule, remainingSourceRootModules)' @ [76:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleSourceRootGroup?, elseBranch: ModuleSourceRootGroup?): ModuleSourceRootGroup?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleSourceRootGroup?

'remainingSourceRootModules' @ [76:17] ==> val remainingSourceRootModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.exclude.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [76:44] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ModuleSourceRootGroup' @ [79:17] ==> public constructor ModuleSourceRootGroup(baseModule: Module, sourceRootModules: List<Module>) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[ClassConstructorDescriptorImpl]

'it' @ [79:39] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.exclude.<anonymous>[ValueParameterDescriptorImpl]

'baseModule' @ [79:42] ==> public final val baseModule: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[PropertyDescriptorImpl]

'remainingSourceRootModules' @ [79:54] ==> val remainingSourceRootModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.exclude.<anonymous>[LocalVariableDescriptor]

