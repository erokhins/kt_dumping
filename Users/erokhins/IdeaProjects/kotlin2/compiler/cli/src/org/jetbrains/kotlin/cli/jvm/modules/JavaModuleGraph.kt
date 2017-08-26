'NO_LOCKS' @ [25:37] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'createMemoizedFunctionWithNullableValues' @ [25:46] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (String) -> JavaModule?): MemoizedFunctionToNullable<String, JavaModule> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V : Any> -> JavaModule

'finder' @ [25:87] ==> value-parameter finder: JavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.<init>[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [28:23] ==> public final fun <E> <init>(p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>?)): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'moduleNames' @ [28:37] ==> value-parameter moduleNames: List<String> defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[ValueParameterDescriptorImpl]

'visited' @ [31:9] ==> val visited: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'?:' @ [35:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JavaModuleInfo?, right: JavaModuleInfo): JavaModuleInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JavaModuleInfo

'invoke' @ [35:31] ==> public abstract operator fun invoke(p1: String): JavaModule? defined in kotlin.Function1[FunctionInvokeDescriptor]

'moduleName' @ [35:38] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies.dfs[ValueParameterDescriptorImpl]

'moduleInfo' @ [35:76] ==> public final val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedPropertyDescriptor]

'component1' @ [36:19] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[DeserializedSimpleFunctionDescriptor]

'component2' @ [36:41] ==> public final operator fun component2(): Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [36:58] ==> val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies.dfs[LocalVariableDescriptor]

'requires' @ [36:69] ==> public final val requires: List<JavaModuleInfo.Requires> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[DeserializedPropertyDescriptor]

'isTransitive' @ [37:21] ==> val isTransitive: Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies.dfs[LocalVariableDescriptor]

'visited' @ [37:37] ==> val visited: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'add' @ [37:45] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'dependencyModuleName' @ [37:49] ==> val dependencyModuleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies.dfs[LocalVariableDescriptor]

'dfs' @ [38:21] ==> local final fun dfs(moduleName: String): Unit defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[SimpleFunctionDescriptorImpl]

'dependencyModuleName' @ [38:25] ==> val dependencyModuleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies.dfs[LocalVariableDescriptor]

'moduleNames' @ [43:28] ==> value-parameter moduleNames: List<String> defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[ValueParameterDescriptorImpl]

'invoke' @ [44:26] ==> public abstract operator fun invoke(p1: String): JavaModule? defined in kotlin.Function1[FunctionInvokeDescriptor]

'moduleName' @ [44:33] ==> val moduleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'when (module) {
                is JavaModule.Automatic -> {
                    // Do nothing; all automatic modules should be added to compilation roots at call site as per java.lang.module javadoc
                }
                is JavaModule.Explicit -> {
                    for ((dependencyModuleName) in module.moduleInfo.requires) {
                        if (visited.add(dependencyModuleName)) {
                            dfs(dependencyModuleName)
                        }
                    }
                }
                else -> error("Unknown module: $module (${module.javaClass})")
            }' @ [45:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'module' @ [45:19] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'component1' @ [50:27] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[DeserializedSimpleFunctionDescriptor]

'module' @ [50:52] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'moduleInfo' @ [50:59] ==> public final val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedPropertyDescriptor]

'requires' @ [50:70] ==> public final val requires: List<JavaModuleInfo.Requires> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[DeserializedPropertyDescriptor]

'visited' @ [51:29] ==> val visited: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'add' @ [51:37] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'dependencyModuleName' @ [51:41] ==> val dependencyModuleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'dfs' @ [52:29] ==> local final fun dfs(moduleName: String): Unit defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[SimpleFunctionDescriptorImpl]

