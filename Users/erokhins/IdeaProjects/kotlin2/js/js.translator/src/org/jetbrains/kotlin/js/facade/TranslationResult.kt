'TranslationResult' @ [44:44] ==> protected constructor TranslationResult(diagnostics: Diagnostics) defined in org.jetbrains.kotlin.js.facade.TranslationResult[ClassConstructorDescriptorImpl]

'diagnostics' @ [44:62] ==> value-parameter diagnostics: Diagnostics defined in org.jetbrains.kotlin.js.facade.TranslationResult.Fail.<init>[ValueParameterDescriptorImpl]

'TranslationResult' @ [54:9] ==> protected constructor TranslationResult(diagnostics: Diagnostics) defined in org.jetbrains.kotlin.js.facade.TranslationResult[ClassConstructorDescriptorImpl]

'diagnostics' @ [54:27] ==> value-parameter diagnostics: Diagnostics defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.<init>[ValueParameterDescriptorImpl]

'Suppress' @ [55:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'TextOutputImpl' @ [57:26] ==> public constructor TextOutputImpl() defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaClassConstructorDescriptor]

'getCode' @ [58:13] ==> private final fun getCode(output: TextOutput, sourceLocationConsumer: SourceLocationConsumer?): Unit defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[SimpleFunctionDescriptorImpl]

'output' @ [58:21] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getCode[LocalVariableDescriptor]

'output' @ [59:20] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getCode[LocalVariableDescriptor]

'toString' @ [59:27] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaMethodDescriptor]

'TextOutputImpl' @ [63:26] ==> public constructor TextOutputImpl() defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaClassConstructorDescriptor]

'SourceMap3Builder' @ [65:36] ==> public constructor SourceMap3Builder(generatedFile: (File..File?), textOutput: (TextOutput..TextOutput?), pathPrefix: (String..String?)) defined in org.jetbrains.kotlin.js.sourceMap.SourceMap3Builder[JavaClassConstructorDescriptor]

'outputFile' @ [65:54] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[ValueParameterDescriptorImpl]

'output' @ [65:66] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'config' @ [65:74] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'sourceMapPrefix' @ [65:81] ==> public final val JsConfig.sourceMapPrefix: String[MyPropertyDescriptor]

'if (config.configuration.getBoolean(JSConfigurationKeys.SOURCE_MAP)) {
                        val sourceRoots = config.sourceMapRoots.map { File(it) }
                        val sourceMapContentEmbedding = config.sourceMapContentEmbedding
                        val pathResolver = SourceFilePathResolver(sourceRoots)
                        SourceMapBuilderConsumer(
                                sourceMapBuilder,
                                pathResolver,
                                sourceMapContentEmbedding == SourceMapSourceEmbedding.ALWAYS,
                                sourceMapContentEmbedding != SourceMapSourceEmbedding.NEVER)
                    }
                    else {
                        null
                    }' @ [67:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SourceMapBuilderConsumer?, elseBranch: SourceMapBuilderConsumer?): SourceMapBuilderConsumer?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SourceMapBuilderConsumer?

'config' @ [67:25] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'configuration' @ [67:32] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'getBoolean' @ [67:46] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'SOURCE_MAP' @ [67:77] ==> public final val SOURCE_MAP: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'config' @ [68:43] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'sourceMapRoots' @ [68:50] ==> public final val JsConfig.sourceMapRoots: (MutableList<(String..String?)>..List<(String..String?)>)[MyPropertyDescriptor]

'map' @ [68:65] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> File

'File' @ [68:71] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [68:76] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles.<anonymous>[ValueParameterDescriptorImpl]

'config' @ [69:57] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'sourceMapContentEmbedding' @ [69:64] ==> public final val JsConfig.sourceMapContentEmbedding: SourceMapSourceEmbedding[MyPropertyDescriptor]

'SourceFilePathResolver' @ [70:44] ==> public constructor SourceFilePathResolver(@NotNull sourceRoots: (MutableList<(File..File?)>..List<(File..File?)>)) defined in org.jetbrains.kotlin.js.sourceMap.SourceFilePathResolver[JavaClassConstructorDescriptor]

