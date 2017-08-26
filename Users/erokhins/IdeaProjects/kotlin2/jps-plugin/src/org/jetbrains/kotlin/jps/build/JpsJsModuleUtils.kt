'ArrayList' @ [33:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'getLibraryFiles' @ [34:9] ==> public final fun getLibraryFiles(target: ModuleBuildTarget, result: MutableList<String>): Unit defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils[SimpleFunctionDescriptorImpl]

'target' @ [34:25] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFilesAndDependencies[ValueParameterDescriptorImpl]

'result' @ [34:33] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFilesAndDependencies[LocalVariableDescriptor]

'getDependencyModulesAndSources' @ [35:9] ==> public final fun getDependencyModulesAndSources(target: ModuleBuildTarget, result: MutableList<String>): Unit defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils[SimpleFunctionDescriptorImpl]

'target' @ [35:40] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFilesAndDependencies[ValueParameterDescriptorImpl]

'result' @ [35:48] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFilesAndDependencies[LocalVariableDescriptor]

'result' @ [36:16] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFilesAndDependencies[LocalVariableDescriptor]

'getAllDependencies' @ [40:34] ==> @NotNull public/*package*/ open fun getAllDependencies(@NotNull target: ModuleBuildTarget): JpsJavaDependenciesEnumerator defined in org.jetbrains.kotlin.jps.build.JpsUtils[JavaMethodDescriptor]

'target' @ [40:53] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFiles[ValueParameterDescriptorImpl]

'libraries' @ [40:61] ==> public final val JpsJavaDependenciesEnumerator.libraries: (MutableSet<(JpsLibrary..JpsLibrary?)>..Set<(JpsLibrary..JpsLibrary?)>)[MyPropertyDescriptor]

'libraries' @ [41:25] ==> val libraries: (MutableSet<(JpsLibrary..JpsLibrary?)>..Set<(JpsLibrary..JpsLibrary?)>) defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFiles[LocalVariableDescriptor]

'library' @ [42:26] ==> val library: (JpsLibrary..JpsLibrary?) defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFiles[LocalVariableDescriptor]

'getRoots' @ [42:34] ==> @NotNull public abstract fun getRoots(@NotNull p0: JpsOrderRootType): (MutableList<(JpsLibraryRoot..JpsLibraryRoot?)>..List<(JpsLibraryRoot..JpsLibraryRoot?)>) defined in org.jetbrains.jps.model.library.JpsLibrary[JavaMethodDescriptor]

'COMPILED' @ [42:60] ==> public final val COMPILED: (JpsOrderRootType..JpsOrderRootType?) defined in org.jetbrains.jps.model.library.JpsOrderRootType[JavaPropertyDescriptor]

'result' @ [43:17] ==> value-parameter result: MutableList<String> defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFiles[ValueParameterDescriptorImpl]

'add' @ [43:24] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'urlToPath' @ [43:40] ==> @Contract public open fun urlToPath(@Nullable p0: String?): (String..String?) defined in org.jetbrains.jps.util.JpsPathUtil[JavaMethodDescriptor]

'root' @ [43:50] ==> val root: (JpsLibraryRoot..JpsLibraryRoot?) defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getLibraryFiles[LocalVariableDescriptor]

'url' @ [43:55] ==> public final val JpsLibraryRoot.url: String[MyPropertyDescriptor]

'getAllDependencies' @ [49:18] ==> @NotNull public/*package*/ open fun getAllDependencies(@NotNull target: ModuleBuildTarget): JpsJavaDependenciesEnumerator defined in org.jetbrains.kotlin.jps.build.JpsUtils[JavaMethodDescriptor]

'target' @ [49:37] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources[ValueParameterDescriptorImpl]

'processModules' @ [49:45] ==> public abstract fun processModules(@NotNull p0: Consumer<(JpsModule..JpsModule?)>): Unit defined in org.jetbrains.jps.model.java.JpsJavaDependenciesEnumerator[JavaMethodDescriptor]

'module' @ [51:21] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume[ValueParameterDescriptorImpl]

'moduleType' @ [51:28] ==> public final val JpsModule.moduleType: JpsModuleType<*>[MyPropertyDescriptor]

'INSTANCE' @ [51:60] ==> public final val INSTANCE: (JpsJavaModuleType..JpsJavaModuleType?) defined in org.jetbrains.jps.model.java.JpsJavaModuleType[JavaPropertyDescriptor]

'module' @ [53:22] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume[ValueParameterDescriptorImpl]

'target' @ [53:32] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources[ValueParameterDescriptorImpl]

'module' @ [53:39] ==> public final val ModuleBuildTarget.module: JpsModule[MyPropertyDescriptor]

'target' @ [53:49] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources[ValueParameterDescriptorImpl]

'isTests' @ [53:56] ==> public final val ModuleBuildTarget.isTests: Boolean[MyPropertyDescriptor]

'module' @ [53:68] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume[ValueParameterDescriptorImpl]

'sourceRoots' @ [53:75] ==> public final val JpsModule.sourceRoots: (MutableList<(JpsModuleSourceRoot..JpsModuleSourceRoot?)>..List<(JpsModuleSourceRoot..JpsModuleSourceRoot?)>)[MyPropertyDescriptor]

'any' @ [53:87] ==> public inline fun <T> Iterable<(JpsModuleSourceRoot..JpsModuleSourceRoot?)>.any(predicate: ((JpsModuleSourceRoot..JpsModuleSourceRoot?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.jps.model.module.JpsModuleSourceRoot..org.jetbrains.jps.model.module.JpsModuleSourceRoot?)

'it' @ [53:93] ==> value-parameter it: (JpsModuleSourceRoot..JpsModuleSourceRoot?) defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume.<anonymous>[ValueParameterDescriptorImpl]

'rootType' @ [53:96] ==> public final val JpsModuleSourceRoot.rootType: JpsModuleSourceRootType<*>[MyPropertyDescriptor]

'SOURCE' @ [53:127] ==> public final val SOURCE: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.jps.model.java.JavaSourceRootType[JavaPropertyDescriptor]

'addTarget' @ [54:21] ==> public final fun addTarget(module: JpsModule, isTests: Boolean): Unit defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>[SimpleFunctionDescriptorImpl]

'module' @ [54:31] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume[ValueParameterDescriptorImpl]

'module' @ [57:21] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume[ValueParameterDescriptorImpl]

'target' @ [57:31] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources[ValueParameterDescriptorImpl]

'module' @ [57:38] ==> public final val ModuleBuildTarget.module: JpsModule[MyPropertyDescriptor]

'target' @ [57:48] ==> value-parameter target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources[ValueParameterDescriptorImpl]

'isTests' @ [57:55] ==> public final val ModuleBuildTarget.isTests: Boolean[MyPropertyDescriptor]

'module' @ [57:66] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume[ValueParameterDescriptorImpl]

'sourceRoots' @ [57:73] ==> public final val JpsModule.sourceRoots: (MutableList<(JpsModuleSourceRoot..JpsModuleSourceRoot?)>..List<(JpsModuleSourceRoot..JpsModuleSourceRoot?)>)[MyPropertyDescriptor]

'any' @ [57:85] ==> public inline fun <T> Iterable<(JpsModuleSourceRoot..JpsModuleSourceRoot?)>.any(predicate: ((JpsModuleSourceRoot..JpsModuleSourceRoot?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.jps.model.module.JpsModuleSourceRoot..org.jetbrains.jps.model.module.JpsModuleSourceRoot?)

'it' @ [57:91] ==> value-parameter it: (JpsModuleSourceRoot..JpsModuleSourceRoot?) defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume.<anonymous>[ValueParameterDescriptorImpl]

'rootType' @ [57:94] ==> public final val JpsModuleSourceRoot.rootType: JpsModuleSourceRootType<*>[MyPropertyDescriptor]

'TEST_SOURCE' @ [57:125] ==> public final val TEST_SOURCE: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.jps.model.java.JavaSourceRootType[JavaPropertyDescriptor]

'addTarget' @ [58:21] ==> public final fun addTarget(module: JpsModule, isTests: Boolean): Unit defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>[SimpleFunctionDescriptorImpl]

'module' @ [58:31] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.consume[ValueParameterDescriptorImpl]

'getOutputMetaFile' @ [63:36] ==> @JvmStatic public final fun getOutputMetaFile(module: JpsModule, isTests: Boolean): File defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils[SimpleFunctionDescriptorImpl]

'module' @ [63:54] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.addTarget[ValueParameterDescriptorImpl]

'isTests' @ [63:62] ==> value-parameter isTests: Boolean defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.addTarget[ValueParameterDescriptorImpl]

'metaInfoFile' @ [64:21] ==> val metaInfoFile: File defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.addTarget[LocalVariableDescriptor]

'exists' @ [64:34] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'result' @ [65:21] ==> value-parameter result: MutableList<String> defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources[ValueParameterDescriptorImpl]

'add' @ [65:28] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'metaInfoFile' @ [65:32] ==> val metaInfoFile: File defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getDependencyModulesAndSources.<no name provided>.addTarget[LocalVariableDescriptor]

'absolutePath' @ [65:45] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'JvmStatic' @ [71:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ModuleBuildTarget' @ [73:33] ==> public constructor ModuleBuildTarget(@NotNull p0: JpsModule, p1: (JavaModuleBuildTargetType..JavaModuleBuildTargetType?)) defined in org.jetbrains.jps.incremental.ModuleBuildTarget[JavaClassConstructorDescriptor]

'module' @ [73:51] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[ValueParameterDescriptorImpl]

'if (isTests) JavaModuleBuildTargetType.TEST else JavaModuleBuildTargetType.PRODUCTION' @ [73:59] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (JavaModuleBuildTargetType..JavaModuleBuildTargetType?), elseBranch: (JavaModuleBuildTargetType..JavaModuleBuildTargetType?)): (JavaModuleBuildTargetType..JavaModuleBuildTargetType?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.jps.builders.java.JavaModuleBuildTargetType..org.jetbrains.jps.builders.java.JavaModuleBuildTargetType?)

'isTests' @ [73:63] ==> value-parameter isTests: Boolean defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[ValueParameterDescriptorImpl]

'TEST' @ [73:98] ==> public final val TEST: (JavaModuleBuildTargetType..JavaModuleBuildTargetType?) defined in org.jetbrains.jps.builders.java.JavaModuleBuildTargetType[JavaPropertyDescriptor]

'PRODUCTION' @ [73:134] ==> public final val PRODUCTION: (JavaModuleBuildTargetType..JavaModuleBuildTargetType?) defined in org.jetbrains.jps.builders.java.JavaModuleBuildTargetType[JavaPropertyDescriptor]

'KotlinBuilderModuleScriptGenerator' @ [74:25] ==> public object KotlinBuilderModuleScriptGenerator defined in org.jetbrains.kotlin.jps.build in file KotlinBuilderModuleScriptGenerator.kt[FakeCallableDescriptorForObject]

'getOutputDirSafe' @ [74:60] ==> public final fun getOutputDirSafe(target: ModuleBuildTarget): File defined in org.jetbrains.kotlin.jps.build.KotlinBuilderModuleScriptGenerator[SimpleFunctionDescriptorImpl]

'moduleBuildTarget' @ [74:77] ==> val moduleBuildTarget: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[LocalVariableDescriptor]

'getOutputMetaFile' @ [75:16] ==> @JvmStatic public final fun getOutputMetaFile(outputDir: File, moduleName: String, isTests: Boolean): File defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils[SimpleFunctionDescriptorImpl]

'outputDir' @ [75:34] ==> val outputDir: File defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[LocalVariableDescriptor]

'module' @ [75:45] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[ValueParameterDescriptorImpl]

'name' @ [75:52] ==> public final var JpsModule.name: String[MyPropertyDescriptor]

'isTests' @ [75:58] ==> value-parameter isTests: Boolean defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[ValueParameterDescriptorImpl]

'JvmStatic' @ [78:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'File' @ [80:15] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [80:20] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputFile[ValueParameterDescriptorImpl]

'moduleName' @ [80:31] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputFile[ValueParameterDescriptorImpl]

'suffix' @ [80:44] ==> private final fun suffix(isTests: Boolean): String defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils[SimpleFunctionDescriptorImpl]

'isTests' @ [80:51] ==> value-parameter isTests: Boolean defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputFile[ValueParameterDescriptorImpl]

'KotlinJavascriptMetadataUtils' @ [80:62] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'JS_EXT' @ [80:92] ==> public const final val JS_EXT: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedPropertyDescriptor]

'JvmStatic' @ [82:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'File' @ [84:15] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [84:20] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[ValueParameterDescriptorImpl]

'moduleName' @ [84:31] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[ValueParameterDescriptorImpl]

'suffix' @ [84:44] ==> private final fun suffix(isTests: Boolean): String defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils[SimpleFunctionDescriptorImpl]

'isTests' @ [84:51] ==> value-parameter isTests: Boolean defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.getOutputMetaFile[ValueParameterDescriptorImpl]

'KotlinJavascriptMetadataUtils' @ [84:62] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'META_JS_SUFFIX' @ [84:92] ==> public const final val META_JS_SUFFIX: String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedPropertyDescriptor]

'if (isTests) "_test" else ""' @ [86:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isTests' @ [86:48] ==> value-parameter isTests: Boolean defined in org.jetbrains.kotlin.jps.build.JpsJsModuleUtils.suffix[ValueParameterDescriptorImpl]

