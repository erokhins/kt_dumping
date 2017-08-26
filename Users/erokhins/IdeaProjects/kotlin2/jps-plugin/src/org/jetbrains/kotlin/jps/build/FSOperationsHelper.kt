'ModulesBasedFileFilter' @ [37:37] ==> public constructor ModulesBasedFileFilter(context: CompileContext, chunk: ModuleChunk) defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[ClassConstructorDescriptorImpl]

'compileContext' @ [37:60] ==> private final val compileContext: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'chunk' @ [37:76] ==> private final val chunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'compileContext' @ [42:31] ==> private final val compileContext: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'testingContext' @ [42:46] ==> public val CompileContext.testingContext: TestingContext? defined in org.jetbrains.kotlin.jps.build in file TestingContext.kt[PropertyDescriptorImpl]

'buildLogger' @ [42:62] ==> public final val buildLogger: BuildLogger defined in org.jetbrains.kotlin.jps.build.TestingContext[PropertyDescriptorImpl]

'setOf' @ [44:88] ==> @InlineOnly public inline fun <T> setOf(): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'kotlinOnly' @ [46:17] ==> value-parameter kotlinOnly: Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markChunk[ValueParameterDescriptorImpl]

'!' @ [46:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isKotlinSourceFile' @ [46:58] ==> public/*package*/ open fun isKotlinSourceFile(file: (File..File?)): Boolean defined in org.jetbrains.kotlin.jps.build.KotlinSourceFileCollector[JavaMethodDescriptor]

'file' @ [46:77] ==> value-parameter file: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markChunk.shouldMark[ValueParameterDescriptorImpl]

'file' @ [48:17] ==> value-parameter file: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markChunk.shouldMark[ValueParameterDescriptorImpl]

'excludeFiles' @ [48:25] ==> value-parameter excludeFiles: Set<File> = ... defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markChunk[ValueParameterDescriptorImpl]

'hasMarkedDirty' @ [50:13] ==> internal final var hasMarkedDirty: Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'if (recursively) {
            FSOperations.markDirtyRecursively(compileContext, CompilationRound.NEXT, chunk, ::shouldMark)
        }
        else {
            FSOperations.markDirty(compileContext, CompilationRound.NEXT, chunk, ::shouldMark)
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'recursively' @ [54:13] ==> value-parameter recursively: Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markChunk[ValueParameterDescriptorImpl]

'markDirtyRecursively' @ [55:26] ==> public final fun markDirtyRecursively(p0: (CompileContext..CompileContext?), p1: (CompilationRound..CompilationRound?), p2: (ModuleChunk..ModuleChunk?), @Nullable p3: (((File..File?)) -> Boolean)?): Unit defined in org.jetbrains.jps.incremental.FSOperations[SamAdapterFunctionDescriptor]

'compileContext' @ [55:47] ==> private final val compileContext: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'NEXT' @ [55:80] ==> enum entry NEXT defined in org.jetbrains.jps.incremental.fs.CompilationRound[FakeCallableDescriptorForObject]

'chunk' @ [55:86] ==> private final val chunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'shouldMark' @ [55:95] ==> local final fun shouldMark(file: File): Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markChunk[SimpleFunctionDescriptorImpl]

'markDirty' @ [58:26] ==> public final fun markDirty(p0: (CompileContext..CompileContext?), p1: (CompilationRound..CompilationRound?), p2: (ModuleChunk..ModuleChunk?), @Nullable p3: (((File..File?)) -> Boolean)?): Unit defined in org.jetbrains.jps.incremental.FSOperations[SamAdapterFunctionDescriptor]

'compileContext' @ [58:36] ==> private final val compileContext: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'NEXT' @ [58:69] ==> enum entry NEXT defined in org.jetbrains.jps.incremental.fs.CompilationRound[FakeCallableDescriptorForObject]

'chunk' @ [58:75] ==> private final val chunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'shouldMark' @ [58:84] ==> local final fun shouldMark(file: File): Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markChunk[SimpleFunctionDescriptorImpl]

'markFilesImpl' @ [63:9] ==> private final inline fun markFilesImpl(files: Iterable<File>, shouldMark: (File) -> Boolean): Unit defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[SimpleFunctionDescriptorImpl]

'files' @ [63:23] ==> value-parameter files: Iterable<File> defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFiles[ValueParameterDescriptorImpl]

'it' @ [63:32] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFiles.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [63:35] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'markFilesImpl' @ [67:9] ==> private final inline fun markFilesImpl(files: Iterable<File>, shouldMark: (File) -> Boolean): Unit defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[SimpleFunctionDescriptorImpl]

'files' @ [67:23] ==> value-parameter files: Iterable<File> defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markInChunkOrDependents[ValueParameterDescriptorImpl]

'it' @ [67:32] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markInChunkOrDependents.<anonymous>[ValueParameterDescriptorImpl]

'excludeFiles' @ [67:39] ==> value-parameter excludeFiles: Set<File> defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markInChunkOrDependents[ValueParameterDescriptorImpl]

'it' @ [67:55] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markInChunkOrDependents.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [67:58] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'moduleBasedFilter' @ [67:70] ==> private final val moduleBasedFilter: FSOperationsHelper.ModulesBasedFileFilter defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'accept' @ [67:88] ==> public open fun accept(file: File): Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[SimpleFunctionDescriptorImpl]

'it' @ [67:95] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markInChunkOrDependents.<anonymous>[ValueParameterDescriptorImpl]

'files' @ [71:27] ==> value-parameter files: Iterable<File> defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFilesImpl[ValueParameterDescriptorImpl]

'filterTo' @ [71:33] ==> public inline fun <T, C : MutableCollection<in File>> Iterable<File>.filterTo(destination: HashSet<File> /* = HashSet<File> */, predicate: (File) -> Boolean): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <C : MutableCollection<in T>> -> HashSet<File>

'HashSet' @ [71:42] ==> public final fun <E> <init>(): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> File

'shouldMark' @ [71:53] ==> value-parameter shouldMark: (File) -> Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFilesImpl[ValueParameterDescriptorImpl]

'filesToMark' @ [73:13] ==> val filesToMark: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFilesImpl[LocalVariableDescriptor]

'isEmpty' @ [73:25] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'filesToMark' @ [75:28] ==> val filesToMark: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFilesImpl[LocalVariableDescriptor]

'markDirty' @ [76:26] ==> public open fun markDirty(p0: (CompileContext..CompileContext?), p1: (CompilationRound..CompilationRound?), p2: (File..File?)): Unit defined in org.jetbrains.jps.incremental.FSOperations[JavaMethodDescriptor]

'compileContext' @ [76:36] ==> private final val compileContext: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'NEXT' @ [76:69] ==> enum entry NEXT defined in org.jetbrains.jps.incremental.fs.CompilationRound[FakeCallableDescriptorForObject]

'fileToMark' @ [76:75] ==> val fileToMark: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFilesImpl[LocalVariableDescriptor]

'log' @ [79:9] ==> private final val log: Logger defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'debug' @ [79:13] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'filesToMark' @ [79:33] ==> val filesToMark: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFilesImpl[LocalVariableDescriptor]

'buildLogger' @ [80:9] ==> private final val buildLogger: BuildLogger? defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'markedAsDirty' @ [80:22] ==> public abstract fun markedAsDirty(files: Iterable<File>): Unit defined in org.jetbrains.kotlin.jps.build.BuildLogger[SimpleFunctionDescriptorImpl]

'filesToMark' @ [80:36] ==> val filesToMark: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.markFilesImpl[LocalVariableDescriptor]

'hasMarkedDirty' @ [81:9] ==> internal final var hasMarkedDirty: Boolean defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper[PropertyDescriptorImpl]

'chunk' @ [89:36] ==> value-parameter chunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.<init>[ValueParameterDescriptorImpl]

'targets' @ [89:42] ==> public final val ModuleChunk.targets: (MutableSet<(ModuleBuildTarget..ModuleBuildTarget?)>..Set<(ModuleBuildTarget..ModuleBuildTarget?)>?)[MyPropertyDescriptor]

'context' @ [90:38] ==> private final val context: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'projectDescriptor' @ [90:46] ==> public final val CompileContext.projectDescriptor: (ProjectDescriptor..ProjectDescriptor?)[MyPropertyDescriptor]

'buildRootIndex' @ [90:64] ==> public final val ProjectDescriptor.buildRootIndex: (BuildRootIndex..BuildRootIndex?)[MyPropertyDescriptor]

'context' @ [91:40] ==> private final val context: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'projectDescriptor' @ [91:48] ==> public final val CompileContext.projectDescriptor: (ProjectDescriptor..ProjectDescriptor?)[MyPropertyDescriptor]

'buildTargetIndex' @ [91:66] ==> public final val ProjectDescriptor.buildTargetIndex: (BuildTargetIndex..BuildTargetIndex?)[MyPropertyDescriptor]

'HashMap' @ [92:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> BuildTarget<*>
    <V : (Any..Any?)> -> Set<BuildTarget<*>>

'buildRootIndex' @ [95:22] ==> private final val buildRootIndex: (BuildRootIndex..BuildRootIndex?) defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'findJavaRootDescriptor' @ [95:37] ==> @Nullable public abstract fun findJavaRootDescriptor(@Nullable p0: CompileContext?, p1: (File..File?)): JavaSourceRootDescriptor? defined in org.jetbrains.jps.builders.BuildRootIndex[JavaMethodDescriptor]

'context' @ [95:60] ==> private final val context: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'file' @ [95:69] ==> value-parameter file: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.accept[ValueParameterDescriptorImpl]

'rd' @ [96:26] ==> val rd: JavaSourceRootDescriptor defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.accept[LocalVariableDescriptor]

'target' @ [96:29] ==> @NotNull public final val target: ModuleBuildTarget defined in org.jetbrains.jps.builders.java.JavaSourceRootDescriptor[JavaPropertyDescriptor]

'target' @ [97:17] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.accept[LocalVariableDescriptor]

'chunkTargets' @ [97:27] ==> private final val chunkTargets: (MutableSet<(ModuleBuildTarget..ModuleBuildTarget?)>..Set<(ModuleBuildTarget..ModuleBuildTarget?)>?) defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'cache' @ [99:48] ==> private final val cache: HashMap<BuildTarget<*>, Set<BuildTarget<*>>> defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'getOrPut' @ [99:54] ==> public inline fun <K, V> MutableMap<BuildTarget<*>, Set<BuildTarget<*>>>.getOrPut(key: BuildTarget<*>, defaultValue: () -> Set<BuildTarget<*>>): Set<BuildTarget<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> BuildTarget<*>
    <V> -> Set<BuildTarget<*>>

'target' @ [99:63] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.accept[LocalVariableDescriptor]

'buildTargetIndex' @ [99:73] ==> private final val buildTargetIndex: (BuildTargetIndex..BuildTargetIndex?) defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'getDependenciesRecursively' @ [99:90] ==> @Deprecated public abstract fun getDependenciesRecursively(@NotNull p0: BuildTarget<*>, @NotNull p1: CompileContext): (MutableSet<(BuildTarget<*>..BuildTarget<*>?)>..Set<(BuildTarget<*>..BuildTarget<*>?)>?) defined in org.jetbrains.jps.builders.BuildTargetIndex[JavaMethodDescriptor]

'target' @ [99:117] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.accept[LocalVariableDescriptor]

'context' @ [99:125] ==> private final val context: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'intersects' @ [100:34] ==> @Contract public open fun <T : (Any..Any?)> intersects(@NotNull p0: (MutableCollection<out (BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>..BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>?)>..Collection<(BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>..BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>?)>), @NotNull p1: (MutableCollection<out (BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>..BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>?)>..Collection<(BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>..BuildTarget<out (BuildRootDescriptor..BuildRootDescriptor?)>?)>)): Boolean defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.jps.builders.BuildTarget<out (org.jetbrains.jps.builders.BuildRootDescriptor..org.jetbrains.jps.builders.BuildRootDescriptor?)>..org.jetbrains.jps.builders.BuildTarget<out (org.jetbrains.jps.builders.BuildRootDescriptor..org.jetbrains.jps.builders.BuildRootDescriptor?)>?)

'targetOfFileWithDependencies' @ [100:45] ==> val targetOfFileWithDependencies: Set<BuildTarget<*>> defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.accept[LocalVariableDescriptor]

'chunkTargets' @ [100:75] ==> private final val chunkTargets: (MutableSet<(ModuleBuildTarget..ModuleBuildTarget?)>..Set<(ModuleBuildTarget..ModuleBuildTarget?)>?) defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'buildRootIndex' @ [104:22] ==> private final val buildRootIndex: (BuildRootIndex..BuildRootIndex?) defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'findJavaRootDescriptor' @ [104:37] ==> @Nullable public abstract fun findJavaRootDescriptor(@Nullable p0: CompileContext?, p1: (File..File?)): JavaSourceRootDescriptor? defined in org.jetbrains.jps.builders.BuildRootIndex[JavaMethodDescriptor]

'context' @ [104:60] ==> private final val context: CompileContext defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'file' @ [104:69] ==> value-parameter file: File defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.belongsToCurrentTargetChunk[ValueParameterDescriptorImpl]

'rd' @ [105:20] ==> val rd: JavaSourceRootDescriptor? defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.belongsToCurrentTargetChunk[LocalVariableDescriptor]

'chunkTargets' @ [105:34] ==> private final val chunkTargets: (MutableSet<(ModuleBuildTarget..ModuleBuildTarget?)>..Set<(ModuleBuildTarget..ModuleBuildTarget?)>?) defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter[PropertyDescriptorImpl]

'contains' @ [105:47] ==> public abstract fun contains(element: (ModuleBuildTarget..ModuleBuildTarget?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'rd' @ [105:56] ==> val rd: JavaSourceRootDescriptor? defined in org.jetbrains.kotlin.jps.build.FSOperationsHelper.ModulesBasedFileFilter.belongsToCurrentTargetChunk[LocalVariableDescriptor]

'target' @ [105:59] ==> @NotNull public final val target: ModuleBuildTarget defined in org.jetbrains.jps.builders.java.JavaSourceRootDescriptor[JavaPropertyDescriptor]

