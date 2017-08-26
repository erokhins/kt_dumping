'BasicMapsOwner' @ [56:5] ==> public constructor BasicMapsOwner() defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner[ClassConstructorDescriptorImpl]

'+' @ [71:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'ModuleMapping' @ [71:54] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'MAPPING_FILE_EXT' @ [71:68] ==> @field:JvmField public final val MAPPING_FILE_EXT: String defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedPropertyDescriptor]

'File' @ [74:27] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'targetDataRoot' @ [74:32] ==> private final val targetDataRoot: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'KOTLIN_CACHE_DIRECTORY_NAME' @ [74:48] ==> public val KOTLIN_CACHE_DIRECTORY_NAME: String defined in org.jetbrains.kotlin.incremental in file IncrementalCacheImpl.kt[PropertyDescriptorImpl]

'File' @ [77:17] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseDir' @ [77:22] ==> private final val baseDir: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'this' @ [77:31] ==> <this> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.storageFile[ReceiverParameterDescriptorImpl]

'CACHE_EXTENSION' @ [77:44] ==> public final val CACHE_EXTENSION: String defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner.Companion[PropertyDescriptorImpl]

'registerMap' @ [79:28] ==> protected final fun <K, V, M : BasicMap<String, ProtoMapValue>> registerMap(map: IncrementalCacheImpl<Target>.ProtoMap): IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> ProtoMapValue
    <M : BasicMap<K, V>> -> ProtoMap<Target>

'ProtoMap' @ [79:40] ==> public constructor ProtoMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[ClassConstructorDescriptorImpl]

'PROTO_MAP' @ [79:49] ==> private final val PROTO_MAP: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [79:59] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [80:32] ==> protected final fun <K, V, M : BasicMap<String, Map<String, Any>>> registerMap(map: IncrementalCacheImpl<Target>.ConstantsMap): IncrementalCacheImpl<Target>.ConstantsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Map<String, Any>
    <M : BasicMap<K, V>> -> ConstantsMap<Target>

'ConstantsMap' @ [80:44] ==> public constructor ConstantsMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[ClassConstructorDescriptorImpl]

'CONSTANTS_MAP' @ [80:57] ==> private final val CONSTANTS_MAP: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [80:71] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [81:34] ==> protected final fun <K, V, M : BasicMap<String, Boolean>> registerMap(map: IncrementalCacheImpl<Target>.PackagePartMap): IncrementalCacheImpl<Target>.PackagePartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Boolean
    <M : BasicMap<K, V>> -> PackagePartMap<Target>

'PackagePartMap' @ [81:46] ==> public constructor PackagePartMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[ClassConstructorDescriptorImpl]

'PACKAGE_PARTS' @ [81:61] ==> private final val PACKAGE_PARTS: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [81:75] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [82:42] ==> protected final fun <K, V, M : BasicMap<String, Collection<String>>> registerMap(map: IncrementalCacheImpl<Target>.MultifileClassFacadeMap): IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Collection<String>
    <M : BasicMap<K, V>> -> MultifileClassFacadeMap<Target>

'MultifileClassFacadeMap' @ [82:54] ==> public constructor MultifileClassFacadeMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[ClassConstructorDescriptorImpl]

'MULTIFILE_CLASS_FACADES' @ [82:78] ==> private final val MULTIFILE_CLASS_FACADES: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [82:102] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [83:41] ==> protected final fun <K, V, M : BasicMap<String, String>> registerMap(map: IncrementalCacheImpl<Target>.MultifileClassPartMap): IncrementalCacheImpl<Target>.MultifileClassPartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> String
    <M : BasicMap<K, V>> -> MultifileClassPartMap<Target>

'MultifileClassPartMap' @ [83:53] ==> public constructor MultifileClassPartMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[ClassConstructorDescriptorImpl]

'MULTIFILE_CLASS_PARTS' @ [83:75] ==> private final val MULTIFILE_CLASS_PARTS: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [83:97] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [84:38] ==> protected final fun <K, V, M : BasicMap<String, Collection<String>>> registerMap(map: IncrementalCacheImpl<Target>.SourceToClassesMap): IncrementalCacheImpl<Target>.SourceToClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Collection<String>
    <M : BasicMap<K, V>> -> SourceToClassesMap<Target>

'SourceToClassesMap' @ [84:50] ==> public constructor SourceToClassesMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[ClassConstructorDescriptorImpl]

'SOURCE_TO_CLASSES' @ [84:69] ==> private final val SOURCE_TO_CLASSES: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [84:87] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [85:41] ==> protected final fun <K, V, M : BasicMap<String, Boolean>> registerMap(map: IncrementalCacheImpl<Target>.DirtyOutputClassesMap): IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Boolean
    <M : BasicMap<K, V>> -> DirtyOutputClassesMap<Target>

'DirtyOutputClassesMap' @ [85:53] ==> public constructor DirtyOutputClassesMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[ClassConstructorDescriptorImpl]

'DIRTY_OUTPUT_CLASSES' @ [85:75] ==> private final val DIRTY_OUTPUT_CLASSES: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [85:96] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [86:38] ==> protected final fun <K, V, M : BasicMap<String, Map<String, Long>>> registerMap(map: IncrementalCacheImpl<Target>.InlineFunctionsMap): IncrementalCacheImpl<Target>.InlineFunctionsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Map<String, Long>
    <M : BasicMap<K, V>> -> InlineFunctionsMap<Target>

'InlineFunctionsMap' @ [86:50] ==> public constructor InlineFunctionsMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[ClassConstructorDescriptorImpl]

'INLINE_FUNCTIONS' @ [86:69] ==> private final val INLINE_FUNCTIONS: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [86:86] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [87:31] ==> protected final fun <K, V, M : BasicMap<String, Collection<String>>> registerMap(map: SubtypesMap): SubtypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Collection<String>
    <M : BasicMap<K, V>> -> SubtypesMap

'SubtypesMap' @ [87:43] ==> public constructor SubtypesMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.storage.SubtypesMap[ClassConstructorDescriptorImpl]

'SUBTYPES' @ [87:55] ==> private final val SUBTYPES: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [87:64] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [88:33] ==> protected final fun <K, V, M : BasicMap<String, Collection<String>>> registerMap(map: SupertypesMap): SupertypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Collection<String>
    <M : BasicMap<K, V>> -> SupertypesMap

'SupertypesMap' @ [88:45] ==> public constructor SupertypesMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.storage.SupertypesMap[ClassConstructorDescriptorImpl]

'SUPERTYPES' @ [88:59] ==> private final val SUPERTYPES: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [88:70] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [89:42] ==> protected final fun <K, V, M : BasicMap<String, String>> registerMap(map: IncrementalCacheImpl<Target>.ClassFqNameToSourceMap): IncrementalCacheImpl<Target>.ClassFqNameToSourceMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> String
    <M : BasicMap<K, V>> -> ClassFqNameToSourceMap<Target>

'ClassFqNameToSourceMap' @ [89:54] ==> public constructor ClassFqNameToSourceMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap[ClassConstructorDescriptorImpl]

'CLASS_FQ_NAME_TO_SOURCE' @ [89:77] ==> private final val CLASS_FQ_NAME_TO_SOURCE: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [89:101] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'registerMap' @ [91:40] ==> protected final fun <K, V, M : BasicMap<String, Collection<String>>> registerMap(map: IncrementalCacheImpl<Target>.InternalNameToSourcesMap): IncrementalCacheImpl<Target>.InternalNameToSourcesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Collection<String>
    <M : BasicMap<K, V>> -> InternalNameToSourcesMap<Target>

'InternalNameToSourcesMap' @ [91:52] ==> public constructor InternalNameToSourcesMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap[ClassConstructorDescriptorImpl]

'INTERNAL_NAME_TO_SOURCE' @ [91:77] ==> private final val INTERNAL_NAME_TO_SOURCE: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [91:101] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'arrayListOf' @ [93:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCacheImpl<Target>

'lazy' @ [94:30] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> File): Lazy<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'NONE' @ [94:56] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'requireNotNull' @ [94:64] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: File?, lazyMessage: () -> Any): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> File

'targetOutputDir' @ [94:79] ==> value-parameter targetOutputDir: File? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'target' @ [94:145] ==> value-parameter target: Target defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'lazy' @ [96:76] ==> public fun <T> lazy(initializer: () -> ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */): Lazy<ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<IncrementalCacheImpl<Target>>

'arrayListOf' @ [97:22] ==> public fun <T> arrayListOf(vararg elements: IncrementalCacheImpl<Target>): ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCacheImpl<Target>

'this' @ [97:34] ==> <this> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[LazyClassReceiverParameterDescriptor]

'result' @ [98:9] ==> val result: ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.thisWithDependentCaches.<anonymous>[LocalVariableDescriptor]