'sourceRoots' @ [70:67] ==> val sourceRoots: List<File> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'SourceMapBuilderConsumer' @ [71:25] ==> public constructor SourceMapBuilderConsumer(@NotNull mappingConsumer: SourceMapMappingConsumer, @NotNull pathResolver: SourceFilePathResolver, provideCurrentModuleContent: Boolean, provideExternalModuleContent: Boolean) defined in org.jetbrains.kotlin.js.facade.SourceMapBuilderConsumer[JavaClassConstructorDescriptor]

'sourceMapBuilder' @ [72:33] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'pathResolver' @ [73:33] ==> val pathResolver: SourceFilePathResolver defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'sourceMapContentEmbedding' @ [74:33] ==> val sourceMapContentEmbedding: SourceMapSourceEmbedding defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'ALWAYS' @ [74:87] ==> enum entry ALWAYS defined in org.jetbrains.kotlin.js.config.SourceMapSourceEmbedding[FakeCallableDescriptorForObject]

'sourceMapContentEmbedding' @ [75:33] ==> val sourceMapContentEmbedding: SourceMapSourceEmbedding defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'NEVER' @ [75:87] ==> enum entry NEVER defined in org.jetbrains.kotlin.js.config.SourceMapSourceEmbedding[FakeCallableDescriptorForObject]

'getCode' @ [81:13] ==> private final fun getCode(output: TextOutput, sourceLocationConsumer: SourceLocationConsumer?): Unit defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[SimpleFunctionDescriptorImpl]

'output' @ [81:21] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'sourceMapBuilderConsumer' @ [81:29] ==> val sourceMapBuilderConsumer: SourceMapBuilderConsumer? defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'sourceMapBuilderConsumer' @ [82:17] ==> val sourceMapBuilderConsumer: SourceMapBuilderConsumer? defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'sourceMapBuilder' @ [83:17] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'addLink' @ [83:34] ==> @Override public open fun addLink(): Unit defined in org.jetbrains.kotlin.js.sourceMap.SourceMap3Builder[JavaMethodDescriptor]

'output' @ [85:24] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'toString' @ [85:31] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaMethodDescriptor]

'outputPrefixFile' @ [87:26] ==> value-parameter outputPrefixFile: File? defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[ValueParameterDescriptorImpl]

'readText' @ [87:44] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'outputPostfixFile' @ [88:27] ==> value-parameter outputPostfixFile: File? defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[ValueParameterDescriptorImpl]

'readText' @ [88:46] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'files' @ [89:31] ==> private final val files: List<KtFile> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'map' @ [89:37] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> File

'it' @ [90:35] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles.<anonymous>[ValueParameterDescriptorImpl]

'originalFile' @ [90:38] ==> public final var KtFile.originalFile: PsiFile[MyPropertyDescriptor]

'virtualFile' @ [90:51] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'when {
                    virtualFile == null -> File(it.name)
                    else -> VfsUtilCore.virtualToIoFile(virtualFile)
                }' @ [92:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: File, entry1: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> File

'virtualFile' @ [93:21] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles.<anonymous>[LocalVariableDescriptor]