'dependencyModuleName' @ [52:33] ==> val dependencyModuleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'error' @ [56:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'module' @ [56:49] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'module' @ [56:59] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'javaClass' @ [56:66] ==> public val <T : Any> JavaModule.javaClass: Class<JavaModule> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> JavaModule

'visited' @ [60:16] ==> val visited: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.getAllDependencies[LocalVariableDescriptor]

'moduleName' @ [64:13] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[ValueParameterDescriptorImpl]

'dependencyName' @ [64:27] ==> value-parameter dependencyName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[ValueParameterDescriptorImpl]

'dependencyName' @ [64:45] ==> value-parameter dependencyName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[ValueParameterDescriptorImpl]

'linkedSetOf' @ [66:23] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!' @ [69:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visited' @ [69:18] ==> val visited: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[LocalVariableDescriptor]

'add' @ [69:26] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'name' @ [69:30] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads.dfs[ValueParameterDescriptorImpl]

'invoke' @ [71:26] ==> public abstract operator fun invoke(p1: String): JavaModule? defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [71:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads.dfs[ValueParameterDescriptorImpl]

'when (module) {
                is JavaModule.Automatic -> return true
                is JavaModule.Explicit -> {
                    for ((dependencyModuleName, isTransitive) in module.moduleInfo.requires) {
                        if (dependencyModuleName == dependencyName) return true
                        if (isTransitive && dfs(dependencyName)) return true
                    }
                    return false
                }
                else -> error("Unsupported module type: $module")
            }' @ [72:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'module' @ [72:19] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads.dfs[LocalVariableDescriptor]

'component1' @ [75:27] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[DeserializedSimpleFunctionDescriptor]

'component2' @ [75:49] ==> public final operator fun component2(): Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[DeserializedSimpleFunctionDescriptor]

'module' @ [75:66] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads.dfs[LocalVariableDescriptor]

'moduleInfo' @ [75:73] ==> public final val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedPropertyDescriptor]

'requires' @ [75:84] ==> public final val requires: List<JavaModuleInfo.Requires> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[DeserializedPropertyDescriptor]

'dependencyModuleName' @ [76:29] ==> val dependencyModuleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads.dfs[LocalVariableDescriptor]

'dependencyName' @ [76:53] ==> value-parameter dependencyName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[ValueParameterDescriptorImpl]

'isTransitive' @ [77:29] ==> val isTransitive: Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads.dfs[LocalVariableDescriptor]

'dfs' @ [77:45] ==> local final fun dfs(name: String): Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[SimpleFunctionDescriptorImpl]

'dependencyName' @ [77:49] ==> value-parameter dependencyName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[ValueParameterDescriptorImpl]

'error' @ [81:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'module' @ [81:58] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads.dfs[LocalVariableDescriptor]

'invoke' @ [85:22] ==> public abstract operator fun invoke(p1: String): JavaModule? defined in kotlin.Function1[FunctionInvokeDescriptor]

'moduleName' @ [85:29] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[ValueParameterDescriptorImpl]

'when (module) {
            is JavaModule.Automatic -> return true
            is JavaModule.Explicit -> {
                for ((dependencyModuleName) in module.moduleInfo.requires) {
                    if (dfs(dependencyModuleName)) return true
                }
            }
        }' @ [86:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'module' @ [86:15] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[LocalVariableDescriptor]

'component1' @ [89:23] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Requires[DeserializedSimpleFunctionDescriptor]

'module' @ [89:48] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[LocalVariableDescriptor]

'moduleInfo' @ [89:55] ==> public final val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedPropertyDescriptor]

'requires' @ [89:66] ==> public final val requires: List<JavaModuleInfo.Requires> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[DeserializedPropertyDescriptor]

'dfs' @ [90:25] ==> local final fun dfs(name: String): Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[SimpleFunctionDescriptorImpl]

'dependencyModuleName' @ [90:29] ==> val dependencyModuleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[LocalVariableDescriptor]

'dfs' @ [95:16] ==> local final fun dfs(name: String): Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[SimpleFunctionDescriptorImpl]

'moduleName' @ [95:20] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph.reads[ValueParameterDescriptorImpl]

