'Suppress' @ [18:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'filter' @ [44:9] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'mapNotNull' @ [44:34] ==> public inline fun <T, R : Any> Iterable<File>.mapNotNull(transform: (File) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R : Any> -> File

'findSrcDirRoot' @ [44:47] ==> private fun findSrcDirRoot(file: File, roots: Iterable<File>): File? defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]

'it' @ [44:62] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.javaSourceRoots.<anonymous>[ValueParameterDescriptorImpl]

'roots' @ [44:66] ==> value-parameter roots: Iterable<File> defined in org.jetbrains.kotlin.incremental.javaSourceRoots[ValueParameterDescriptorImpl]

'KotlinModuleXmlBuilder' @ [55:19] ==> public constructor KotlinModuleXmlBuilder() defined in org.jetbrains.kotlin.modules.KotlinModuleXmlBuilder[ClassConstructorDescriptorImpl]

'builder' @ [56:5] ==> val builder: KotlinModuleXmlBuilder defined in org.jetbrains.kotlin.incremental.makeModuleFile[LocalVariableDescriptor]

'addModule' @ [56:13] ==> public final fun addModule(moduleName: String, outputDir: String, sourceFiles: Iterable<File>, javaSourceRoots: Iterable<JvmSourceRoot>, classpathRoots: Iterable<File>, modularJdkRoot: File?, targetTypeId: String, isTests: Boolean, directoriesToFilterOut: Set<File>, friendDirs: Iterable<File>): KotlinModuleXmlBuilder defined in org.jetbrains.kotlin.modules.KotlinModuleXmlBuilder[SimpleFunctionDescriptorImpl]

'name' @ [57:13] ==> value-parameter name: String defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'outputDir' @ [58:13] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'absolutePath' @ [58:23] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'sourcesToCompile' @ [59:13] ==> value-parameter sourcesToCompile: Iterable<File> defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'javaSourceRoots' @ [60:13] ==> value-parameter javaSourceRoots: Iterable<JvmSourceRoot> defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'classpath' @ [61:13] ==> value-parameter classpath: Iterable<File> defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'isTest' @ [64:13] ==> value-parameter isTest: Boolean defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'setOf' @ [66:13] ==> public fun <T> setOf(element: File): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'outputDir' @ [66:19] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'friendDirs' @ [67:13] ==> value-parameter friendDirs: Iterable<File> defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'createTempFile' @ [70:27] ==> public open fun createTempFile(p0: (String..String?), p1: (String..String?)): (File..File?) defined in java.io.File[JavaMethodDescriptor]

'+' @ [70:50] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'sanitizeJavaIdentifier' @ [70:61] ==> @NotNull @Contract public open fun sanitizeJavaIdentifier(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'name' @ [70:84] ==> value-parameter name: String defined in org.jetbrains.kotlin.incremental.makeModuleFile[ValueParameterDescriptorImpl]

'writeToFile' @ [71:14] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'scriptFile' @ [71:26] ==> val scriptFile: (File..File?) defined in org.jetbrains.kotlin.incremental.makeModuleFile[LocalVariableDescriptor]

'builder' @ [71:38] ==> val builder: KotlinModuleXmlBuilder defined in org.jetbrains.kotlin.incremental.makeModuleFile[LocalVariableDescriptor]

'asText' @ [71:46] ==> public final fun asText(): CharSequence defined in org.jetbrains.kotlin.modules.KotlinModuleXmlBuilder[SimpleFunctionDescriptorImpl]

'toString' @ [71:55] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'scriptFile' @ [72:12] ==> val scriptFile: (File..File?) defined in org.jetbrains.kotlin.incremental.makeModuleFile[LocalVariableDescriptor]

'with' @ [80:5] ==> @InlineOnly public inline fun <T, R> with(receiver: Services.Builder, block: Services.Builder.() -> Services): Services defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Builder
    <R> -> Services

'Services' @ [80:10] ==> public companion object defined in org.jetbrains.kotlin.config.Services[FakeCallableDescriptorForObject]

'Builder' @ [80:19] ==> public constructor Builder() defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedClassConstructorDescriptor]

'register' @ [81:9] ==> public final fun <T : Any> register(interfaceClass: Class<LookupTracker>, implementation: LookupTracker): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LookupTracker

'java' @ [81:39] ==> public val <T> KClass<LookupTracker>.java: Class<LookupTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LookupTracker

'lookupTracker' @ [81:45] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.incremental.makeCompileServices[ValueParameterDescriptorImpl]

'register' @ [82:9] ==> public final fun <T : Any> register(interfaceClass: Class<IncrementalCompilationComponents>, implementation: IncrementalCompilationComponents): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IncrementalCompilationComponents

'java' @ [82:58] ==> public val <T> KClass<IncrementalCompilationComponents>.java: Class<IncrementalCompilationComponents> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalCompilationComponents

'IncrementalCompilationComponentsImpl' @ [82:64] ==> public constructor IncrementalCompilationComponentsImpl(caches: Map<TargetId, IncrementalCache>) defined in org.jetbrains.kotlin.incremental.IncrementalCompilationComponentsImpl[ClassConstructorDescriptorImpl]

'incrementalCaches' @ [82:101] ==> value-parameter incrementalCaches: Map<TargetId, IncrementalCache> defined in org.jetbrains.kotlin.incremental.makeCompileServices[ValueParameterDescriptorImpl]

'compilationCanceledStatus' @ [83:9] ==> value-parameter compilationCanceledStatus: CompilationCanceledStatus? defined in org.jetbrains.kotlin.incremental.makeCompileServices[ValueParameterDescriptorImpl]

'let' @ [83:36] ==> @InlineOnly public inline fun <T, R> CompilationCanceledStatus.let(block: (CompilationCanceledStatus) -> Services.Builder): Services.Builder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilationCanceledStatus
    <R> -> Builder

'register' @ [84:13] ==> public final fun <T : Any> register(interfaceClass: Class<CompilationCanceledStatus>, implementation: CompilationCanceledStatus): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompilationCanceledStatus

'java' @ [84:55] ==> public val <T> KClass<CompilationCanceledStatus>.java: Class<CompilationCanceledStatus> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompilationCanceledStatus

'it' @ [84:61] ==> value-parameter it: CompilationCanceledStatus defined in org.jetbrains.kotlin.incremental.makeCompileServices.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [86:9] ==> public final fun build(): Services defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]