'addAll' @ [98:16] ==> public open fun addAll(elements: Collection<IncrementalCacheImpl<Target>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'dependents' @ [98:23] ==> private final val dependents: ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'result' @ [99:9] ==> val result: ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.thisWithDependentCaches.<anonymous>[LocalVariableDescriptor]

'dependents' @ [105:9] ==> private final val dependents: ArrayList<IncrementalCacheImpl<Target>> /* = ArrayList<IncrementalCacheImpl<Target>> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'add' @ [105:20] ==> public open fun add(element: IncrementalCacheImpl<Target>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'cache' @ [105:24] ==> value-parameter cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addDependentCache[ValueParameterDescriptorImpl]

'removedAndCompiledSources' @ [109:28] ==> value-parameter removedAndCompiledSources: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.markOutputClassesDirty[ValueParameterDescriptorImpl]

'sourceToClassesMap' @ [110:27] ==> private final val sourceToClassesMap: IncrementalCacheImpl<Target>.SourceToClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'sourceFile' @ [110:46] ==> val sourceFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.markOutputClassesDirty[LocalVariableDescriptor]

'classes' @ [111:13] ==> val classes: Collection<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.markOutputClassesDirty[LocalVariableDescriptor]

'forEach' @ [111:21] ==> @HidesMembers public inline fun <T> Iterable<JvmClassName>.forEach(action: (JvmClassName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClassName

'dirtyOutputClassesMap' @ [112:17] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'markDirty' @ [112:39] ==> public final fun markDirty(className: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'it' @ [112:49] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.markOutputClassesDirty.<anonymous>[ValueParameterDescriptorImpl]

'internalName' @ [112:52] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'sourceToClassesMap' @ [115:13] ==> private final val sourceToClassesMap: IncrementalCacheImpl<Target>.SourceToClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'clearOutputsForSource' @ [115:32] ==> public final fun clearOutputsForSource(sourceFile: File): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[SimpleFunctionDescriptorImpl]

'sourceFile' @ [115:54] ==> val sourceFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.markOutputClassesDirty[LocalVariableDescriptor]

'Suppress' @ [120:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'sources' @ [122:13] ==> value-parameter sources: Iterable<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.classesBySources[ValueParameterDescriptorImpl]

'flatMap' @ [122:21] ==> public inline fun <T, R> Iterable<File>.flatMap(transform: (File) -> Iterable<JvmClassName>): List<JvmClassName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> JvmClassName

'sourceToClassesMap' @ [122:31] ==> private final val sourceToClassesMap: IncrementalCacheImpl<Target>.SourceToClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'it' @ [122:50] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.classesBySources.<anonymous>[ValueParameterDescriptorImpl]

'subtypesMap' @ [125:13] ==> private final val subtypesMap: SubtypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'className' @ [125:25] ==> value-parameter className: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getSubtypesOf[ValueParameterDescriptorImpl]

'asSequence' @ [125:36] ==> public fun <T> Iterable<FqName>.asSequence(): Sequence<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'classFqNameToSourceMap' @ [128:13] ==> private final val classFqNameToSourceMap: IncrementalCacheImpl<Target>.ClassFqNameToSourceMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'fqName' @ [128:36] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getSourceFileIfClass[ValueParameterDescriptorImpl]

'internalNameToSource' @ [131:13] ==> private final val internalNameToSource: IncrementalCacheImpl<Target>.InternalNameToSourcesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'internalName' @ [131:34] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.sourcesByInternalName[ValueParameterDescriptorImpl]

'className' @ [134:13] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.isMultifileFacade[ValueParameterDescriptorImpl]

'internalName' @ [134:23] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'multifileFacadeToParts' @ [134:39] ==> private final val multifileFacadeToParts: IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'toSystemIndependentName' @ [137:16] ==> @NotNull public open fun toSystemIndependentName(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [137:40] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [137:45] ==> private final val outputDir: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'internalClassName' @ [137:58] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getClassFilePath[ValueParameterDescriptorImpl]

'canonicalPath' @ [137:84] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'byInternalName' @ [141:41] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'MODULE_MAPPING_FILE_NAME' @ [141:56] ==> private final val MODULE_MAPPING_FILE_NAME: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'protoMap' @ [142:9] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'storeModuleMapping' @ [142:18] ==> public final fun storeModuleMapping(className: JvmClassName, bytes: ByteArray): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[SimpleFunctionDescriptorImpl]

'jvmClassName' @ [142:37] ==> val jvmClassName: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveModuleMappingToCache[LocalVariableDescriptor]

'file' @ [142:51] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveModuleMappingToCache[ValueParameterDescriptorImpl]

'readBytes' @ [142:56] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'dirtyOutputClassesMap' @ [143:9] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'notDirty' @ [143:31] ==> public final fun notDirty(className: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'MODULE_MAPPING_FILE_NAME' @ [143:40] ==> private final val MODULE_MAPPING_FILE_NAME: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'sourceFiles' @ [144:9] ==> value-parameter sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveModuleMappingToCache[ValueParameterDescriptorImpl]

'forEach' @ [144:21] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sourceToClassesMap' @ [144:31] ==> private final val sourceToClassesMap: IncrementalCacheImpl<Target>.SourceToClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'add' @ [144:50] ==> public final fun add(sourceFile: File, className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[SimpleFunctionDescriptorImpl]

'it' @ [144:54] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveModuleMappingToCache.<anonymous>[ValueParameterDescriptorImpl]

'jvmClassName' @ [144:58] ==> val jvmClassName: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveModuleMappingToCache[LocalVariableDescriptor]

'CompilationResult' @ [145:16] ==> public companion object defined in org.jetbrains.kotlin.incremental.CompilationResult[FakeCallableDescriptorForObject]

'NO_CHANGES' @ [145:34] ==> public final val NO_CHANGES: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.Companion[PropertyDescriptorImpl]

'generatedClass' @ [149:45] ==> value-parameter generatedClass: GeneratedJvmClass<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[ValueParameterDescriptorImpl]

'sourceFiles' @ [149:60] ==> public final val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.build.GeneratedJvmClass[PropertyDescriptorImpl]

'generatedClass' @ [150:49] ==> value-parameter generatedClass: GeneratedJvmClass<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[ValueParameterDescriptorImpl]

'outputClass' @ [150:64] ==> public final val outputClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.build.GeneratedJvmClass[PropertyDescriptorImpl]

'kotlinClass' @ [151:25] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'className' @ [151:37] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'dirtyOutputClassesMap' @ [153:9] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'notDirty' @ [153:31] ==> public final fun notDirty(className: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'className' @ [153:40] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'internalName' @ [153:50] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'sourceFiles' @ [154:9] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'forEach' @ [154:21] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sourceToClassesMap' @ [155:13] ==> private final val sourceToClassesMap: IncrementalCacheImpl<Target>.SourceToClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'add' @ [155:32] ==> public final fun add(sourceFile: File, className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[SimpleFunctionDescriptorImpl]

'it' @ [155:36] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [155:40] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'internalNameToSource' @ [158:9] ==> private final val internalNameToSource: IncrementalCacheImpl<Target>.InternalNameToSourcesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'className' @ [158:30] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'internalName' @ [158:40] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'sourceFiles' @ [158:56] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'kotlinClass' @ [160:13] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'classId' @ [160:25] ==> public open val classId: ClassId defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'isLocal' @ [160:33] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'CompilationResult' @ [161:20] ==> public companion object defined in org.jetbrains.kotlin.incremental.CompilationResult[FakeCallableDescriptorForObject]

'NO_CHANGES' @ [161:38] ==> public final val NO_CHANGES: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.Companion[PropertyDescriptorImpl]

'kotlinClass' @ [164:22] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'classHeader' @ [164:34] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'when (header.kind) {
            KotlinClassHeader.Kind.FILE_FACADE -> {
                assert(sourceFiles.size == 1) { "Package part from several source files: $sourceFiles" }
                packagePartMap.addPackagePart(className)

                protoMap.process(kotlinClass, isPackage = true) +
                constantsMap.process(kotlinClass, isPackage = true) +
                inlineFunctionsMap.process(kotlinClass, isPackage = true)
            }
            KotlinClassHeader.Kind.MULTIFILE_CLASS -> {
                val partNames = kotlinClass.classHeader.data?.toList()
                                ?: throw AssertionError("Multifile class has no parts: ${kotlinClass.className}")
                multifileFacadeToParts[className] = partNames
                // When a class is replaced with a facade with the same name,
                // the class' proto wouldn't ever be deleted,
                // because we don't write proto for multifile facades.
                // As a workaround we can remove proto values for multifile facades.
                val additionalChangeInfo = if (className in protoMap) {
                    val info = ChangeInfo.SignatureChanged(className.fqNameForClassNameWithoutDollars, areSubclassesAffected = true)
                    CompilationResult(changes = sequenceOf(info))
                }
                else CompilationResult.NO_CHANGES
                protoMap.remove(className)
                classFqNameToSourceMap.remove(className.fqNameForClassNameWithoutDollars)
                internalNameToSource.remove(className.internalName)

                // TODO NO_CHANGES? (delegates only)
                constantsMap.process(kotlinClass, isPackage = true) +
                inlineFunctionsMap.process(kotlinClass, isPackage = true) +
                additionalChangeInfo
            }
            KotlinClassHeader.Kind.MULTIFILE_CLASS_PART -> {
                assert(sourceFiles.size == 1) { "Multifile class part from several source files: $sourceFiles" }
                packagePartMap.addPackagePart(className)
                partToMultifileFacade.set(className.internalName, header.multifileClassName!!)

                protoMap.process(kotlinClass, isPackage = true) +
                constantsMap.process(kotlinClass, isPackage = true) +
                inlineFunctionsMap.process(kotlinClass, isPackage = true)
            }
            KotlinClassHeader.Kind.CLASS -> {
                assert(sourceFiles.size == 1) { "Class is expected to have only one source file: $sourceFiles" }
                addToClassStorage(kotlinClass, sourceFiles.first())

                protoMap.process(kotlinClass, isPackage = false) +
                constantsMap.process(kotlinClass, isPackage = false) +
                inlineFunctionsMap.process(kotlinClass, isPackage = false)
            }
            else -> CompilationResult.NO_CHANGES
        }' @ [165:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompilationResult, entry1: CompilationResult, entry2: CompilationResult, entry3: CompilationResult, entry4: CompilationResult): CompilationResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CompilationResult

'header' @ [165:33] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'kind' @ [165:40] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'FILE_FACADE' @ [166:36] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'assert' @ [167:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sourceFiles' @ [167:24] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'size' @ [167:36] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'sourceFiles' @ [167:91] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'packagePartMap' @ [168:17] ==> private final val packagePartMap: IncrementalCacheImpl<Target>.PackagePartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'addPackagePart' @ [168:32] ==> public final fun addPackagePart(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[SimpleFunctionDescriptorImpl]

'className' @ [168:47] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'protoMap' @ [170:17] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [170:26] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [170:34] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'constantsMap' @ [171:17] ==> private final val constantsMap: IncrementalCacheImpl<Target>.ConstantsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [171:30] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [171:38] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'inlineFunctionsMap' @ [172:17] ==> private final val inlineFunctionsMap: IncrementalCacheImpl<Target>.InlineFunctionsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [172:36] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [172:44] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'MULTIFILE_CLASS' @ [174:36] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'kotlinClass' @ [175:33] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'classHeader' @ [175:45] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'data' @ [175:57] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'toList' @ [175:63] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'AssertionError' @ [176:42] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'kotlinClass' @ [176:90] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'className' @ [176:102] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'multifileFacadeToParts' @ [177:17] ==> private final val multifileFacadeToParts: IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'className' @ [177:40] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'partNames' @ [177:53] ==> val partNames: List<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'if (className in protoMap) {
                    val info = ChangeInfo.SignatureChanged(className.fqNameForClassNameWithoutDollars, areSubclassesAffected = true)
                    CompilationResult(changes = sequenceOf(info))
                }
                else CompilationResult.NO_CHANGES' @ [182:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompilationResult, elseBranch: CompilationResult): CompilationResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CompilationResult

'className' @ [182:48] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'protoMap' @ [182:61] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'SignatureChanged' @ [183:43] ==> public constructor SignatureChanged(fqName: FqName, areSubclassesAffected: Boolean) defined in org.jetbrains.kotlin.incremental.ChangeInfo.SignatureChanged[ClassConstructorDescriptorImpl]

'className' @ [183:60] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'fqNameForClassNameWithoutDollars' @ [183:70] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'CompilationResult' @ [184:21] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'sequenceOf' @ [184:49] ==> public fun <T> sequenceOf(vararg elements: ChangeInfo.SignatureChanged): Sequence<ChangeInfo.SignatureChanged> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignatureChanged

'info' @ [184:60] ==> val info: ChangeInfo.SignatureChanged defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'CompilationResult' @ [186:22] ==> public companion object defined in org.jetbrains.kotlin.incremental.CompilationResult[FakeCallableDescriptorForObject]

'NO_CHANGES' @ [186:40] ==> public final val NO_CHANGES: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.Companion[PropertyDescriptorImpl]

'protoMap' @ [187:17] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [187:26] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[SimpleFunctionDescriptorImpl]

'className' @ [187:33] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'classFqNameToSourceMap' @ [188:17] ==> private final val classFqNameToSourceMap: IncrementalCacheImpl<Target>.ClassFqNameToSourceMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [188:40] ==> public final fun remove(fqName: FqName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap[SimpleFunctionDescriptorImpl]

'className' @ [188:47] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'fqNameForClassNameWithoutDollars' @ [188:57] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'internalNameToSource' @ [189:17] ==> private final val internalNameToSource: IncrementalCacheImpl<Target>.InternalNameToSourcesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [189:38] ==> public final fun remove(internalName: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap[SimpleFunctionDescriptorImpl]

'className' @ [189:45] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'internalName' @ [189:55] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'constantsMap' @ [192:17] ==> private final val constantsMap: IncrementalCacheImpl<Target>.ConstantsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [192:30] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [192:38] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'inlineFunctionsMap' @ [193:17] ==> private final val inlineFunctionsMap: IncrementalCacheImpl<Target>.InlineFunctionsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [193:36] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [193:44] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'additionalChangeInfo' @ [194:17] ==> val additionalChangeInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'MULTIFILE_CLASS_PART' @ [196:36] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'assert' @ [197:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sourceFiles' @ [197:24] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'size' @ [197:36] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'sourceFiles' @ [197:99] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'packagePartMap' @ [198:17] ==> private final val packagePartMap: IncrementalCacheImpl<Target>.PackagePartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'addPackagePart' @ [198:32] ==> public final fun addPackagePart(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[SimpleFunctionDescriptorImpl]

'className' @ [198:47] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'partToMultifileFacade' @ [199:17] ==> private final val partToMultifileFacade: IncrementalCacheImpl<Target>.MultifileClassPartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'set' @ [199:39] ==> public final fun set(partName: String, facadeName: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[SimpleFunctionDescriptorImpl]

'className' @ [199:43] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'internalName' @ [199:53] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'header' @ [199:67] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'multifileClassName' @ [199:74] ==> public final val multifileClassName: String? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'protoMap' @ [201:17] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [201:26] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [201:34] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'constantsMap' @ [202:17] ==> private final val constantsMap: IncrementalCacheImpl<Target>.ConstantsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [202:30] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [202:38] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'inlineFunctionsMap' @ [203:17] ==> private final val inlineFunctionsMap: IncrementalCacheImpl<Target>.InlineFunctionsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [203:36] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [203:44] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'CLASS' @ [205:36] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'assert' @ [206:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sourceFiles' @ [206:24] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'size' @ [206:36] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'sourceFiles' @ [206:99] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'addToClassStorage' @ [207:17] ==> private final fun addToClassStorage(kotlinClass: LocalFileKotlinClass, srcFile: File): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [207:35] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'sourceFiles' @ [207:48] ==> val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'first' @ [207:60] ==> public fun <T> Iterable<File>.first(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'protoMap' @ [209:17] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [209:26] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [209:34] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'constantsMap' @ [210:17] ==> private final val constantsMap: IncrementalCacheImpl<Target>.ConstantsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [210:30] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [210:38] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'inlineFunctionsMap' @ [211:17] ==> private final val inlineFunctionsMap: IncrementalCacheImpl<Target>.InlineFunctionsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'process' @ [211:36] ==> public final fun process(kotlinClass: LocalFileKotlinClass, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [211:44] ==> val kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'CompilationResult' @ [213:21] ==> public companion object defined in org.jetbrains.kotlin.incremental.CompilationResult[FakeCallableDescriptorForObject]

'NO_CHANGES' @ [213:39] ==> public final val NO_CHANGES: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.Companion[PropertyDescriptorImpl]

'changesInfo' @ [216:9] ==> val changesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'logIfSomethingChanged' @ [216:21] ==> private final fun CompilationResult.logIfSomethingChanged(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'className' @ [216:43] ==> val className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'changesInfo' @ [217:16] ==> val changesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.saveFileToCache[LocalVariableDescriptor]

'this' @ [221:13] ==> <this> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.logIfSomethingChanged[ReceiverParameterDescriptorImpl]

'CompilationResult' @ [221:21] ==> public companion object defined in org.jetbrains.kotlin.incremental.CompilationResult[FakeCallableDescriptorForObject]

'NO_CHANGES' @ [221:39] ==> public final val NO_CHANGES: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.Companion[PropertyDescriptorImpl]

'debugLog' @ [223:9] ==> protected open fun debugLog(message: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'className' @ [223:20] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.logIfSomethingChanged[ValueParameterDescriptorImpl]

'this' @ [223:43] ==> <this> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.logIfSomethingChanged[ReceiverParameterDescriptorImpl]

'members' @ [228:17] ==> value-parameter vararg members: T.() -> List<MessageLite> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges.getNonPrivateNames[ValueParameterDescriptorImpl]

'flatMap' @ [228:25] ==> public inline fun <T, R> Array<out T.() -> List<MessageLite>>.flatMap(transform: (T.() -> List<MessageLite>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> [@kotlin.ExtensionFunctionType] Function1<T, List<MessageLite>>
    <R> -> String

'this' @ [228:35] ==> <this> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges.getNonPrivateNames[ReceiverParameterDescriptorImpl]

'invoke' @ [228:40] ==> public abstract operator fun T.invoke(): List<MessageLite> defined in kotlin.Function1[FunctionInvokeDescriptor]

'filterNot' @ [228:45] ==> public inline fun <T> Iterable<MessageLite>.filterNot(predicate: (MessageLite) -> Boolean): List<MessageLite> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageLite

'it' @ [228:57] ==> value-parameter it: MessageLite defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges.getNonPrivateNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isPrivate' @ [228:60] ==> internal val MessageLite.isPrivate: Boolean defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[PropertyDescriptorImpl]

'names' @ [228:72] ==> internal fun List<MessageLite>.names(nameResolver: NameResolver): List<String> defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]

'nameResolver' @ [228:78] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges.getNonPrivateNames[ValueParameterDescriptorImpl]

'toSet' @ [228:94] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'className' @ [230:13] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[ValueParameterDescriptorImpl]

'internalName' @ [230:23] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'MODULE_MAPPING_FILE_NAME' @ [230:39] ==> private final val MODULE_MAPPING_FILE_NAME: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'emptyList' @ [230:72] ==> public fun <T> emptyList(): List<ChangeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'protoMap' @ [232:24] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'className' @ [232:33] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[ValueParameterDescriptorImpl]

'emptyList' @ [232:54] ==> public fun <T> emptyList(): List<ChangeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'when {
            mapValue.isPackageFacade -> {
                val packageData = JvmProtoBufUtil.readPackageDataFrom(mapValue.bytes, mapValue.strings)

                val memberNames =
                        packageData.packageProto.getNonPrivateNames(
                                packageData.nameResolver,
                                ProtoBuf.Package::getFunctionList,
                                ProtoBuf.Package::getPropertyList
                        )

                listOf(createChangeInfo(className.packageFqName, memberNames))
            }
            else -> {
                val classData = JvmProtoBufUtil.readClassDataFrom(mapValue.bytes, mapValue.strings)

                val classFqName = className.fqNameForClassNameWithoutDollars
                val kind = Flags.CLASS_KIND.get(classData.classProto.flags)

                if (kind == ProtoBuf.Class.Kind.COMPANION_OBJECT) {
                    val memberNames =
                            classData.classProto.getNonPrivateNames(
                                    classData.nameResolver,
                                    ProtoBuf.Class::getConstructorList,
                                    ProtoBuf.Class::getFunctionList,
                                    ProtoBuf.Class::getPropertyList
                            ) + classData.classProto.enumEntryList.map { classData.nameResolver.getString(it.name) }

                    val companionObjectChanged = createChangeInfo(classFqName.parent(), listOfNotNull(classFqName.shortName().asString()))
                    val companionObjectMembersChanged = createChangeInfo(classFqName, memberNames)

                    listOf(companionObjectMembersChanged, companionObjectChanged)
                }
                else {
                    listOf(ChangeInfo.SignatureChanged(classFqName, areSubclassesAffected = true))
                }
            }
        }' @ [234:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<ChangeInfo>, entry1: List<ChangeInfo>): List<ChangeInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<ChangeInfo>

'mapValue' @ [235:13] ==> val mapValue: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'isPackageFacade' @ [235:22] ==> public final val isPackageFacade: Boolean defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'JvmProtoBufUtil' @ [236:35] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readPackageDataFrom' @ [236:51] ==> @JvmStatic public final fun readPackageDataFrom(bytes: ByteArray, strings: Array<String>): PackageData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'mapValue' @ [236:71] ==> val mapValue: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'bytes' @ [236:80] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'mapValue' @ [236:87] ==> val mapValue: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'strings' @ [236:96] ==> public final val strings: Array<String> defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'packageData' @ [239:25] ==> val packageData: PackageData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'packageProto' @ [239:37] ==> public final val packageProto: ProtoBuf.Package defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedPropertyDescriptor]

'getNonPrivateNames' @ [239:50] ==> local final fun <T> ProtoBuf.Package.getNonPrivateNames(nameResolver: NameResolver, vararg members: ProtoBuf.Package.() -> List<MessageLite>): Set<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Package

'packageData' @ [240:33] ==> val packageData: PackageData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'nameResolver' @ [240:45] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.PackageData[DeserializedPropertyDescriptor]

'listOf' @ [245:17] ==> public fun <T> listOf(element: ChangeInfo): List<ChangeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'invoke' @ [245:24] ==> public abstract operator fun invoke(p1: FqName, p2: Collection<String>): ChangeInfo defined in kotlin.Function2[FunctionInvokeDescriptor]

'className' @ [245:41] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[ValueParameterDescriptorImpl]

'packageFqName' @ [245:51] ==> public final val JvmClassName.packageFqName: FqName[MyPropertyDescriptor]

'memberNames' @ [245:66] ==> val memberNames: Set<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'JvmProtoBufUtil' @ [248:33] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readClassDataFrom' @ [248:49] ==> @JvmStatic public final fun readClassDataFrom(bytes: ByteArray, strings: Array<String>): ClassData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'mapValue' @ [248:67] ==> val mapValue: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'bytes' @ [248:76] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'mapValue' @ [248:83] ==> val mapValue: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'strings' @ [248:92] ==> public final val strings: Array<String> defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'className' @ [250:35] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[ValueParameterDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [250:45] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'CLASS_KIND' @ [251:34] ==> public final val CLASS_KIND: (Flags.FlagField<(ProtoBuf.Class.Kind..ProtoBuf.Class.Kind?)>..Flags.FlagField<(ProtoBuf.Class.Kind..ProtoBuf.Class.Kind?)>?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [251:45] ==> public abstract operator fun get(p0: Int): (ProtoBuf.Class.Kind..ProtoBuf.Class.Kind?) defined in org.jetbrains.kotlin.serialization.Flags.FlagField[JavaMethodDescriptor]

'classData' @ [251:49] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'classProto' @ [251:59] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'flags' @ [251:70] ==> public final val ProtoBuf.Class.flags: Int[MyPropertyDescriptor]

'if (kind == ProtoBuf.Class.Kind.COMPANION_OBJECT) {
                    val memberNames =
                            classData.classProto.getNonPrivateNames(
                                    classData.nameResolver,
                                    ProtoBuf.Class::getConstructorList,
                                    ProtoBuf.Class::getFunctionList,
                                    ProtoBuf.Class::getPropertyList
                            ) + classData.classProto.enumEntryList.map { classData.nameResolver.getString(it.name) }

                    val companionObjectChanged = createChangeInfo(classFqName.parent(), listOfNotNull(classFqName.shortName().asString()))
                    val companionObjectMembersChanged = createChangeInfo(classFqName, memberNames)

                    listOf(companionObjectMembersChanged, companionObjectChanged)
                }
                else {
                    listOf(ChangeInfo.SignatureChanged(classFqName, areSubclassesAffected = true))
                }' @ [253:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ChangeInfo>, elseBranch: List<ChangeInfo>): List<ChangeInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ChangeInfo>

'kind' @ [253:21] ==> val kind: (ProtoBuf.Class.Kind..ProtoBuf.Class.Kind?) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'COMPANION_OBJECT' @ [253:49] ==> enum entry COMPANION_OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'classData' @ [255:29] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'classProto' @ [255:39] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'getNonPrivateNames' @ [255:50] ==> local final fun <T> ProtoBuf.Class.getNonPrivateNames(nameResolver: NameResolver, vararg members: ProtoBuf.Class.() -> List<MessageLite>): Set<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Class

'classData' @ [256:37] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'nameResolver' @ [256:47] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'classData' @ [260:33] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'classProto' @ [260:43] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'enumEntryList' @ [260:54] ==> public final val ProtoBuf.Class.enumEntryList: (MutableList<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)>..List<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)>?)[MyPropertyDescriptor]

'map' @ [260:68] ==> public inline fun <T, R> Iterable<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)>.map(transform: ((ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry..org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry?)
    <R> -> String

'classData' @ [260:74] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'nameResolver' @ [260:84] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'getString' @ [260:97] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [260:107] ==> value-parameter it: (ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [260:110] ==> public final val ProtoBuf.EnumEntry.name: Int[MyPropertyDescriptor]

'invoke' @ [262:50] ==> public abstract operator fun invoke(p1: FqName, p2: Collection<String>): ChangeInfo defined in kotlin.Function2[FunctionInvokeDescriptor]

'classFqName' @ [262:67] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'parent' @ [262:79] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'listOfNotNull' @ [262:89] ==> public fun <T : Any> listOfNotNull(element: String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'classFqName' @ [262:103] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'shortName' @ [262:115] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [262:127] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'invoke' @ [263:57] ==> public abstract operator fun invoke(p1: FqName, p2: Collection<String>): ChangeInfo defined in kotlin.Function2[FunctionInvokeDescriptor]

'classFqName' @ [263:74] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'memberNames' @ [263:87] ==> val memberNames: Set<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'listOf' @ [265:21] ==> public fun <T> listOf(vararg elements: ChangeInfo): List<ChangeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'companionObjectMembersChanged' @ [265:28] ==> val companionObjectMembersChanged: ChangeInfo defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'companionObjectChanged' @ [265:59] ==> val companionObjectChanged: ChangeInfo defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'listOf' @ [268:21] ==> public fun <T> listOf(element: ChangeInfo.SignatureChanged): List<ChangeInfo.SignatureChanged> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignatureChanged

'SignatureChanged' @ [268:39] ==> public constructor SignatureChanged(fqName: FqName, areSubclassesAffected: Boolean) defined in org.jetbrains.kotlin.incremental.ChangeInfo.SignatureChanged[ClassConstructorDescriptorImpl]

'classFqName' @ [268:56] ==> val classFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.computeChanges[LocalVariableDescriptor]

'dirtyOutputClassesMap' @ [275:28] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'getDirtyOutputClasses' @ [276:34] ==> public final fun getDirtyOutputClasses(): Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'map' @ [277:34] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> JvmClassName): List<JvmClassName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> JvmClassName

'JvmClassName' @ [277:38] ==> private constructor JvmClassName(@NotNull p0: String) defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaClassConstructorDescriptor]

'toList' @ [278:34] ==> public fun <T> Iterable<JvmClassName>.toList(): List<JvmClassName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClassName

'dirtyClasses' @ [280:23] ==> val dirtyClasses: List<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'flatMap' @ [280:36] ==> public inline fun <T, R> Iterable<JvmClassName>.flatMap(transform: (JvmClassName) -> Iterable<ChangeInfo>): List<ChangeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClassName
    <R> -> ChangeInfo

'computeChanges' @ [280:46] ==> private final fun computeChanges(className: JvmClassName, createChangeInfo: (FqName, Collection<String>) -> ChangeInfo): List<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'it' @ [280:61] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [280:78] ==> public fun <T> Iterable<ChangeInfo>.asSequence(): Sequence<ChangeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'CompilationResult' @ [281:27] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'changes' @ [281:55] ==> val changes: Sequence<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'hashMapOf' @ [283:39] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<JvmClassName, MutableSet<String>> /* = HashMap<JvmClassName, MutableSet<String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JvmClassName
    <V> -> MutableSet<String>

'dirtyClasses' @ [284:28] ==> val dirtyClasses: List<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'partToMultifileFacade' @ [285:26] ==> private final val partToMultifileFacade: IncrementalCacheImpl<Target>.MultifileClassPartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'get' @ [285:48] ==> public final fun get(partName: String): String? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[SimpleFunctionDescriptorImpl]

'dirtyClass' @ [285:52] ==> val dirtyClass: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'internalName' @ [285:63] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'byInternalName' @ [286:48] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'facade' @ [286:63] ==> val facade: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'facadesWithRemovedParts' @ [287:32] ==> val facadesWithRemovedParts: HashMap<JvmClassName, MutableSet<String>> /* = HashMap<JvmClassName, MutableSet<String>> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'getOrPut' @ [287:56] ==> public inline fun <K, V> MutableMap<JvmClassName, MutableSet<String>>.getOrPut(key: JvmClassName, defaultValue: () -> MutableSet<String>): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JvmClassName
    <V> -> MutableSet<String>

'facadeClassName' @ [287:65] ==> val facadeClassName: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'hashSetOf' @ [287:84] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'removedParts' @ [288:13] ==> val removedParts: MutableSet<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'add' @ [288:26] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'dirtyClass' @ [288:30] ==> val dirtyClass: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'internalName' @ [288:41] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'component1' @ [291:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<JvmClassName, MutableSet<String>>.component1(): JvmClassName defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JvmClassName
    <V> -> MutableSet<String>

'component2' @ [291:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<JvmClassName, MutableSet<String>>.component2(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JvmClassName
    <V> -> MutableSet<String>

'facadesWithRemovedParts' @ [291:40] ==> val facadesWithRemovedParts: HashMap<JvmClassName, MutableSet<String>> /* = HashMap<JvmClassName, MutableSet<String>> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'entries' @ [291:64] ==> public open val entries: MutableSet<MutableMap.MutableEntry<JvmClassName, MutableSet<String>>> defined in java.util.HashMap[JavaPropertyDescriptor]

'multifileFacadeToParts' @ [292:28] ==> private final val multifileFacadeToParts: IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'facade' @ [292:51] ==> val facade: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'internalName' @ [292:58] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'allParts' @ [293:35] ==> val allParts: Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'filter' @ [293:44] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [293:53] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'removedParts' @ [293:60] ==> val removedParts: MutableSet<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'if (notRemovedParts.isEmpty()) {
                multifileFacadeToParts.remove(facade)
            }
            else {
                multifileFacadeToParts[facade] = notRemovedParts
            }' @ [295:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'notRemovedParts' @ [295:17] ==> val notRemovedParts: List<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'isEmpty' @ [295:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'multifileFacadeToParts' @ [296:17] ==> private final val multifileFacadeToParts: IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [296:40] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[SimpleFunctionDescriptorImpl]

'facade' @ [296:47] ==> val facade: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'multifileFacadeToParts' @ [299:17] ==> private final val multifileFacadeToParts: IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'facade' @ [299:40] ==> val facade: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'notRemovedParts' @ [299:50] ==> val notRemovedParts: List<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'dirtyClasses' @ [303:9] ==> val dirtyClasses: List<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'forEach' @ [303:22] ==> @HidesMembers public inline fun <T> Iterable<JvmClassName>.forEach(action: (JvmClassName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClassName

'protoMap' @ [304:13] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [304:22] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[SimpleFunctionDescriptorImpl]

'it' @ [304:29] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'packagePartMap' @ [305:13] ==> private final val packagePartMap: IncrementalCacheImpl<Target>.PackagePartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [305:28] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[SimpleFunctionDescriptorImpl]

'it' @ [305:35] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'multifileFacadeToParts' @ [306:13] ==> private final val multifileFacadeToParts: IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [306:36] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[SimpleFunctionDescriptorImpl]

'it' @ [306:43] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'partToMultifileFacade' @ [307:13] ==> private final val partToMultifileFacade: IncrementalCacheImpl<Target>.MultifileClassPartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [307:35] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[SimpleFunctionDescriptorImpl]

'it' @ [307:42] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'constantsMap' @ [308:13] ==> private final val constantsMap: IncrementalCacheImpl<Target>.ConstantsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [308:26] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'it' @ [308:33] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'inlineFunctionsMap' @ [309:13] ==> private final val inlineFunctionsMap: IncrementalCacheImpl<Target>.InlineFunctionsMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [309:32] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[SimpleFunctionDescriptorImpl]

'it' @ [309:39] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'internalNameToSource' @ [310:13] ==> private final val internalNameToSource: IncrementalCacheImpl<Target>.InternalNameToSourcesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [310:34] ==> public final fun remove(internalName: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap[SimpleFunctionDescriptorImpl]

'it' @ [310:41] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses.<anonymous>[ValueParameterDescriptorImpl]

'internalName' @ [310:44] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'removeAllFromClassStorage' @ [313:9] ==> private final fun removeAllFromClassStorage(removedClasses: Collection<JvmClassName>): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'dirtyClasses' @ [313:35] ==> val dirtyClasses: List<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'dirtyOutputClassesMap' @ [315:9] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'clean' @ [315:31] ==> public final fun clean(): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'changesInfo' @ [316:16] ==> val changesInfo: CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.clearCacheForRemovedClasses[LocalVariableDescriptor]

'dirtyOutputClassesMap' @ [321:17] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'getDirtyOutputClasses' @ [321:39] ==> public final fun getDirtyOutputClasses(): Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'filter' @ [321:63] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'packagePartMap' @ [321:72] ==> private final val packagePartMap: IncrementalCacheImpl<Target>.PackagePartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'isPackagePart' @ [321:87] ==> public final fun isPackagePart(className: JvmClassName): Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[SimpleFunctionDescriptorImpl]

'byInternalName' @ [321:114] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'it' @ [321:129] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoletePackageParts.<anonymous>[ValueParameterDescriptorImpl]

'debugLog' @ [322:9] ==> protected open fun debugLog(message: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'obsoletePackageParts' @ [322:44] ==> val obsoletePackageParts: List<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoletePackageParts[LocalVariableDescriptor]

'obsoletePackageParts' @ [323:16] ==> val obsoletePackageParts: List<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoletePackageParts[LocalVariableDescriptor]

'protoMap' @ [327:16] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'byInternalName' @ [327:38] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'partInternalName' @ [327:53] ==> value-parameter partInternalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getPackagePartData[ValueParameterDescriptorImpl]

'let' @ [327:73] ==> @InlineOnly public inline fun <T, R> ProtoMapValue.let(block: (ProtoMapValue) -> JvmPackagePartProto): JvmPackagePartProto defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProtoMapValue
    <R> -> JvmPackagePartProto

'JvmPackagePartProto' @ [328:13] ==> public constructor JvmPackagePartProto(data: ByteArray, strings: Array<String>) defined in org.jetbrains.kotlin.load.kotlin.incremental.components.JvmPackagePartProto[DeserializedClassConstructorDescriptor]

'value' @ [328:33] ==> value-parameter value: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getPackagePartData.<anonymous>[ValueParameterDescriptorImpl]

'bytes' @ [328:39] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'value' @ [328:46] ==> value-parameter value: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getPackagePartData.<anonymous>[ValueParameterDescriptorImpl]

'strings' @ [328:52] ==> public final val strings: Array<String> defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'linkedSetOf' @ [333:40] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'dirtyOutputClassesMap' @ [334:28] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'getDirtyOutputClasses' @ [334:50] ==> public final fun getDirtyOutputClasses(): Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'partToMultifileFacade' @ [335:31] ==> private final val partToMultifileFacade: IncrementalCacheImpl<Target>.MultifileClassPartMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'get' @ [335:53] ==> public final fun get(partName: String): String? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[SimpleFunctionDescriptorImpl]

'dirtyClass' @ [335:57] ==> val dirtyClass: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoleteMultifileClasses[LocalVariableDescriptor]

'obsoleteMultifileClasses' @ [336:13] ==> val obsoleteMultifileClasses: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoleteMultifileClasses[LocalVariableDescriptor]

'add' @ [336:38] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'dirtyFacade' @ [336:42] ==> val dirtyFacade: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoleteMultifileClasses[LocalVariableDescriptor]

'debugLog' @ [338:9] ==> protected open fun debugLog(message: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'obsoleteMultifileClasses' @ [338:54] ==> val obsoleteMultifileClasses: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoleteMultifileClasses[LocalVariableDescriptor]

'obsoleteMultifileClasses' @ [339:16] ==> val obsoleteMultifileClasses: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getObsoleteMultifileClasses[LocalVariableDescriptor]

'multifileFacadeToParts' @ [343:25] ==> private final val multifileFacadeToParts: IncrementalCacheImpl<Target>.MultifileClassFacadeMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'get' @ [343:48] ==> public final operator fun get(internalName: String): Collection<String>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[SimpleFunctionDescriptorImpl]

'facadeInternalName' @ [343:52] ==> value-parameter facadeInternalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getStableMultifileFacadeParts[ValueParameterDescriptorImpl]

'partNames' @ [344:16] ==> val partNames: Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getStableMultifileFacadeParts[LocalVariableDescriptor]

'filter' @ [344:26] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!' @ [344:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dirtyOutputClassesMap' @ [344:36] ==> private final val dirtyOutputClassesMap: IncrementalCacheImpl<Target>.DirtyOutputClassesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'isDirty' @ [344:58] ==> public final fun isDirty(className: String): Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[SimpleFunctionDescriptorImpl]

'it' @ [344:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.getStableMultifileFacadeParts.<anonymous>[ValueParameterDescriptorImpl]

'protoMap' @ [348:16] ==> private final val protoMap: IncrementalCacheImpl<Target>.ProtoMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'byInternalName' @ [348:38] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'MODULE_MAPPING_FILE_NAME' @ [348:53] ==> private final val MODULE_MAPPING_FILE_NAME: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'bytes' @ [348:81] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'super' @ [352:9] ==> <this> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[LazyClassReceiverParameterDescriptor]

'clean' @ [352:15] ==> public open fun clean(): Unit defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner[SimpleFunctionDescriptorImpl]

'normalCacheVersion' @ [353:9] ==> public fun normalCacheVersion(dataRoot: File): CacheVersion defined in org.jetbrains.kotlin.incremental in file CacheVersion.kt[SimpleFunctionDescriptorImpl]

'targetDataRoot' @ [353:28] ==> private final val targetDataRoot: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'clean' @ [353:44] ==> public final fun clean(): Unit defined in org.jetbrains.kotlin.incremental.CacheVersion[SimpleFunctionDescriptorImpl]

'BasicStringMap<ProtoMapValue>' @ [356:55] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<ProtoMapValue>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> ProtoMapValue

'storageFile' @ [356:85] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.<init>[ValueParameterDescriptorImpl]

'ProtoMapValueExternalizer' @ [356:98] ==> public object ProtoMapValueExternalizer : DataExternalizer<ProtoMapValue> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'kotlinClass' @ [359:26] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.process[ValueParameterDescriptorImpl]

'classHeader' @ [359:38] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'decodeBytes' @ [360:37] ==> @NotNull public open fun decodeBytes(@NotNull p0: (Array<(String..String?)>..Array<out (String..String?)>)): ByteArray defined in org.jetbrains.kotlin.serialization.jvm.BitEncoding[JavaMethodDescriptor]

'header' @ [360:49] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.process[LocalVariableDescriptor]

'data' @ [360:56] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'put' @ [361:20] ==> private final fun put(className: JvmClassName, bytes: ByteArray, strings: Array<String>, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [361:24] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.process[ValueParameterDescriptorImpl]

'className' @ [361:36] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'bytes' @ [361:47] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.process[LocalVariableDescriptor]

'header' @ [361:54] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.process[LocalVariableDescriptor]

'strings' @ [361:61] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'isPackage' @ [361:72] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.process[ValueParameterDescriptorImpl]

'storage' @ [372:13] ==> protected final val storage: LazyStorage<String, ProtoMapValue> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[PropertyDescriptorImpl]

'className' @ [372:21] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.storeModuleMapping[ValueParameterDescriptorImpl]

'internalName' @ [372:31] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'ProtoMapValue' @ [372:47] ==> public constructor ProtoMapValue(isPackageFacade: Boolean, bytes: ByteArray, strings: Array<String>) defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[ClassConstructorDescriptorImpl]

'bytes' @ [372:94] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.storeModuleMapping[ValueParameterDescriptorImpl]

'emptyArray' @ [372:111] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'CompilationResult' @ [373:20] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'className' @ [382:23] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'internalName' @ [382:33] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [383:27] ==> protected final val storage: LazyStorage<String, ProtoMapValue> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[PropertyDescriptorImpl]

'key' @ [383:35] ==> val key: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'ProtoMapValue' @ [384:24] ==> public constructor ProtoMapValue(isPackageFacade: Boolean, bytes: ByteArray, strings: Array<String>) defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[ClassConstructorDescriptorImpl]

'isPackage' @ [384:38] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'bytes' @ [384:49] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'strings' @ [384:56] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'oldData' @ [386:17] ==> val oldData: ProtoMapValue? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'!' @ [387:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equals' @ [387:25] ==> public open fun equals(p0: (ByteArray..ByteArray?), p1: (ByteArray..ByteArray?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'bytes' @ [387:32] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'oldData' @ [387:39] ==> val oldData: ProtoMapValue? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'bytes' @ [387:47] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'!' @ [388:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equals' @ [388:25] ==> public open fun equals(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?), p1: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'strings' @ [388:32] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'oldData' @ [388:41] ==> val oldData: ProtoMapValue? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'strings' @ [388:49] ==> public final val strings: Array<String> defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'isPackage' @ [389:17] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'oldData' @ [389:30] ==> val oldData: ProtoMapValue? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'isPackageFacade' @ [389:38] ==> public final val isPackageFacade: Boolean defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'storage' @ [391:17] ==> protected final val storage: LazyStorage<String, ProtoMapValue> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[PropertyDescriptorImpl]

'key' @ [391:25] ==> val key: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'data' @ [391:32] ==> val data: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'oldData' @ [394:17] ==> val oldData: ProtoMapValue? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'computeChanges' @ [395:31] ==> private final fun computeChanges(className: JvmClassName, createChangeInfo: (FqName, Collection<String>) -> ChangeInfo): List<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'className' @ [395:46] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'asSequence' @ [395:75] ==> public fun <T> Iterable<ChangeInfo>.asSequence(): Sequence<ChangeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'CompilationResult' @ [396:24] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'changes' @ [396:52] ==> val changes: Sequence<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'difference' @ [399:30] ==> public fun difference(oldValue: ProtoMapValue, newValue: ProtoMapValue): Difference defined in org.jetbrains.kotlin.incremental in file protoDifferenceUtils.kt[SimpleFunctionDescriptorImpl]

'oldData' @ [399:41] ==> val oldData: ProtoMapValue? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'data' @ [399:50] ==> val data: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'if (isPackage) className.packageFqName else className.fqNameForClassNameWithoutDollars' @ [400:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'isPackage' @ [400:30] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'className' @ [400:41] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'packageFqName' @ [400:51] ==> public final val JvmClassName.packageFqName: FqName[MyPropertyDescriptor]

'className' @ [400:70] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[ValueParameterDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [400:80] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'SmartList' @ [401:30] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ChangeInfo

'difference' @ [403:17] ==> val difference: Difference defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'isClassAffected' @ [403:28] ==> public final val isClassAffected: Boolean defined in org.jetbrains.kotlin.incremental.Difference[PropertyDescriptorImpl]

'changeList' @ [404:17] ==> val changeList: SmartList<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'add' @ [404:28] ==> public open fun add(element: (ChangeInfo..ChangeInfo?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'SignatureChanged' @ [404:43] ==> public constructor SignatureChanged(fqName: FqName, areSubclassesAffected: Boolean) defined in org.jetbrains.kotlin.incremental.ChangeInfo.SignatureChanged[ClassConstructorDescriptorImpl]

'fqName' @ [404:60] ==> val fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'difference' @ [404:68] ==> val difference: Difference defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'areSubclassesAffected' @ [404:79] ==> public final val areSubclassesAffected: Boolean defined in org.jetbrains.kotlin.incremental.Difference[PropertyDescriptorImpl]

'difference' @ [407:17] ==> val difference: Difference defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'changedMembersNames' @ [407:28] ==> public final val changedMembersNames: Set<String> defined in org.jetbrains.kotlin.incremental.Difference[PropertyDescriptorImpl]

'isNotEmpty' @ [407:48] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'changeList' @ [408:17] ==> val changeList: SmartList<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'add' @ [408:28] ==> public open fun add(element: (ChangeInfo..ChangeInfo?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'MembersChanged' @ [408:43] ==> public constructor MembersChanged(fqName: FqName, names: Collection<String>) defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged[ClassConstructorDescriptorImpl]

'fqName' @ [408:58] ==> val fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'difference' @ [408:66] ==> val difference: Difference defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'changedMembersNames' @ [408:77] ==> public final val changedMembersNames: Set<String> defined in org.jetbrains.kotlin.incremental.Difference[PropertyDescriptorImpl]

'CompilationResult' @ [411:20] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'changeList' @ [411:48] ==> val changeList: SmartList<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.put[LocalVariableDescriptor]

'asSequence' @ [411:59] ==> public fun <T> Iterable<(ChangeInfo..ChangeInfo?)>.asSequence(): Sequence<(ChangeInfo..ChangeInfo?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.incremental.ChangeInfo..org.jetbrains.kotlin.incremental.ChangeInfo?)

'className' @ [415:17] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.contains[ValueParameterDescriptorImpl]

'internalName' @ [415:27] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [415:43] ==> protected final val storage: LazyStorage<String, ProtoMapValue> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[PropertyDescriptorImpl]

'storage' @ [418:17] ==> protected final val storage: LazyStorage<String, ProtoMapValue> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[PropertyDescriptorImpl]

'className' @ [418:25] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.get[ValueParameterDescriptorImpl]

'internalName' @ [418:35] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [421:13] ==> protected final val storage: LazyStorage<String, ProtoMapValue> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap[PropertyDescriptorImpl]

'remove' @ [421:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [421:28] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.remove[ValueParameterDescriptorImpl]

'internalName' @ [421:38] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'+' @ [425:20] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (value.isPackageFacade) "1" else "0"' @ [425:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'value' @ [425:25] ==> value-parameter value: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.dumpValue[ValueParameterDescriptorImpl]

'isPackageFacade' @ [425:31] ==> public final val isPackageFacade: Boolean defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'toHexString' @ [425:79] ==> public open fun toHexString(p0: Long): (String..String?) defined in java.lang.Long[JavaMethodDescriptor]

'value' @ [425:91] ==> value-parameter value: ProtoMapValue defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ProtoMap.dumpValue[ValueParameterDescriptorImpl]

'bytes' @ [425:97] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[PropertyDescriptorImpl]

'md5' @ [425:103] ==> public fun ByteArray.md5(): Long defined in org.jetbrains.kotlin.incremental in file IncrementalCacheImpl.kt[SimpleFunctionDescriptorImpl]

'BasicStringMap<Map<String, Any>>' @ [429:59] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<Map<String, Any>>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Map<String, Any>

'storageFile' @ [429:92] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.<init>[ValueParameterDescriptorImpl]

'ConstantsMapExternalizer' @ [429:105] ==> public object ConstantsMapExternalizer : DataExternalizer<Map<String, Any>> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'HashMap' @ [431:26] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Any

'ClassReader' @ [433:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'bytes' @ [433:25] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap[ValueParameterDescriptorImpl]

'accept' @ [433:32] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [433:48] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [433:69] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'or' @ [435:39] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_STATIC' @ [435:47] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_FINAL' @ [435:69] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_PRIVATE' @ [435:90] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [436:25] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap.<no name provided>.visitField[ValueParameterDescriptorImpl]

'access' @ [436:42] ==> value-parameter access: Int defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap.<no name provided>.visitField[ValueParameterDescriptorImpl]

'staticFinal' @ [436:53] ==> val staticFinal: Int defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap.<no name provided>.visitField[LocalVariableDescriptor]

'or' @ [436:68] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_STATIC' @ [436:76] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_FINAL' @ [436:98] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'result' @ [437:25] ==> val result: HashMap<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap[LocalVariableDescriptor]

'name' @ [437:32] ==> value-parameter name: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap.<no name provided>.visitField[ValueParameterDescriptorImpl]

'value' @ [437:40] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap.<no name provided>.visitField[ValueParameterDescriptorImpl]

'or' @ [441:16] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SKIP_CODE' @ [441:28] ==> public const final val SKIP_CODE: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_DEBUG' @ [441:53] ==> public const final val SKIP_DEBUG: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_FRAMES' @ [441:79] ==> public const final val SKIP_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'if (result.isEmpty()) null else result' @ [443:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<String, Any>?, elseBranch: Map<String, Any>?): Map<String, Any>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<String, Any>?

'result' @ [443:24] ==> val result: HashMap<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap[LocalVariableDescriptor]

'isEmpty' @ [443:31] ==> public open fun isEmpty(): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'result' @ [443:52] ==> val result: HashMap<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.getConstantsMap[LocalVariableDescriptor]

'className' @ [447:17] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.contains[ValueParameterDescriptorImpl]

'internalName' @ [447:27] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [447:43] ==> protected final val storage: LazyStorage<String, Map<String, Any>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[PropertyDescriptorImpl]

'put' @ [450:20] ==> private final fun put(className: JvmClassName, constantsMap: Map<String, Any>?, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [450:24] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.process[ValueParameterDescriptorImpl]

'className' @ [450:36] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'getConstantsMap' @ [450:47] ==> private final fun getConstantsMap(bytes: ByteArray): Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [450:63] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.process[ValueParameterDescriptorImpl]

'fileContents' @ [450:75] ==> public final val LocalFileKotlinClass.fileContents: ByteArray[MyPropertyDescriptor]

'isPackage' @ [450:90] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.process[ValueParameterDescriptorImpl]

'className' @ [454:23] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'internalName' @ [454:33] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [456:26] ==> protected final val storage: LazyStorage<String, Map<String, Any>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[PropertyDescriptorImpl]

'key' @ [456:34] ==> val key: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'oldMap' @ [457:17] ==> val oldMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'constantsMap' @ [457:27] ==> value-parameter constantsMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'CompilationResult' @ [457:48] ==> public companion object defined in org.jetbrains.kotlin.incremental.CompilationResult[FakeCallableDescriptorForObject]

'NO_CHANGES' @ [457:66] ==> public final val NO_CHANGES: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.Companion[PropertyDescriptorImpl]

'if (constantsMap != null) {
                storage[key] = constantsMap
            }
            else {
                remove(className)
            }' @ [459:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'constantsMap' @ [459:17] ==> value-parameter constantsMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'storage' @ [460:17] ==> protected final val storage: LazyStorage<String, Map<String, Any>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[PropertyDescriptorImpl]

'key' @ [460:25] ==> val key: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'constantsMap' @ [460:32] ==> value-parameter constantsMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'remove' @ [463:17] ==> public final fun remove(className: JvmClassName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[SimpleFunctionDescriptorImpl]

'className' @ [463:24] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'if (constantsMap == null || constantsMap.isEmpty() ||
                        oldMap == null || oldMap.isEmpty()
                    ) {
                        emptySequence<ChangeInfo>()
                    }
                    else {
                        // we need only changed constants everything other should be covered by diff
                        val changedNames = oldMap.filter { constantsMap.containsKey(it.key) && constantsMap[it.key] != it.value }.map { it.key }

                        val fqName = if (isPackage) className.packageFqName else className.fqNameForClassNameWithoutDollars

                        sequenceOf(ChangeInfo.MembersChanged(fqName, changedNames))
                    }' @ [467:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<ChangeInfo>, elseBranch: Sequence<ChangeInfo>): Sequence<ChangeInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<ChangeInfo>

'constantsMap' @ [467:25] ==> value-parameter constantsMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'constantsMap' @ [467:49] ==> value-parameter constantsMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'isEmpty' @ [467:62] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'oldMap' @ [468:25] ==> val oldMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'oldMap' @ [468:43] ==> val oldMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'isEmpty' @ [468:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'emptySequence' @ [470:25] ==> public fun <T> emptySequence(): Sequence<ChangeInfo> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'oldMap' @ [474:44] ==> val oldMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'filter' @ [474:51] ==> public inline fun <K, V> Map<out String, Any>.filter(predicate: (Map.Entry<String, Any>) -> Boolean): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'constantsMap' @ [474:60] ==> value-parameter constantsMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'containsKey' @ [474:73] ==> public abstract fun containsKey(key: String): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'it' @ [474:85] ==> value-parameter it: Map.Entry<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [474:88] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'constantsMap' @ [474:96] ==> value-parameter constantsMap: Map<String, Any>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'it' @ [474:109] ==> value-parameter it: Map.Entry<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [474:112] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [474:120] ==> value-parameter it: Map.Entry<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [474:123] ==> public abstract val value: Any defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [474:131] ==> public inline fun <K, V, R> Map<out String, Any>.map(transform: (Map.Entry<String, Any>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any
    <R> -> String

'it' @ [474:137] ==> value-parameter it: Map.Entry<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [474:140] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'if (isPackage) className.packageFqName else className.fqNameForClassNameWithoutDollars' @ [476:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'isPackage' @ [476:42] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'className' @ [476:53] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'packageFqName' @ [476:63] ==> public final val JvmClassName.packageFqName: FqName[MyPropertyDescriptor]

'className' @ [476:82] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[ValueParameterDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [476:92] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'sequenceOf' @ [478:25] ==> public fun <T> sequenceOf(vararg elements: ChangeInfo.MembersChanged): Sequence<ChangeInfo.MembersChanged> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MembersChanged

'MembersChanged' @ [478:47] ==> public constructor MembersChanged(fqName: FqName, names: Collection<String>) defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged[ClassConstructorDescriptorImpl]

'fqName' @ [478:62] ==> val fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'changedNames' @ [478:70] ==> val changedNames: List<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'CompilationResult' @ [481:20] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'changes' @ [481:48] ==> val changes: Sequence<ChangeInfo> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.put[LocalVariableDescriptor]

'storage' @ [485:13] ==> protected final val storage: LazyStorage<String, Map<String, Any>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap[PropertyDescriptorImpl]

'remove' @ [485:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [485:28] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.remove[ValueParameterDescriptorImpl]

'internalName' @ [485:38] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'value' @ [489:17] ==> value-parameter value: Map<String, Any> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ConstantsMap.dumpValue[ValueParameterDescriptorImpl]

'dumpMap' @ [489:23] ==> @TestOnly public fun <K : Comparable<String>, V> Map<String, Any>.dumpMap(dumpValue: (Any) -> String): String defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : Comparable<K>> -> String
    <V> -> Any

'Any' @ [489:31] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'BasicStringMap<Boolean>' @ [492:61] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<Boolean>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Boolean

'storageFile' @ [492:85] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [492:120] ==> public final val INSTANCE: (BooleanDataDescriptor..BooleanDataDescriptor?) defined in com.intellij.util.io.BooleanDataDescriptor[JavaPropertyDescriptor]

'storage' @ [494:13] ==> protected final val storage: LazyStorage<String, Boolean> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[PropertyDescriptorImpl]

'className' @ [494:21] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap.addPackagePart[ValueParameterDescriptorImpl]

'internalName' @ [494:31] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [498:13] ==> protected final val storage: LazyStorage<String, Boolean> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[PropertyDescriptorImpl]

'remove' @ [498:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [498:28] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap.remove[ValueParameterDescriptorImpl]

'internalName' @ [498:38] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'className' @ [502:17] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap.isPackagePart[ValueParameterDescriptorImpl]

'internalName' @ [502:27] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [502:43] ==> protected final val storage: LazyStorage<String, Boolean> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.PackagePartMap[PropertyDescriptorImpl]

'BasicStringMap<Collection<String>>' @ [507:70] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<Collection<String>>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Collection<String>

'storageFile' @ [507:105] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap.<init>[ValueParameterDescriptorImpl]

'StringCollectionExternalizer' @ [507:118] ==> public object StringCollectionExternalizer : CollectionExternalizer<String> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'storage' @ [509:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[PropertyDescriptorImpl]

'facadeName' @ [509:21] ==> value-parameter facadeName: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap.set[ValueParameterDescriptorImpl]

'internalName' @ [509:32] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'partNames' @ [509:48] ==> value-parameter partNames: Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap.set[ValueParameterDescriptorImpl]

'storage' @ [512:71] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[PropertyDescriptorImpl]

'internalName' @ [512:79] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap.get[ValueParameterDescriptorImpl]

'internalName' @ [514:64] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap.contains[ValueParameterDescriptorImpl]

'storage' @ [514:80] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[PropertyDescriptorImpl]

'storage' @ [517:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap[PropertyDescriptorImpl]

'remove' @ [517:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [517:28] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap.remove[ValueParameterDescriptorImpl]

'internalName' @ [517:38] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'value' @ [520:69] ==> value-parameter value: Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassFacadeMap.dumpValue[ValueParameterDescriptorImpl]

'dumpCollection' @ [520:75] ==> @TestOnly public fun <T : Comparable<String>> Collection<String>.dumpCollection(): String defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Comparable<T>> -> String

'BasicStringMap<String>' @ [523:68] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<String>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> String

'storageFile' @ [523:91] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [523:131] ==> public final val INSTANCE: (EnumeratorStringDescriptor..EnumeratorStringDescriptor?) defined in com.intellij.util.io.EnumeratorStringDescriptor[JavaPropertyDescriptor]

'storage' @ [525:13] ==> protected final val storage: LazyStorage<String, String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[PropertyDescriptorImpl]

'partName' @ [525:21] ==> value-parameter partName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap.set[ValueParameterDescriptorImpl]

'facadeName' @ [525:33] ==> value-parameter facadeName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap.set[ValueParameterDescriptorImpl]

'storage' @ [529:20] ==> protected final val storage: LazyStorage<String, String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[PropertyDescriptorImpl]

'get' @ [529:28] ==> public final operator fun get(key: String): String? defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'partName' @ [529:32] ==> value-parameter partName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap.get[ValueParameterDescriptorImpl]

'storage' @ [533:13] ==> protected final val storage: LazyStorage<String, String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap[PropertyDescriptorImpl]

'remove' @ [533:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [533:28] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap.remove[ValueParameterDescriptorImpl]

'internalName' @ [533:38] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'value' @ [536:57] ==> value-parameter value: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.MultifileClassPartMap.dumpValue[ValueParameterDescriptorImpl]

'BasicStringMap<Collection<String>>' @ [539:57] ==> public constructor BasicStringMap<V>(storageFile: File, keyDescriptor: KeyDescriptor<String>, valueExternalizer: DataExternalizer<Collection<String>>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Collection<String>

'storageFile' @ [539:92] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.<init>[ValueParameterDescriptorImpl]

'PathStringDescriptor' @ [539:105] ==> public object PathStringDescriptor : EnumeratorStringDescriptor defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'StringCollectionExternalizer' @ [539:127] ==> public object StringCollectionExternalizer : CollectionExternalizer<String> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'remove' @ [541:13] ==> private final fun remove(path: String): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[SimpleFunctionDescriptorImpl]

'sourceFile' @ [541:20] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.clearOutputsForSource[ValueParameterDescriptorImpl]

'absolutePath' @ [541:31] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'storage' @ [545:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[PropertyDescriptorImpl]

'append' @ [545:21] ==> public final fun append(key: String, value: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'sourceFile' @ [545:28] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.add[ValueParameterDescriptorImpl]

'absolutePath' @ [545:39] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'className' @ [545:53] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.add[ValueParameterDescriptorImpl]

'internalName' @ [545:63] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [549:17] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[PropertyDescriptorImpl]

'sourceFile' @ [549:25] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.get[ValueParameterDescriptorImpl]

'absolutePath' @ [549:36] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'orEmpty' @ [549:50] ==> @InlineOnly public inline fun <T> Collection<String>?.orEmpty(): Collection<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [549:60] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> JvmClassName): List<JvmClassName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> JvmClassName

'byInternalName' @ [549:79] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'it' @ [549:94] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.get.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [551:61] ==> value-parameter value: Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.dumpValue[ValueParameterDescriptorImpl]

'dumpCollection' @ [551:67] ==> @TestOnly public fun <T : Comparable<String>> Collection<String>.dumpCollection(): String defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Comparable<T>> -> String

'storage' @ [554:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap[PropertyDescriptorImpl]

'remove' @ [554:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'path' @ [554:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.SourceToClassesMap.remove[ValueParameterDescriptorImpl]

'BasicStringMap<String>' @ [558:61] ==> public constructor BasicStringMap<V>(storageFile: File, keyDescriptor: KeyDescriptor<String>, valueExternalizer: DataExternalizer<String>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> String

'storageFile' @ [558:84] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap.<init>[ValueParameterDescriptorImpl]

'EnumeratorStringDescriptor' @ [558:97] ==> public constructor EnumeratorStringDescriptor() defined in com.intellij.util.io.EnumeratorStringDescriptor[JavaClassConstructorDescriptor]

'PathStringDescriptor' @ [558:127] ==> public object PathStringDescriptor : EnumeratorStringDescriptor defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'storage' @ [560:13] ==> protected final val storage: LazyStorage<String, String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap[PropertyDescriptorImpl]

'fqName' @ [560:21] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap.set[ValueParameterDescriptorImpl]

'asString' @ [560:28] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'sourceFile' @ [560:42] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap.set[ValueParameterDescriptorImpl]

'canonicalPath' @ [560:53] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'storage' @ [564:17] ==> protected final val storage: LazyStorage<String, String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap[PropertyDescriptorImpl]

'fqName' @ [564:25] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap.get[ValueParameterDescriptorImpl]

'asString' @ [564:32] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [564:45] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'storage' @ [567:13] ==> protected final val storage: LazyStorage<String, String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap[PropertyDescriptorImpl]

'remove' @ [567:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'fqName' @ [567:28] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap.remove[ValueParameterDescriptorImpl]

'asString' @ [567:35] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'value' @ [570:49] ==> value-parameter value: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap.dumpValue[ValueParameterDescriptorImpl]

'BasicStringMap<Collection<String>>' @ [574:63] ==> public constructor BasicStringMap<V>(storageFile: File, keyDescriptor: KeyDescriptor<String>, valueExternalizer: DataExternalizer<Collection<String>>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Collection<String>

'storageFile' @ [574:98] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap.<init>[ValueParameterDescriptorImpl]

'EnumeratorStringDescriptor' @ [574:111] ==> public constructor EnumeratorStringDescriptor() defined in com.intellij.util.io.EnumeratorStringDescriptor[JavaClassConstructorDescriptor]

'PathCollectionExternalizer' @ [574:141] ==> private object PathCollectionExternalizer : CollectionExternalizer<String> defined in org.jetbrains.kotlin.incremental in file IncrementalCacheImpl.kt[FakeCallableDescriptorForObject]

'storage' @ [576:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap[PropertyDescriptorImpl]

'internalName' @ [576:21] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap.set[ValueParameterDescriptorImpl]

'sourceFiles' @ [576:37] ==> value-parameter sourceFiles: Iterable<File> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap.set[ValueParameterDescriptorImpl]

'map' @ [576:49] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [576:55] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap.set.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [576:58] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'storage' @ [580:18] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap[PropertyDescriptorImpl]

'internalName' @ [580:26] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap.get[ValueParameterDescriptorImpl]

'emptyList' @ [580:43] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [580:56] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'storage' @ [583:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap[PropertyDescriptorImpl]

'remove' @ [583:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'internalName' @ [583:28] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap.remove[ValueParameterDescriptorImpl]

'value' @ [587:17] ==> value-parameter value: Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InternalNameToSourcesMap.dumpValue[ValueParameterDescriptorImpl]

'dumpCollection' @ [587:23] ==> @TestOnly public fun <T : Comparable<String>> Collection<String>.dumpCollection(): String defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Comparable<T>> -> String

'JvmProtoBufUtil' @ [591:25] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm[FakeCallableDescriptorForObject]

'readClassDataFrom' @ [591:41] ==> @JvmStatic public final fun readClassDataFrom(data: Array<String>, strings: Array<String>): ClassData defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[DeserializedSimpleFunctionDescriptor]

'kotlinClass' @ [591:59] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[ValueParameterDescriptorImpl]

'classHeader' @ [591:71] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'data' @ [591:83] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'kotlinClass' @ [591:91] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[ValueParameterDescriptorImpl]

'classHeader' @ [591:103] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'strings' @ [591:115] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'classData' @ [592:26] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'classProto' @ [592:36] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'supertypes' @ [592:47] ==> public fun ProtoBuf.Class.supertypes(typeTable: TypeTable): List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'TypeTable' @ [592:58] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[DeserializedClassConstructorDescriptor]

'classData' @ [592:68] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'classProto' @ [592:78] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'typeTable' @ [592:89] ==> public final val ProtoBuf.Class.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'supertypes' @ [593:23] ==> val supertypes: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'map' @ [593:34] ==> public inline fun <T, R> Iterable<ProtoBuf.Type>.map(transform: (ProtoBuf.Type) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> FqName

'classData' @ [593:40] ==> val classData: ClassData defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'nameResolver' @ [593:50] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedPropertyDescriptor]

'getClassId' @ [593:63] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [593:74] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [593:77] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'asSingleFqName' @ [593:88] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'filter' @ [594:34] ==> public inline fun <T> Iterable<FqName>.filter(predicate: (FqName) -> Boolean): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'it' @ [594:43] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [594:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'toSet' @ [595:34] ==> public fun <T> Iterable<FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'kotlinClass' @ [596:21] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[ValueParameterDescriptorImpl]

'classId' @ [596:33] ==> public open val classId: ClassId defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'asSingleFqName' @ [596:41] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'parents' @ [598:9] ==> val parents: Set<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'forEach' @ [598:17] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'subtypesMap' @ [598:27] ==> private final val subtypesMap: SubtypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'add' @ [598:39] ==> public final fun add(key: FqName, value: FqName): Unit defined in org.jetbrains.kotlin.incremental.storage.SubtypesMap[SimpleFunctionDescriptorImpl]

'it' @ [598:43] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage.<anonymous>[ValueParameterDescriptorImpl]

'child' @ [598:47] ==> val child: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'supertypesMap' @ [600:33] ==> private final val supertypesMap: SupertypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'child' @ [600:47] ==> val child: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'filter' @ [600:54] ==> public inline fun <T> Iterable<FqName>.filter(predicate: (FqName) -> Boolean): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'it' @ [600:63] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [600:70] ==> val parents: Set<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'removedSupertypes' @ [601:9] ==> val removedSupertypes: List<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'forEach' @ [601:27] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'subtypesMap' @ [601:37] ==> private final val subtypesMap: SubtypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'removeValues' @ [601:49] ==> public final fun removeValues(key: FqName, removed: Set<FqName>): Unit defined in org.jetbrains.kotlin.incremental.storage.SubtypesMap[SimpleFunctionDescriptorImpl]

'it' @ [601:62] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [601:66] ==> public fun <T> setOf(element: FqName): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'child' @ [601:72] ==> val child: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'supertypesMap' @ [603:9] ==> private final val supertypesMap: SupertypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'child' @ [603:23] ==> val child: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'parents' @ [603:32] ==> val parents: Set<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[LocalVariableDescriptor]

'classFqNameToSourceMap' @ [604:9] ==> private final val classFqNameToSourceMap: IncrementalCacheImpl<Target>.ClassFqNameToSourceMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'kotlinClass' @ [604:32] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[ValueParameterDescriptorImpl]

'className' @ [604:44] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [604:54] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'srcFile' @ [604:90] ==> value-parameter srcFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.addToClassStorage[ValueParameterDescriptorImpl]

'removedClasses' @ [608:13] ==> value-parameter removedClasses: Collection<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[ValueParameterDescriptorImpl]

'isEmpty' @ [608:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'removedClasses' @ [610:30] ==> value-parameter removedClasses: Collection<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[ValueParameterDescriptorImpl]

'map' @ [610:45] ==> public inline fun <T, R> Iterable<JvmClassName>.map(transform: (JvmClassName) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClassName
    <R> -> FqName

'it' @ [610:51] ==> value-parameter it: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage.<anonymous>[ValueParameterDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [610:54] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'toSet' @ [610:89] ==> public fun <T> Iterable<FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'thisWithDependentCaches' @ [612:23] ==> public final val thisWithDependentCaches: Iterable<IncrementalCacheImpl<Target>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'hashSetOf' @ [613:34] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<FqName> /* = HashSet<FqName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'hashSetOf' @ [614:35] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<FqName> /* = HashSet<FqName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'removedFqNames' @ [616:35] ==> val removedFqNames: Set<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'parentsFqNames' @ [617:17] ==> val parentsFqNames: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'addAll' @ [617:32] ==> public open fun addAll(elements: Collection<FqName>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'cache' @ [617:39] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'supertypesMap' @ [617:45] ==> private final val supertypesMap: SupertypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'removedFqName' @ [617:59] ==> val removedFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'childrenFqNames' @ [618:17] ==> val childrenFqNames: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'addAll' @ [618:33] ==> public open fun addAll(elements: Collection<FqName>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'cache' @ [618:40] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'subtypesMap' @ [618:46] ==> private final val subtypesMap: SubtypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'removedFqName' @ [618:58] ==> val removedFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'cache' @ [620:17] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'supertypesMap' @ [620:23] ==> private final val supertypesMap: SupertypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [620:37] ==> public final fun remove(key: FqName): Unit defined in org.jetbrains.kotlin.incremental.storage.SupertypesMap[SimpleFunctionDescriptorImpl]

'removedFqName' @ [620:44] ==> val removedFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'cache' @ [621:17] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'subtypesMap' @ [621:23] ==> private final val subtypesMap: SubtypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [621:35] ==> public final fun remove(key: FqName): Unit defined in org.jetbrains.kotlin.incremental.storage.SubtypesMap[SimpleFunctionDescriptorImpl]

'removedFqName' @ [621:42] ==> val removedFqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'childrenFqNames' @ [624:27] ==> val childrenFqNames: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'cache' @ [625:17] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'supertypesMap' @ [625:23] ==> private final val supertypesMap: SupertypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'removeValues' @ [625:37] ==> public final fun removeValues(key: FqName, removed: Set<FqName>): Unit defined in org.jetbrains.kotlin.incremental.storage.SupertypesMap[SimpleFunctionDescriptorImpl]

'child' @ [625:50] ==> val child: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'removedFqNames' @ [625:57] ==> val removedFqNames: Set<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'parentsFqNames' @ [628:28] ==> val parentsFqNames: HashSet<FqName> /* = HashSet<FqName> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'cache' @ [629:17] ==> val cache: IncrementalCacheImpl<Target> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'subtypesMap' @ [629:23] ==> private final val subtypesMap: SubtypesMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'removeValues' @ [629:35] ==> public final fun removeValues(key: FqName, removed: Set<FqName>): Unit defined in org.jetbrains.kotlin.incremental.storage.SubtypesMap[SimpleFunctionDescriptorImpl]

'parent' @ [629:48] ==> val parent: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'removedFqNames' @ [629:56] ==> val removedFqNames: Set<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'removedFqNames' @ [633:9] ==> val removedFqNames: Set<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage[LocalVariableDescriptor]

'forEach' @ [633:24] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'classFqNameToSourceMap' @ [633:34] ==> private final val classFqNameToSourceMap: IncrementalCacheImpl<Target>.ClassFqNameToSourceMap defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [633:57] ==> public final fun remove(fqName: FqName): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.ClassFqNameToSourceMap[SimpleFunctionDescriptorImpl]

'it' @ [633:64] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.removeAllFromClassStorage.<anonymous>[ValueParameterDescriptorImpl]

'BasicStringMap<Boolean>' @ [636:68] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<Boolean>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Boolean

'storageFile' @ [636:92] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [636:127] ==> public final val INSTANCE: (BooleanDataDescriptor..BooleanDataDescriptor?) defined in com.intellij.util.io.BooleanDataDescriptor[JavaPropertyDescriptor]

'storage' @ [638:13] ==> protected final val storage: LazyStorage<String, Boolean> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[PropertyDescriptorImpl]

'className' @ [638:21] ==> value-parameter className: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap.markDirty[ValueParameterDescriptorImpl]

'storage' @ [642:13] ==> protected final val storage: LazyStorage<String, Boolean> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[PropertyDescriptorImpl]

'remove' @ [642:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [642:28] ==> value-parameter className: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap.notDirty[ValueParameterDescriptorImpl]

'storage' @ [646:17] ==> protected final val storage: LazyStorage<String, Boolean> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[PropertyDescriptorImpl]

'keys' @ [646:25] ==> public final val keys: Collection<String> defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[PropertyDescriptorImpl]

'storage' @ [649:17] ==> protected final val storage: LazyStorage<String, Boolean> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap[PropertyDescriptorImpl]

'contains' @ [649:25] ==> public final operator fun contains(key: String): Boolean defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [649:34] ==> value-parameter className: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.DirtyOutputClassesMap.isDirty[ValueParameterDescriptorImpl]

'BasicStringMap<Map<String, Long>>' @ [654:65] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<Map<String, Long>>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Map<String, Long>

'storageFile' @ [654:99] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.<init>[ValueParameterDescriptorImpl]

'StringToLongMapExternalizer' @ [654:112] ==> public object StringToLongMapExternalizer : StringMapExternalizer<Long> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'inlineFunctionsJvmNames' @ [656:35] ==> public fun inlineFunctionsJvmNames(header: KotlinClassHeader): Set<String> defined in org.jetbrains.kotlin.inline[DeserializedSimpleFunctionDescriptor]

'header' @ [656:59] ==> value-parameter header: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap[ValueParameterDescriptorImpl]

'inlineFunctions' @ [657:17] ==> val inlineFunctions: Set<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap[LocalVariableDescriptor]

'isEmpty' @ [657:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [657:51] ==> public fun <K, V> emptyMap(): Map<String, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Long

'HashMap' @ [659:26] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Long

'ClassReader' @ [661:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'bytes' @ [661:25] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap[ValueParameterDescriptorImpl]

'accept' @ [661:32] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [661:48] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [661:69] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ClassWriter' @ [663:44] ==> public constructor ClassWriter(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaClassConstructorDescriptor]

'ASM5' @ [663:64] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'MethodVisitor' @ [665:37] ==> public constructor MethodVisitor(p0: Int, p1: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [665:59] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'dummyClassWriter' @ [665:65] ==> val dummyClassWriter: ClassWriter defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod[LocalVariableDescriptor]

'visitMethod' @ [665:82] ==> public final fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'name' @ [665:97] ==> value-parameter name: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [665:103] ==> value-parameter desc: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [665:115] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [667:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [667:50] ==> value-parameter desc: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'jvmName' @ [668:33] ==> val jvmName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'inlineFunctions' @ [668:45] ==> val inlineFunctions: Set<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap[LocalVariableDescriptor]

'dummyClassWriter' @ [670:46] ==> val dummyClassWriter: ClassWriter defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod[LocalVariableDescriptor]

'toByteArray' @ [670:63] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'dummyBytes' @ [671:40] ==> val dummyBytes: ByteArray defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'md5' @ [671:51] ==> public fun ByteArray.md5(): Long defined in org.jetbrains.kotlin.incremental in file IncrementalCacheImpl.kt[SimpleFunctionDescriptorImpl]

'result' @ [672:29] ==> val result: HashMap<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap[LocalVariableDescriptor]

'jvmName' @ [672:36] ==> val jvmName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'hash' @ [672:47] ==> val hash: Long defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'result' @ [679:20] ==> val result: HashMap<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.getInlineFunctionsMap[LocalVariableDescriptor]

'put' @ [683:20] ==> private final fun put(className: JvmClassName, newMap: Map<String, Long>, isPackage: Boolean): CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [683:24] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.process[ValueParameterDescriptorImpl]

'className' @ [683:36] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[PropertyDescriptorImpl]

'getInlineFunctionsMap' @ [683:47] ==> private final fun getInlineFunctionsMap(header: KotlinClassHeader, bytes: ByteArray): Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [683:69] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.process[ValueParameterDescriptorImpl]

'classHeader' @ [683:81] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'kotlinClass' @ [683:94] ==> value-parameter kotlinClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.process[ValueParameterDescriptorImpl]

'fileContents' @ [683:106] ==> public final val LocalFileKotlinClass.fileContents: ByteArray[MyPropertyDescriptor]

'isPackage' @ [683:121] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.process[ValueParameterDescriptorImpl]

'className' @ [687:32] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'internalName' @ [687:42] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'storage' @ [688:26] ==> protected final val storage: LazyStorage<String, Map<String, Long>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[PropertyDescriptorImpl]

'internalName' @ [688:34] ==> val internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'emptyMap' @ [688:51] ==> public fun <K, V> emptyMap(): Map<String, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Long

'hashSetOf' @ [690:25] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'hashSetOf' @ [691:27] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'oldMap' @ [692:32] ==> val oldMap: Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'keys' @ [692:39] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'newMap' @ [692:46] ==> value-parameter newMap: Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'keys' @ [692:53] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'allFunctions' @ [694:24] ==> val allFunctions: Set<String> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'oldMap' @ [695:31] ==> val oldMap: Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'fn' @ [695:38] ==> val fn: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'newMap' @ [696:31] ==> value-parameter newMap: Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'fn' @ [696:38] ==> val fn: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'when {
                    oldHash == null -> added.add(fn)
                    oldHash != newHash -> changed.add(fn)
                }' @ [698:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'oldHash' @ [699:21] ==> val oldHash: Long? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'added' @ [699:40] ==> val added: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'add' @ [699:46] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fn' @ [699:50] ==> val fn: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'oldHash' @ [700:21] ==> val oldHash: Long? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'newHash' @ [700:32] ==> val newHash: Long? defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'changed' @ [700:43] ==> val changed: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'add' @ [700:51] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fn' @ [700:55] ==> val fn: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'when {
                newMap.isNotEmpty() -> storage[internalName] = newMap
                else -> storage.remove(internalName)
            }' @ [704:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'newMap' @ [705:17] ==> value-parameter newMap: Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'isNotEmpty' @ [705:24] ==> @InlineOnly public inline fun <K, V> Map<out String, Long>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Long

'storage' @ [705:40] ==> protected final val storage: LazyStorage<String, Map<String, Long>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[PropertyDescriptorImpl]

'internalName' @ [705:48] ==> val internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'newMap' @ [705:64] ==> value-parameter newMap: Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'storage' @ [706:25] ==> protected final val storage: LazyStorage<String, Map<String, Long>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[PropertyDescriptorImpl]

'remove' @ [706:33] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'internalName' @ [706:40] ==> val internalName: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'if (isPackage) className.packageFqName else className.fqNameForClassNameWithoutDollars' @ [709:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'isPackage' @ [709:30] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'className' @ [709:41] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'packageFqName' @ [709:51] ==> public final val JvmClassName.packageFqName: FqName[MyPropertyDescriptor]

'className' @ [709:70] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[ValueParameterDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [709:80] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'added' @ [711:29] ==> val added: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'asSequence' @ [711:35] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'changed' @ [711:50] ==> val changed: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'asSequence' @ [711:58] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [711:72] ==> public fun <T, R> Sequence<String>.map(transform: (String) -> ChangeInfo.MembersChanged): Sequence<ChangeInfo.MembersChanged> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> MembersChanged

'MembersChanged' @ [711:89] ==> public constructor MembersChanged(fqName: FqName, names: Collection<String>) defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged[ClassConstructorDescriptorImpl]

'fqName' @ [711:104] ==> val fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'listOf' @ [711:112] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [711:119] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put.<anonymous>[ValueParameterDescriptorImpl]

'substringBefore' @ [711:122] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CompilationResult' @ [712:20] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'changes' @ [712:48] ==> val changes: Sequence<ChangeInfo.MembersChanged> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.put[LocalVariableDescriptor]

'storage' @ [716:13] ==> protected final val storage: LazyStorage<String, Map<String, Long>> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap[PropertyDescriptorImpl]

'remove' @ [716:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'className' @ [716:28] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.remove[ValueParameterDescriptorImpl]

'internalName' @ [716:38] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'value' @ [720:17] ==> value-parameter value: Map<String, Long> defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.dumpValue[ValueParameterDescriptorImpl]

'dumpMap' @ [720:23] ==> @TestOnly public fun <K : Comparable<String>, V> Map<String, Long>.dumpMap(dumpValue: (Long) -> String): String defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : Comparable<K>> -> String
    <V> -> Long

'toHexString' @ [720:48] ==> public open fun toHexString(p0: Long): (String..String?) defined in java.lang.Long[JavaMethodDescriptor]

'it' @ [720:60] ==> value-parameter it: Long defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl.InlineFunctionsMap.dumpValue.<anonymous>[ValueParameterDescriptorImpl]

'CollectionExternalizer<String>' @ [724:45] ==> public constructor CollectionExternalizer<T>(elementExternalizer: DataExternalizer<String>, newCollection: () -> MutableCollection<String>) defined in org.jetbrains.kotlin.incremental.storage.CollectionExternalizer[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> String

'PathStringDescriptor' @ [724:76] ==> public object PathStringDescriptor : EnumeratorStringDescriptor defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'THashSet' @ [724:100] ==> public constructor THashSet<E : (Any..Any?)>(p0: (TObjectHashingStrategy<(String..String?)>..TObjectHashingStrategy<(String..String?)>?)) defined in gnu.trove.THashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'PATH_HASHING_STRATEGY' @ [724:118] ==> public final val PATH_HASHING_STRATEGY: (TObjectHashingStrategy<(String..String?)>..TObjectHashingStrategy<(String..String?)>?) defined in com.intellij.openapi.util.io.FileUtil[JavaPropertyDescriptor]

'ChangeInfo' @ [727:80] ==> private constructor ChangeInfo(fqName: FqName) defined in org.jetbrains.kotlin.incremental.ChangeInfo[ClassConstructorDescriptorImpl]

'fqName' @ [727:91] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged.<init>[ValueParameterDescriptorImpl]

'super' @ [728:53] ==> <this> defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged[LazyClassReceiverParameterDescriptor]

'toStringProperties' @ [728:59] ==> protected open fun toStringProperties(): String defined in org.jetbrains.kotlin.incremental.ChangeInfo[SimpleFunctionDescriptorImpl]

'names' @ [728:94] ==> public final val names: Collection<String> defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged[PropertyDescriptorImpl]

'MembersChanged' @ [731:64] ==> public constructor MembersChanged(fqName: FqName, names: Collection<String>) defined in org.jetbrains.kotlin.incremental.ChangeInfo.MembersChanged[ClassConstructorDescriptorImpl]

'fqName' @ [731:79] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.incremental.ChangeInfo.Removed.<init>[ValueParameterDescriptorImpl]

'names' @ [731:87] ==> value-parameter names: Collection<String> defined in org.jetbrains.kotlin.incremental.ChangeInfo.Removed.<init>[ValueParameterDescriptorImpl]

'ChangeInfo' @ [733:82] ==> private constructor ChangeInfo(fqName: FqName) defined in org.jetbrains.kotlin.incremental.ChangeInfo[ClassConstructorDescriptorImpl]

'fqName' @ [733:93] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.incremental.ChangeInfo.SignatureChanged.<init>[ValueParameterDescriptorImpl]

'fqName' @ [736:66] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.incremental.ChangeInfo[PropertyDescriptorImpl]

'this' @ [739:16] ==> <this> defined in org.jetbrains.kotlin.incremental.ChangeInfo[LazyClassReceiverParameterDescriptor]

'java' @ [739:28] ==> public val <T> KClass<out ChangeInfo>.java: Class<out ChangeInfo> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ChangeInfo

'simpleName' @ [739:33] ==> public final val <T : (Any..Any?)> Class<out ChangeInfo>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ChangeInfo

'toStringProperties' @ [739:50] ==> protected open fun toStringProperties(): String defined in org.jetbrains.kotlin.incremental.ChangeInfo[SimpleFunctionDescriptorImpl]

'emptySequence' @ [744:45] ==> public fun <T> emptySequence(): Sequence<ChangeInfo> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChangeInfo

'CompilationResult' @ [747:45] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'CompilationResult' @ [751:13] ==> public constructor CompilationResult(changes: Sequence<ChangeInfo> = ...) defined in org.jetbrains.kotlin.incremental.CompilationResult[ClassConstructorDescriptorImpl]

'changes' @ [751:31] ==> public final val changes: Sequence<ChangeInfo> defined in org.jetbrains.kotlin.incremental.CompilationResult[PropertyDescriptorImpl]

'other' @ [751:41] ==> value-parameter other: CompilationResult defined in org.jetbrains.kotlin.incremental.CompilationResult.plus[ValueParameterDescriptorImpl]

'changes' @ [751:47] ==> public final val changes: Sequence<ChangeInfo> defined in org.jetbrains.kotlin.incremental.CompilationResult[PropertyDescriptorImpl]

'!!' @ [755:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: ByteArray?): ByteArray[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> ByteArray

'getInstance' @ [755:27] ==> public open fun getInstance(p0: (String..String?)): (MessageDigest..MessageDigest?) defined in java.security.MessageDigest[JavaMethodDescriptor]

'digest' @ [755:46] ==> public open fun digest(p0: (ByteArray..ByteArray?)): (ByteArray..ByteArray?) defined in java.security.MessageDigest[JavaMethodDescriptor]

'this' @ [755:53] ==> <this> defined in org.jetbrains.kotlin.incremental.md5[ReceiverParameterDescriptorImpl]

'or' @ [756:13] ==> public final infix fun or(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [756:14] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [756:19] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'shl' @ [757:17] ==> public final infix fun shl(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [757:18] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [757:23] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'shl' @ [758:17] ==> public final infix fun shl(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [758:18] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [758:23] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'shl' @ [759:17] ==> public final infix fun shl(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [759:18] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [759:23] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'shl' @ [760:17] ==> public final infix fun shl(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [760:18] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [760:23] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'shl' @ [761:17] ==> public final infix fun shl(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [761:18] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [761:23] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'shl' @ [762:17] ==> public final infix fun shl(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [762:18] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [762:23] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'shl' @ [763:17] ==> public final infix fun shl(bitCount: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'd' @ [763:18] ==> val d: ByteArray defined in org.jetbrains.kotlin.incremental.md5[LocalVariableDescriptor]

'toLong' @ [763:23] ==> public open fun toLong(): Long defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'TestOnly' @ [767:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'buildString' @ [769:9] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [770:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'keys' @ [771:25] ==> public abstract val keys: Set<K> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sorted' @ [771:30] ==> public fun <T : Comparable<K>> Iterable<K>.sorted(): List<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> K

'length' @ [772:21] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'append' @ [773:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'get' @ [776:29] ==> public abstract operator fun get(key: K): V? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'key' @ [776:33] ==> val key: K defined in org.jetbrains.kotlin.incremental.dumpMap.<anonymous>[LocalVariableDescriptor]

'let' @ [776:39] ==> @InlineOnly public inline fun <T, R> V.let(block: (V) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> V
    <R> -> String

'dumpValue' @ [776:43] ==> value-parameter dumpValue: (V) -> String defined in org.jetbrains.kotlin.incremental.dumpMap[ValueParameterDescriptorImpl]

'append' @ [777:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'key' @ [777:26] ==> val key: K defined in org.jetbrains.kotlin.incremental.dumpMap.<anonymous>[LocalVariableDescriptor]

'value' @ [777:34] ==> val value: String defined in org.jetbrains.kotlin.incremental.dumpMap.<anonymous>[LocalVariableDescriptor]

'append' @ [779:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'TestOnly' @ [782:1] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'sorted' @ [783:13] ==> public fun <T : Comparable<T>> Iterable<T>.sorted(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> T

'joinToString' @ [783:22] ==> public fun <T> Iterable<T>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((T) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'Any' @ [783:53] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