'File' @ [93:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [93:49] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [93:52] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'virtualToIoFile' @ [94:41] ==> @NotNull public open fun virtualToIoFile(@NotNull p0: VirtualFile): File defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'virtualFile' @ [94:57] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles.<anonymous>[LocalVariableDescriptor]

'SimpleOutputFile' @ [98:26] ==> public constructor SimpleOutputFile(sourceFiles: List<File>, relativePath: String, content: String) defined in org.jetbrains.kotlin.backend.common.output.SimpleOutputFile[DeserializedClassConstructorDescriptor]

'sourceFiles' @ [98:43] ==> val sourceFiles: List<File> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'outputFile' @ [98:56] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[ValueParameterDescriptorImpl]

'name' @ [98:67] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'prefix' @ [98:73] ==> val prefix: String defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'code' @ [98:82] ==> val code: String defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'postfix' @ [98:89] ==> val postfix: String defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'arrayListOf' @ [99:31] ==> public fun <T> arrayListOf(vararg elements: OutputFile): ArrayList<OutputFile> /* = ArrayList<OutputFile> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile

'jsFile' @ [99:55] ==> val jsFile: SimpleOutputFile defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'config' @ [101:17] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'configuration' @ [101:24] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'getBoolean' @ [101:38] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'META_INFO' @ [101:69] ==> public final val META_INFO: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'KotlinJavascriptMetadataUtils' @ [102:36] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'replaceSuffix' @ [102:66] ==> public final fun replaceSuffix(filePath: String): String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedSimpleFunctionDescriptor]

'outputFile' @ [102:80] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[ValueParameterDescriptorImpl]

'name' @ [102:91] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'JsModuleDescriptor' @ [103:41] ==> public constructor JsModuleDescriptor<out T>(name: String, kind: ModuleKind, imported: List<String>, data: ModuleDescriptor) defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> ModuleDescriptor

'config' @ [104:28] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'moduleId' @ [104:35] ==> public final val JsConfig.moduleId: String[MyPropertyDescriptor]

'moduleDescriptor' @ [105:28] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'config' @ [106:28] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'moduleKind' @ [106:35] ==> public final val JsConfig.moduleKind: ModuleKind[MyPropertyDescriptor]

'importedModules' @ [107:32] ==> private final val importedModules: List<String> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'KotlinJavascriptSerializationUtil' @ [109:39] ==> public object KotlinJavascriptSerializationUtil defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'metadataAsString' @ [109:73] ==> public final fun metadataAsString(bindingContext: BindingContext, jsDescriptor: JsModuleDescriptor<ModuleDescriptor>): String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [109:90] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'moduleDescription' @ [109:106] ==> val moduleDescription: JsModuleDescriptor<ModuleDescriptor> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'ArrayList' @ [110:46] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (File..File?)>..Collection<(File..File?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (java.io.File..java.io.File?)

'sourceFiles' @ [110:56] ==> val sourceFiles: List<File> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'SimpleOutputFile' @ [111:34] ==> public constructor SimpleOutputFile(sourceFiles: List<File>, relativePath: String, content: String) defined in org.jetbrains.kotlin.backend.common.output.SimpleOutputFile[DeserializedClassConstructorDescriptor]

'sourceFilesForMetaFile' @ [111:51] ==> val sourceFilesForMetaFile: ArrayList<(File..File?)> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'metaFileName' @ [111:75] ==> val metaFileName: String defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'metaFileContent' @ [111:89] ==> val metaFileContent: String defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'outputFiles' @ [112:17] ==> val outputFiles: ArrayList<OutputFile> /* = ArrayList<OutputFile> */ defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'add' @ [112:29] ==> public open fun add(element: OutputFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'jsMetaFile' @ [112:33] ==> val jsMetaFile: SimpleOutputFile defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'KotlinJavascriptSerializationUtil' @ [114:17] ==> public object KotlinJavascriptSerializationUtil defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'toContentMap' @ [114:51] ==> public final fun toContentMap(bindingContext: BindingContext, module: ModuleDescriptor): Map<String, ByteArray> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [114:64] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'moduleDescriptor' @ [114:80] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'forEach' @ [114:98] ==> @HidesMembers public inline fun <K, V> Map<out String, ByteArray>.forEach(action: (Map.Entry<String, ByteArray>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ByteArray

'outputFiles' @ [116:21] ==> val outputFiles: ArrayList<OutputFile> /* = ArrayList<OutputFile> */ defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'add' @ [116:33] ==> public open fun add(element: OutputFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'SimpleOutputBinaryFile' @ [116:37] ==> public constructor SimpleOutputBinaryFile(sourceFiles: List<File>, relativePath: String, content: ByteArray) defined in org.jetbrains.kotlin.backend.common.output.SimpleOutputBinaryFile[DeserializedClassConstructorDescriptor]

'emptyList' @ [116:60] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'config' @ [116:73] ==> private final val config: JsConfig defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'moduleId' @ [116:80] ==> public final val JsConfig.moduleId: String[MyPropertyDescriptor]

'VFS_SEPARATOR_CHAR' @ [116:103] ==> public const final val VFS_SEPARATOR_CHAR: Char defined in com.intellij.openapi.vfs.VfsUtilCore[JavaPropertyDescriptor]

'it' @ [116:124] ==> value-parameter it: Map.Entry<String, ByteArray> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [116:127] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [116:132] ==> value-parameter it: Map.Entry<String, ByteArray> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [116:135] ==> public abstract val value: ByteArray defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'sourceMapBuilderConsumer' @ [120:17] ==> val sourceMapBuilderConsumer: SourceMapBuilderConsumer? defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'sourceMapBuilder' @ [121:17] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'skipLinesAtBeginning' @ [121:34] ==> @Override public open fun skipLinesAtBeginning(count: Int): Unit defined in org.jetbrains.kotlin.js.sourceMap.SourceMap3Builder[JavaMethodDescriptor]

'getLineBreakCount' @ [121:66] ==> @Contract public open fun getLineBreakCount(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'prefix' @ [121:84] ==> val prefix: String defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'SimpleOutputFile' @ [122:37] ==> public constructor SimpleOutputFile(sourceFiles: List<File>, relativePath: String, content: String) defined in org.jetbrains.kotlin.backend.common.output.SimpleOutputFile[DeserializedClassConstructorDescriptor]

'sourceFiles' @ [122:54] ==> val sourceFiles: List<File> defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'sourceMapBuilder' @ [122:67] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'outFile' @ [122:84] ==> public final val SourceMap3Builder.outFile: (File..File?)[MyPropertyDescriptor]

'name' @ [122:92] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'sourceMapBuilder' @ [122:98] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'build' @ [122:115] ==> @Override public open fun build(): (String..String?) defined in org.jetbrains.kotlin.js.sourceMap.SourceMap3Builder[JavaMethodDescriptor]

'outputFiles' @ [123:17] ==> val outputFiles: ArrayList<OutputFile> /* = ArrayList<OutputFile> */ defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'add' @ [123:29] ==> public open fun add(element: OutputFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'sourceMapFile' @ [123:33] ==> val sourceMapFile: SimpleOutputFile defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'sourceMapBuilder' @ [124:17] ==> val sourceMapBuilder: SourceMap3Builder defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'addLink' @ [124:34] ==> @Override public open fun addLink(): Unit defined in org.jetbrains.kotlin.js.sourceMap.SourceMap3Builder[JavaMethodDescriptor]

'SimpleOutputFileCollection' @ [127:20] ==> public constructor SimpleOutputFileCollection(outputFiles: List<OutputFile>) defined in org.jetbrains.kotlin.backend.common.output.SimpleOutputFileCollection[DeserializedClassConstructorDescriptor]

'outputFiles' @ [127:47] ==> val outputFiles: ArrayList<OutputFile> /* = ArrayList<OutputFile> */ defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getOutputFiles[LocalVariableDescriptor]

'program' @ [131:13] ==> public final val program: JsProgram defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[PropertyDescriptorImpl]

'accept' @ [131:21] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaMethodDescriptor]

'JsToStringGenerationVisitor' @ [131:28] ==> public constructor JsToStringGenerationVisitor(@NotNull p0: TextOutput, @NotNull p1: SourceLocationConsumer) defined in org.jetbrains.kotlin.js.backend.JsToStringGenerationVisitor[JavaClassConstructorDescriptor]

'output' @ [131:56] ==> value-parameter output: TextOutput defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getCode[ValueParameterDescriptorImpl]

'sourceLocationConsumer' @ [131:64] ==> value-parameter sourceLocationConsumer: SourceLocationConsumer? defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success.getCode[ValueParameterDescriptorImpl]

'NoOpSourceLocationConsumer' @ [131:90] ==> public object NoOpSourceLocationConsumer : SourceLocationConsumer defined in org.jetbrains.kotlin.js.backend[FakeCallableDescriptorForObject]