'DO_NOTHING' @ [89:74] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'if (IncrementalCompilation.isEnabled()) LookupTrackerImpl(parentLookupTracker)
        else parentLookupTracker' @ [90:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LookupTracker, elseBranch: LookupTracker): LookupTracker[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LookupTracker

'isEnabled' @ [90:36] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'LookupTrackerImpl' @ [90:49] ==> public constructor LookupTrackerImpl(delegate: LookupTracker) defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[ClassConstructorDescriptorImpl]

'parentLookupTracker' @ [90:67] ==> value-parameter parentLookupTracker: LookupTracker = ... defined in org.jetbrains.kotlin.incremental.makeLookupTracker[ValueParameterDescriptorImpl]

'parentLookupTracker' @ [91:14] ==> value-parameter parentLookupTracker: LookupTracker = ... defined in org.jetbrains.kotlin.incremental.makeLookupTracker[ValueParameterDescriptorImpl]

'targets' @ [100:22] ==> value-parameter targets: Iterable<Target> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[ValueParameterDescriptorImpl]

'keysToMap' @ [100:30] ==> public fun <K, V> Iterable<Target>.keysToMap(value: (Target) -> HashSet<Target> /* = HashSet<Target> */): Map<Target, HashSet<Target> /* = HashSet<Target> */> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Target
    <V> -> HashSet<Target>

'hashSetOf' @ [100:42] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<Target> /* = HashSet<Target> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Target

'targets' @ [101:33] ==> value-parameter targets: Iterable<Target> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[ValueParameterDescriptorImpl]

'toHashSet' @ [101:41] ==> public fun <T> Iterable<Target>.toHashSet(): HashSet<Target> /* = HashSet<Target> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Target

'targets' @ [103:20] ==> value-parameter targets: Iterable<Target> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[ValueParameterDescriptorImpl]

'invoke' @ [104:28] ==> public abstract operator fun invoke(p1: Target): Iterable<Target> defined in kotlin.Function1[FunctionInvokeDescriptor]

'target' @ [104:44] ==> val target: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'dependency' @ [105:17] ==> val dependency: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'targets' @ [105:32] ==> value-parameter targets: Iterable<Target> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[ValueParameterDescriptorImpl]

'dependents' @ [107:13] ==> val dependents: Map<Target, HashSet<Target> /* = HashSet<Target> */> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'dependency' @ [107:24] ==> val dependency: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'add' @ [107:38] ==> public open fun add(element: Target): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'target' @ [107:42] ==> val target: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'targetsWithDependents' @ [108:13] ==> val targetsWithDependents: HashSet<Target> /* = HashSet<Target> */ defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'add' @ [108:35] ==> public open fun add(element: Target): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'target' @ [108:39] ==> val target: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'targetsWithDependents' @ [112:18] ==> val targetsWithDependents: HashSet<Target> /* = HashSet<Target> */ defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'keysToMap' @ [112:40] ==> public fun <K, V> Iterable<Target>.keysToMap(value: (Target) -> IncrementalCacheImpl<Target>): Map<Target, IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Target
    <V> -> IncrementalCacheImpl<Target>

'invoke' @ [112:52] ==> public abstract operator fun invoke(p1: Target): IncrementalCacheImpl<Target> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [112:61] ==> value-parameter it: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [114:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Target, IncrementalCacheImpl<Target>>.component1(): Target defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Target
    <V> -> IncrementalCacheImpl<Target>

'component2' @ [114:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Target, IncrementalCacheImpl<Target>>.component2(): IncrementalCacheImpl<Target> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Target
    <V> -> IncrementalCacheImpl<Target>

'caches' @ [114:29] ==> val caches: Map<Target, IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'dependents' @ [115:9] ==> val dependents: Map<Target, HashSet<Target> /* = HashSet<Target> */> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'target' @ [115:20] ==> val target: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'forEach' @ [115:29] ==> @HidesMembers public inline fun <T> Iterable<Target>.forEach(action: (Target) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Target

'cache' @ [116:13] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'addDependentCache' @ [116:19] ==> public final fun addDependentCache(cache: IncrementalCacheImpl<Target>): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'caches' @ [116:37] ==> val caches: Map<Target, IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'it' @ [116:44] ==> value-parameter it: Target defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap.<anonymous>[ValueParameterDescriptorImpl]

'caches' @ [120:12] ==> val caches: Map<Target, IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap[LocalVariableDescriptor]

'mapKeys' @ [120:19] ==> public inline fun <K, V, R> Map<out Target, IncrementalCacheImpl<Target>>.mapKeys(transform: (Map.Entry<Target, IncrementalCacheImpl<Target>>) -> TargetId): Map<TargetId, IncrementalCacheImpl<Target>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Target
    <V> -> IncrementalCacheImpl<Target>
    <R> -> TargetId

'it' @ [120:29] ==> value-parameter it: Map.Entry<Target, IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.makeIncrementalCachesMap.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [120:32] ==> public abstract val key: Target defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'invoke' @ [120:36] ==> public abstract operator fun Target.invoke(): TargetId defined in kotlin.Function1[FunctionInvokeDescriptor]

'CompilationResult' @ [130:23] ==> public companion object defined in org.jetbrains.kotlin.incremental.CompilationResult[FakeCallableDescriptorForObject]

'NO_CHANGES' @ [130:41] ==> public final val NO_CHANGES: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.Companion[PropertyDescriptorImpl]

'generatedFiles' @ [131:27] ==> value-parameter generatedFiles: List<GeneratedFile<Target>> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[ValueParameterDescriptorImpl]

'invoke' @ [132:18] ==> public abstract operator fun invoke(p1: Target): IncrementalCacheImpl<Target> defined in kotlin.Function1[FunctionInvokeDescriptor]

'generatedFile' @ [132:38] ==> val generatedFile: GeneratedFile<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'target' @ [132:52] ==> public final val target: Target defined in org.jetbrains.kotlin.build.GeneratedFile[PropertyDescriptorImpl]

'when {
            generatedFile is GeneratedJvmClass<Target> -> changesInfo += ic.saveFileToCache(generatedFile)
            generatedFile.outputFile.isModuleMappingFile() -> changesInfo += ic.saveModuleMappingToCache(generatedFile.sourceFiles, generatedFile.outputFile)
        }' @ [133:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'generatedFile' @ [134:13] ==> val generatedFile: GeneratedFile<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'changesInfo' @ [134:59] ==> var changesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'ic' @ [134:74] ==> val ic: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'saveFileToCache' @ [134:77] ==> public open fun saveFileToCache(generatedClass: GeneratedJvmClass<Target>): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'generatedFile' @ [134:93] ==> val generatedFile: GeneratedFile<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'generatedFile' @ [135:13] ==> val generatedFile: GeneratedFile<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'outputFile' @ [135:27] ==> public final val outputFile: File defined in org.jetbrains.kotlin.build.GeneratedFile[PropertyDescriptorImpl]

'isModuleMappingFile' @ [135:38] ==> public fun File.isModuleMappingFile(): Boolean defined in org.jetbrains.kotlin.build[SimpleFunctionDescriptorImpl]

'changesInfo' @ [135:63] ==> var changesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'ic' @ [135:78] ==> val ic: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'saveModuleMappingToCache' @ [135:81] ==> public final fun saveModuleMappingToCache(sourceFiles: Collection<File>, file: File): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'generatedFile' @ [135:106] ==> val generatedFile: GeneratedFile<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'sourceFiles' @ [135:120] ==> public final val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.build.GeneratedFile[PropertyDescriptorImpl]

'generatedFile' @ [135:133] ==> val generatedFile: GeneratedFile<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'outputFile' @ [135:147] ==> public final val outputFile: File defined in org.jetbrains.kotlin.build.GeneratedFile[PropertyDescriptorImpl]

'!' @ [139:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'compiledWithErrors' @ [139:10] ==> value-parameter compiledWithErrors: Boolean defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[ValueParameterDescriptorImpl]

'targets' @ [140:9] ==> value-parameter targets: Iterable<Target> defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[ValueParameterDescriptorImpl]

'forEach' @ [140:17] ==> @HidesMembers public inline fun <T> Iterable<Target>.forEach(action: (Target) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Target

'invoke' @ [141:34] ==> public abstract operator fun invoke(p1: Target): IncrementalCacheImpl<Target> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [141:54] ==> value-parameter it: Target defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches.<anonymous>[ValueParameterDescriptorImpl]

'clearCacheForRemovedClasses' @ [141:58] ==> public final fun clearCacheForRemovedClasses(): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'changesInfo' @ [142:13] ==> var changesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'newChangesInfo' @ [142:28] ==> val newChangesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches.<anonymous>[LocalVariableDescriptor]

'changesInfo' @ [146:12] ==> var changesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.updateIncrementalCaches[LocalVariableDescriptor]

'lookupTracker' @ [154:9] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.incremental.update[ValueParameterDescriptorImpl]

'AssertionError' @ [154:52] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'lookupTracker' @ [154:126] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.incremental.update[ValueParameterDescriptorImpl]

'java' @ [154:147] ==> public val <T> KClass<out LookupTracker>.java: Class<out LookupTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LookupTracker

'removeLookupsFrom' @ [156:5] ==> @Synchronized public final fun removeLookupsFrom(files: Sequence<File>): Unit defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'filesToCompile' @ [156:23] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.incremental.update[ValueParameterDescriptorImpl]

'asSequence' @ [156:38] ==> public fun <T> Iterable<File>.asSequence(): Sequence<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'removedFiles' @ [156:53] ==> value-parameter removedFiles: Iterable<File> defined in org.jetbrains.kotlin.incremental.update[ValueParameterDescriptorImpl]

'asSequence' @ [156:66] ==> public fun <T> Iterable<File>.asSequence(): Sequence<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'addAll' @ [158:5] ==> @Synchronized public final fun addAll(lookups: Set<Map.Entry<LookupSymbol, Collection<String>>>, allPaths: Set<String>): Unit defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'lookupTracker' @ [158:12] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.incremental.update[ValueParameterDescriptorImpl]

'lookups' @ [158:26] ==> public final val lookups: MultiMap<(LookupSymbol..LookupSymbol?), (String..String?)> defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'entrySet' @ [158:34] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(LookupSymbol..LookupSymbol?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(LookupSymbol..LookupSymbol?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?)>..Set<(MutableMap.MutableEntry<(LookupSymbol..LookupSymbol?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(LookupSymbol..LookupSymbol?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'lookupTracker' @ [158:46] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.incremental.update[ValueParameterDescriptorImpl]

'pathInterner' @ [158:60] ==> public final val pathInterner: StringInterner defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'values' @ [158:73] ==> public final val StringInterner.values: (MutableSet<(String..String?)>..Set<(String..String?)>)[MyPropertyDescriptor]

'if (targets.size >1) targets.flatMap { target -> getSources(target).map { Pair(it, target) } }.toMap()
            else mapOf<File, Target>()' @ [169:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<File, Target>, elseBranch: Map<File, Target>): Map<File, Target>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<File, Target>

'targets' @ [169:17] ==> value-parameter targets: Collection<Target> defined in org.jetbrains.kotlin.incremental.generatedFiles[ValueParameterDescriptorImpl]

'size' @ [169:25] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'targets' @ [169:34] ==> value-parameter targets: Collection<Target> defined in org.jetbrains.kotlin.incremental.generatedFiles[ValueParameterDescriptorImpl]

'flatMap' @ [169:42] ==> public inline fun <T, R> Iterable<Target>.flatMap(transform: (Target) -> Iterable<Pair<File, Target>>): List<Pair<File, Target>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Target
    <R> -> Pair<File, Target>

'invoke' @ [169:62] ==> public abstract operator fun invoke(p1: Target): Iterable<File> defined in kotlin.Function1[FunctionInvokeDescriptor]

'target' @ [169:73] ==> value-parameter target: Target defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [169:81] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> Pair<File, Target>): List<Pair<File, Target>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Pair<File, Target>

'Pair' @ [169:87] ==> public constructor Pair<out A, out B>(first: File, second: Target) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> File
    <out B> -> Target

'it' @ [169:92] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [169:96] ==> value-parameter target: Target defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [169:108] ==> public fun <K, V> Iterable<Pair<File, Target>>.toMap(): Map<File, Target> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> Target

'mapOf' @ [170:18] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<File, Target> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> Target

'outputs' @ [172:12] ==> public final val OutputItemsCollectorImpl.outputs: (MutableList<(SimpleOutputItem..SimpleOutputItem?)>..List<(SimpleOutputItem..SimpleOutputItem?)>)[MyPropertyDescriptor]

'map' @ [172:20] ==> public inline fun <T, R> Iterable<(SimpleOutputItem..SimpleOutputItem?)>.map(transform: ((SimpleOutputItem..SimpleOutputItem?)) -> GeneratedFile<Target>): List<GeneratedFile<Target>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.compilerRunner.SimpleOutputItem..org.jetbrains.kotlin.compilerRunner.SimpleOutputItem?)
    <R> -> GeneratedFile<Target>

'outputItem' @ [174:17] ==> value-parameter outputItem: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [174:28] ==> public final val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[PropertyDescriptorImpl]

'firstOrNull' @ [174:40] ==> public fun <T> Iterable<File>.firstOrNull(): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'let' @ [174:55] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> Target?): Target? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Target?

'sourceToTarget' @ [174:61] ==> val sourceToTarget: Map<File, Target> defined in org.jetbrains.kotlin.incremental.generatedFiles[LocalVariableDescriptor]

'it' @ [174:76] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'targets' @ [175:17] ==> value-parameter targets: Collection<Target> defined in org.jetbrains.kotlin.incremental.generatedFiles[ValueParameterDescriptorImpl]

'singleOrNull' @ [175:25] ==> public inline fun <T> Iterable<Target>.singleOrNull(predicate: (Target) -> Boolean): Target? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Target

'invoke' @ [175:40] ==> public abstract operator fun invoke(p1: Target): File? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [175:53] ==> value-parameter it: Target defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [175:58] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Boolean

'outputItem' @ [175:64] ==> value-parameter outputItem: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [175:75] ==> public final val outputFile: File defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[PropertyDescriptorImpl]

'startsWith' @ [175:86] ==> public fun File.startsWith(other: File): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [175:97] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'representativeTarget' @ [176:17] ==> value-parameter representativeTarget: Target defined in org.jetbrains.kotlin.incremental.generatedFiles[ValueParameterDescriptorImpl]

'when (outputItem.outputFile.extension) {
            "class" -> GeneratedJvmClass(target, outputItem.sourceFiles, outputItem.outputFile)
            else -> GeneratedFile(target, outputItem.sourceFiles, outputItem.outputFile)
        }' @ [178:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GeneratedFile<Target>, entry1: GeneratedFile<Target>): GeneratedFile<Target>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GeneratedFile<Target>

'outputItem' @ [178:15] ==> value-parameter outputItem: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [178:26] ==> public final val outputFile: File defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[PropertyDescriptorImpl]

'extension' @ [178:37] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'GeneratedJvmClass' @ [179:24] ==> public constructor GeneratedJvmClass<Target>(target: Target, sourceFiles: Collection<File>, outputFile: File) defined in org.jetbrains.kotlin.build.GeneratedJvmClass[ClassConstructorDescriptorImpl]
Inferred types:
    <Target> -> Target

'target' @ [179:42] ==> val target: Target defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[LocalVariableDescriptor]

'outputItem' @ [179:50] ==> value-parameter outputItem: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [179:61] ==> public final val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[PropertyDescriptorImpl]

'outputItem' @ [179:74] ==> value-parameter outputItem: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [179:85] ==> public final val outputFile: File defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[PropertyDescriptorImpl]

'GeneratedFile' @ [180:21] ==> public constructor GeneratedFile<Target>(target: Target, sourceFiles: Collection<File>, outputFile: File) defined in org.jetbrains.kotlin.build.GeneratedFile[ClassConstructorDescriptorImpl]
Inferred types:
    <Target> -> Target

'target' @ [180:35] ==> val target: Target defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[LocalVariableDescriptor]

'outputItem' @ [180:43] ==> value-parameter outputItem: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [180:54] ==> public final val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[PropertyDescriptorImpl]

'outputItem' @ [180:67] ==> value-parameter outputItem: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.incremental.generatedFiles.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [180:78] ==> public final val outputFile: File defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[PropertyDescriptorImpl]

'emptyList' @ [186:60] ==> public fun <T> emptyList(): List<LookupSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupSymbol

'emptyList' @ [187:55] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'HashSet' @ [194:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupSymbol

'HashSet' @ [195:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'changes' @ [197:20] ==> public final val changes: Sequence<ChangeInfo> defined in org.jetbrains.kotlin.incremental.CompilationResult[PropertyDescriptorImpl]

'reporter' @ [198:9] ==> value-parameter reporter: ICReporter defined in org.jetbrains.kotlin.incremental.getDirtyData[ValueParameterDescriptorImpl]

'report' @ [198:18] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[SimpleFunctionDescriptorImpl]

'change' @ [198:37] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'if (change is ChangeInfo.SignatureChanged) {
            val fqNames = if (!change.areSubclassesAffected) listOf(change.fqName) else withSubtypes(change.fqName, caches)

            for (classFqName in fqNames) {
                assert(!classFqName.isRoot) { "$classFqName is root when processing $change" }

                val scope = classFqName.parent().asString()
                val name = classFqName.shortName().identifier
                dirtyLookupSymbols.add(LookupSymbol(name, scope))
            }
        }
        else if (change is ChangeInfo.MembersChanged) {
            val fqNames = withSubtypes(change.fqName, caches)
            // need to recompile subtypes because changed member might break override
            dirtyClassesFqNames.addAll(fqNames)

            for (name in change.names) {
                for (fqName in fqNames) {
                    dirtyLookupSymbols.add(LookupSymbol(name, fqName.asString()))
                }
            }
        }' @ [200:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [200:13] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'if (!change.areSubclassesAffected) listOf(change.fqName) else withSubtypes(change.fqName, caches)' @ [201:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<FqName>, elseBranch: Collection<FqName>): Collection<FqName>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<FqName>

'!' @ [201:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'change' @ [201:32] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'areSubclassesAffected' @ [201:39] ==> public final val areSubclassesAffected: Boolean defined in org.jetbrains.kotlin.incremental.ChangeInfo.SignatureChanged[PropertyDescriptorImpl]

'listOf' @ [201:62] ==> public fun <T> listOf(element: FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'change' @ [201:69] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'fqName' @ [201:76] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.incremental.ChangeInfo[PropertyDescriptorImpl]

'withSubtypes' @ [201:89] ==> public fun <Target> withSubtypes(typeFqName: FqName, caches: Iterable<IncrementalCacheImpl<Target>>): Set<FqName> defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <Target> -> Target

'change' @ [201:102] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'fqName' @ [201:109] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.incremental.ChangeInfo[PropertyDescriptorImpl]

'caches' @ [201:117] ==> value-parameter caches: Iterable<IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.getDirtyData[ValueParameterDescriptorImpl]

'fqNames' @ [203:33] ==> val fqNames: Collection<FqName> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'assert' @ [204:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [204:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classFqName' @ [204:25] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'isRoot' @ [204:37] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'classFqName' @ [204:49] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'change' @ [204:86] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'classFqName' @ [206:29] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'parent' @ [206:41] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [206:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'classFqName' @ [207:28] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'shortName' @ [207:40] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [207:52] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'dirtyLookupSymbols' @ [208:17] ==> val dirtyLookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'add' @ [208:36] ==> public open fun add(element: LookupSymbol): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'LookupSymbol' @ [208:40] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[ClassConstructorDescriptorImpl]

'name' @ [208:53] ==> val name: String defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'scope' @ [208:59] ==> val scope: String defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'change' @ [211:18] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'withSubtypes' @ [212:27] ==> public fun <Target> withSubtypes(typeFqName: FqName, caches: Iterable<IncrementalCacheImpl<Target>>): Set<FqName> defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <Target> -> Target

'change' @ [212:40] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'fqName' @ [212:47] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.incremental.ChangeInfo[PropertyDescriptorImpl]

'caches' @ [212:55] ==> value-parameter caches: Iterable<IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.getDirtyData[ValueParameterDescriptorImpl]

'dirtyClassesFqNames' @ [214:13] ==> val dirtyClassesFqNames: HashSet<FqName> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'addAll' @ [214:33] ==> public open fun addAll(elements: Collection<FqName>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fqNames' @ [214:40] ==> val fqNames: Set<FqName> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'change' @ [216:26] ==> val change: ChangeInfo defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'names' @ [216:33] ==> public final val names: Collection<String> defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged[PropertyDescriptorImpl]

'fqNames' @ [217:32] ==> val fqNames: Set<FqName> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'dirtyLookupSymbols' @ [218:21] ==> val dirtyLookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'add' @ [218:40] ==> public open fun add(element: LookupSymbol): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'LookupSymbol' @ [218:44] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[ClassConstructorDescriptorImpl]

'name' @ [218:57] ==> val name: String defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'fqName' @ [218:63] ==> val fqName: FqName defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'asString' @ [218:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'DirtyData' @ [224:12] ==> public constructor DirtyData(dirtyLookupSymbols: Collection<LookupSymbol> = ..., dirtyClassesFqNames: Collection<FqName> = ...) defined in org.jetbrains.kotlin.incremental.DirtyData[ClassConstructorDescriptorImpl]

'dirtyLookupSymbols' @ [224:22] ==> val dirtyLookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'dirtyClassesFqNames' @ [224:42] ==> val dirtyClassesFqNames: HashSet<FqName> defined in org.jetbrains.kotlin.incremental.getDirtyData[LocalVariableDescriptor]

'emptySet' @ [231:31] ==> public fun <T> emptySet(): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'HashSet' @ [233:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'lookupSymbols' @ [235:20] ==> value-parameter lookupSymbols: Iterable<LookupSymbol> defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[ValueParameterDescriptorImpl]

'lookupStorage' @ [236:29] ==> value-parameter lookupStorage: LookupStorage defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[ValueParameterDescriptorImpl]

'get' @ [236:43] ==> @Synchronized public final fun get(lookupSymbol: LookupSymbol): Collection<String> defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'lookup' @ [236:47] ==> val lookup: LookupSymbol defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[LocalVariableDescriptor]

'map' @ [236:55] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'filter' @ [236:67] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [236:76] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles.<anonymous>[ValueParameterDescriptorImpl]

'excludes' @ [236:83] ==> value-parameter excludes: Set<File> = ... defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[ValueParameterDescriptorImpl]

'reporter' @ [237:9] ==> value-parameter reporter: ICReporter defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[ValueParameterDescriptorImpl]

'report' @ [237:18] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[SimpleFunctionDescriptorImpl]

'lookup' @ [237:30] ==> val lookup: LookupSymbol defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[LocalVariableDescriptor]

'scope' @ [237:37] ==> public final val scope: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'lookup' @ [237:46] ==> val lookup: LookupSymbol defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[LocalVariableDescriptor]

'name' @ [237:53] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'reporter' @ [237:86] ==> value-parameter reporter: ICReporter defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[ValueParameterDescriptorImpl]

'pathsAsString' @ [237:95] ==> public open fun pathsAsString(files: Iterable<File>): String defined in org.jetbrains.kotlin.incremental.ICReporter[SimpleFunctionDescriptorImpl]

'affectedFiles' @ [237:109] ==> val affectedFiles: List<File> defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[LocalVariableDescriptor]

'dirtyFiles' @ [238:9] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[LocalVariableDescriptor]

'addAll' @ [238:20] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'affectedFiles' @ [238:27] ==> val affectedFiles: List<File> defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[LocalVariableDescriptor]

'dirtyFiles' @ [241:12] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.mapLookupSymbolsToFiles[LocalVariableDescriptor]

'emptySet' @ [248:31] ==> public fun <T> emptySet(): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'HashSet' @ [250:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'caches' @ [252:19] ==> value-parameter caches: Iterable<IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[ValueParameterDescriptorImpl]

'classesFqNames' @ [253:34] ==> value-parameter classesFqNames: Iterable<FqName> defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[ValueParameterDescriptorImpl]

'cache' @ [254:27] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'getSourceFileIfClass' @ [254:33] ==> public final fun getSourceFileIfClass(fqName: FqName): File? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'dirtyClassFqName' @ [254:54] ==> val dirtyClassFqName: FqName defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'srcFile' @ [255:17] ==> val srcFile: File? defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'srcFile' @ [255:36] ==> val srcFile: File? defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'excludes' @ [255:47] ==> value-parameter excludes: Set<File> = ... defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[ValueParameterDescriptorImpl]

'reporter' @ [257:13] ==> value-parameter reporter: ICReporter defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[ValueParameterDescriptorImpl]

'report' @ [257:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[SimpleFunctionDescriptorImpl]

'dirtyClassFqName' @ [257:40] ==> val dirtyClassFqName: FqName defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'reporter' @ [257:84] ==> value-parameter reporter: ICReporter defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[ValueParameterDescriptorImpl]

'pathsAsString' @ [257:93] ==> public open fun pathsAsString(vararg files: File): String defined in org.jetbrains.kotlin.incremental.ICReporter[SimpleFunctionDescriptorImpl]

'srcFile' @ [257:107] ==> val srcFile: File? defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'dirtyFiles' @ [258:13] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'add' @ [258:24] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'srcFile' @ [258:28] ==> val srcFile: File? defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'dirtyFiles' @ [262:12] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.mapClassesFqNamesToFiles[LocalVariableDescriptor]

'roots' @ [266:9] ==> value-parameter roots: Iterable<File> defined in org.jetbrains.kotlin.incremental.findSrcDirRoot[ValueParameterDescriptorImpl]

'firstOrNull' @ [266:15] ==> public inline fun <T> Iterable<File>.firstOrNull(predicate: (File) -> Boolean): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'isAncestor' @ [266:38] ==> public open fun isAncestor(@NotNull p0: File, @NotNull p1: File, p2: Boolean): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'it' @ [266:49] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.findSrcDirRoot.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [266:53] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.findSrcDirRoot[ValueParameterDescriptorImpl]

'LinkedList' @ [272:17] ==> public constructor LinkedList<E : (Any..Any?)>(p0: (MutableCollection<out (FqName..FqName?)>..Collection<(FqName..FqName?)>?)) defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'listOf' @ [272:28] ==> public fun <T> listOf(element: FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'typeFqName' @ [272:35] ==> value-parameter typeFqName: FqName defined in org.jetbrains.kotlin.incremental.withSubtypes[ValueParameterDescriptorImpl]

'hashSetOf' @ [273:20] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<FqName> /* = HashSet<FqName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'types' @ [275:12] ==> val types: LinkedList<FqName> defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

'isNotEmpty' @ [275:18] ==> @InlineOnly public inline fun <T> Collection<FqName>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'types' @ [276:31] ==> val types: LinkedList<FqName> defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

'pollFirst' @ [276:37] ==> public open fun pollFirst(): (FqName..FqName?) defined in java.util.LinkedList[JavaMethodDescriptor]

'caches' @ [278:9] ==> value-parameter caches: Iterable<IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.withSubtypes[ValueParameterDescriptorImpl]

'asSequence' @ [278:16] ==> public fun <T> Iterable<IncrementalCacheImpl<Target>>.asSequence(): Sequence<IncrementalCacheImpl<Target>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCacheImpl<Target>

'flatMap' @ [279:16] ==> public fun <T, R> Sequence<IncrementalCacheImpl<Target>>.flatMap(transform: (IncrementalCacheImpl<Target>) -> Sequence<FqName>): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCacheImpl<Target>
    <R> -> FqName

'it' @ [279:26] ==> value-parameter it: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.withSubtypes.<anonymous>[ValueParameterDescriptorImpl]

'getSubtypesOf' @ [279:29] ==> public final fun getSubtypesOf(className: FqName): Sequence<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'unprocessedType' @ [279:43] ==> val unprocessedType: (FqName..FqName?) defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

'filter' @ [280:16] ==> public fun <T> Sequence<FqName>.filter(predicate: (FqName) -> Boolean): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'it' @ [280:25] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.withSubtypes.<anonymous>[ValueParameterDescriptorImpl]

'subtypes' @ [280:32] ==> val subtypes: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

'forEach' @ [281:16] ==> public inline fun <T> Sequence<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'types' @ [281:26] ==> val types: LinkedList<FqName> defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

'addLast' @ [281:32] ==> public open fun addLast(p0: (FqName..FqName?)): Unit defined in java.util.LinkedList[JavaMethodDescriptor]

'it' @ [281:40] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.withSubtypes.<anonymous>[ValueParameterDescriptorImpl]

'subtypes' @ [283:9] ==> val subtypes: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

'add' @ [283:18] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'unprocessedType' @ [283:22] ==> val unprocessedType: (FqName..FqName?) defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

'subtypes' @ [286:12] ==> val subtypes: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.incremental.withSubtypes[LocalVariableDescriptor]

